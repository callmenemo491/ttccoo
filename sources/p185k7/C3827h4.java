package p185k7;

/* renamed from: k7.h4 */
/* loaded from: classes.dex */
public /* synthetic */ class C3827h4 implements p185k7.InterfaceC3986t4 {

    /* renamed from: Y */
    public android.content.Context f16660Y;

    public C3827h4(android.content.Context r2, int r3) {
            r1 = this;
            r0 = 1
            if (r3 == r0) goto L1b
            r0 = 2
            if (r3 == r0) goto L15
            r0 = 3
            if (r3 == r0) goto Lf
            r1.<init>()
            r1.f16660Y = r2
            return
        Lf:
            r1.<init>()
            r1.f16660Y = r2
            return
        L15:
            r1.<init>()
            r1.f16660Y = r2
            return
        L1b:
            r1.<init>()
            r1.f16660Y = r2
            return
    }

    @Override // p185k7.InterfaceC3986t4
    /* renamed from: a */
    public java.lang.Object mo8217a() {
            r13 = this;
            java.lang.String r0 = "HermeticFileOverrides"
            android.content.Context r1 = r13.f16660Y
            java.lang.Object r2 = p185k7.AbstractC3921o4.f16797f
            java.lang.String r2 = android.os.Build.TYPE
            java.lang.String r3 = android.os.Build.TAGS
            java.lang.String r4 = "eng"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L1b
            java.lang.String r4 = "userdebug"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L1b
            goto L2c
        L1b:
            java.lang.String r2 = "dev-keys"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L30
            java.lang.String r2 = "test-keys"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L2c
            goto L30
        L2c:
            k7.q4<java.lang.Object> r0 = p185k7.C3947q4.f16843Y
            goto L142
        L30:
            boolean r2 = p185k7.C4011v3.m9072a()
            if (r2 == 0) goto L40
            boolean r2 = r1.isDeviceProtectedStorage()
            if (r2 != 0) goto L40
            android.content.Context r1 = r1.createDeviceProtectedStorageContext()
        L40:
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> L143
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch: java.lang.RuntimeException -> L64 java.lang.Throwable -> L143
            java.lang.String r5 = "phenotype_hermetic"
            java.io.File r1 = r1.getDir(r5, r3)     // Catch: java.lang.RuntimeException -> L64 java.lang.Throwable -> L143
            java.lang.String r5 = "overrides.txt"
            r4.<init>(r1, r5)     // Catch: java.lang.RuntimeException -> L64 java.lang.Throwable -> L143
            boolean r1 = r4.exists()     // Catch: java.lang.Throwable -> L143
            if (r1 == 0) goto L61
            k7.s4 r1 = new k7.s4     // Catch: java.lang.Throwable -> L143
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L143
            goto L6b
        L61:
            k7.q4<java.lang.Object> r1 = p185k7.C3947q4.f16843Y     // Catch: java.lang.Throwable -> L143
            goto L6b
        L64:
            r1 = move-exception
            java.lang.String r4 = "no data dir"
            android.util.Log.e(r0, r4, r1)     // Catch: java.lang.Throwable -> L143
            goto L61
        L6b:
            boolean r4 = r1.mo8908b()     // Catch: java.lang.Throwable -> L143
            if (r4 == 0) goto L13d
            java.lang.Object r1 = r1.mo8907a()     // Catch: java.lang.Throwable -> L143
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L143
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.io.IOException -> L136 java.lang.Throwable -> L143
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L136 java.lang.Throwable -> L143
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.io.IOException -> L136 java.lang.Throwable -> L143
            r6.<init>(r1)     // Catch: java.io.IOException -> L136 java.lang.Throwable -> L143
            r5.<init>(r6)     // Catch: java.io.IOException -> L136 java.lang.Throwable -> L143
            r4.<init>(r5)     // Catch: java.io.IOException -> L136 java.lang.Throwable -> L143
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> L131
            r5.<init>()     // Catch: java.lang.Throwable -> L131
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L131
            r6.<init>()     // Catch: java.lang.Throwable -> L131
        L90:
            java.lang.String r7 = r4.readLine()     // Catch: java.lang.Throwable -> L131
            if (r7 == 0) goto L104
            java.lang.String r8 = " "
            r9 = 3
            java.lang.String[] r8 = r7.split(r8, r9)     // Catch: java.lang.Throwable -> L131
            int r10 = r8.length     // Catch: java.lang.Throwable -> L131
            if (r10 == r9) goto Lb6
            java.lang.String r8 = "Invalid: "
            int r9 = r7.length()     // Catch: java.lang.Throwable -> L131
            if (r9 == 0) goto Lad
            java.lang.String r7 = r8.concat(r7)     // Catch: java.lang.Throwable -> L131
            goto Lb2
        Lad:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L131
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L131
        Lb2:
            android.util.Log.e(r0, r7)     // Catch: java.lang.Throwable -> L131
            goto L90
        Lb6:
            r7 = r8[r3]     // Catch: java.lang.Throwable -> L131
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Throwable -> L131
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L131
            r7 = 1
            r7 = r8[r7]     // Catch: java.lang.Throwable -> L131
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L131
            r10.<init>(r7)     // Catch: java.lang.Throwable -> L131
            java.lang.String r7 = android.net.Uri.decode(r10)     // Catch: java.lang.Throwable -> L131
            r10 = 2
            r11 = r8[r10]     // Catch: java.lang.Throwable -> L131
            java.lang.Object r11 = r6.get(r11)     // Catch: java.lang.Throwable -> L131
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L131
            if (r11 != 0) goto Lec
            r8 = r8[r10]     // Catch: java.lang.Throwable -> L131
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L131
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L131
            java.lang.String r11 = android.net.Uri.decode(r10)     // Catch: java.lang.Throwable -> L131
            int r8 = r11.length()     // Catch: java.lang.Throwable -> L131
            r12 = 1024(0x400, float:1.435E-42)
            if (r8 < r12) goto Le9
            if (r11 != r10) goto Lec
        Le9:
            r6.put(r10, r11)     // Catch: java.lang.Throwable -> L131
        Lec:
            boolean r8 = r5.containsKey(r9)     // Catch: java.lang.Throwable -> L131
            if (r8 != 0) goto Lfa
            java.util.HashMap r8 = new java.util.HashMap     // Catch: java.lang.Throwable -> L131
            r8.<init>()     // Catch: java.lang.Throwable -> L131
            r5.put(r9, r8)     // Catch: java.lang.Throwable -> L131
        Lfa:
            java.lang.Object r8 = r5.get(r9)     // Catch: java.lang.Throwable -> L131
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L131
            r8.put(r7, r11)     // Catch: java.lang.Throwable -> L131
            goto L90
        L104:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L131
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L131
            int r3 = r3 + 7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L131
            java.lang.String r3 = "Parsed "
            r6.append(r3)     // Catch: java.lang.Throwable -> L131
            r6.append(r1)     // Catch: java.lang.Throwable -> L131
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L131
            android.util.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L131
            k7.e4 r0 = new k7.e4     // Catch: java.lang.Throwable -> L131
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L131
            r4.close()     // Catch: java.io.IOException -> L136 java.lang.Throwable -> L143
            k7.s4 r1 = new k7.s4     // Catch: java.lang.Throwable -> L143
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L143
            r0 = r1
            goto L13f
        L131:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L135
        L135:
            throw r0     // Catch: java.io.IOException -> L136 java.lang.Throwable -> L143
        L136:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L143
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L143
            throw r1     // Catch: java.lang.Throwable -> L143
        L13d:
            k7.q4<java.lang.Object> r0 = p185k7.C3947q4.f16843Y     // Catch: java.lang.Throwable -> L143
        L13f:
            android.os.StrictMode.setThreadPolicy(r2)
        L142:
            return r0
        L143:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)
            throw r0
    }

    /* renamed from: b */
    public java.io.File m8568b() {
            r3 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r3.f16660Y
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = ".com.google.firebase.crashlytics"
            r0.<init>(r1, r2)
            r1 = 0
            boolean r2 = r0.exists()
            if (r2 != 0) goto L23
            boolean r2 = r0.mkdirs()
            if (r2 == 0) goto L1b
            goto L23
        L1b:
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r2 = "Couldn't create file"
            android.util.Log.w(r0, r2, r1)
            r0 = r1
        L23:
            return r0
    }

    /* renamed from: c */
    public java.io.File m8569c() {
            r4 = this;
            java.io.File r0 = new java.io.File
            k7.h4 r1 = new k7.h4
            android.content.Context r2 = r4.f16660Y
            r3 = 1
            r1.<init>(r2, r3)
            java.io.File r1 = r1.m8568b()
            java.lang.String r2 = "com.crashlytics.settings.json"
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: d */
    public org.json.JSONObject m8570d() {
            r7 = this;
            java.lang.String r0 = "Error while closing settings cache file."
            r1 = 3
            java.lang.String r2 = "FirebaseCrashlytics"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            r3 = 0
            r4 = 1
            if (r1 == 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            r5 = 0
            if (r1 == 0) goto L18
            java.lang.String r1 = "Checking for cached settings..."
            android.util.Log.d(r2, r1, r5)
        L18:
            java.io.File r1 = r7.m8569c()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            boolean r6 = r1.exists()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r6 == 0) goto L34
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.String r1 = p056da.C1354e.m3870n(r3)     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L56
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L56
            r4.<init>(r1)     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L56
            r5 = r3
            goto L44
        L32:
            r1 = move-exception
            goto L4d
        L34:
            java.lang.String r1 = "Settings file does not exist."
            r6 = 2
            boolean r6 = android.util.Log.isLoggable(r2, r6)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r6 == 0) goto L3e
            r3 = 1
        L3e:
            if (r3 == 0) goto L43
            android.util.Log.v(r2, r1, r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
        L43:
            r4 = r5
        L44:
            p056da.C1354e.m3857a(r5, r0)
            r5 = r4
            goto L55
        L49:
            r1 = move-exception
            goto L58
        L4b:
            r1 = move-exception
            r3 = r5
        L4d:
            java.lang.String r4 = "Failed to fetch cached settings"
            android.util.Log.e(r2, r4, r1)     // Catch: java.lang.Throwable -> L56
            p056da.C1354e.m3857a(r3, r0)
        L55:
            return r5
        L56:
            r1 = move-exception
            r5 = r3
        L58:
            p056da.C1354e.m3857a(r5, r0)
            throw r1
    }

    /* renamed from: e */
    public java.lang.String m8571e(int r5) {
            r4 = this;
            r0 = 0
            android.content.Context r1 = r4.f16660Y     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.io.InputStream r5 = r1.openRawResource(r5)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r1 = new java.lang.String     // Catch: java.io.IOException -> L18 java.lang.Throwable -> L2a
            byte[] r2 = p039c9.C0937b.m2661b(r5)     // Catch: java.io.IOException -> L18 java.lang.Throwable -> L2a
            r1.<init>(r2)     // Catch: java.io.IOException -> L18 java.lang.Throwable -> L2a
            r5.close()     // Catch: java.io.IOException -> L17
        L17:
            return r1
        L18:
            r1 = move-exception
            goto L21
        L1a:
            r5 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L2b
        L1f:
            r1 = move-exception
            r5 = r0
        L21:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L29
            r5.close()     // Catch: java.io.IOException -> L29
        L29:
            return r0
        L2a:
            r0 = move-exception
        L2b:
            if (r5 == 0) goto L30
            r5.close()     // Catch: java.io.IOException -> L30
        L30:
            throw r0
    }
}
