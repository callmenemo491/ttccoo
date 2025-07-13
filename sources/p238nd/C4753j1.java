package p238nd;

/* renamed from: nd.j1 */
/* loaded from: classes.dex */
public final class C4753j1 {

    /* renamed from: a */
    public android.content.SharedPreferences f19056a;

    public C4753j1() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final android.content.SharedPreferences m10820a() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f19056a
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "pref"
            p214m2.C4339q.m9713w(r0)
            r0 = 0
            throw r0
    }

    /* renamed from: b */
    public final boolean m10821b() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.m10820a()
            java.lang.String r1 = "showNFTsValue"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    /* renamed from: c */
    public final boolean m10822c() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.m10820a()
            java.lang.String r1 = "showPriceGraphs"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    /* renamed from: d */
    public final boolean m10823d() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.m10820a()
            java.lang.String r1 = "showStakedWax"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    /* renamed from: e */
    public final java.util.Set<io.tacocrypto.app.p156ui.secret.EnumC3251c> m10824e() {
            r8 = this;
            android.content.SharedPreferences r0 = r8.m10820a()
            dh.m r1 = p062dh.C1477m.f7239Y
            java.lang.String r2 = "toolsFavorites"
            java.util.Set r0 = r0.getStringSet(r2, r1)
            if (r0 == 0) goto L4e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            io.tacocrypto.app.ui.secret.c[] r3 = io.tacocrypto.app.p156ui.secret.EnumC3251c.values()     // Catch: java.lang.Exception -> L43
            r4 = 0
            int r5 = r3.length     // Catch: java.lang.Exception -> L43
        L29:
            if (r4 >= r5) goto L3b
            r6 = r3[r4]     // Catch: java.lang.Exception -> L43
            java.lang.String r7 = r6.m7734k()     // Catch: java.lang.Exception -> L43
            boolean r7 = p214m2.C4339q.m9702c(r7, r2)     // Catch: java.lang.Exception -> L43
            if (r7 == 0) goto L38
            goto L44
        L38:
            int r4 = r4 + 1
            goto L29
        L3b:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = "Array contains no element matching the predicate."
            r2.<init>(r3)     // Catch: java.lang.Exception -> L43
            throw r2     // Catch: java.lang.Exception -> L43
        L43:
            r6 = 0
        L44:
            if (r6 == 0) goto L17
            r1.add(r6)
            goto L17
        L4a:
            java.util.Set r1 = p062dh.C1473i.m4011W(r1)
        L4e:
            return r1
    }

    /* renamed from: f */
    public final java.util.List<io.tacocrypto.app.p156ui.secret.EnumC3251c> m10825f() {
            r10 = this;
            android.content.SharedPreferences r0 = r10.m10820a()
            java.lang.String r1 = "toolsSorted"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto Lf
            java.lang.String r0 = ""
        Lf:
            java.lang.String r1 = ","
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r3 = 6
            r4 = 0
            java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r4, r4, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            io.tacocrypto.app.ui.secret.c[] r5 = io.tacocrypto.app.p156ui.secret.EnumC3251c.values()     // Catch: java.lang.Exception -> L50
            int r6 = r5.length     // Catch: java.lang.Exception -> L50
            r7 = 0
        L36:
            if (r7 >= r6) goto L48
            r8 = r5[r7]     // Catch: java.lang.Exception -> L50
            java.lang.String r9 = r8.m7734k()     // Catch: java.lang.Exception -> L50
            boolean r9 = p214m2.C4339q.m9702c(r9, r3)     // Catch: java.lang.Exception -> L50
            if (r9 == 0) goto L45
            goto L51
        L45:
            int r7 = r7 + 1
            goto L36
        L48:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException     // Catch: java.lang.Exception -> L50
            java.lang.String r5 = "Array contains no element matching the predicate."
            r3.<init>(r5)     // Catch: java.lang.Exception -> L50
            throw r3     // Catch: java.lang.Exception -> L50
        L50:
            r8 = r2
        L51:
            if (r8 == 0) goto L24
            r1.add(r8)
            goto L24
        L57:
            return r1
    }

    /* renamed from: g */
    public final void m10826g(java.util.Set<? extends io.tacocrypto.app.p156ui.secret.EnumC3251c> r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.m10820a()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p062dh.C1469e.m3992D(r4, r2)
            r1.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r4.next()
            io.tacocrypto.app.ui.secret.c r2 = (io.tacocrypto.app.p156ui.secret.EnumC3251c) r2
            java.lang.String r2 = r2.m7734k()
            r1.add(r2)
            goto L17
        L2b:
            java.util.Set r4 = p062dh.C1473i.m4011W(r1)
            java.lang.String r1 = "toolsFavorites"
            android.content.SharedPreferences$Editor r4 = r0.putStringSet(r1, r4)
            r4.apply()
            return
    }
}
