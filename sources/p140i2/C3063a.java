package p140i2;

/* renamed from: i2.a */
/* loaded from: classes.dex */
public final class C3063a implements java.io.Closeable {

    /* renamed from: Y */
    public final java.io.File f12298Y;

    /* renamed from: Z */
    public final java.io.File f12299Z;

    /* renamed from: a0 */
    public final java.io.File f12300a0;

    /* renamed from: b0 */
    public final java.io.File f12301b0;

    /* renamed from: c0 */
    public final int f12302c0;

    /* renamed from: d0 */
    public long f12303d0;

    /* renamed from: e0 */
    public final int f12304e0;

    /* renamed from: f0 */
    public long f12305f0;

    /* renamed from: g0 */
    public java.io.Writer f12306g0;

    /* renamed from: h0 */
    public final java.util.LinkedHashMap<java.lang.String, p140i2.C3063a.d> f12307h0;

    /* renamed from: i0 */
    public int f12308i0;

    /* renamed from: j0 */
    public long f12309j0;

    /* renamed from: k0 */
    public final java.util.concurrent.ThreadPoolExecutor f12310k0;

    /* renamed from: l0 */
    public final java.util.concurrent.Callable<java.lang.Void> f12311l0;

    /* renamed from: i2.a$a */
    public class a implements java.util.concurrent.Callable<java.lang.Void> {

        /* renamed from: a */
        public final /* synthetic */ p140i2.C3063a f12312a;

        public a(p140i2.C3063a r1) {
                r0 = this;
                r0.f12312a = r1
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        public java.lang.Void call() {
                r3 = this;
                i2.a r0 = r3.f12312a
                monitor-enter(r0)
                i2.a r1 = r3.f12312a     // Catch: java.lang.Throwable -> L23
                java.io.Writer r2 = r1.f12306g0     // Catch: java.lang.Throwable -> L23
                if (r2 != 0) goto Lb
            L9:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                goto L21
            Lb:
                r1.m7503f0()     // Catch: java.lang.Throwable -> L23
                i2.a r1 = r3.f12312a     // Catch: java.lang.Throwable -> L23
                boolean r1 = r1.m7498Q()     // Catch: java.lang.Throwable -> L23
                if (r1 == 0) goto L9
                i2.a r1 = r3.f12312a     // Catch: java.lang.Throwable -> L23
                r1.m7502b0()     // Catch: java.lang.Throwable -> L23
                i2.a r1 = r3.f12312a     // Catch: java.lang.Throwable -> L23
                r2 = 0
                r1.f12308i0 = r2     // Catch: java.lang.Throwable -> L23
                goto L9
            L21:
                r0 = 0
                return r0
            L23:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                throw r1
        }
    }

    /* renamed from: i2.a$b */
    public static final class b implements java.util.concurrent.ThreadFactory {
        public b(p140i2.C3063a.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized java.lang.Thread newThread(java.lang.Runnable r3) {
                r2 = this;
                monitor-enter(r2)
                java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> Le
                java.lang.String r1 = "glide-disk-lru-cache-thread"
                r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
                r3 = 1
                r0.setPriority(r3)     // Catch: java.lang.Throwable -> Le
                monitor-exit(r2)
                return r0
            Le:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
        }
    }

    /* renamed from: i2.a$c */
    public final class c {

        /* renamed from: a */
        public final p140i2.C3063a.d f12313a;

        /* renamed from: b */
        public final boolean[] f12314b;

        /* renamed from: c */
        public boolean f12315c;

        /* renamed from: d */
        public final /* synthetic */ p140i2.C3063a f12316d;

        public c(p140i2.C3063a r1, p140i2.C3063a.d r2, p140i2.C3063a.a r3) {
                r0 = this;
                r0.f12316d = r1
                r0.<init>()
                r0.f12313a = r2
                boolean r2 = r2.f12321e
                if (r2 == 0) goto Ld
                r1 = 0
                goto L11
            Ld:
                int r1 = r1.f12304e0
                boolean[] r1 = new boolean[r1]
            L11:
                r0.f12314b = r1
                return
        }

        /* renamed from: a */
        public void m7506a() {
                r2 = this;
                i2.a r0 = r2.f12316d
                r1 = 0
                p140i2.C3063a.m7493a(r0, r2, r1)
                return
        }

        /* renamed from: b */
        public java.io.File m7507b(int r5) {
                r4 = this;
                i2.a r0 = r4.f12316d
                monitor-enter(r0)
                i2.a$d r1 = r4.f12313a     // Catch: java.lang.Throwable -> L25
                i2.a$c r2 = r1.f12322f     // Catch: java.lang.Throwable -> L25
                if (r2 != r4) goto L1f
                boolean r2 = r1.f12321e     // Catch: java.lang.Throwable -> L25
                if (r2 != 0) goto L12
                boolean[] r2 = r4.f12314b     // Catch: java.lang.Throwable -> L25
                r3 = 1
                r2[r5] = r3     // Catch: java.lang.Throwable -> L25
            L12:
                java.io.File[] r1 = r1.f12320d     // Catch: java.lang.Throwable -> L25
                r5 = r1[r5]     // Catch: java.lang.Throwable -> L25
                i2.a r1 = r4.f12316d     // Catch: java.lang.Throwable -> L25
                java.io.File r1 = r1.f12298Y     // Catch: java.lang.Throwable -> L25
                r1.mkdirs()     // Catch: java.lang.Throwable -> L25
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                return r5
            L1f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L25
                r5.<init>()     // Catch: java.lang.Throwable -> L25
                throw r5     // Catch: java.lang.Throwable -> L25
            L25:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                throw r5
        }
    }

