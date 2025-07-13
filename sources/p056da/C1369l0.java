package p056da;

/* renamed from: da.l0 */
/* loaded from: classes.dex */
public class C1369l0 {

    /* renamed from: a */
    public final p056da.C1347a0 f6926a;

    /* renamed from: b */
    public final p148ia.C3123e f6927b;

    /* renamed from: c */
    public final p168ja.C3456a f6928c;

    /* renamed from: d */
    public final p075ea.C1808b f6929d;

    /* renamed from: e */
    public final androidx.fragment.app.C0392l0 f6930e;

    public C1369l0(p056da.C1347a0 r1, p148ia.C3123e r2, p168ja.C3456a r3, p075ea.C1808b r4, androidx.fragment.app.C0392l0 r5) {
            r0 = this;
            r0.<init>()
            r0.f6926a = r1
            r0.f6927b = r2
            r0.f6928c = r3
            r0.f6929d = r4
            r0.f6930e = r5
            return
    }

    /* renamed from: b */
    public static java.lang.String m3885b(java.io.InputStream r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r3 = r3.name()
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r2.<init>(r4, r3)
            r1.<init>(r2)
        L19:
            int r4 = r1.read()     // Catch: java.lang.Throwable -> L2d
            r2 = -1
            if (r4 == r2) goto L25
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2d
            r0.append(r4)     // Catch: java.lang.Throwable -> L2d
            goto L19
        L25:
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L2d
            r1.close()
            return r4
        L2d:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r0 = move-exception
            r4.addSuppressed(r0)
        L36:
            throw r4
    }

