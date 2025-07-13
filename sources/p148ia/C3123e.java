package p148ia;

/* renamed from: ia.e */
/* loaded from: classes.dex */
public class C3123e {

    /* renamed from: g */
    public static final java.nio.charset.Charset f12521g = null;

    /* renamed from: h */
    public static final int f12522h = 0;

    /* renamed from: i */
    public static final ga.C2310a f12523i = null;

    /* renamed from: j */
    public static final java.util.Comparator<? super java.io.File> f12524j = null;

    /* renamed from: k */
    public static final java.io.FilenameFilter f12525k = null;

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicInteger f12526a;

    /* renamed from: b */
    public final java.io.File f12527b;

    /* renamed from: c */
    public final java.io.File f12528c;

    /* renamed from: d */
    public final java.io.File f12529d;

    /* renamed from: e */
    public final java.io.File f12530e;

    /* renamed from: f */
    public final p188ka.InterfaceC4076c f12531f;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p148ia.C3123e.f12521g = r0
            r0 = 15
            p148ia.C3123e.f12522h = r0
            ga.a r0 = new ga.a
            r0.<init>()
            p148ia.C3123e.f12523i = r0
            s5.b r0 = p325s5.C5962b.f22926c0
            p148ia.C3123e.f12524j = r0
            ia.d r0 = p148ia.C3122d.f12520a
            p148ia.C3123e.f12525k = r0
            return
    }

    public C3123e(java.io.File r3, p188ka.InterfaceC4076c r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.f12526a = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "report-persistence"
            r0.<init>(r3, r1)
            java.io.File r3 = new java.io.File
            java.lang.String r1 = "sessions"
            r3.<init>(r0, r1)
            r2.f12527b = r3
            java.io.File r3 = new java.io.File
            java.lang.String r1 = "priority-reports"
            r3.<init>(r0, r1)
            r2.f12528c = r3
            java.io.File r3 = new java.io.File
            java.lang.String r1 = "reports"
            r3.<init>(r0, r1)
            r2.f12529d = r3
            java.io.File r3 = new java.io.File
            java.lang.String r1 = "native-reports"
            r3.<init>(r0, r1)
            r2.f12530e = r3
            r2.f12531f = r4
            return
    }

    /* renamed from: a */
    public static java.util.List<java.io.File> m7578a(java.util.List<java.io.File>... r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
            r3 = 0
            r4 = 0
        L9:
            if (r3 >= r1) goto L15
            r5 = r6[r3]
            int r5 = r5.size()
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L9
        L15:
            r0.ensureCapacity(r4)
            int r1 = r6.length
        L19:
            if (r2 >= r1) goto L23
            r3 = r6[r2]
            r0.addAll(r3)
            int r2 = r2 + 1
            goto L19
        L23:
            return r0
    }

    /* renamed from: b */
    public static java.util.List<java.io.File> m7579b(java.io.File r1) {
            r0 = 0
            java.util.List r1 = m7580d(r1, r0)
            return r1
    }

    /* renamed from: d */
    public static java.util.List<java.io.File> m7580d(java.io.File r1, java.io.FileFilter r2) {
            boolean r0 = r1.isDirectory()
            if (r0 != 0) goto Lb
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
        Lb:
            if (r2 != 0) goto L12
            java.io.File[] r1 = r1.listFiles()
            goto L16
        L12:
            java.io.File[] r1 = r1.listFiles(r2)
        L16:
            if (r1 == 0) goto L1d
            java.util.List r1 = java.util.Arrays.asList(r1)
            goto L21
        L1d:
            java.util.List r1 = java.util.Collections.emptyList()
        L21:
            return r1
    }

    /* renamed from: e */
    public static java.util.List<java.io.File> m7581e(java.io.File r1, java.io.FilenameFilter r2) {
            boolean r0 = r1.isDirectory()
            if (r0 != 0) goto Lb
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
        Lb:
            if (r2 != 0) goto L12
            java.io.File[] r1 = r1.listFiles()
            goto L16
        L12:
            java.io.File[] r1 = r1.listFiles(r2)
        L16:
            if (r1 == 0) goto L1d
            java.util.List r1 = java.util.Arrays.asList(r1)
            goto L21
        L1d:
            java.util.List r1 = java.util.Collections.emptyList()
        L21:
            return r1
    }

    /* renamed from: h */
    public static java.io.File m7582h(java.io.File r3) {
            boolean r0 = r3.exists()
            if (r0 != 0) goto Lf
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L13
            return r3
        L13:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not create directory "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: i */
    public static java.lang.String m7583i(java.io.File r4) {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r4)
        Le:
            int r4 = r2.read(r0)     // Catch: java.lang.Throwable -> L28
            if (r4 <= 0) goto L19
            r3 = 0
            r1.write(r0, r3, r4)     // Catch: java.lang.Throwable -> L28
            goto Le
        L19:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L28
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L28
            java.nio.charset.Charset r1 = p148ia.C3123e.f12521g     // Catch: java.lang.Throwable -> L28
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L28
            r2.close()
            return r4
        L28:
            r4 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r0 = move-exception
            r4.addSuppressed(r0)
        L31:
            throw r4
    }

    /* renamed from: j */
    public static void m7584j(java.io.File r4) {
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L19
            java.io.File[] r0 = r4.listFiles()
            int r1 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            m7584j(r3)
            int r2 = r2 + 1
            goto Lf
        L19:
            r4.delete()
            return
    }

    /* renamed from: k */
    public static void m7585k(java.io.File r2, java.lang.String r3) {
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            java.nio.charset.Charset r2 = p148ia.C3123e.f12521g
            r0.<init>(r1, r2)
            r0.write(r3)     // Catch: java.lang.Throwable -> L13
            r0.close()
            return
        L13:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L18
            goto L1c
        L18:
            r3 = move-exception
            r2.addSuppressed(r3)
        L1c:
            throw r2
    }

    /* renamed from: c */
    public final java.util.List<java.io.File> m7586c() {
            r6 = this;
            r0 = 2
            java.util.List[] r1 = new java.util.List[r0]
            java.util.List[] r2 = new java.util.List[r0]
            java.io.File r3 = r6.f12528c
            java.util.List r3 = m7579b(r3)
            r4 = 0
            r2[r4] = r3
            java.io.File r3 = r6.f12530e
            java.util.List r3 = m7579b(r3)
            r5 = 1
            r2[r5] = r3
            java.util.List r2 = m7578a(r2)
            r1[r4] = r2
            java.io.File r2 = r6.f12529d
            java.util.List r2 = m7579b(r2)
            r1[r5] = r2
        L25:
            if (r4 >= r0) goto L31
            r2 = r1[r4]
            java.util.Comparator<? super java.io.File> r3 = p148ia.C3123e.f12524j
            java.util.Collections.sort(r2, r3)
            int r4 = r4 + 1
            goto L25
        L31:
            java.util.List r0 = m7578a(r1)
            return r0
    }

    /* renamed from: f */
    public final java.io.File m7587f(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.f12527b
            r0.<init>(r1, r3)
            return r0
    }

    /* renamed from: g */
    public void m7588g(p094fa.AbstractC2103a0.e.d r7, java.lang.String r8, boolean r9) {
            r6 = this;
            ka.c r0 = r6.f12531f
            ka.b r0 = (p188ka.C4075b) r0
            la.c r0 = r0.m9171b()
            n0.k r0 = r0.mo9542a()
            int r0 = r0.f18563a
            java.io.File r1 = r6.m7587f(r8)
            ga.a r2 = p148ia.C3123e.f12523i
            java.util.Objects.requireNonNull(r2)
            qa.a r2 = ga.C2310a.f10530a
            sa.d r2 = (sa.C6004d) r2
            java.util.Objects.requireNonNull(r2)
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            r2.m12485a(r7, r3)     // Catch: java.io.IOException -> L27
            goto L28
        L27:
        L28:
            java.lang.String r7 = r3.toString()
            java.util.concurrent.atomic.AtomicInteger r2 = r6.f12526a
            int r2 = r2.getAndIncrement()
            java.util.Locale r3 = java.util.Locale.US
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r4[r5] = r2
            java.lang.String r2 = "%010d"
            java.lang.String r2 = java.lang.String.format(r3, r2, r4)
            if (r9 == 0) goto L49
            java.lang.String r9 = "_"
            goto L4b
        L49:
            java.lang.String r9 = ""
        L4b:
            java.lang.String r3 = "event"
            java.lang.String r9 = android.support.v4.media.C0145d.m257a(r3, r2, r9)
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L5a
            r2.<init>(r1, r9)     // Catch: java.io.IOException -> L5a
            m7585k(r2, r7)     // Catch: java.io.IOException -> L5a
            goto L71
        L5a:
            r7 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "Could not persist event for session "
            r9.append(r2)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "FirebaseCrashlytics"
            android.util.Log.w(r9, r8, r7)
        L71:
            ia.c r7 = p148ia.C3121c.f12519a
            java.util.List r7 = m7581e(r1, r7)
            j5.b r8 = p163j5.C3423b.f14812c0
            java.util.Collections.sort(r7, r8)
            int r8 = r7.size()
            java.util.Iterator r7 = r7.iterator()
        L84:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L99
            java.lang.Object r9 = r7.next()
            java.io.File r9 = (java.io.File) r9
            if (r8 > r0) goto L93
            goto L99
        L93:
            m7584j(r9)
            int r8 = r8 + (-1)
            goto L84
        L99:
            return
    }
}
