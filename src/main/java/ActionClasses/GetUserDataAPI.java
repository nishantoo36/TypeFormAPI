package ActionClasses;


public class GetUserDataAPI extends CommonAPIAction {

    public boolean isStatusCode(int statusCode){
       return getStatusCode(response)==statusCode;
    }

    public boolean isName(String name){
        return getFieldValue(response,"name").equals(name);
    }

    public boolean isHeight(String name){
        return getFieldValue(response,"height").equals(name);
    }

    public boolean isMass(String mass){
        return getFieldValue(response,"mass").equals(mass);
    }

    public boolean isHair_color(String hair_color){
        return getFieldValue(response,"hair_color").equals(hair_color);
    }

    public boolean isSkin_color(String skin_color){
        return getFieldValue(response,"skin_color").equals(skin_color);
    }

    public boolean isEye_color(String eye_color){
        return getFieldValue(response,"eye_color").equals(eye_color);
    }
    public boolean isBirth_year(String birth_year){
        return getFieldValue(response,"birth_year").equals(birth_year);
    }

    public boolean isGender(String gender){
        return getFieldValue(response,"gender").equals(gender);
    }

    public boolean isHomeworld(String homeworld){
        return getFieldValue(response,"homeworld").equals(homeworld);
    }

    public boolean isFilm(String film){
        return getFieldValues(response,"films").contains(film);
    }

    public boolean isVehicle(String vehicle){
        return getFieldValues(response,"vehicles").contains(vehicle);
    }

    public boolean isStarships(String starships){
        return getFieldValues(response,"starships").contains(starships);
    }

    public boolean isCreatedNotEmpty(){
        return getFieldValue(response,"created")!=null && !getFieldValue(response,"created").isEmpty();
    }

    public boolean isEditedNotEmpty(){
        return  getFieldValue(response,"edited")!=null && !getFieldValue(response,"edited").isEmpty();
    }

    public boolean isURL(String url){
        return  getFieldValue(response,"url").equals(url);
    }

}