    /* renamed from: c */
    public static p056da.C1369l0 m3886c(android.content.Context r7, p056da.C1361h0 r8, p185k7.C3827h4 r9, p056da.C1346a r10, p075ea.C1808b r11, androidx.fragment.app.C0392l0 r12, ma.InterfaceC4509c r13, p188ka.InterfaceC4076c r14) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            android.content.Context r9 = r9.f16660Y
            java.io.File r9 = r9.getFilesDir()
            java.lang.String r2 = ".com.google.firebase.crashlytics"
            r1.<init>(r9, r2)
            java.lang.String r9 = r1.getPath()
            r0.<init>(r9)
            da.a0 r2 = new da.a0
            r2.<init>(r7, r8, r10, r13)
            ia.e r3 = new ia.e
            r3.<init>(r0, r14)
            ga.a r8 = p168ja.C3456a.f14928b
            p385w3.C6791m.m13811b(r7)
            w3.m r7 = p385w3.C6791m.m13810a()
            u3.a r8 = new u3.a
            java.lang.String r9 = p168ja.C3456a.f14929c
            java.lang.String r10 = p168ja.C3456a.f14930d
            r8.<init>(r9, r10)
            t3.g r7 = r7.m13812c(r8)
            java.lang.Class<fa.a0> r8 = p094fa.AbstractC2103a0.class
            t3.b r9 = new t3.b
            java.lang.String r10 = "json"
            r9.<init>(r10)
            t3.e<fa.a0, byte[]> r10 = p168ja.C3456a.f14931e
            w3.j r7 = (p385w3.C6788j) r7
            java.lang.String r13 = "FIREBASE_CRASHLYTICS_REPORT"
            t3.f r7 = r7.mo12698a(r13, r8, r9, r10)
            ja.a r4 = new ja.a
            r4.<init>(r7, r10)
            da.l0 r7 = new da.l0
            r1 = r7
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
    }

    /* renamed from: d */
    public static java.util.List<p094fa.AbstractC2103a0.c> m3887d(java.util.Map<java.lang.String, java.lang.String> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.size()
            r0.ensureCapacity(r1)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "Null key"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "Null value"
            java.util.Objects.requireNonNull(r1, r3)
            fa.d r3 = new fa.d
            r4 = 0
            r3.<init>(r2, r1, r4)
            r0.add(r3)
            goto L14
        L40:
            e5.d r5 = p070e5.C1519d.f7379b0
            java.util.Collections.sort(r0, r5)
            return r0
    }

    /* renamed from: a */
    public final p094fa.AbstractC2103a0.e.d m3888a(p094fa.AbstractC2103a0.e.d r4, p075ea.C1808b r5, androidx.fragment.app.C0392l0 r6) {
            r3 = this;
            fa.a0$e$d$b r0 = r4.mo5617f()
            ea.a r5 = r5.f7858c
            java.lang.String r5 = r5.mo4546b()
            r1 = 0
            if (r5 == 0) goto L18
            fa.t r2 = new fa.t
            r2.<init>(r5, r1)
            r5 = r0
            fa.k$b r5 = (p094fa.C2115k.b) r5
            r5.f9745e = r2
            goto L26
        L18:
            r5 = 2
            java.lang.String r2 = "FirebaseCrashlytics"
            boolean r5 = android.util.Log.isLoggable(r2, r5)
            if (r5 == 0) goto L26
            java.lang.String r5 = "No log data to include with this event."
            android.util.Log.v(r2, r5, r1)
        L26:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r5 = r6.f2231a0
            da.j0 r5 = (p056da.C1365j0) r5
            java.util.Map r5 = r5.m3880a()
            java.util.List r5 = m3887d(r5)
            java.lang.Object r6 = r6.f2232b0
            da.j0 r6 = (p056da.C1365j0) r6
            java.util.Map r6 = r6.m3880a()
            java.util.List r6 = m3887d(r6)
            r1 = r5
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6b
            fa.a0$e$d$a r4 = r4.mo5612a()
            fa.a0$e$d$a$a r4 = r4.mo5623f()
            fa.b0 r1 = new fa.b0
            r1.<init>(r5)
            fa.l$b r4 = (p094fa.C2116l.b) r4
            r4.f9752b = r1
            fa.b0 r5 = new fa.b0
            r5.<init>(r6)
            r4.f9753c = r5
            fa.a0$e$d$a r4 = r4.m5688a()
            r5 = r0
            fa.k$b r5 = (p094fa.C2115k.b) r5
            java.util.Objects.requireNonNull(r5)
            r5.f9743c = r4
        L6b:
            fa.a0$e$d r4 = r0.mo5649a()
            return r4
    }

    /* renamed from: e */
    public java.util.List<java.lang.String> m3889e() {
            r3 = this;
            ia.e r0 = r3.f6927b
            java.io.File r0 = r0.f12527b
            java.util.List r0 = p148ia.C3123e.m7579b(r0)
            java.util.Comparator<? super java.io.File> r1 = p148ia.C3123e.f12524j
            java.util.Collections.sort(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r2 = r2.getName()
            r1.add(r2)
            goto L16
        L2a:
            return r1
    }

    /* renamed from: f */
    public final void m3890f(java.lang.Throwable r24, java.lang.Thread r25, java.lang.String r26, java.lang.String r27, long r28, boolean r30) {
            r23 = this;
            r0 = r23
            r1 = r25
            r4 = r27
            java.lang.String r2 = "crash"
            boolean r9 = r4.equals(r2)
            da.a0 r2 = r0.f6926a
            android.content.Context r3 = r2.f6871a
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.orientation
            v.c r5 = new v.c
            ma.c r6 = r2.f6874d
            r7 = r24
            r5.<init>(r7, r6)
            java.lang.String r6 = "Null type"
            java.util.Objects.requireNonNull(r4, r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r28)
            da.a r7 = r2.f6873c
            java.lang.String r7 = r7.f6865d
            android.content.Context r8 = r2.f6871a
            java.lang.String r10 = "activity"
            java.lang.Object r8 = r8.getSystemService(r10)
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8
            java.util.List r8 = r8.getRunningAppProcesses()
            r10 = 0
            if (r8 == 0) goto L5a
            java.util.Iterator r8 = r8.iterator()
        L45:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L5a
            java.lang.Object r11 = r8.next()
            android.app.ActivityManager$RunningAppProcessInfo r11 = (android.app.ActivityManager.RunningAppProcessInfo) r11
            java.lang.String r12 = r11.processName
            boolean r12 = r12.equals(r7)
            if (r12 == 0) goto L45
            goto L5b
        L5a:
            r11 = r10
        L5b:
            r7 = 0
            if (r11 == 0) goto L6b
            int r8 = r11.importance
            r10 = 100
            if (r8 == r10) goto L66
            r8 = 1
            goto L67
        L66:
            r8 = 0
        L67:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)
        L6b:
            r15 = r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r19 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            v.e r11 = r5.f25077a0
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            r12 = 4
            fa.a0$e$d$a$b$d r11 = r2.m3849f(r1, r11, r12)
            r10.add(r11)
            if (r30 == 0) goto Lbd
            java.util.Map r11 = java.lang.Thread.getAllStackTraces()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L91:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lbd
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            java.lang.Thread r13 = (java.lang.Thread) r13
            boolean r14 = r13.equals(r1)
            if (r14 != 0) goto L91
            ma.c r14 = r2.f6874d
            java.lang.Object r12 = r12.getValue()
            java.lang.StackTraceElement[] r12 = (java.lang.StackTraceElement[]) r12
            java.lang.StackTraceElement[] r12 = r14.mo10389a(r12)
            fa.a0$e$d$a$b$d r12 = r2.m3849f(r13, r12, r7)
            r10.add(r12)
            goto L91
        Lbd:
            fa.b0 r1 = new fa.b0
            r1.<init>(r10)
            r10 = 8
            r11 = 4
            fa.a0$e$d$a$b$b r18 = r2.m3846c(r5, r11, r10, r7)
            fa.a0$e$d$a$b$c r20 = r2.m3848e()
            fa.b0 r21 = r2.m3844a()
            fa.m r12 = new fa.m
            r22 = 0
            r16 = r12
            r17 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = ""
            if (r8 != 0) goto Le3
            java.lang.String r5 = " uiOrientation"
            goto Le4
        Le3:
            r5 = r1
        Le4:
            boolean r7 = r5.isEmpty()
            java.lang.String r10 = "Missing required properties:"
            if (r7 == 0) goto L132
            fa.l r5 = new fa.l
            int r16 = r8.intValue()
            r17 = 0
            r14 = 0
            r13 = 0
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17)
            fa.a0$e$d$c r7 = r2.m3845b(r3)
            if (r6 != 0) goto L102
            java.lang.String r1 = " timestamp"
        L102:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L128
            fa.k r10 = new fa.k
            long r2 = r6.longValue()
            r8 = 0
            r11 = 0
            r1 = r10
            r4 = r27
            r6 = r7
            r7 = r11
            r1.<init>(r2, r4, r5, r6, r7, r8)
            ia.e r1 = r0.f6927b
            ea.b r2 = r0.f6929d
            androidx.fragment.app.l0 r3 = r0.f6930e
            fa.a0$e$d r2 = r0.m3888a(r10, r2, r3)
            r3 = r26
            r1.m7588g(r2, r3, r9)
            return
        L128:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = p064e.C1493g.m4049a(r10, r1)
            r2.<init>(r1)
            throw r2
        L132:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = p064e.C1493g.m4049a(r10, r5)
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: g */
    public p327s7.AbstractC5985i<java.lang.Void> m3891g(java.util.concurrent.Executor r10) {
            r9 = this;
            ia.e r0 = r9.f6927b
            java.util.List r1 = r0.m7586c()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            r2.ensureCapacity(r1)
            java.util.List r0 = r0.m7586c()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            ga.a r3 = p148ia.C3123e.f12523i     // Catch: java.io.IOException -> L41
            java.lang.String r4 = p148ia.C3123e.m7583i(r1)     // Catch: java.io.IOException -> L41
            fa.a0 r3 = r3.m6073g(r4)     // Catch: java.io.IOException -> L41
            java.lang.String r4 = r1.getName()     // Catch: java.io.IOException -> L41
            da.b r5 = new da.b     // Catch: java.io.IOException -> L41
            r5.<init>(r3, r4)     // Catch: java.io.IOException -> L41
            r2.add(r5)     // Catch: java.io.IOException -> L41
            goto L1e
        L41:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not load report file "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = "; deleting"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FirebaseCrashlytics"
            android.util.Log.w(r5, r4, r3)
            r1.delete()
            goto L1e
        L61:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r1.next()
            da.b0 r2 = (p056da.AbstractC1349b0) r2
            ja.a r3 = r9.f6928c
            java.util.Objects.requireNonNull(r3)
            fa.a0 r4 = r2.mo3850a()
            s7.j r5 = new s7.j
            r5.<init>()
            t3.f<fa.a0> r3 = r3.f14932a
            t3.a r6 = new t3.a
            t3.d r7 = p335t3.EnumC6151d.f23744a0
            r8 = 0
            r6.<init>(r8, r4, r7)
            f1.g0 r4 = new f1.g0
            r4.<init>(r5, r2)
            w3.k r3 = (p385w3.C6789k) r3
            r3.m13809a(r6, r4)
            s7.q<TResult> r2 = r5.f23075a
            u3.b r3 = new u3.b
            r3.<init>(r9)
            s7.i r2 = r2.mo12447e(r10, r3)
            r0.add(r2)
            goto L6a
        La7:
            s7.i r10 = p327s7.C5988l.m12465f(r0)
            return r10
    }
}
