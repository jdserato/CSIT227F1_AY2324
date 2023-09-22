package Sept22.Pets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tester {

    private static List<Field> getAllFields(List<Field> fields, Class<?> type) {
        fields.addAll(Arrays.asList(type.getDeclaredFields()));

        if (type.getSuperclass() != null) {
            getAllFields(fields, type.getSuperclass());
        }

        return fields;
    }

    private static Field getField(Object obj, String fieldName) {
        List<Field> fields = getAllFields(new LinkedList<Field>(), obj.getClass());
        for(Field f : fields){
            if (f.getName().equals(fieldName)) {
                return f;
            }
        }
        return null;
    }

    private static Method getMethod(Object obj, String methodName) {
        Method[] methods = obj.getClass().getMethods();
        for (Method m : methods) {
            if (m.getName().equals(methodName)) {
                return m;
            }
        }
        return null;
    }

    public static void test(PetStore petStore) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter code: ");
        int code = scanner.nextInt();

        if (code == 1) {
            Field pets = getField(petStore, "pets");
            if (pets != null && Modifier.isPrivate(pets.getModifiers())) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILED");
            }
        } else if (code == 2) {
            Method addPet = getMethod(petStore, "addPet");
            Method countCats = getMethod(petStore, "countCats");
            Method countDogs = getMethod(petStore, "countDogs");
            Method countBirds = getMethod(petStore, "countBirds");

            if (addPet != null && countCats != null && countDogs != null && countBirds != null) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILED");
            }
        } else if (code == 3) {
            Method petStoreSounds = getMethod(petStore, "petStoreSounds");
            Method petStoreMoves = getMethod(petStore, "petStoreMoves");

            if (petStoreSounds != null && petStoreMoves != null) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILED");
            }
        } else if (code == 4) {
            petStore.addPet(new Bird());
            petStore.addPet(new Dog());
            petStore.addPet(new Cat());
            petStore.addPet(new Cat());
            petStore.addPet(new Bird());
            petStore.addPet(new Dog());
            petStore.addPet(new Bird());
            petStore.addPet(new Cat());
            petStore.addPet(new Dog());
            petStore.addPet(new Dog());
            petStore.addPet(new Bird());
            petStore.addPet(new Cat());
            petStore.addPet(new Cat());
            petStore.addPet(new Dog());
            petStore.addPet(new Bird());

            petStore.petStoreSounds();
            petStore.petStoreMoves();
            petStore.countCats();
            petStore.countDogs();
            petStore.countBirds();
        }
    }
}