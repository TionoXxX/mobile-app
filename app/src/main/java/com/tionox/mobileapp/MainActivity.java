package com.tionox.mobileapp;
import android.app.Activity;
import android.os.Bundle;
import sdk.pendo.io.Pendo;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Pendo.setup(this, "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJkYXRhY2VudGVyIjoidXMiLCJrZXkiOiI3MWI2MTA3MzY0YTA0ZGI1MTg2MjZhMzE4ODE0MjY1NTcwNjI2NTdjODE5MThhZjE5MjI2ZjgzMzI3ZThkMDRmZTMwMjgwN2Y0MTc1NmI1ZTcwZTEzNWZkYmU1YTMyYzQxZWIyNzFhZmY0N2U5MWFiYTUyOTBiOGQwMzM2MzZmNzdkZTg0NzBiZDYxYTkxMGYwMjgwMDgwMGQ0NzQyNTAzMjEwNDIzZGFiYzMwNWE3ZWNlYWQ1Y2Q5MWU1NDQzMWQuZDgwZWUxZjZmMDIxMTNhZDY2M2Y3MTViZWU4MTliNWUuOTczMzI0NDllMzBlOTcxYzg0ZDAwMGU5YjM0YjgyYTdlZDMyOTQwNjg1OWEyZjQ4ZmE5ODZiZjc4MzAzZjA4MCJ9.dG3MhBEXs6BWbbzdFMKJ_Hq_xtAjQoI6APJBS07Ei8Uz8JsEUij5MiY5YYe05tIBxbvCYq16xpykosznl3lSXzbImXl7vZgmim24BsWyEcx7PFH4Nqgfc-HL9AjKutsnM8fGag0Wb9qsRiUyrJG3NQOPFpELdsSm5h1oBKfKeGI", null, null);
        Pendo.startSession("visitor-1", "account-1", null, null);
    }
}
