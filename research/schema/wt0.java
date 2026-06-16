package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wt0 {
    public String a;
    public wt0 b;
    public JSONObject c;
    public int d;

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(mg6 mg6Var, mg6 mg6Var2) {
            return ((Integer) mg6Var.b).intValue() - ((Integer) mg6Var2.b).intValue();
        }
    }

    public class b implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    public class c implements Comparator {
        public c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(mg6 mg6Var, mg6 mg6Var2) {
            return ((Integer) mg6Var.b).intValue() - ((Integer) mg6Var2.b).intValue();
        }
    }

    public wt0(int i, JSONObject jSONObject, wt0 wt0Var) {
        this.a = "" + i;
        this.b = wt0Var;
        this.c = jSONObject;
        r0();
    }

    public static String f(List list, String str) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(";");
        }
        sb.append(";");
        sb.append(str);
        return sb.toString();
    }

    public static String[] z(String str) {
        String[] strArrSplit = str.split("\\s+");
        return strArrSplit.length < 1 ? new String[]{str} : strArrSplit;
    }

    public bu6 A(String str, bu6 bu6Var) {
        try {
            return bu6.a(this.c.getJSONObject(str).getString("v"), bu6Var);
        } catch (JSONException unused) {
            return bu6Var;
        }
    }

    public String B() {
        return x("tag", "");
    }

    public String C() {
        return D("");
    }

    public String D(String str) {
        try {
            return this.c.getString("v");
        } catch (JSONException unused) {
            return str;
        }
    }

    public String E() {
        JSONObject jSONObject = this.c;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.getString("ver");
        } catch (JSONException unused) {
            return "";
        }
    }

    public void F(String str) {
        try {
            this.c.put("v", str);
            this.c.put("objType", str);
        } catch (JSONException unused) {
        }
    }

    public wt0 G(String str, String str2, String str3, String[] strArr) {
        return H(str, str2, str3, strArr, false);
    }

    public wt0 H(String str, String str2, String str3, String[] strArr, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("_child");
            for (String str4 : strArr) {
                sb.append(" ");
                sb.append(str4);
            }
            jSONObject.put("v", str2);
            jSONObject.put("t", sb.toString());
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str3);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
        return new wt0(str, jSONObject, this);
    }

    public wt0 I(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", "_dyn");
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
        return new wt0(str, jSONObject, this);
    }

    public final void J(String str, float[] fArr, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", zo.b(fArr));
            jSONObject.put("t", str3);
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void K(String str, float[] fArr, String str2) {
        L(str, fArr, str2, null);
    }

    public void L(String str, float[] fArr, String str2, String str3) {
        J(str, fArr, str2, "chsla4f", str3);
    }

    public void M(String str, float[] fArr) {
        try {
            JSONObject jSONObjectOptJSONObject = this.c.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            jSONObjectOptJSONObject.put("v", zo.b(fArr));
            this.c.put(str, jSONObjectOptJSONObject);
        } catch (JSONException unused) {
        }
    }

    public void N(String str, boolean z, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", z ? 1 : 0);
            jSONObject.put("t", "b");
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", (Object) null);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void O(String str, boolean z) {
        try {
            JSONObject jSONObjectOptJSONObject = this.c.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            jSONObjectOptJSONObject.put("v", z ? 1 : 0);
            this.c.put(str, jSONObjectOptJSONObject);
        } catch (JSONException unused) {
        }
    }

    public final void P(String str, float f, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", f);
            jSONObject.put("t", str3);
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void Q(String str, float f, String str2, float f2, float f3) {
        P(str, f, str2, "f " + f2 + " " + f3, null);
    }

    public void R(String str, float f, String str2, float f2, float f3, String str3) {
        P(str, f, str2, "f " + f2 + " " + f3, str3);
    }

    public void S(String str, float f) {
        try {
            JSONObject jSONObjectOptJSONObject = this.c.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            jSONObjectOptJSONObject.put("v", f);
            this.c.put(str, jSONObjectOptJSONObject);
        } catch (JSONException unused) {
        }
    }

    public final void T(String str, int i, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", i);
            jSONObject.put("t", str3);
            int i2 = this.d;
            this.d = i2 + 1;
            jSONObject.put("o", i2);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void U(String str, int i, String str2) {
        T(str, i, str2, "crgb", null);
    }

    public void V(String str, int i, String str2) {
        T(str, i, str2, "crgba", null);
    }

    public void W(String str, int i, String str2) {
        T(str, i, str2, "crgb_hl", null);
    }

    public void X(String str, int i, String str2) {
        T(str, i, str2, "ih", null);
    }

    public void Y(String str, int i, String str2, int i2, int i3) {
        T(str, i, str2, "i " + i2 + " " + i3, null);
    }

    public void Z(String str, int i, String str2, int i2, int i3) {
        T(str, i, str2, "ih " + i2 + " " + i3, null);
    }

    public void a0(String str, int i) {
        try {
            JSONObject jSONObjectOptJSONObject = this.c.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            jSONObjectOptJSONObject.put("v", i);
            this.c.put(str, jSONObjectOptJSONObject);
        } catch (JSONException unused) {
        }
    }

    public void b0(String str, lh3 lh3Var, String str2, float f, float f2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", lh3Var.toString());
            jSONObject.put("t", "mvarf " + f + " " + f2);
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void c0(String str, lh3 lh3Var) {
        try {
            JSONObject jSONObjectOptJSONObject = this.c.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            jSONObjectOptJSONObject.put("v", lh3Var.toString());
            this.c.put(str, jSONObjectOptJSONObject);
        } catch (JSONException unused) {
        }
    }

    public Map d() {
        Iterator<String> itKeys = this.c.keys();
        TreeMap treeMap = new TreeMap(new b());
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strQ = q(next, "0_general");
            if (strQ.length() > 0) {
                ut3 ut3Var = (ut3) treeMap.get(strQ);
                if (ut3Var == null) {
                    ut3Var = new ut3();
                    treeMap.put(strQ, ut3Var);
                }
                ut3Var.add(new mg6(next, Integer.valueOf(u(next))));
            }
        }
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ut3) it.next(), new c());
        }
        return treeMap;
    }

    public void d0(String str, lh3 lh3Var, String str2, float f, float f2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", lh3Var.toString());
            jSONObject.put("t", "mvarf2 " + f + " " + f2);
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public Iterator e() {
        Iterator<String> itKeys = this.c.keys();
        ut3 ut3Var = new ut3();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            ut3Var.add(new mg6(next, Integer.valueOf(u(next))));
        }
        Collections.sort(ut3Var, new a());
        return ut3Var.F();
    }

    public void e0(String str, String str2) {
        try {
            JSONObject jSONObjectOptJSONObject = this.c.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            if (str2 == null) {
                str2 = "";
            }
            jSONObjectOptJSONObject.put("v", str2);
            this.c.put(str, jSONObjectOptJSONObject);
        } catch (JSONException unused) {
        }
    }

    public final void f0(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("v", str2);
            jSONObject.put("t", str4);
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str3);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void g(String str, String str2) {
        if (this.c == null) {
            return;
        }
        while (this.c.length() > 0) {
            JSONObject jSONObject = this.c;
            jSONObject.remove(jSONObject.keys().next());
        }
        F(str);
        u0(str2);
    }

    public void g0(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("passet");
        for (String str4 : strArr) {
            sb.append(" ");
            sb.append(str4);
        }
        f0(str, str2, str3, sb.toString());
    }

    public wt0 h(String str) {
        try {
            return new wt0(str, this.c.getJSONObject(str), this);
        } catch (JSONException unused) {
            return new wt0(str, new JSONObject(), this);
        }
    }

    public void h0(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("img");
        for (String str4 : strArr) {
            sb.append(" ");
            sb.append(str4);
        }
        f0(str, str2, str3, sb.toString());
    }

    public String i() {
        try {
            return this.c.getString("_name");
        } catch (JSONException unused) {
            return "";
        }
    }

    public void i0(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("pimg");
        for (String str4 : strArr) {
            sb.append(" ");
            sb.append(str4);
        }
        f0(str, str2, str3, sb.toString());
    }

    public int j(String str) {
        int i = 0;
        while (true) {
            try {
                if (!this.c.has(str + i)) {
                    return i;
                }
                i++;
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public void j0(String str, String str2, String str3) {
        f0(str, str2, str3, "etxt");
    }

    public ArrayList k() {
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        return arrayList;
    }

    public void k0(String str, String str2, String str3) {
        f0(str, str2, str3, "ptxt");
    }

    public final void l(List list) {
        wt0 wt0Var = this.b;
        if (wt0Var != null) {
            wt0Var.l(list);
        }
        list.add(this.a);
    }

    public void l0(String str, String str2) {
        try {
            JSONObject jSONObjectOptJSONObject = this.c.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            if (str2 == null) {
                str2 = "";
            }
            jSONObjectOptJSONObject.put("v", str2);
            this.c.put(str, jSONObjectOptJSONObject);
        } catch (JSONException unused) {
        }
    }

    public wt0 m() {
        return this.b;
    }

    public final void m0(String str, bu6 bu6Var, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", bu6Var.toString());
            jSONObject.put("t", str3);
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public float[] n(String str, float[] fArr) {
        try {
            float[] fArr2 = new float[4];
            zo.a(this.c.getJSONObject(str).getString("v"), fArr2, fArr);
            return fArr2;
        } catch (JSONException unused) {
            return fArr;
        }
    }

    public void n0(String str, bu6 bu6Var, String str2, float f, float f2) {
        m0(str, bu6Var, str2, "f2 " + f + " " + f2, null);
    }

    public boolean o(String str, boolean z) {
        try {
            return this.c.getJSONObject(str).getInt("v") != 0;
        } catch (JSONException unused) {
            return z;
        }
    }

    public void o0(String str, bu6 bu6Var) {
        try {
            JSONObject jSONObjectOptJSONObject = this.c.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            jSONObjectOptJSONObject.put("v", bu6Var.toString());
            this.c.put(str, jSONObjectOptJSONObject);
        } catch (JSONException unused) {
        }
    }

    public float p(String str, float f) {
        try {
            return (float) this.c.getJSONObject(str).getDouble("v");
        } catch (JSONException unused) {
            return f;
        }
    }

    public void p0(String str, String str2, String str3, String[] strArr) {
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append("sel");
            for (String str4 : strArr) {
                sb.append(" ");
                sb.append(str4);
            }
            jSONObject.put("v", str2);
            jSONObject.put("t", sb.toString());
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str3);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public String q(String str, String str2) {
        try {
            return this.c.getJSONObject(str).getString("tag");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public void q0(String str) {
        this.c.remove(str);
    }

    public String r(String str) {
        try {
            return this.c.getJSONObject(str).getString("hint");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final void r0() {
        this.d = 0;
    }

    public int s(String str, int i) {
        try {
            return this.c.getJSONObject(str).getInt("v");
        } catch (JSONException unused) {
            return i;
        }
    }

    public void s0(String str) {
        try {
            this.c.put("_name", str);
        } catch (JSONException unused) {
        }
    }

    public lh3 t(String str, lh3 lh3Var) {
        try {
            return lh3.c(this.c.getJSONObject(str).getString("v"), lh3Var);
        } catch (JSONException unused) {
            return lh3Var;
        }
    }

    public void t0(String str) {
        k0("tag", str, "0_general");
    }

    public int u(String str) {
        try {
            return this.c.getJSONObject(str).getInt("o");
        } catch (JSONException unused) {
            return -1;
        }
    }

    public void u0(String str) {
        JSONObject jSONObject = this.c;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ver", str);
        } catch (JSONException unused) {
        }
    }

    public String v(String str, String str2) {
        try {
            return this.c.getJSONObject(str).getString("v");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public void v0(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = this.c.getJSONObject(str);
            jSONObject.put("t", str2);
            jSONObject.put("hint", str3);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public int w(String str, String[] strArr, int i) {
        return rr6.f(strArr, v(str, rr6.a(strArr, i, strArr[0])), i);
    }

    public String x(String str, String str2) {
        try {
            return this.c.getJSONObject(str).getString("v");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public String y(String str) {
        try {
            return this.c.getJSONObject(str).getString("t");
        } catch (JSONException unused) {
            return "";
        }
    }

    public wt0(String str, JSONObject jSONObject, wt0 wt0Var) {
        this.a = str;
        this.b = wt0Var;
        this.c = jSONObject;
        r0();
    }
}