    /* renamed from: i2.a$d */
    public final class d {

        /* renamed from: a */
        public final java.lang.String f12317a;

        /* renamed from: b */
        public final long[] f12318b;

        /* renamed from: c */
        public java.io.File[] f12319c;

        /* renamed from: d */
        public java.io.File[] f12320d;

        /* renamed from: e */
        public boolean f12321e;

        /* renamed from: f */
        public p140i2.C3063a.c f12322f;

        /* renamed from: g */
        public long f12323g;

        /* renamed from: h */
        public final /* synthetic */ p140i2.C3063a f12324h;

        public d(p140i2.C3063a r6, java.lang.String r7, p140i2.C3063a.a r8) {
                r5 = this;
                r5.f12324h = r6
                r5.<init>()
                r5.f12317a = r7
                int r8 = r6.f12304e0
                long[] r0 = new long[r8]
                r5.f12318b = r0
                java.io.File[] r0 = new java.io.File[r8]
                r5.f12319c = r0
                java.io.File[] r8 = new java.io.File[r8]
                r5.f12320d = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>(r7)
                r7 = 46
                r8.append(r7)
                int r7 = r8.length()
                r0 = 0
            L24:
                int r1 = r6.f12304e0
                if (r0 >= r1) goto L54
                r8.append(r0)
                java.io.File[] r1 = r5.f12319c
                java.io.File r2 = new java.io.File
                java.io.File r3 = r6.f12298Y
                java.lang.String r4 = r8.toString()
                r2.<init>(r3, r4)
                r1[r0] = r2
                java.lang.String r1 = ".tmp"
                r8.append(r1)
                java.io.File[] r1 = r5.f12320d
                java.io.File r2 = new java.io.File
                java.io.File r3 = r6.f12298Y
                java.lang.String r4 = r8.toString()
                r2.<init>(r3, r4)
                r1[r0] = r2
                r8.setLength(r7)
                int r0 = r0 + 1
                goto L24
            L54:
                return
        }

