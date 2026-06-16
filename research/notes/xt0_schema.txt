package com.daaw;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class xt0 implements pe2 {
    public JSONObject a;
    public JSONArray b;

    public xt0(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.a = new JSONObject();
            n();
            return;
        }
        try {
            this.a = jSONObject;
            this.b = jSONObject.getJSONArray("compositions");
        } catch (JSONException e) {
            ub7.c("Failed to create from saved string: " + e.getMessage());
            this.a = new JSONObject();
            n();
        }
    }

    public static xt0 d() {
        return new xt0(null);
    }

    public static xt0 e(String str) {
        JSONObject jSONObject;
        if (str == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return new xt0(jSONObject);
    }

    public static xt0 g(String str) {
        return e(str);
    }

    @Override // com.daaw.pe2
    public int c() {
        return this.b.length();
    }

    @Override // com.daaw.pe2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public tt0 b() {
        return tt0.w0(this.b.length(), k());
    }

    public int h() {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return -1;
        }
        try {
            return jSONObject.getInt("template");
        } catch (JSONException unused) {
            return -1;
        }
    }

    public wt0 i(List list) {
        if (list == null) {
            return null;
        }
        int iX = list.size() > 0 ? rr6.x((String) list.get(0), -1) : -1;
        if (iX < 0) {
            return null;
        }
        tt0 tt0VarA = a(iX);
        if (tt0VarA == null) {
            ub7.c("entry is null");
            return null;
        }
        if (list.size() <= 1) {
            return tt0VarA;
        }
        if (rr6.x((String) list.get(1), -1) < 0) {
            return null;
        }
        return tt0VarA.C0(list, 1);
    }

    @Override // com.daaw.pe2
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public tt0 a(int i) {
        if (i >= 0 && i < this.b.length()) {
            try {
                return tt0.y0(i, this.b.getJSONObject(i));
            } catch (JSONException e) {
                ub7.c(e.getMessage());
            }
        }
        return null;
    }

    public final JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        this.b.put(jSONObject);
        return jSONObject;
    }

    public String l() {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.getString("ver");
        } catch (JSONException unused) {
            return "";
        }
    }

    public void m() {
        n();
    }

    public final void n() {
        try {
            JSONArray jSONArray = new JSONArray();
            this.b = jSONArray;
            this.a.put("compositions", jSONArray);
        } catch (JSONException e) {
            ub7.c(e.getMessage());
            this.b = null;
        }
    }

    public String o() {
        JSONObject jSONObject = this.a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public String p() {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.toString(2);
        } catch (JSONException unused) {
            return "";
        }
    }

    public void q(int i) {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("template", i);
        } catch (JSONException unused) {
        }
    }

    public void r(int i, tt0 tt0Var) {
        try {
            this.b.put(i, tt0Var.c);
        } catch (JSONException unused) {
        }
    }

    public void s(String str) {
        try {
            this.a.put("objType", str);
        } catch (JSONException unused) {
        }
    }

    public void t(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ver", str);
        } catch (JSONException unused) {
        }
    }
}
