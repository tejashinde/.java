public class load_comp_period_edit
{
   private static final Logger logger = LoggerFactory.getLogger(load_comp_period_edit.class);

   public Map<String,Object> run(Map<String,Object> inargs)
   {
      logger.info("Session:"+ inargs.get("session")+" - Entered method " + inargs.get("meth"));
      // Get the in arguments
      java.lang.Integer comp_Period_Type_Seq_in = (java.lang.Integer)inargs.get("comp Period Type Seq");

      // Out argument declarations
      SalesComp.Common.types.Comp_Period_Type comp_period_type_out = new Comp_Period_Type();

      // Method exit path
      String exitpath = null; // Possible values are "next"
      Connection conn; // for Conection the DataBase
      try {
         conn = DBUtil.getConnection();
         String query = "SELECT comp_Period_Type_Seq,comp_Period_Type,period_Level,description,creation_Date,deletion_Date,user_Operated from ODS_Comp_period_type where comp_Period_Type_Seq_=?";
         PreparedStatement preparedStatement = conn.prepareStatement(query);
         preparedStatement.setInt(1,comp_Period_Type_Seq_in);
         ResultSet resultSet = preparedStatement.executeQuery();
         while(resultSet.next()){
            // Out arguments
            comp_period_type_out.getComp_Period_Type_Seq(comp_Period_Type_Seq_in);
            comp_period_type_out.setComp_Period_Type(resultSet.getString("comp_Period_Type"));
            comp_period_type_out.setPeriod_Level(resultSet.getShort("period_Level"));
            comp_period_type_out.setDescription(resultSet.getString("description"));
            comp_period_type_out.setCreation_Date(resultSet.getDate("creation_Date"));
            comp_period_type_out.setDeletion_Date(resultSet.getDate("deletion_Date"));
            comp_period_type_out.setUser_Operated(resultSet.getString("user_Operated"));

         }
      } catch (SQLException ignored) {
      }

         exitpath = "next";
      // TODO: Your implementation comes here. Populate the appropriate values in the out arguments and exitpath.

      // Create outargs and populate it
      HashMap<String, Object> outData = new HashMap<String, Object>();
      outData.put("_exitPath",exitpath);
      outData.put("comp period type", comp_period_type_out);

      return outData;
   }
