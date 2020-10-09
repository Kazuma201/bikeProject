package bikeproject;

public interface RoadParts {
  // constant declaration
  public final String TERRAIN = "track_racing";
  //required methods
  //Methods that accept a string argument name newValue
  //and methods to return current value of an instance

  public String getTyreWidth();

  public void setTyreWidth(String newValue);

  public String getPostHeight();

  public void setPostHeight(String newValue);

}
