package p307r7;

/* renamed from: r7.a */
/* loaded from: classes.dex */
public class C5798a {

    /* renamed from: j */
    public static java.util.concurrent.ScheduledExecutorService f22482j;

    /* renamed from: a */
    public final java.lang.Object f22483a;

    /* renamed from: b */
    public final android.os.PowerManager.WakeLock f22484b;

    /* renamed from: c */
    public android.os.WorkSource f22485c;

    /* renamed from: d */
    public final java.lang.String f22486d;

    /* renamed from: e */
    public final android.content.Context f22487e;

    /* renamed from: f */
    public boolean f22488f;

    /* renamed from: g */
    public final java.util.Map<java.lang.String, java.lang.Integer[]> f22489g;

    /* renamed from: h */
    public int f22490h;

    /* renamed from: i */
    public java.util.concurrent.atomic.AtomicInteger f22491i;

    public C5798a(android.content.Context r7, int r8, java.lang.String r9) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L5
            r1 = r0
            goto L9
        L5:
            java.lang.String r1 = r7.getPackageName()
        L9:
            r6.<init>()
            r6.f22483a = r6
            r2 = 1
            r6.f22488f = r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r6.f22489g = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Collections.synchronizedSet(r3)
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r4 = 0
            r3.<init>(r4)
            r6.f22491i = r3
            java.lang.String r3 = "WakeLock: context must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r7, r3)
            java.lang.String r3 = "WakeLock: wakeLockName must not be empty"
            com.google.android.gms.common.internal.C1101a.m3101f(r9, r3)
            android.content.Context r3 = r7.getApplicationContext()
            r6.f22487e = r3
            java.lang.String r3 = "com.google.android.gms"
            java.lang.String r5 = r7.getPackageName()
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L5a
            java.lang.String r3 = "*gcore*:"
            int r5 = r9.length()
            if (r5 == 0) goto L51
            java.lang.String r3 = r3.concat(r9)
            goto L57
        L51:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L57:
            r6.f22486d = r3
            goto L5c
        L5a:
            r6.f22486d = r9
        L5c:
            java.lang.String r3 = "power"
            java.lang.Object r3 = r7.getSystemService(r3)
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            android.os.PowerManager$WakeLock r8 = r3.newWakeLock(r8, r9)
            r6.f22484b = r8
            boolean r8 = p353u6.C6349l.m13002a(r7)
            if (r8 == 0) goto L116
            boolean r8 = p353u6.C6347j.m12999b(r1)
            if (r8 == 0) goto L7a
            java.lang.String r1 = r7.getPackageName()
        L7a:
            java.lang.String r8 = "WorkSourceUtil"
            android.content.pm.PackageManager r9 = r7.getPackageManager()
            if (r9 == 0) goto Lec
            if (r1 != 0) goto L85
            goto Lec
        L85:
            w6.b r7 = p388w6.C6816c.m13887a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld5
            android.content.Context r7 = r7.f26525a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld5
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld5
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld5
            if (r7 != 0) goto La4
            java.lang.String r7 = "Could not get applicationInfo from package: "
            int r9 = r1.length()
            if (r9 == 0) goto L9e
            goto Lde
        L9e:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r7)
            goto Le8
        La4:
            int r7 = r7.uid
            android.os.WorkSource r0 = new android.os.WorkSource
            r0.<init>()
            java.lang.reflect.Method r9 = p353u6.C6349l.f24800b
            if (r9 == 0) goto Lbe
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Lce
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> Lce
            r3[r4] = r7     // Catch: java.lang.Exception -> Lce
            r3[r2] = r1     // Catch: java.lang.Exception -> Lce
            r9.invoke(r0, r3)     // Catch: java.lang.Exception -> Lce
            goto Lec
        Lbe:
            java.lang.reflect.Method r9 = p353u6.C6349l.f24799a
            if (r9 == 0) goto Lec
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lce
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> Lce
            r1[r4] = r7     // Catch: java.lang.Exception -> Lce
            r9.invoke(r0, r1)     // Catch: java.lang.Exception -> Lce
            goto Lec
        Lce:
            r7 = move-exception
            java.lang.String r9 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r8, r9, r7)
            goto Lec
        Ld5:
            java.lang.String r7 = "Could not find package: "
            int r9 = r1.length()
            if (r9 == 0) goto Le3
        Lde:
            java.lang.String r7 = r7.concat(r1)
            goto Le9
        Le3:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r7)
        Le8:
            r7 = r9
        Le9:
            android.util.Log.e(r8, r7)
        Lec:
            r6.f22485c = r0
            if (r0 == 0) goto L116
            android.content.Context r7 = r6.f22487e
            boolean r7 = p353u6.C6349l.m13002a(r7)
            if (r7 == 0) goto L116
            android.os.WorkSource r7 = r6.f22485c
            if (r7 == 0) goto L100
            r7.add(r0)
            goto L102
        L100:
            r6.f22485c = r0
        L102:
            android.os.WorkSource r7 = r6.f22485c
            android.os.PowerManager$WakeLock r8 = r6.f22484b     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10a java.lang.IllegalArgumentException -> L10c
            r8.setWorkSource(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L10a java.lang.IllegalArgumentException -> L10c
            goto L116
        L10a:
            r7 = move-exception
            goto L10d
        L10c:
            r7 = move-exception
        L10d:
            java.lang.String r8 = "WakeLock"
            java.lang.String r7 = r7.toString()
            android.util.Log.wtf(r8, r7)
        L116:
            java.util.concurrent.ScheduledExecutorService r7 = p307r7.C5798a.f22482j
            if (r7 != 0) goto L13e
            java.lang.Class<s6.a> r7 = p326s6.C5975a.class
            monitor-enter(r7)
            s6.a$a r8 = p326s6.C5975a.f23073a     // Catch: java.lang.Throwable -> L13b
            if (r8 != 0) goto L128
            s6.b r8 = new s6.b     // Catch: java.lang.Throwable -> L13b
            r8.<init>()     // Catch: java.lang.Throwable -> L13b
            p326s6.C5975a.f23073a = r8     // Catch: java.lang.Throwable -> L13b
        L128:
            s6.a$a r8 = p326s6.C5975a.f23073a     // Catch: java.lang.Throwable -> L13b
            monitor-exit(r7)
            s6.b r8 = (p326s6.C5976b) r8
            java.util.Objects.requireNonNull(r8)
            java.util.concurrent.ScheduledExecutorService r7 = java.util.concurrent.Executors.newScheduledThreadPool(r2)
            java.util.concurrent.ScheduledExecutorService r7 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r7)
            p307r7.C5798a.f22482j = r7
            goto L13e
        L13b:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L13e:
            return
    }

    /* renamed from: a */
    public void m12165a(long r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r7.f22491i
            r0.incrementAndGet()
            boolean r0 = r7.f22488f
            r1 = 0
            if (r0 == 0) goto Ld
            android.text.TextUtils.isEmpty(r1)
        Ld:
            java.lang.Object r0 = r7.f22483a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r7.f22489g     // Catch: java.lang.Throwable -> L87
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L87
            r3 = 0
            if (r2 == 0) goto L1d
            int r2 = r7.f22490h     // Catch: java.lang.Throwable -> L87
            if (r2 <= 0) goto L2c
        L1d:
            android.os.PowerManager$WakeLock r2 = r7.f22484b     // Catch: java.lang.Throwable -> L87
            boolean r2 = r2.isHeld()     // Catch: java.lang.Throwable -> L87
            if (r2 != 0) goto L2c
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r7.f22489g     // Catch: java.lang.Throwable -> L87
            r2.clear()     // Catch: java.lang.Throwable -> L87
            r7.f22490h = r3     // Catch: java.lang.Throwable -> L87
        L2c:
            boolean r2 = r7.f22488f     // Catch: java.lang.Throwable -> L87
            r4 = 1
            if (r2 == 0) goto L59
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r7.f22489g     // Catch: java.lang.Throwable -> L87
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L87
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2     // Catch: java.lang.Throwable -> L87
            if (r2 != 0) goto L4a
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r7.f22489g     // Catch: java.lang.Throwable -> L87
            java.lang.Integer[] r5 = new java.lang.Integer[r4]     // Catch: java.lang.Throwable -> L87
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L87
            r5[r3] = r6     // Catch: java.lang.Throwable -> L87
            r2.put(r1, r5)     // Catch: java.lang.Throwable -> L87
            r3 = 1
            goto L57
        L4a:
            r5 = r2[r3]     // Catch: java.lang.Throwable -> L87
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L87
            int r5 = r5 + r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L87
            r2[r3] = r5     // Catch: java.lang.Throwable -> L87
        L57:
            if (r3 != 0) goto L61
        L59:
            boolean r2 = r7.f22488f     // Catch: java.lang.Throwable -> L87
            if (r2 != 0) goto L6e
            int r2 = r7.f22490h     // Catch: java.lang.Throwable -> L87
            if (r2 != 0) goto L6e
        L61:
            android.os.PowerManager$WakeLock r2 = r7.f22484b     // Catch: java.lang.Throwable -> L87
            p338t6.C6182b.m12752a(r2, r1)     // Catch: java.lang.Throwable -> L87
            r7.m12167c()     // Catch: java.lang.Throwable -> L87
            int r1 = r7.f22490h     // Catch: java.lang.Throwable -> L87
            int r1 = r1 + r4
            r7.f22490h = r1     // Catch: java.lang.Throwable -> L87
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            android.os.PowerManager$WakeLock r0 = r7.f22484b
            r0.acquire()
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            java.util.concurrent.ScheduledExecutorService r0 = p307r7.C5798a.f22482j
            f6.i r1 = new f6.i
            r1.<init>(r7)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r8, r2)
        L86:
            return
        L87:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            throw r8
    }

    /* renamed from: b */
    public void m12166b() {
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f22491i
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L19
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r6.f22486d
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " release without a matched acquire!"
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r0, r1)
        L19:
            boolean r0 = r6.f22488f
            r1 = 0
            if (r0 == 0) goto L21
            android.text.TextUtils.isEmpty(r1)
        L21:
            java.lang.Object r0 = r6.f22483a
            monitor-enter(r0)
            boolean r2 = r6.f22488f     // Catch: java.lang.Throwable -> L6d
            r3 = 1
            if (r2 == 0) goto L53
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r6.f22489g     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2     // Catch: java.lang.Throwable -> L6d
            r4 = 0
            if (r2 != 0) goto L35
            goto L51
        L35:
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L6d
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L6d
            if (r5 != r3) goto L44
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r6.f22489g     // Catch: java.lang.Throwable -> L6d
            r2.remove(r1)     // Catch: java.lang.Throwable -> L6d
            r4 = 1
            goto L51
        L44:
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L6d
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L6d
            int r5 = r5 - r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L6d
            r2[r4] = r5     // Catch: java.lang.Throwable -> L6d
        L51:
            if (r4 != 0) goto L5b
        L53:
            boolean r2 = r6.f22488f     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L68
            int r2 = r6.f22490h     // Catch: java.lang.Throwable -> L6d
            if (r2 != r3) goto L68
        L5b:
            android.os.PowerManager$WakeLock r2 = r6.f22484b     // Catch: java.lang.Throwable -> L6d
            p338t6.C6182b.m12752a(r2, r1)     // Catch: java.lang.Throwable -> L6d
            r6.m12167c()     // Catch: java.lang.Throwable -> L6d
            int r1 = r6.f22490h     // Catch: java.lang.Throwable -> L6d
            int r1 = r1 - r3
            r6.f22490h = r1     // Catch: java.lang.Throwable -> L6d
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            r6.m12168d()
            return
        L6d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r1
    }

    /* renamed from: c */
    public final java.util.List<java.lang.String> m12167c() {
            r11 = this;
            android.os.WorkSource r0 = r11.f22485c
            java.lang.reflect.Method r1 = p353u6.C6349l.f24799a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "null reference"
            java.lang.String r3 = "Unable to assign blame through WorkSource"
            java.lang.String r4 = "WorkSourceUtil"
            r5 = 0
            if (r0 != 0) goto L13
            goto L2b
        L13:
            java.lang.reflect.Method r6 = p353u6.C6349l.f24801c
            if (r6 == 0) goto L2b
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = r6.invoke(r0, r7)     // Catch: java.lang.Exception -> L27
            java.util.Objects.requireNonNull(r6, r2)     // Catch: java.lang.Exception -> L27
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Exception -> L27
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L27
            goto L2c
        L27:
            r6 = move-exception
            android.util.Log.wtf(r4, r3, r6)
        L2b:
            r6 = 0
        L2c:
            if (r6 != 0) goto L2f
            goto L5a
        L2f:
            r7 = 0
        L30:
            if (r7 >= r6) goto L5a
            java.lang.reflect.Method r8 = p353u6.C6349l.f24802d
            if (r8 == 0) goto L4a
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L46
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L46
            r9[r5] = r10     // Catch: java.lang.Exception -> L46
            java.lang.Object r8 = r8.invoke(r0, r9)     // Catch: java.lang.Exception -> L46
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L46
            goto L4b
        L46:
            r8 = move-exception
            android.util.Log.wtf(r4, r3, r8)
        L4a:
            r8 = 0
        L4b:
            boolean r9 = p353u6.C6347j.m12999b(r8)
            if (r9 != 0) goto L57
            java.util.Objects.requireNonNull(r8, r2)
            r1.add(r8)
        L57:
            int r7 = r7 + 1
            goto L30
        L5a:
            return r1
    }

    /* renamed from: d */
    public final void m12168d() {
            r3 = this;
            android.os.PowerManager$WakeLock r0 = r3.f22484b
            boolean r0 = r0.isHeld()
            if (r0 == 0) goto L33
            android.os.PowerManager$WakeLock r0 = r3.f22484b     // Catch: java.lang.RuntimeException -> Le
            r0.release()     // Catch: java.lang.RuntimeException -> Le
            goto L2c
        Le:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()
            java.lang.Class<java.lang.RuntimeException> r2 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L32
            java.lang.String r1 = r3.f22486d
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " was already released!"
            java.lang.String r1 = r1.concat(r2)
            java.lang.String r2 = "WakeLock"
            android.util.Log.e(r2, r1, r0)
        L2c:
            android.os.PowerManager$WakeLock r0 = r3.f22484b
            r0.isHeld()
            goto L33
        L32:
            throw r0
        L33:
            return
    }
}
