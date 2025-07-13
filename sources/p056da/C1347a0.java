package p056da;

/* renamed from: da.a0 */
/* loaded from: classes.dex */
public class C1347a0 {

    /* renamed from: e */
    public static final java.util.Map<java.lang.String, java.lang.Integer> f6869e = null;

    /* renamed from: f */
    public static final java.lang.String f6870f = null;

    /* renamed from: a */
    public final android.content.Context f6871a;

    /* renamed from: b */
    public final p056da.C1361h0 f6872b;

    /* renamed from: c */
    public final p056da.C1346a f6873c;

    /* renamed from: d */
    public final ma.InterfaceC4509c f6874d;

    static {
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            p056da.C1347a0.f6869e = r9
            r0 = 5
            java.lang.String r2 = "armeabi"
            r3 = 6
            java.lang.String r4 = "armeabi-v7a"
            r5 = 9
            java.lang.String r6 = "arm64-v8a"
            r10 = 0
            java.lang.String r8 = "x86"
            r1 = r9
            r7 = r10
            p371v5.C6555e.m13340a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "x86_64"
            r9.put(r2, r1)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "18.2.3"
            r0[r10] = r2
            java.lang.String r2 = "Crashlytics Android SDK/%s"
            java.lang.String r0 = java.lang.String.format(r1, r2, r0)
            p056da.C1347a0.f6870f = r0
            return
    }

    public C1347a0(android.content.Context r1, p056da.C1361h0 r2, p056da.C1346a r3, ma.InterfaceC4509c r4) {
            r0 = this;
            r0.<init>()
            r0.f6871a = r1
            r0.f6872b = r2
            r0.f6873c = r3
            r0.f6874d = r4
            return
    }

