package p124h7;

/* renamed from: h7.cd */
/* loaded from: classes.dex */
public final class C2571cd {

    /* renamed from: a */
    public final int f11421a;

    public C2571cd(java.lang.String r9) {
            r8 = this;
            r8.<init>()
            r0 = 0
            r1 = 2
            r2 = 3
            r3 = 1
            r4 = -1
            java.lang.String r5 = "[.-]"
            h7.hd r5 = p124h7.C2661hd.m6803g(r5)     // Catch: java.lang.IllegalArgumentException -> L4c
            java.util.List r5 = r5.m6809i(r9)     // Catch: java.lang.IllegalArgumentException -> L4c
            int r6 = r5.size()     // Catch: java.lang.IllegalArgumentException -> L4c
            if (r6 != r3) goto L1d
            int r4 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.IllegalArgumentException -> L4c
            goto L64
        L1d:
            int r6 = r5.size()     // Catch: java.lang.IllegalArgumentException -> L4c
            if (r6 < r2) goto L64
            java.lang.Object r6 = r5.get(r0)     // Catch: java.lang.IllegalArgumentException -> L4c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.IllegalArgumentException -> L4c
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.IllegalArgumentException -> L4c
            r7 = 1000000(0xf4240, float:1.401298E-39)
            int r6 = r6 * r7
            java.lang.Object r7 = r5.get(r3)     // Catch: java.lang.IllegalArgumentException -> L4c
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.IllegalArgumentException -> L4c
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.IllegalArgumentException -> L4c
            int r7 = r7 * 1000
            int r7 = r7 + r6
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.IllegalArgumentException -> L4c
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.IllegalArgumentException -> L4c
            int r9 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.IllegalArgumentException -> L4c
            int r4 = r7 + r9
            goto L64
        L4c:
            r5 = move-exception
            java.lang.String r6 = "LibraryVersionContainer"
            boolean r2 = android.util.Log.isLoggable(r6, r2)
            if (r2 == 0) goto L64
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            r1[r3] = r5
            java.lang.String r9 = "Version code parsing failed for: %s with exception %s."
            java.lang.String r9 = java.lang.String.format(r9, r1)
            android.util.Log.d(r6, r9)
        L64:
            r8.f11421a = r4
            return
    }

    /* renamed from: b */
    public static java.lang.String m6532b() {
            o6.n r0 = p248o6.C4922n.f19518c
            java.lang.String r1 = "firebase-auth"
            java.util.Objects.requireNonNull(r0)
            java.lang.String r2 = "Failed to get app version for libraryName: "
            java.lang.String r3 = "LibraryVersion"
            java.lang.String r4 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.C1101a.m3101f(r1, r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r4 = r0.f19519a
            boolean r4 = r4.containsKey(r1)
            java.lang.String r5 = "UNKNOWN"
            if (r4 == 0) goto L24
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r0.f19519a
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L105
        L24:
            java.util.Properties r4 = new java.util.Properties
            r4.<init>()
            r6 = 0
            java.lang.String r7 = "/%s.properties"
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lb7
            r9 = 0
            r8[r9] = r1     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lb7
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lb7
            java.lang.Class<o6.n> r8 = p248o6.C4922n.class
            java.io.InputStream r7 = r8.getResourceAsStream(r7)     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lb7
            if (r7 == 0) goto L80
            r4.load(r7)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            java.lang.String r8 = "version"
            java.lang.String r6 = r4.getProperty(r8, r6)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            o6.j r4 = p248o6.C4922n.f19517b     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            int r8 = r1.length()     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            int r8 = r8 + 12
            java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            int r9 = r9.length()     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            r9.append(r1)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            java.lang.String r8 = " version is "
            r9.append(r8)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            r9.append(r6)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            r9 = 2
            boolean r9 = r4.m11069a(r9)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            if (r9 == 0) goto La5
            java.lang.String r4 = r4.f19508b     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            if (r4 != 0) goto L78
            goto L7c
        L78:
            java.lang.String r8 = r4.concat(r8)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
        L7c:
            android.util.Log.v(r3, r8)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            goto La5
        L80:
            o6.j r4 = p248o6.C4922n.f19517b     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            int r8 = r1.length()     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            if (r8 == 0) goto L8d
            java.lang.String r8 = r2.concat(r1)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            goto L92
        L8d:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
        L92:
            r9 = 5
            boolean r9 = r4.m11069a(r9)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            if (r9 == 0) goto La5
            java.lang.String r4 = r4.f19508b     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
            if (r4 != 0) goto L9e
            goto La2
        L9e:
            java.lang.String r8 = r4.concat(r8)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
        La2:
            android.util.Log.w(r3, r8)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Lb0
        La5:
            if (r7 == 0) goto Le5
            r7.close()     // Catch: java.io.IOException -> Lab
            goto Le5
        Lab:
            goto Le5
        Lad:
            r0 = move-exception
            goto L117
        Lb0:
            r4 = move-exception
            r10 = r7
            r7 = r6
            r6 = r10
            goto Lb9
        Lb5:
            r0 = move-exception
            goto L116
        Lb7:
            r4 = move-exception
            r7 = r6
        Lb9:
            o6.j r8 = p248o6.C4922n.f19517b     // Catch: java.lang.Throwable -> Lb5
            int r9 = r1.length()     // Catch: java.lang.Throwable -> Lb5
            if (r9 == 0) goto Lc6
            java.lang.String r2 = r2.concat(r1)     // Catch: java.lang.Throwable -> Lb5
            goto Lcc
        Lc6:
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Throwable -> Lb5
            r9.<init>(r2)     // Catch: java.lang.Throwable -> Lb5
            r2 = r9
        Lcc:
            r9 = 6
            boolean r9 = r8.m11069a(r9)     // Catch: java.lang.Throwable -> Lb5
            if (r9 == 0) goto Ldf
            java.lang.String r8 = r8.f19508b     // Catch: java.lang.Throwable -> Lb5
            if (r8 != 0) goto Ld8
            goto Ldc
        Ld8:
            java.lang.String r2 = r8.concat(r2)     // Catch: java.lang.Throwable -> Lb5
        Ldc:
            android.util.Log.e(r3, r2, r4)     // Catch: java.lang.Throwable -> Lb5
        Ldf:
            if (r6 == 0) goto Le4
            r6.close()     // Catch: java.io.IOException -> Le4
        Le4:
            r6 = r7
        Le5:
            if (r6 != 0) goto Lff
            o6.j r2 = p248o6.C4922n.f19517b
            java.lang.String r4 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r6 = 3
            boolean r6 = r2.m11069a(r6)
            if (r6 == 0) goto Lfe
            java.lang.String r2 = r2.f19508b
            if (r2 != 0) goto Lf7
            goto Lfb
        Lf7:
            java.lang.String r4 = r2.concat(r4)
        Lfb:
            android.util.Log.d(r3, r4)
        Lfe:
            r6 = r5
        Lff:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r0.f19519a
            r0.put(r1, r6)
            r0 = r6
        L105:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L113
            boolean r1 = r0.equals(r5)
            if (r1 == 0) goto L112
            goto L113
        L112:
            return r0
        L113:
            java.lang.String r0 = "-1"
            return r0
        L116:
            r7 = r6
        L117:
            if (r7 == 0) goto L11c
            r7.close()     // Catch: java.io.IOException -> L11c
        L11c:
            throw r0
    }

    /* renamed from: a */
    public final java.lang.String m6533a() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.f11421a
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "X%s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
