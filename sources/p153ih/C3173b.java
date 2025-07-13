package p153ih;

/* renamed from: ih.b */
/* loaded from: classes.dex */
public final class C3173b {

    /* renamed from: a */
    public static final p153ih.C3172a f12672a = null;

    static {
            java.lang.Class<ih.a> r0 = p153ih.C3172a.class
            java.lang.String r1 = "java.specification.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r1 != 0) goto Ld
            goto L47
        Ld:
            r3 = 6
            r4 = 46
            r5 = 0
            int r3 = p362uh.C6467m.m13069Z(r1, r4, r5, r5, r3)
            if (r3 >= 0) goto L1e
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L47
            int r1 = r1 * r2
            goto L4a
        L1e:
            int r6 = r3 + 1
            r7 = 4
            int r4 = p362uh.C6467m.m13069Z(r1, r4, r6, r5, r7)
            if (r4 >= 0) goto L2b
            int r4 = r1.length()
        L2b:
            java.lang.String r3 = r1.substring(r5, r3)
            java.lang.String r5 = "this as java.lang.String\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r3, r5)
            java.lang.String r1 = r1.substring(r6, r4)
            p214m2.C4339q.m9705j(r1, r5)
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L47
            int r3 = r3 * r2
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L47
            int r1 = r1 + r3
            goto L4a
        L47:
            r1 = 65542(0x10006, float:9.1844E-41)
        L4a:
            r3 = 65544(0x10008, float:9.1847E-41)
            java.lang.String r4 = ", base type classloader: "
            java.lang.String r5 = "Instance class was loaded from a different classloader: "
            java.lang.String r6 = "forName(\"kotlin.internal\u2026entations\").newInstance()"
            if (r1 >= r3) goto L57
            if (r1 >= r2) goto Ld4
        L57:
            java.lang.Class<kh.a> r3 = kh.C4127a.class
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.ClassNotFoundException -> L93
            p214m2.C4339q.m9705j(r3, r6)     // Catch: java.lang.ClassNotFoundException -> L93
            ih.a r3 = (p153ih.C3172a) r3     // Catch: java.lang.ClassCastException -> L64 java.lang.ClassNotFoundException -> L93
            goto L15c
        L64:
            r7 = move-exception
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.ClassNotFoundException -> L93
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L93
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L93
            boolean r9 = p214m2.C4339q.m9702c(r3, r8)     // Catch: java.lang.ClassNotFoundException -> L93
            if (r9 != 0) goto L92
            java.lang.ClassNotFoundException r9 = new java.lang.ClassNotFoundException     // Catch: java.lang.ClassNotFoundException -> L93
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L93
            r10.<init>()     // Catch: java.lang.ClassNotFoundException -> L93
            r10.append(r5)     // Catch: java.lang.ClassNotFoundException -> L93
            r10.append(r3)     // Catch: java.lang.ClassNotFoundException -> L93
            r10.append(r4)     // Catch: java.lang.ClassNotFoundException -> L93
            r10.append(r8)     // Catch: java.lang.ClassNotFoundException -> L93
            java.lang.String r3 = r10.toString()     // Catch: java.lang.ClassNotFoundException -> L93
            r9.<init>(r3, r7)     // Catch: java.lang.ClassNotFoundException -> L93
            throw r9     // Catch: java.lang.ClassNotFoundException -> L93
        L92:
            throw r7     // Catch: java.lang.ClassNotFoundException -> L93
        L93:
            java.lang.String r3 = "kotlin.internal.JRE8PlatformImplementations"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> Ld3
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.ClassNotFoundException -> Ld3
            p214m2.C4339q.m9705j(r3, r6)     // Catch: java.lang.ClassNotFoundException -> Ld3
            ih.a r3 = (p153ih.C3172a) r3     // Catch: java.lang.ClassCastException -> La4 java.lang.ClassNotFoundException -> Ld3
            goto L15c
        La4:
            r7 = move-exception
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.ClassNotFoundException -> Ld3
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> Ld3
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> Ld3
            boolean r9 = p214m2.C4339q.m9702c(r3, r8)     // Catch: java.lang.ClassNotFoundException -> Ld3
            if (r9 != 0) goto Ld2
            java.lang.ClassNotFoundException r9 = new java.lang.ClassNotFoundException     // Catch: java.lang.ClassNotFoundException -> Ld3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> Ld3
            r10.<init>()     // Catch: java.lang.ClassNotFoundException -> Ld3
            r10.append(r5)     // Catch: java.lang.ClassNotFoundException -> Ld3
            r10.append(r3)     // Catch: java.lang.ClassNotFoundException -> Ld3
            r10.append(r4)     // Catch: java.lang.ClassNotFoundException -> Ld3
            r10.append(r8)     // Catch: java.lang.ClassNotFoundException -> Ld3
            java.lang.String r3 = r10.toString()     // Catch: java.lang.ClassNotFoundException -> Ld3
            r9.<init>(r3, r7)     // Catch: java.lang.ClassNotFoundException -> Ld3
            throw r9     // Catch: java.lang.ClassNotFoundException -> Ld3
        Ld2:
            throw r7     // Catch: java.lang.ClassNotFoundException -> Ld3
        Ld3:
        Ld4:
            r3 = 65543(0x10007, float:9.1845E-41)
            if (r1 >= r3) goto Ldb
            if (r1 >= r2) goto L157
        Ldb:
            java.lang.Class<jh.a> r1 = p174jh.C3610a.class
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.ClassNotFoundException -> L117
            p214m2.C4339q.m9705j(r1, r6)     // Catch: java.lang.ClassNotFoundException -> L117
            r3 = r1
            ih.a r3 = (p153ih.C3172a) r3     // Catch: java.lang.ClassCastException -> Le8 java.lang.ClassNotFoundException -> L117
            goto L15c
        Le8:
            r2 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.ClassNotFoundException -> L117
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L117
            java.lang.ClassLoader r3 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L117
            boolean r7 = p214m2.C4339q.m9702c(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L117
            if (r7 != 0) goto L116
            java.lang.ClassNotFoundException r7 = new java.lang.ClassNotFoundException     // Catch: java.lang.ClassNotFoundException -> L117
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L117
            r8.<init>()     // Catch: java.lang.ClassNotFoundException -> L117
            r8.append(r5)     // Catch: java.lang.ClassNotFoundException -> L117
            r8.append(r1)     // Catch: java.lang.ClassNotFoundException -> L117
            r8.append(r4)     // Catch: java.lang.ClassNotFoundException -> L117
            r8.append(r3)     // Catch: java.lang.ClassNotFoundException -> L117
            java.lang.String r1 = r8.toString()     // Catch: java.lang.ClassNotFoundException -> L117
            r7.<init>(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L117
            throw r7     // Catch: java.lang.ClassNotFoundException -> L117
        L116:
            throw r2     // Catch: java.lang.ClassNotFoundException -> L117
        L117:
            java.lang.String r1 = "kotlin.internal.JRE7PlatformImplementations"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L157
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.ClassNotFoundException -> L157
            p214m2.C4339q.m9705j(r1, r6)     // Catch: java.lang.ClassNotFoundException -> L157
            r3 = r1
            ih.a r3 = (p153ih.C3172a) r3     // Catch: java.lang.ClassCastException -> L128 java.lang.ClassNotFoundException -> L157
            goto L15c
        L128:
            r2 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.ClassNotFoundException -> L157
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L157
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L157
            boolean r3 = p214m2.C4339q.m9702c(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L157
            if (r3 != 0) goto L156
            java.lang.ClassNotFoundException r3 = new java.lang.ClassNotFoundException     // Catch: java.lang.ClassNotFoundException -> L157
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L157
            r6.<init>()     // Catch: java.lang.ClassNotFoundException -> L157
            r6.append(r5)     // Catch: java.lang.ClassNotFoundException -> L157
            r6.append(r1)     // Catch: java.lang.ClassNotFoundException -> L157
            r6.append(r4)     // Catch: java.lang.ClassNotFoundException -> L157
            r6.append(r0)     // Catch: java.lang.ClassNotFoundException -> L157
            java.lang.String r0 = r6.toString()     // Catch: java.lang.ClassNotFoundException -> L157
            r3.<init>(r0, r2)     // Catch: java.lang.ClassNotFoundException -> L157
            throw r3     // Catch: java.lang.ClassNotFoundException -> L157
        L156:
            throw r2     // Catch: java.lang.ClassNotFoundException -> L157
        L157:
            ih.a r3 = new ih.a
            r3.<init>()
        L15c:
            p153ih.C3173b.f12672a = r3
            return
    }
}