    /* renamed from: a */
    public final p094fa.C2105b0<p094fa.AbstractC2103a0.e.d.a.b.AbstractC7384a> m3844a() {
            r12 = this;
            r0 = 1
            fa.a0$e$d$a$b$a[] r0 = new p094fa.AbstractC2103a0.e.d.a.b.AbstractC7384a[r0]
            r1 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            da.a r2 = r12.f6873c
            java.lang.String r9 = r2.f6865d
            java.lang.String r2 = "Null name"
            java.util.Objects.requireNonNull(r9, r2)
            da.a r2 = r12.f6873c
            java.lang.String r10 = r2.f6863b
            if (r3 != 0) goto L1f
            java.lang.String r2 = " baseAddress"
            goto L21
        L1f:
            java.lang.String r2 = ""
        L21:
            if (r1 != 0) goto L29
            java.lang.String r4 = " size"
            java.lang.String r2 = p064e.C1493g.m4049a(r2, r4)
        L29:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L4b
            fa.n r2 = new fa.n
            long r5 = r3.longValue()
            long r7 = r1.longValue()
            r11 = 0
            r4 = r2
            r4.<init>(r5, r7, r9, r10, r11)
            r1 = 0
            r0[r1] = r2
            fa.b0 r1 = new fa.b0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.<init>(r0)
            return r1
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties:"
            java.lang.String r1 = p064e.C1493g.m4049a(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public final p094fa.AbstractC2103a0.e.d.c m3845b(int r14) {
            r13 = this;
            android.content.Context r0 = r13.f6871a
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = 0
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch: java.lang.IllegalStateException -> L44
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch: java.lang.IllegalStateException -> L44
            android.content.Intent r0 = r0.registerReceiver(r4, r5)     // Catch: java.lang.IllegalStateException -> L44
            if (r0 == 0) goto L41
            java.lang.String r5 = "status"
            r6 = -1
            int r5 = r0.getIntExtra(r5, r6)     // Catch: java.lang.IllegalStateException -> L44
            if (r5 != r6) goto L1d
            goto L23
        L1d:
            if (r5 == r3) goto L25
            r7 = 5
            if (r5 != r7) goto L23
            goto L25
        L23:
            r5 = 0
            goto L26
        L25:
            r5 = 1
        L26:
            java.lang.String r7 = "level"
            int r7 = r0.getIntExtra(r7, r6)     // Catch: java.lang.IllegalStateException -> L3f
            java.lang.String r8 = "scale"
            int r0 = r0.getIntExtra(r8, r6)     // Catch: java.lang.IllegalStateException -> L3f
            if (r7 == r6) goto L4d
            if (r0 != r6) goto L37
            goto L4d
        L37:
            float r6 = (float) r7     // Catch: java.lang.IllegalStateException -> L3f
            float r0 = (float) r0     // Catch: java.lang.IllegalStateException -> L3f
            float r6 = r6 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r6)     // Catch: java.lang.IllegalStateException -> L3f
            goto L4e
        L3f:
            r0 = move-exception
            goto L46
        L41:
            r0 = r4
            r5 = 0
            goto L4e
        L44:
            r0 = move-exception
            r5 = 0
        L46:
            java.lang.String r6 = "FirebaseCrashlytics"
            java.lang.String r7 = "An error occurred getting battery state."
            android.util.Log.e(r6, r7, r0)
        L4d:
            r0 = r4
        L4e:
            if (r0 == 0) goto L58
            double r6 = r0.doubleValue()
            java.lang.Double r4 = java.lang.Double.valueOf(r6)
        L58:
            if (r5 == 0) goto L6e
            if (r0 != 0) goto L5d
            goto L6e
        L5d:
            float r0 = r0.floatValue()
            double r5 = (double) r0
            r7 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L6c
            goto L6f
        L6c:
            r3 = 3
            goto L6f
        L6e:
            r3 = 1
        L6f:
            android.content.Context r0 = r13.f6871a
            boolean r5 = p056da.C1354e.m3867k(r0)
            if (r5 == 0) goto L78
            goto L89
        L78:
            java.lang.String r5 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r5)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r5 = 8
            android.hardware.Sensor r0 = r0.getDefaultSensor(r5)
            if (r0 == 0) goto L89
            goto L8a
        L89:
            r1 = 0
        L8a:
            long r5 = p056da.C1354e.m3865i()
            android.content.Context r0 = r13.f6871a
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo
            r2.<init>()
            java.lang.String r7 = "activity"
            java.lang.Object r0 = r0.getSystemService(r7)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r0.getMemoryInfo(r2)
            long r7 = r2.availMem
            long r5 = r5 - r7
            java.io.File r0 = android.os.Environment.getDataDirectory()
            java.lang.String r0 = r0.getPath()
            android.os.StatFs r2 = new android.os.StatFs
            r2.<init>(r0)
            int r0 = r2.getBlockSize()
            long r7 = (long) r0
            int r0 = r2.getBlockCount()
            long r9 = (long) r0
            long r9 = r9 * r7
            int r0 = r2.getAvailableBlocks()
            long r11 = (long) r0
            long r7 = r7 * r11
            long r9 = r9 - r7
            fa.s$b r0 = new fa.s$b
            r0.<init>()
            r0.f9792a = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.f9793b = r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.f9794c = r1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0.f9795d = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r5)
            r0.f9796e = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            r0.f9797f = r14
            fa.a0$e$d$c r14 = r0.m5690a()
            return r14
    }

    /* renamed from: c */
    public final p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b m3846c(p365v.C6476c r9, int r10, int r11, int r12) {
            r8 = this;
            v.e r0 = r9.f25076Z
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            v.e r0 = r9.f25075Y
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            v.e r0 = r9.f25077a0
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            r1 = 0
            if (r0 == 0) goto L12
            goto L14
        L12:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
        L14:
            java.lang.Object r9 = r9.f25078b0
            v.c r9 = (p365v.C6476c) r9
            if (r12 < r11) goto L24
            r4 = r9
        L1b:
            if (r4 == 0) goto L24
            java.lang.Object r4 = r4.f25078b0
            v.c r4 = (p365v.C6476c) r4
            int r1 = r1 + 1
            goto L1b
        L24:
            r4 = 0
            java.lang.String r5 = "Null type"
            java.util.Objects.requireNonNull(r2, r5)
            fa.b0 r0 = r8.m3847d(r0, r10)
            fa.b0 r5 = new fa.b0
            r5.<init>(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r9 == 0) goto L42
            if (r1 != 0) goto L42
            int r12 = r12 + 1
            fa.a0$e$d$a$b$b r9 = r8.m3846c(r9, r10, r11, r12)
            goto L43
        L42:
            r9 = r4
        L43:
            if (r0 != 0) goto L48
            java.lang.String r10 = " overflowCount"
            goto L4a
        L48:
            java.lang.String r10 = ""
        L4a:
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L5e
            fa.o r10 = new fa.o
            int r6 = r0.intValue()
            r7 = 0
            r1 = r10
            r4 = r5
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r10
        L5e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r11 = "Missing required properties:"
            java.lang.String r10 = p064e.C1493g.m4049a(r11, r10)
            r9.<init>(r10)
            throw r9
    }

    /* renamed from: d */
    public final p094fa.C2105b0<p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a> m3847d(java.lang.StackTraceElement[] r13, int r14) {
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r13.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L79
            r3 = r13[r2]
            fa.r$b r4 = new fa.r$b
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r4.f9785e = r5
            boolean r5 = r3.isNativeMethod()
            r6 = 0
            if (r5 == 0) goto L28
            int r5 = r3.getLineNumber()
            long r8 = (long) r5
            long r8 = java.lang.Math.max(r8, r6)
            goto L29
        L28:
            r8 = r6
        L29:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = r3.getClassName()
            r5.append(r10)
            java.lang.String r10 = "."
            r5.append(r10)
            java.lang.String r10 = r3.getMethodName()
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = r3.getFileName()
            boolean r11 = r3.isNativeMethod()
            if (r11 != 0) goto L5a
            int r11 = r3.getLineNumber()
            if (r11 <= 0) goto L5a
            int r3 = r3.getLineNumber()
            long r6 = (long) r3
        L5a:
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r4.f9781a = r3
            java.lang.String r3 = "Null symbol"
            java.util.Objects.requireNonNull(r5, r3)
            r4.f9782b = r5
            r4.f9783c = r10
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r4.f9784d = r3
            fa.a0$e$d$a$b$d$a r3 = r4.m5689a()
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L79:
            fa.b0 r13 = new fa.b0
            r13.<init>(r0)
            return r13
    }

    /* renamed from: e */
    public final p094fa.AbstractC2103a0.e.d.a.b.c m3848e() {
            r9 = this;
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 != 0) goto Lb
            java.lang.String r1 = " address"
            goto Ld
        Lb:
            java.lang.String r1 = ""
        Ld:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L23
            fa.p r1 = new fa.p
            long r6 = r0.longValue()
            r8 = 0
            java.lang.String r4 = "0"
            java.lang.String r5 = "0"
            r3 = r1
            r3.<init>(r4, r5, r6, r8)
            return r1
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r1 = p064e.C1493g.m4049a(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: f */
    public final p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d m3849f(java.lang.Thread r3, java.lang.StackTraceElement[] r4, int r5) {
            r2 = this;
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "Null name"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            fa.b0 r4 = r2.m3847d(r4, r5)
            fa.b0 r5 = new fa.b0
            r5.<init>(r4)
            if (r0 != 0) goto L1b
            java.lang.String r4 = " importance"
            goto L1d
        L1b:
            java.lang.String r4 = ""
        L1d:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L2e
            fa.q r4 = new fa.q
            int r0 = r0.intValue()
            r1 = 0
            r4.<init>(r3, r0, r5, r1)
            return r4
        L2e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r5 = "Missing required properties:"
            java.lang.String r4 = p064e.C1493g.m4049a(r5, r4)
            r3.<init>(r4)
            throw r3
    }
}
