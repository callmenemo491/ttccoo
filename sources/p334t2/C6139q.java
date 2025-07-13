package p334t2;

/* renamed from: t2.q */
/* loaded from: classes.dex */
public final class C6139q {

    /* renamed from: g */
    public static final boolean f23698g = false;

    /* renamed from: h */
    public static final boolean f23699h = false;

    /* renamed from: i */
    public static final java.io.File f23700i = null;

    /* renamed from: j */
    public static volatile p334t2.C6139q f23701j;

    /* renamed from: k */
    public static volatile int f23702k;

    /* renamed from: a */
    public final boolean f23703a;

    /* renamed from: b */
    public final int f23704b;

    /* renamed from: c */
    public final int f23705c;

    /* renamed from: d */
    public int f23706d;

    /* renamed from: e */
    public boolean f23707e;

    /* renamed from: f */
    public final java.util.concurrent.atomic.AtomicBoolean f23708f;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 29
            if (r0 >= r3) goto La
            r3 = 1
            goto Lb
        La:
            r3 = 0
        Lb:
            p334t2.C6139q.f23698g = r3
            r3 = 26
            if (r0 < r3) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            p334t2.C6139q.f23699h = r1
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/proc/self/fd"
            r0.<init>(r1)
            p334t2.C6139q.f23700i = r0
            r0 = -1
            p334t2.C6139q.f23702k = r0
            return
    }

    public C6139q() {
            r26 = this;
            r0 = r26
            r26.<init>()
            r1 = 1
            r0.f23707e = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r0.f23708f = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 == r4) goto L17
            goto L5b
        L17:
            java.lang.String r5 = "SC-04J"
            java.lang.String r6 = "SM-N935"
            java.lang.String r7 = "SM-J720"
            java.lang.String r8 = "SM-G570F"
            java.lang.String r9 = "SM-G570M"
            java.lang.String r10 = "SM-G960"
            java.lang.String r11 = "SM-G965"
            java.lang.String r12 = "SM-G935"
            java.lang.String r13 = "SM-G930"
            java.lang.String r14 = "SM-A520"
            java.lang.String r15 = "SM-A720F"
            java.lang.String r16 = "moto e5"
            java.lang.String r17 = "moto e5 play"
            java.lang.String r18 = "moto e5 plus"
            java.lang.String r19 = "moto e5 cruise"
            java.lang.String r20 = "moto g(6) forge"
            java.lang.String r21 = "moto g(6) play"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = android.os.Build.MODEL
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto L45
            r2 = 1
            goto L5c
        L5b:
            r2 = 0
        L5c:
            if (r2 != 0) goto La1
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 27
            if (r2 == r4) goto L66
            r2 = 0
            goto L9e
        L66:
            java.lang.String r5 = "LG-M250"
            java.lang.String r6 = "LG-M320"
            java.lang.String r7 = "LG-Q710AL"
            java.lang.String r8 = "LG-Q710PL"
            java.lang.String r9 = "LGM-K121K"
            java.lang.String r10 = "LGM-K121L"
            java.lang.String r11 = "LGM-K121S"
            java.lang.String r12 = "LGM-X320K"
            java.lang.String r13 = "LGM-X320L"
            java.lang.String r14 = "LGM-X320S"
            java.lang.String r15 = "LGM-X401L"
            java.lang.String r16 = "LGM-X401S"
            java.lang.String r17 = "LM-Q610.FG"
            java.lang.String r18 = "LM-Q610.FGN"
            java.lang.String r19 = "LM-Q617.FG"
            java.lang.String r20 = "LM-Q617.FGN"
            java.lang.String r21 = "LM-Q710.FG"
            java.lang.String r22 = "LM-Q710.FGN"
            java.lang.String r23 = "LM-X220PM"
            java.lang.String r24 = "LM-X220QMA"
            java.lang.String r25 = "LM-X410PM"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r4 = android.os.Build.MODEL
            boolean r2 = r2.contains(r4)
        L9e:
            if (r2 != 0) goto La1
            goto La2
        La1:
            r1 = 0
        La2:
            r0.f23703a = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lb1
            r1 = 20000(0x4e20, float:2.8026E-41)
            r0.f23704b = r1
            r0.f23705c = r3
            goto Lb9
        Lb1:
            r1 = 700(0x2bc, float:9.81E-43)
            r0.f23704b = r1
            r1 = 128(0x80, float:1.8E-43)
            r0.f23705c = r1
        Lb9:
            return
    }

    /* renamed from: a */
    public static p334t2.C6139q m12682a() {
            t2.q r0 = p334t2.C6139q.f23701j
            if (r0 != 0) goto L17
            java.lang.Class<t2.q> r0 = p334t2.C6139q.class
            monitor-enter(r0)
            t2.q r1 = p334t2.C6139q.f23701j     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            t2.q r1 = new t2.q     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            p334t2.C6139q.f23701j = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            t2.q r0 = p334t2.C6139q.f23701j
            return r0
    }

    /* renamed from: b */
    public boolean m12683b(int r6, int r7, boolean r8, boolean r9) {
            r5 = this;
            r0 = 2
            r1 = 0
            if (r8 != 0) goto L14
            java.lang.String r6 = "HardwareConfig"
            boolean r6 = android.util.Log.isLoggable(r6, r0)
            if (r6 == 0) goto L13
            java.lang.String r6 = "HardwareConfig"
            java.lang.String r7 = "Hardware config disallowed by caller"
            android.util.Log.v(r6, r7)
        L13:
            return r1
        L14:
            boolean r8 = r5.f23703a
            if (r8 != 0) goto L28
            java.lang.String r6 = "HardwareConfig"
            boolean r6 = android.util.Log.isLoggable(r6, r0)
            if (r6 == 0) goto L27
            java.lang.String r6 = "HardwareConfig"
            java.lang.String r7 = "Hardware config disallowed by device model"
            android.util.Log.v(r6, r7)
        L27:
            return r1
        L28:
            boolean r8 = p334t2.C6139q.f23699h
            if (r8 != 0) goto L3c
            java.lang.String r6 = "HardwareConfig"
            boolean r6 = android.util.Log.isLoggable(r6, r0)
            if (r6 == 0) goto L3b
            java.lang.String r6 = "HardwareConfig"
            java.lang.String r7 = "Hardware config disallowed by sdk"
            android.util.Log.v(r6, r7)
        L3b:
            return r1
        L3c:
            boolean r8 = p334t2.C6139q.f23698g
            r2 = 1
            if (r8 == 0) goto L4b
            java.util.concurrent.atomic.AtomicBoolean r8 = r5.f23708f
            boolean r8 = r8.get()
            if (r8 != 0) goto L4b
            r8 = 1
            goto L4c
        L4b:
            r8 = 0
        L4c:
            if (r8 == 0) goto L5e
            java.lang.String r6 = "HardwareConfig"
            boolean r6 = android.util.Log.isLoggable(r6, r0)
            if (r6 == 0) goto L5d
            java.lang.String r6 = "HardwareConfig"
            java.lang.String r7 = "Hardware config disallowed by app state"
            android.util.Log.v(r6, r7)
        L5d:
            return r1
        L5e:
            if (r9 == 0) goto L70
            java.lang.String r6 = "HardwareConfig"
            boolean r6 = android.util.Log.isLoggable(r6, r0)
            if (r6 == 0) goto L6f
            java.lang.String r6 = "HardwareConfig"
            java.lang.String r7 = "Hardware config disallowed because exif orientation is required"
            android.util.Log.v(r6, r7)
        L6f:
            return r1
        L70:
            int r8 = r5.f23705c
            if (r6 >= r8) goto L84
            java.lang.String r6 = "HardwareConfig"
            boolean r6 = android.util.Log.isLoggable(r6, r0)
            if (r6 == 0) goto L83
            java.lang.String r6 = "HardwareConfig"
            java.lang.String r7 = "Hardware config disallowed because width is too small"
            android.util.Log.v(r6, r7)
        L83:
            return r1
        L84:
            if (r7 >= r8) goto L96
            java.lang.String r6 = "HardwareConfig"
            boolean r6 = android.util.Log.isLoggable(r6, r0)
            if (r6 == 0) goto L95
            java.lang.String r6 = "HardwareConfig"
            java.lang.String r7 = "Hardware config disallowed because height is too small"
            android.util.Log.v(r6, r7)
        L95:
            return r1
        L96:
            monitor-enter(r5)
            int r6 = r5.f23706d     // Catch: java.lang.Throwable -> Lfd
            int r6 = r6 + r2
            r5.f23706d = r6     // Catch: java.lang.Throwable -> Lfd
            r7 = 50
            if (r6 < r7) goto Le7
            r5.f23706d = r1     // Catch: java.lang.Throwable -> Lfd
            java.io.File r6 = p334t2.C6139q.f23700i     // Catch: java.lang.Throwable -> Lfd
            java.lang.String[] r6 = r6.list()     // Catch: java.lang.Throwable -> Lfd
            int r6 = r6.length     // Catch: java.lang.Throwable -> Lfd
            int r7 = p334t2.C6139q.f23702k     // Catch: java.lang.Throwable -> Lfd
            r8 = -1
            if (r7 == r8) goto Lb1
            int r7 = p334t2.C6139q.f23702k     // Catch: java.lang.Throwable -> Lfd
            goto Lb3
        Lb1:
            int r7 = r5.f23704b     // Catch: java.lang.Throwable -> Lfd
        Lb3:
            long r7 = (long) r7     // Catch: java.lang.Throwable -> Lfd
            long r3 = (long) r6     // Catch: java.lang.Throwable -> Lfd
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto Lbb
            r9 = 1
            goto Lbc
        Lbb:
            r9 = 0
        Lbc:
            r5.f23707e = r9     // Catch: java.lang.Throwable -> Lfd
            if (r9 != 0) goto Le7
            java.lang.String r9 = "Downsampler"
            r3 = 5
            boolean r9 = android.util.Log.isLoggable(r9, r3)     // Catch: java.lang.Throwable -> Lfd
            if (r9 == 0) goto Le7
            java.lang.String r9 = "Downsampler"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lfd
            r3.<init>()     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r4 = "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lfd
            r3.append(r6)     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r6 = ", limit "
            r3.append(r6)     // Catch: java.lang.Throwable -> Lfd
            r3.append(r7)     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> Lfd
            android.util.Log.w(r9, r6)     // Catch: java.lang.Throwable -> Lfd
        Le7:
            boolean r6 = r5.f23707e     // Catch: java.lang.Throwable -> Lfd
            monitor-exit(r5)
            if (r6 != 0) goto Lfc
            java.lang.String r6 = "HardwareConfig"
            boolean r6 = android.util.Log.isLoggable(r6, r0)
            if (r6 == 0) goto Lfb
            java.lang.String r6 = "HardwareConfig"
            java.lang.String r7 = "Hardware config disallowed because there are insufficient FDs"
            android.util.Log.v(r6, r7)
        Lfb:
            return r1
        Lfc:
            return r2
        Lfd:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }
}