        /* renamed from: a */
        public java.lang.String m7508a() {
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long[] r1 = r7.f12318b
                int r2 = r1.length
                r3 = 0
            L9:
                if (r3 >= r2) goto L18
                r4 = r1[r3]
                r6 = 32
                r0.append(r6)
                r0.append(r4)
                int r3 = r3 + 1
                goto L9
            L18:
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* renamed from: b */
        public final java.io.IOException m7509b(java.lang.String[] r3) {
                r2 = this;
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "unexpected journal line: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = java.util.Arrays.toString(r3)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }
    }

    /* renamed from: i2.a$e */
    public final class e {

        /* renamed from: a */
        public final java.io.File[] f12325a;

        public e(p140i2.C3063a r1, java.lang.String r2, long r3, java.io.File[] r5, long[] r6, p140i2.C3063a.a r7) {
                r0 = this;
                r0.<init>()
                r0.f12325a = r5
                return
        }
    }

    public C3063a(java.io.File r17, int r18, int r19, long r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r16.<init>()
            r2 = 0
            r0.f12305f0 = r2
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 0
            r6 = 1061158912(0x3f400000, float:0.75)
            r7 = 1
            r4.<init>(r5, r6, r7)
            r0.f12307h0 = r4
            r0.f12309j0 = r2
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r14 = new java.util.concurrent.LinkedBlockingQueue
            r14.<init>()
            i2.a$b r15 = new i2.a$b
            r3 = 0
            r15.<init>(r3)
            r9 = 0
            r10 = 1
            r11 = 60
            r8 = r2
            r8.<init>(r9, r10, r11, r13, r14, r15)
            r0.f12310k0 = r2
            i2.a$a r2 = new i2.a$a
            r2.<init>(r0)
            r0.f12311l0 = r2
            r0.f12298Y = r1
            r2 = r18
            r0.f12302c0 = r2
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "journal"
            r2.<init>(r1, r3)
            r0.f12299Z = r2
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "journal.tmp"
            r2.<init>(r1, r3)
            r0.f12300a0 = r2
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "journal.bkp"
            r2.<init>(r1, r3)
            r0.f12301b0 = r2
            r1 = r19
            r0.f12304e0 = r1
            r1 = r20
            r0.f12303d0 = r1
            return
    }

    @android.annotation.TargetApi(26)
    /* renamed from: A */
    public static void m7491A(java.io.Writer r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto La
            r2.flush()
            return
        La:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r1 = new android.os.StrictMode$ThreadPolicy$Builder
            r1.<init>(r0)
            android.os.StrictMode$ThreadPolicy$Builder r1 = r1.permitUnbufferedIo()
            android.os.StrictMode$ThreadPolicy r1 = r1.build()
            android.os.StrictMode.setThreadPolicy(r1)
            r2.flush()     // Catch: java.lang.Throwable -> L25
            android.os.StrictMode.setThreadPolicy(r0)
            return
        L25:
            r2 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r2
    }

    /* renamed from: R */
    public static p140i2.C3063a m7492R(java.io.File r9, int r10, int r11, long r12) {
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L8c
            if (r11 <= 0) goto L84
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal.bkp"
            r0.<init>(r9, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L2a
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "journal"
            r1.<init>(r9, r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L26
            r0.delete()
            goto L2a
        L26:
            r2 = 0
            m7494d0(r0, r1, r2)
        L2a:
            i2.a r0 = new i2.a
            r3 = r0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7)
            java.io.File r1 = r0.f12299Z
            boolean r1 = r1.exists()
            if (r1 == 0) goto L73
            r0.m7500V()     // Catch: java.io.IOException -> L43
            r0.m7499S()     // Catch: java.io.IOException -> L43
            return r0
        L43:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "DiskLruCache "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = " is corrupt: "
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = ", removing"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            r0.close()
            java.io.File r0 = r0.f12298Y
            p140i2.C3065c.m7512a(r0)
        L73:
            r9.mkdirs()
            i2.a r0 = new i2.a
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5)
            r0.m7502b0()
            return r0
        L84:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "valueCount <= 0"
            r9.<init>(r10)
            throw r9
        L8c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "maxSize <= 0"
            r9.<init>(r10)
            throw r9
    }

    /* renamed from: a */
    public static void m7493a(p140i2.C3063a r9, p140i2.C3063a.c r10, boolean r11) {
            monitor-enter(r9)
            i2.a$d r0 = r10.f12313a     // Catch: java.lang.Throwable -> Lf7
            i2.a$c r1 = r0.f12322f     // Catch: java.lang.Throwable -> Lf7
            if (r1 != r10) goto Lf1
            r1 = 0
            if (r11 == 0) goto L45
            boolean r2 = r0.f12321e     // Catch: java.lang.Throwable -> Lf7
            if (r2 != 0) goto L45
            r2 = 0
        Lf:
            int r3 = r9.f12304e0     // Catch: java.lang.Throwable -> Lf7
            if (r2 >= r3) goto L45
            boolean[] r3 = r10.f12314b     // Catch: java.lang.Throwable -> Lf7
            boolean r3 = r3[r2]     // Catch: java.lang.Throwable -> Lf7
            if (r3 == 0) goto L2b
            java.io.File[] r3 = r0.f12320d     // Catch: java.lang.Throwable -> Lf7
            r3 = r3[r2]     // Catch: java.lang.Throwable -> Lf7
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> Lf7
            if (r3 != 0) goto L28
            r10.m7506a()     // Catch: java.lang.Throwable -> Lf7
            goto Lef
        L28:
            int r2 = r2 + 1
            goto Lf
        L2b:
            r10.m7506a()     // Catch: java.lang.Throwable -> Lf7
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf7
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf7
            r11.<init>()     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch: java.lang.Throwable -> Lf7
            r11.append(r2)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lf7
            r10.<init>(r11)     // Catch: java.lang.Throwable -> Lf7
            throw r10     // Catch: java.lang.Throwable -> Lf7
        L45:
            int r10 = r9.f12304e0     // Catch: java.lang.Throwable -> Lf7
            if (r1 >= r10) goto L75
            java.io.File[] r10 = r0.f12320d     // Catch: java.lang.Throwable -> Lf7
            r10 = r10[r1]     // Catch: java.lang.Throwable -> Lf7
            if (r11 == 0) goto L6f
            boolean r2 = r10.exists()     // Catch: java.lang.Throwable -> Lf7
            if (r2 == 0) goto L72
            java.io.File[] r2 = r0.f12319c     // Catch: java.lang.Throwable -> Lf7
            r2 = r2[r1]     // Catch: java.lang.Throwable -> Lf7
            r10.renameTo(r2)     // Catch: java.lang.Throwable -> Lf7
            long[] r10 = r0.f12318b     // Catch: java.lang.Throwable -> Lf7
            r3 = r10[r1]     // Catch: java.lang.Throwable -> Lf7
            long r5 = r2.length()     // Catch: java.lang.Throwable -> Lf7
            long[] r10 = r0.f12318b     // Catch: java.lang.Throwable -> Lf7
            r10[r1] = r5     // Catch: java.lang.Throwable -> Lf7
            long r7 = r9.f12305f0     // Catch: java.lang.Throwable -> Lf7
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f12305f0 = r7     // Catch: java.lang.Throwable -> Lf7
            goto L72
        L6f:
            m7496l(r10)     // Catch: java.lang.Throwable -> Lf7
        L72:
            int r1 = r1 + 1
            goto L45
        L75:
            int r10 = r9.f12308i0     // Catch: java.lang.Throwable -> Lf7
            r1 = 1
            int r10 = r10 + r1
            r9.f12308i0 = r10     // Catch: java.lang.Throwable -> Lf7
            r10 = 0
            r0.f12322f = r10     // Catch: java.lang.Throwable -> Lf7
            boolean r10 = r0.f12321e     // Catch: java.lang.Throwable -> Lf7
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto Lb6
            r0.f12321e = r1     // Catch: java.lang.Throwable -> Lf7
            java.io.Writer r10 = r9.f12306g0     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch: java.lang.Throwable -> Lf7
            java.io.Writer r10 = r9.f12306g0     // Catch: java.lang.Throwable -> Lf7
            r10.append(r3)     // Catch: java.lang.Throwable -> Lf7
            java.io.Writer r10 = r9.f12306g0     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r1 = r0.f12317a     // Catch: java.lang.Throwable -> Lf7
            r10.append(r1)     // Catch: java.lang.Throwable -> Lf7
            java.io.Writer r10 = r9.f12306g0     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r1 = r0.m7508a()     // Catch: java.lang.Throwable -> Lf7
            r10.append(r1)     // Catch: java.lang.Throwable -> Lf7
            java.io.Writer r10 = r9.f12306g0     // Catch: java.lang.Throwable -> Lf7
            r10.append(r2)     // Catch: java.lang.Throwable -> Lf7
            if (r11 == 0) goto Ld5
            long r10 = r9.f12309j0     // Catch: java.lang.Throwable -> Lf7
            r1 = 1
            long r1 = r1 + r10
            r9.f12309j0 = r1     // Catch: java.lang.Throwable -> Lf7
            r0.f12323g = r10     // Catch: java.lang.Throwable -> Lf7
            goto Ld5
        Lb6:
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r10 = r9.f12307h0     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r11 = r0.f12317a     // Catch: java.lang.Throwable -> Lf7
            r10.remove(r11)     // Catch: java.lang.Throwable -> Lf7
            java.io.Writer r10 = r9.f12306g0     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch: java.lang.Throwable -> Lf7
            java.io.Writer r10 = r9.f12306g0     // Catch: java.lang.Throwable -> Lf7
            r10.append(r3)     // Catch: java.lang.Throwable -> Lf7
            java.io.Writer r10 = r9.f12306g0     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r11 = r0.f12317a     // Catch: java.lang.Throwable -> Lf7
            r10.append(r11)     // Catch: java.lang.Throwable -> Lf7
            java.io.Writer r10 = r9.f12306g0     // Catch: java.lang.Throwable -> Lf7
            r10.append(r2)     // Catch: java.lang.Throwable -> Lf7
        Ld5:
            java.io.Writer r10 = r9.f12306g0     // Catch: java.lang.Throwable -> Lf7
            m7491A(r10)     // Catch: java.lang.Throwable -> Lf7
            long r10 = r9.f12305f0     // Catch: java.lang.Throwable -> Lf7
            long r0 = r9.f12303d0     // Catch: java.lang.Throwable -> Lf7
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto Le8
            boolean r10 = r9.m7498Q()     // Catch: java.lang.Throwable -> Lf7
            if (r10 == 0) goto Lef
        Le8:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f12310k0     // Catch: java.lang.Throwable -> Lf7
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f12311l0     // Catch: java.lang.Throwable -> Lf7
            r10.submit(r11)     // Catch: java.lang.Throwable -> Lf7
        Lef:
            monitor-exit(r9)
            return
        Lf1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf7
            r10.<init>()     // Catch: java.lang.Throwable -> Lf7
            throw r10     // Catch: java.lang.Throwable -> Lf7
        Lf7:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    /* renamed from: d0 */
    public static void m7494d0(java.io.File r0, java.io.File r1, boolean r2) {
            if (r2 == 0) goto L5
            m7496l(r1)
        L5:
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto Lc
            return
        Lc:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
    }

    @android.annotation.TargetApi(26)
    /* renamed from: i */
    public static void m7495i(java.io.Writer r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto La
            r2.close()
            return
        La:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r1 = new android.os.StrictMode$ThreadPolicy$Builder
            r1.<init>(r0)
            android.os.StrictMode$ThreadPolicy$Builder r1 = r1.permitUnbufferedIo()
            android.os.StrictMode$ThreadPolicy r1 = r1.build()
            android.os.StrictMode.setThreadPolicy(r1)
            r2.close()     // Catch: java.lang.Throwable -> L25
            android.os.StrictMode.setThreadPolicy(r0)
            return
        L25:
            r2 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r2
    }

    /* renamed from: l */
    public static void m7496l(java.io.File r1) {
            boolean r0 = r1.exists()
            if (r0 == 0) goto L13
            boolean r1 = r1.delete()
            if (r1 == 0) goto Ld
            goto L13
        Ld:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>()
            throw r1
        L13:
            return
    }

    /* renamed from: L */
    public synchronized p140i2.C3063a.e m7497L(java.lang.String r10) {
            r9 = this;
            monitor-enter(r9)
            r9.m7504h()     // Catch: java.lang.Throwable -> L68
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r0 = r9.f12307h0     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L68
            i2.a$d r0 = (p140i2.C3063a.d) r0     // Catch: java.lang.Throwable -> L68
            r1 = 0
            if (r0 != 0) goto L11
            monitor-exit(r9)
            return r1
        L11:
            boolean r2 = r0.f12321e     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L17
            monitor-exit(r9)
            return r1
        L17:
            java.io.File[] r2 = r0.f12319c     // Catch: java.lang.Throwable -> L68
            int r3 = r2.length     // Catch: java.lang.Throwable -> L68
            r4 = 0
        L1b:
            if (r4 >= r3) goto L2a
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L68
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> L68
            if (r5 != 0) goto L27
            monitor-exit(r9)
            return r1
        L27:
            int r4 = r4 + 1
            goto L1b
        L2a:
            int r1 = r9.f12308i0     // Catch: java.lang.Throwable -> L68
            int r1 = r1 + 1
            r9.f12308i0 = r1     // Catch: java.lang.Throwable -> L68
            java.io.Writer r1 = r9.f12306g0     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "READ"
            r1.append(r2)     // Catch: java.lang.Throwable -> L68
            java.io.Writer r1 = r9.f12306g0     // Catch: java.lang.Throwable -> L68
            r2 = 32
            r1.append(r2)     // Catch: java.lang.Throwable -> L68
            java.io.Writer r1 = r9.f12306g0     // Catch: java.lang.Throwable -> L68
            r1.append(r10)     // Catch: java.lang.Throwable -> L68
            java.io.Writer r1 = r9.f12306g0     // Catch: java.lang.Throwable -> L68
            r2 = 10
            r1.append(r2)     // Catch: java.lang.Throwable -> L68
            boolean r1 = r9.m7498Q()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L57
            java.util.concurrent.ThreadPoolExecutor r1 = r9.f12310k0     // Catch: java.lang.Throwable -> L68
            java.util.concurrent.Callable<java.lang.Void> r2 = r9.f12311l0     // Catch: java.lang.Throwable -> L68
            r1.submit(r2)     // Catch: java.lang.Throwable -> L68
        L57:
            i2.a$e r8 = new i2.a$e     // Catch: java.lang.Throwable -> L68
            long r3 = r0.f12323g     // Catch: java.lang.Throwable -> L68
            java.io.File[] r5 = r0.f12319c     // Catch: java.lang.Throwable -> L68
            long[] r6 = r0.f12318b     // Catch: java.lang.Throwable -> L68
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L68
            monitor-exit(r9)
            return r8
        L68:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    /* renamed from: Q */
    public final boolean m7498Q() {
            r2 = this;
            int r0 = r2.f12308i0
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 < r1) goto L10
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r1 = r2.f12307h0
            int r1 = r1.size()
            if (r0 < r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    /* renamed from: S */
    public final void m7499S() {
            r8 = this;
            java.io.File r0 = r8.f12300a0
            m7496l(r0)
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r0 = r8.f12307h0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            i2.a$d r1 = (p140i2.C3063a.d) r1
            i2.a$c r2 = r1.f12322f
            r3 = 0
            if (r2 != 0) goto L30
        L20:
            int r2 = r8.f12304e0
            if (r3 >= r2) goto Lf
            long r4 = r8.f12305f0
            long[] r2 = r1.f12318b
            r6 = r2[r3]
            long r4 = r4 + r6
            r8.f12305f0 = r4
            int r3 = r3 + 1
            goto L20
        L30:
            r2 = 0
            r1.f12322f = r2
        L33:
            int r2 = r8.f12304e0
            if (r3 >= r2) goto L48
            java.io.File[] r2 = r1.f12319c
            r2 = r2[r3]
            m7496l(r2)
            java.io.File[] r2 = r1.f12320d
            r2 = r2[r3]
            m7496l(r2)
            int r3 = r3 + 1
            goto L33
        L48:
            r0.remove()
            goto Lf
        L4c:
            return
    }

    /* renamed from: V */
    public final void m7500V() {
            r9 = this;
            java.lang.String r0 = ", "
            i2.b r1 = new i2.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f12299Z
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p140i2.C3065c.f12332a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.m7511h()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = r1.m7511h()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r4 = r1.m7511h()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r5 = r1.m7511h()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r6 = r1.m7511h()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> Lbf
            if (r7 == 0) goto L91
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Throwable -> Lbf
            if (r7 == 0) goto L91
            int r7 = r9.f12302c0     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch: java.lang.Throwable -> Lbf
            boolean r4 = r7.equals(r4)     // Catch: java.lang.Throwable -> Lbf
            if (r4 == 0) goto L91
            int r4 = r9.f12304e0     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> Lbf
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> Lbf
            if (r4 == 0) goto L91
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> Lbf
            if (r4 == 0) goto L91
            r0 = 0
            r2 = 0
        L56:
            java.lang.String r3 = r1.m7511h()     // Catch: java.io.EOFException -> L60 java.lang.Throwable -> Lbf
            r9.m7501Z(r3)     // Catch: java.io.EOFException -> L60 java.lang.Throwable -> Lbf
            int r2 = r2 + 1
            goto L56
        L60:
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r3 = r9.f12307h0     // Catch: java.lang.Throwable -> Lbf
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lbf
            int r2 = r2 - r3
            r9.f12308i0 = r2     // Catch: java.lang.Throwable -> Lbf
            int r2 = r1.f12330c0     // Catch: java.lang.Throwable -> Lbf
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L70
            r0 = 1
        L70:
            if (r0 == 0) goto L76
            r9.m7502b0()     // Catch: java.lang.Throwable -> Lbf
            goto L8b
        L76:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> Lbf
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> Lbf
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lbf
            java.io.File r5 = r9.f12299Z     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> Lbf
            java.nio.charset.Charset r4 = p140i2.C3065c.f12332a     // Catch: java.lang.Throwable -> Lbf
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lbf
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lbf
            r9.f12306g0 = r0     // Catch: java.lang.Throwable -> Lbf
        L8b:
            r1.close()     // Catch: java.lang.Exception -> L8e java.lang.RuntimeException -> L8f
        L8e:
            return
        L8f:
            r0 = move-exception
            throw r0
        L91:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> Lbf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbf
            r7.<init>()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch: java.lang.Throwable -> Lbf
            r7.append(r2)     // Catch: java.lang.Throwable -> Lbf
            r7.append(r0)     // Catch: java.lang.Throwable -> Lbf
            r7.append(r3)     // Catch: java.lang.Throwable -> Lbf
            r7.append(r0)     // Catch: java.lang.Throwable -> Lbf
            r7.append(r5)     // Catch: java.lang.Throwable -> Lbf
            r7.append(r0)     // Catch: java.lang.Throwable -> Lbf
            r7.append(r6)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> Lbf
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lbf
            throw r4     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Exception -> Lc3 java.lang.RuntimeException -> Lc4
        Lc3:
            throw r0
        Lc4:
            r0 = move-exception
            throw r0
    }

    /* renamed from: Z */
    public final void m7501Z(java.lang.String r9) {
            r8 = this;
            r0 = 32
            int r1 = r9.indexOf(r0)
            java.lang.String r2 = "unexpected journal line: "
            r3 = -1
            if (r1 == r3) goto Laa
            int r4 = r1 + 1
            int r0 = r9.indexOf(r0, r4)
            if (r0 != r3) goto L28
            java.lang.String r4 = r9.substring(r4)
            r5 = 6
            if (r1 != r5) goto L2c
            java.lang.String r5 = "REMOVE"
            boolean r5 = r9.startsWith(r5)
            if (r5 == 0) goto L2c
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r9 = r8.f12307h0
            r9.remove(r4)
            return
        L28:
            java.lang.String r4 = r9.substring(r4, r0)
        L2c:
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r5 = r8.f12307h0
            java.lang.Object r5 = r5.get(r4)
            i2.a$d r5 = (p140i2.C3063a.d) r5
            r6 = 0
            if (r5 != 0) goto L41
            i2.a$d r5 = new i2.a$d
            r5.<init>(r8, r4, r6)
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r7 = r8.f12307h0
            r7.put(r4, r5)
        L41:
            r4 = 5
            if (r0 == r3) goto L7e
            if (r1 != r4) goto L7e
            java.lang.String r7 = "CLEAN"
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L7e
            r1 = 1
            int r0 = r0 + r1
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r0 = " "
            java.lang.String[] r9 = r9.split(r0)
            r5.f12321e = r1
            r5.f12322f = r6
            int r0 = r9.length
            i2.a r1 = r5.f12324h
            int r1 = r1.f12304e0
            if (r0 != r1) goto L7a
            r0 = 0
        L66:
            int r1 = r9.length     // Catch: java.lang.NumberFormatException -> L76
            if (r0 >= r1) goto L9f
            long[] r1 = r5.f12318b     // Catch: java.lang.NumberFormatException -> L76
            r2 = r9[r0]     // Catch: java.lang.NumberFormatException -> L76
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L76
            r1[r0] = r2     // Catch: java.lang.NumberFormatException -> L76
            int r0 = r0 + 1
            goto L66
        L76:
            r5.m7509b(r9)
            throw r6
        L7a:
            r5.m7509b(r9)
            throw r6
        L7e:
            if (r0 != r3) goto L92
            if (r1 != r4) goto L92
            java.lang.String r4 = "DIRTY"
            boolean r4 = r9.startsWith(r4)
            if (r4 == 0) goto L92
            i2.a$c r9 = new i2.a$c
            r9.<init>(r8, r5, r6)
            r5.f12322f = r9
            goto L9f
        L92:
            if (r0 != r3) goto La0
            r0 = 4
            if (r1 != r0) goto La0
            java.lang.String r0 = "READ"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto La0
        L9f:
            return
        La0:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r9 = p064e.C1493g.m4049a(r2, r9)
            r0.<init>(r9)
            throw r0
        Laa:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r9 = p064e.C1493g.m4049a(r2, r9)
            r0.<init>(r9)
            throw r0
    }

    /* renamed from: b0 */
    public final synchronized void m7502b0() {
            r6 = this;
            monitor-enter(r6)
            java.io.Writer r0 = r6.f12306g0     // Catch: java.lang.Throwable -> Le1
            if (r0 == 0) goto L8
            m7495i(r0)     // Catch: java.lang.Throwable -> Le1
        L8:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> Le1
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> Le1
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Le1
            java.io.File r3 = r6.f12300a0     // Catch: java.lang.Throwable -> Le1
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le1
            java.nio.charset.Charset r3 = p140i2.C3065c.f12332a     // Catch: java.lang.Throwable -> Le1
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Le1
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r1 = "libcore.io.DiskLruCache"
            r0.write(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "1"
            r0.write(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L86
            int r1 = r6.f12302c0     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L86
            r0.write(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L86
            int r1 = r6.f12304e0     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L86
            r0.write(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L86
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r1 = r6.f12307h0     // Catch: java.lang.Throwable -> L86
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L86
        L5a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L86
            i2.a$d r2 = (p140i2.C3063a.d) r2     // Catch: java.lang.Throwable -> L86
            i2.a$c r3 = r2.f12322f     // Catch: java.lang.Throwable -> L86
            r4 = 10
            if (r3 == 0) goto L88
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r3.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "DIRTY "
            r3.append(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = r2.f12317a     // Catch: java.lang.Throwable -> L86
            r3.append(r2)     // Catch: java.lang.Throwable -> L86
            r3.append(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L86
        L82:
            r0.write(r2)     // Catch: java.lang.Throwable -> L86
            goto L5a
        L86:
            r1 = move-exception
            goto Ldd
        L88:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r3.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "CLEAN "
            r3.append(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = r2.f12317a     // Catch: java.lang.Throwable -> L86
            r3.append(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = r2.m7508a()     // Catch: java.lang.Throwable -> L86
            r3.append(r2)     // Catch: java.lang.Throwable -> L86
            r3.append(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L86
            goto L82
        La6:
            m7495i(r0)     // Catch: java.lang.Throwable -> Le1
            java.io.File r0 = r6.f12299Z     // Catch: java.lang.Throwable -> Le1
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Le1
            r1 = 1
            if (r0 == 0) goto Lb9
            java.io.File r0 = r6.f12299Z     // Catch: java.lang.Throwable -> Le1
            java.io.File r2 = r6.f12301b0     // Catch: java.lang.Throwable -> Le1
            m7494d0(r0, r2, r1)     // Catch: java.lang.Throwable -> Le1
        Lb9:
            java.io.File r0 = r6.f12300a0     // Catch: java.lang.Throwable -> Le1
            java.io.File r2 = r6.f12299Z     // Catch: java.lang.Throwable -> Le1
            r3 = 0
            m7494d0(r0, r2, r3)     // Catch: java.lang.Throwable -> Le1
            java.io.File r0 = r6.f12301b0     // Catch: java.lang.Throwable -> Le1
            r0.delete()     // Catch: java.lang.Throwable -> Le1
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> Le1
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> Le1
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Le1
            java.io.File r4 = r6.f12299Z     // Catch: java.lang.Throwable -> Le1
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> Le1
            java.nio.charset.Charset r1 = p140i2.C3065c.f12332a     // Catch: java.lang.Throwable -> Le1
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le1
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Le1
            r6.f12306g0 = r0     // Catch: java.lang.Throwable -> Le1
            monitor-exit(r6)
            return
        Ldd:
            m7495i(r0)     // Catch: java.lang.Throwable -> Le1
            throw r1     // Catch: java.lang.Throwable -> Le1
        Le1:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
            r2 = this;
            monitor-enter(r2)
            java.io.Writer r0 = r2.f12306g0     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L37
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r1 = r2.f12307h0     // Catch: java.lang.Throwable -> L37
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L37
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        L16:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            i2.a$d r1 = (p140i2.C3063a.d) r1     // Catch: java.lang.Throwable -> L37
            i2.a$c r1 = r1.f12322f     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L16
            r1.m7506a()     // Catch: java.lang.Throwable -> L37
            goto L16
        L2a:
            r2.m7503f0()     // Catch: java.lang.Throwable -> L37
            java.io.Writer r0 = r2.f12306g0     // Catch: java.lang.Throwable -> L37
            m7495i(r0)     // Catch: java.lang.Throwable -> L37
            r0 = 0
            r2.f12306g0 = r0     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            return
        L37:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    /* renamed from: f0 */
    public final void m7503f0() {
            r8 = this;
        L0:
            long r0 = r8.f12305f0
            long r2 = r8.f12303d0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La6
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r0 = r8.f12307h0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            monitor-enter(r8)
            r8.m7504h()     // Catch: java.lang.Throwable -> La3
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r1 = r8.f12307h0     // Catch: java.lang.Throwable -> La3
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> La3
            i2.a$d r1 = (p140i2.C3063a.d) r1     // Catch: java.lang.Throwable -> La3
            r2 = 0
            if (r1 == 0) goto La0
            i2.a$c r3 = r1.f12322f     // Catch: java.lang.Throwable -> La3
            if (r3 == 0) goto L32
            goto La0
        L32:
            int r3 = r8.f12304e0     // Catch: java.lang.Throwable -> La3
            if (r2 >= r3) goto L6e
            java.io.File[] r3 = r1.f12319c     // Catch: java.lang.Throwable -> La3
            r3 = r3[r2]     // Catch: java.lang.Throwable -> La3
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto L5e
            boolean r4 = r3.delete()     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto L47
            goto L5e
        L47:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r1.<init>()     // Catch: java.lang.Throwable -> La3
            java.lang.String r2 = "failed to delete "
            r1.append(r2)     // Catch: java.lang.Throwable -> La3
            r1.append(r3)     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La3
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La3
            throw r0     // Catch: java.lang.Throwable -> La3
        L5e:
            long r3 = r8.f12305f0     // Catch: java.lang.Throwable -> La3
            long[] r5 = r1.f12318b     // Catch: java.lang.Throwable -> La3
            r6 = r5[r2]     // Catch: java.lang.Throwable -> La3
            long r3 = r3 - r6
            r8.f12305f0 = r3     // Catch: java.lang.Throwable -> La3
            r3 = 0
            r5[r2] = r3     // Catch: java.lang.Throwable -> La3
            int r2 = r2 + 1
            goto L32
        L6e:
            int r1 = r8.f12308i0     // Catch: java.lang.Throwable -> La3
            int r1 = r1 + 1
            r8.f12308i0 = r1     // Catch: java.lang.Throwable -> La3
            java.io.Writer r1 = r8.f12306g0     // Catch: java.lang.Throwable -> La3
            java.lang.String r2 = "REMOVE"
            r1.append(r2)     // Catch: java.lang.Throwable -> La3
            java.io.Writer r1 = r8.f12306g0     // Catch: java.lang.Throwable -> La3
            r2 = 32
            r1.append(r2)     // Catch: java.lang.Throwable -> La3
            java.io.Writer r1 = r8.f12306g0     // Catch: java.lang.Throwable -> La3
            r1.append(r0)     // Catch: java.lang.Throwable -> La3
            java.io.Writer r1 = r8.f12306g0     // Catch: java.lang.Throwable -> La3
            r2 = 10
            r1.append(r2)     // Catch: java.lang.Throwable -> La3
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r1 = r8.f12307h0     // Catch: java.lang.Throwable -> La3
            r1.remove(r0)     // Catch: java.lang.Throwable -> La3
            boolean r0 = r8.m7498Q()     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto La0
            java.util.concurrent.ThreadPoolExecutor r0 = r8.f12310k0     // Catch: java.lang.Throwable -> La3
            java.util.concurrent.Callable<java.lang.Void> r1 = r8.f12311l0     // Catch: java.lang.Throwable -> La3
            r0.submit(r1)     // Catch: java.lang.Throwable -> La3
        La0:
            monitor-exit(r8)
            goto L0
        La3:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        La6:
            return
    }

    /* renamed from: h */
    public final void m7504h() {
            r2 = this;
            java.io.Writer r0 = r2.f12306g0
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cache is closed"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: n */
    public p140i2.C3063a.c m7505n(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            r3.m7504h()     // Catch: java.lang.Throwable -> L49
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r0 = r3.f12307h0     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L49
            i2.a$d r0 = (p140i2.C3063a.d) r0     // Catch: java.lang.Throwable -> L49
            r1 = 0
            if (r0 != 0) goto L1a
            i2.a$d r0 = new i2.a$d     // Catch: java.lang.Throwable -> L49
            r0.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L49
            java.util.LinkedHashMap<java.lang.String, i2.a$d> r2 = r3.f12307h0     // Catch: java.lang.Throwable -> L49
            r2.put(r4, r0)     // Catch: java.lang.Throwable -> L49
            goto L20
        L1a:
            i2.a$c r2 = r0.f12322f     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L20
            monitor-exit(r3)
            goto L48
        L20:
            i2.a$c r2 = new i2.a$c     // Catch: java.lang.Throwable -> L49
            r2.<init>(r3, r0, r1)     // Catch: java.lang.Throwable -> L49
            r0.f12322f = r2     // Catch: java.lang.Throwable -> L49
            java.io.Writer r0 = r3.f12306g0     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "DIRTY"
            r0.append(r1)     // Catch: java.lang.Throwable -> L49
            java.io.Writer r0 = r3.f12306g0     // Catch: java.lang.Throwable -> L49
            r1 = 32
            r0.append(r1)     // Catch: java.lang.Throwable -> L49
            java.io.Writer r0 = r3.f12306g0     // Catch: java.lang.Throwable -> L49
            r0.append(r4)     // Catch: java.lang.Throwable -> L49
            java.io.Writer r4 = r3.f12306g0     // Catch: java.lang.Throwable -> L49
            r0 = 10
            r4.append(r0)     // Catch: java.lang.Throwable -> L49
            java.io.Writer r4 = r3.f12306g0     // Catch: java.lang.Throwable -> L49
            m7491A(r4)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r3)
            r1 = r2
        L48:
            return r1
        L49:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
