package com.daaw;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class tt0 extends wt0 implements pe2 {
    public JSONArray e;
    public int f;

    public tt0(int i, JSONObject jSONObject, boolean z) {
        super(i, jSONObject, (wt0) null);
        this.f = i;
        if (!z) {
            try {
                this.e = this.c.getJSONArray("elements");
                return;
            } catch (JSONException e) {
                ub7.c("Failed to create from saved string: " + e.getMessage());
            }
        }
        H0();
    }

    public static tt0 w0(int i, JSONObject jSONObject) {
        return new tt0(i, jSONObject, true);
    }

    public static tt0 y0(int i, JSONObject jSONObject) {
        return new tt0(i, jSONObject, false);
    }

    public wt0 A0(wt0 wt0Var) {
        return new wt0(-1, F0(wt0Var.c), this);
    }

    public wt0 B0(int i) {
        if (i >= 0 && i < this.e.length()) {
            try {
                return new wt0(i, this.e.getJSONObject(i), this);
            } catch (JSONException e) {
                ub7.c(e.getMessage());
            }
        }
        return null;
    }

    public wt0 C0(List list, int i) {
        int iX = list.size() > i ? rr6.x((String) list.get(i), -1) : -1;
        if (iX < 0) {
            return null;
        }
        wt0 wt0VarB0 = B0(iX);
        if (wt0VarB0 == null) {
            ub7.c("entry is null");
            return null;
        }
        while (true) {
            i++;
            if (i >= list.size()) {
                return wt0VarB0;
            }
            wt0VarB0 = wt0VarB0.h((String) list.get(i));
        }
    }

    @Override // com.daaw.pe2
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public wt0 a(int i) {
        return B0(i);
    }

    public final JSONObject E0() {
        return F0(null);
    }

    public final JSONObject F0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                jSONObject2 = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
                ub7.c("json obj cloning failed");
                jSONObject2 = new JSONObject();
            }
        } else {
            jSONObject2 = new JSONObject();
        }
        this.e.put(jSONObject2);
        return jSONObject2;
    }

    public void G0() {
        H0();
    }

    public final void H0() {
        try {
            JSONArray jSONArray = new JSONArray();
            this.e = jSONArray;
            this.c.put("elements", jSONArray);
        } catch (JSONException e) {
            ub7.c(e.getMessage());
            this.e = null;
        }
    }

    public void I0(int i, wt0 wt0Var) {
        try {
            this.e.put(i, wt0Var.c);
        } catch (JSONException unused) {
        }
    }

    @Override // com.daaw.pe2
    public int c() {
        return this.e.length();
    }

    public int x0() {
        return this.f;
    }

    @Override // com.daaw.pe2
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public wt0 b() {
        return new wt0(-1, E0(), this);
    }
}
