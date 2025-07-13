package gb;

/* renamed from: gb.c */
/* loaded from: classes.dex */
public class C2313c {

    /* renamed from: a */
    public final p273p9.C5378c f10535a;

    /* renamed from: b */
    public final java.util.concurrent.Executor f10536b;

    /* renamed from: c */
    public final p128hb.C2998c f10537c;

    /* renamed from: d */
    public final p128hb.C2998c f10538d;

    /* renamed from: e */
    public final p128hb.C2998c f10539e;

    /* renamed from: f */
    public final com.google.firebase.remoteconfig.internal.C1247a f10540f;

    /* renamed from: g */
    public final p128hb.C3001f f10541g;

    /* renamed from: h */
    public final com.google.firebase.remoteconfig.internal.C1248b f10542h;

    /* renamed from: i */
    public final p412xa.InterfaceC7011d f10543i;

    public C2313c(android.content.Context r1, p251o9.C5180d r2, p412xa.InterfaceC7011d r3, p273p9.C5378c r4, java.util.concurrent.Executor r5, p128hb.C2998c r6, p128hb.C2998c r7, p128hb.C2998c r8, com.google.firebase.remoteconfig.internal.C1247a r9, p128hb.C3001f r10, com.google.firebase.remoteconfig.internal.C1248b r11) {
            r0 = this;
            r0.<init>()
            r0.f10543i = r3
            r0.f10535a = r4
            r0.f10536b = r5
            r0.f10537c = r6
            r0.f10538d = r7
            r0.f10539e = r8
            r0.f10540f = r9
            r0.f10541g = r10
            r0.f10542h = r11
            return
    }

    /* renamed from: b */
    public static java.util.List<java.util.Map<java.lang.String, java.lang.String>> m6075b(org.json.JSONArray r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r7.length()
            if (r1 >= r2) goto L33
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            org.json.JSONObject r3 = r7.getJSONObject(r1)
            java.util.Iterator r4 = r3.keys()
        L19:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2d
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r3.getString(r5)
            r2.put(r5, r6)
            goto L19
        L2d:
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L33:
            return r0
    }

    /* renamed from: a */
    public p327s7.AbstractC5985i<java.lang.Boolean> m6076a() {
            r6 = this;
            com.google.firebase.remoteconfig.internal.a r0 = r6.f10540f
            com.google.firebase.remoteconfig.internal.b r1 = r0.f6644g
            android.content.SharedPreferences r1 = r1.f6651a
            long r2 = com.google.firebase.remoteconfig.internal.C1247a.f6636i
            java.lang.String r4 = "minimum_fetch_interval_in_seconds"
            long r1 = r1.getLong(r4, r2)
            hb.c r3 = r0.f6642e
            s7.i r3 = r3.m7370b()
            java.util.concurrent.Executor r4 = r0.f6640c
            b4.j r5 = new b4.j
            r5.<init>(r0, r1)
            s7.i r0 = r3.mo12449g(r4, r5)
            k1.b r1 = p179k1.C3642b.f16070s0
            s7.i r0 = r0.mo12457o(r1)
            java.util.concurrent.Executor r1 = r6.f10536b
            gb.b r2 = new gb.b
            r3 = 0
            r2.<init>(r6, r3)
            s7.i r0 = r0.mo12456n(r1, r2)
            return r0
    }
}
