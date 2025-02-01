

// java -> lang -> Object -> Throwable -> Error ->(VirtualMachineError -> ... & LinkageError -> ...)
//                           Throwable -> Exception -> RuntimeException -> (ArithmeticException, NullPointerException, IndexOutOfBoundsException, IllegalArgumentException)


class H_Exceptions{
    public static void main(String[] args) {
        try{
            // put you code here if you think it will give runtime error...
            // like famous exception ArithmeticException divided by zero...
            int i = 10 / 0;
            System.out.println("This line will not be executed because of exception!"+i);
        }catch(ArithmeticException e){
            System.out.println("Exception handled: " + e.getMessage());
            e.printStackTrace(); // this will to track the exception when there is many methods...
        }catch(RuntimeException e){
            //handle other exceptions like NullPointerException,IndexOutOfBoundsException...
        }catch(Throwable e){//...
        }
        finally{
            //this will always be executed no matter what happens...
            System.out.println("This line will always be executed!");
        }
    }
}