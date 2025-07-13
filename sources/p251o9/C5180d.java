package p251o9;

/* renamed from: o9.d */
/* loaded from: classes.dex */
public class C5180d {

    /* renamed from: i */
    public static final java.lang.Object f20309i = null;

    /* renamed from: j */
    public static final java.util.concurrent.Executor f20310j = null;

    /* renamed from: k */
    public static final java.util.Map<java.lang.String, p251o9.C5180d> f20311k = null;

    /* renamed from: a */
    public final android.content.Context f20312a;

    /* renamed from: b */
    public final java.lang.String f20313b;

    /* renamed from: c */
    public final p251o9.C5184h f20314c;

    /* renamed from: d */
    public final p432y9.C7142i f20315d;

    /* renamed from: e */
    public final java.util.concurrent.atomic.AtomicBoolean f20316e;

    /* renamed from: f */
    public final java.util.concurrent.atomic.AtomicBoolean f20317f;

    /* renamed from: g */
    public final p432y9.C7148o<bb.C0730a> f20318g;

    /* renamed from: h */
    public final java.util.List<p251o9.C5180d.b> f20319h;

    /* renamed from: o9.d$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: o9.d$b */
    public interface b {
        /* renamed from: a */
        void m11502a(boolean r1);
    }

    @android.annotation.TargetApi(14)
    /* renamed from: o9.d$c */
    public static class c implements com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.a {

        /* renamed from: a */
        public static java.util.concurrent.atomic.AtomicReference<p251o9.C5180d.c> f20320a;

        static {
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                p251o9.C5180d.c.f20320a = r0
                return
        }

        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.a
        /* renamed from: a */
        public void mo3053a(boolean r6) {
                r5 = this;
                java.lang.Object r0 = p251o9.C5180d.f20309i
                java.lang.Object r0 = p251o9.C5180d.f20309i
                monitor-enter(r0)
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L49
                java.util.Map<java.lang.String, o9.d> r2 = p251o9.C5180d.f20311k     // Catch: java.lang.Throwable -> L49
                s.a r2 = (p319s.C5934a) r2     // Catch: java.lang.Throwable -> L49
                java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L49
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L49
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L49
            L16:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L49
                if (r2 == 0) goto L47
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L49
                o9.d r2 = (p251o9.C5180d) r2     // Catch: java.lang.Throwable -> L49
                java.util.concurrent.atomic.AtomicBoolean r3 = r2.f20316e     // Catch: java.lang.Throwable -> L49
                boolean r3 = r3.get()     // Catch: java.lang.Throwable -> L49
                if (r3 == 0) goto L16
                java.lang.String r3 = "FirebaseApp"
                java.lang.String r4 = "Notifying background state change listeners."
                android.util.Log.d(r3, r4)     // Catch: java.lang.Throwable -> L49
                java.util.List<o9.d$b> r2 = r2.f20319h     // Catch: java.lang.Throwable -> L49
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L49
            L37:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L49
                if (r3 == 0) goto L16
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L49
                o9.d$b r3 = (p251o9.C5180d.b) r3     // Catch: java.lang.Throwable -> L49
                r3.m11502a(r6)     // Catch: java.lang.Throwable -> L49
                goto L37
            L47:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                return
            L49:
                r6 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                throw r6
        }
    }

    /* renamed from: o9.d$d */
    public static class d implements java.util.concurrent.Executor {

        /* renamed from: Y */
        public static final android.os.Handler f20321Y = null;

        static {
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                p251o9.C5180d.d.f20321Y = r0
                return
        }

        public d(p251o9.C5180d.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                android.os.Handler r0 = p251o9.C5180d.d.f20321Y
                r0.post(r2)
                return
        }
    }

    @android.annotation.TargetApi(24)
    /* renamed from: o9.d$e */
    public static class e extends android.content.BroadcastReceiver {

        /* renamed from: b */
        public static java.util.concurrent.atomic.AtomicReference<p251o9.C5180d.e> f20322b;

        /* renamed from: a */
        public final android.content.Context f20323a;

        static {
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                p251o9.C5180d.e.f20322b = r0
                return
        }

        public e(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.f20323a = r1
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                java.lang.Object r2 = p251o9.C5180d.f20309i
                java.lang.Object r2 = p251o9.C5180d.f20309i
                monitor-enter(r2)
                java.util.Map<java.lang.String, o9.d> r3 = p251o9.C5180d.f20311k     // Catch: java.lang.Throwable -> L28
                s.a r3 = (p319s.C5934a) r3     // Catch: java.lang.Throwable -> L28
                java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L28
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L28
            L11:
                boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L28
                if (r0 == 0) goto L21
                java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L28
                o9.d r0 = (p251o9.C5180d) r0     // Catch: java.lang.Throwable -> L28
                r0.m11499f()     // Catch: java.lang.Throwable -> L28
                goto L11
            L21:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
                android.content.Context r2 = r1.f20323a
                r2.unregisterReceiver(r1)
                return
            L28:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
                throw r3
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p251o9.C5180d.f20309i = r0
            o9.d$d r0 = new o9.d$d
            r1 = 0
            r0.<init>(r1)
            p251o9.C5180d.f20310j = r0
            s.a r0 = new s.a
            r0.<init>()
            p251o9.C5180d.f20311k = r0
            return
    }

    public C5180d(android.content.Context r9, java.lang.String r10, p251o9.C5184h r11) {
            r8 = this;
            r8.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r8.f20316e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.f20317f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.f20319h = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.f20312a = r9
            com.google.android.gms.common.internal.C1101a.m3100e(r10)
            r8.f20313b = r10
            java.lang.String r10 = "null reference"
            java.util.Objects.requireNonNull(r11, r10)
            r8.f20314c = r11
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r10 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "ComponentDiscovery"
            r3 = 0
            android.content.pm.PackageManager r4 = r9.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            if (r4 != 0) goto L3f
            java.lang.String r10 = "Context has no PackageManager."
            goto L5d
        L3f:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r5.<init>(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.ServiceInfo r4 = r4.getServiceInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            if (r4 != 0) goto L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r4.append(r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r10 = " has no service info."
            r4.append(r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r10 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
        L5d:
            android.util.Log.w(r2, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            goto L69
        L61:
            android.os.Bundle r10 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            goto L6a
        L64:
            java.lang.String r10 = "Application info not found."
            android.util.Log.w(r2, r10)
        L69:
            r10 = r3
        L6a:
            if (r10 != 0) goto L76
            java.lang.String r10 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r2, r10)
            java.util.List r10 = java.util.Collections.emptyList()
            goto Lae
        L76:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r4 = r10.keySet()
            java.util.Iterator r4 = r4.iterator()
        L83:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lad
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.get(r5)
            java.lang.String r7 = "com.google.firebase.components.ComponentRegistrar"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L83
            java.lang.String r6 = "com.google.firebase.components:"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L83
            r6 = 31
            java.lang.String r5 = r5.substring(r6)
            r2.add(r5)
            goto L83
        Lad:
            r10 = r2
        Lae:
            java.util.Iterator r10 = r10.iterator()
        Lb2:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lc7
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            y9.e r4 = new y9.e
            r4.<init>(r2)
            r0.add(r4)
            goto Lb2
        Lc7:
            java.util.concurrent.Executor r10 = p251o9.C5180d.f20310j
            int r2 = p432y9.C7142i.f27576g
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.addAll(r0)
            com.google.firebase.FirebaseCommonRegistrar r0 = new com.google.firebase.FirebaseCommonRegistrar
            r0.<init>()
            y9.e r5 = new y9.e
            r5.<init>(r0)
            r2.add(r5)
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            y9.c r0 = p432y9.C7136c.m14249c(r9, r0, r5)
            r4.add(r0)
            java.lang.Class<o9.d> r0 = p251o9.C5180d.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            y9.c r0 = p432y9.C7136c.m14249c(r8, r0, r5)
            r4.add(r0)
            java.lang.Class<o9.h> r0 = p251o9.C5184h.class
            java.lang.Class[] r1 = new java.lang.Class[r1]
            y9.c r11 = p432y9.C7136c.m14249c(r11, r0, r1)
            r4.add(r11)
            y9.i r11 = new y9.i
            r11.<init>(r10, r2, r4, r3)
            r8.f20315d = r11
            y9.o r10 = new y9.o
            o9.c r11 = new o9.c
            r11.<init>(r8, r9)
            r10.<init>(r11)
            r8.f20318g = r10
            return
    }

    /* renamed from: b */
    public static java.util.List<java.lang.String> m11493b() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = p251o9.C5180d.f20309i
            monitor-enter(r1)
            java.util.Map<java.lang.String, o9.d> r2 = p251o9.C5180d.f20311k     // Catch: java.lang.Throwable -> L2e
            s.a r2 = (p319s.C5934a) r2     // Catch: java.lang.Throwable -> L2e
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2e
        L14:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2e
            o9.d r3 = (p251o9.C5180d) r3     // Catch: java.lang.Throwable -> L2e
            r3.m11497a()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.f20313b     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
            goto L14
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            java.util.Collections.sort(r0)
            return r0
        L2e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            throw r0
    }

    /* renamed from: c */
    public static p251o9.C5180d m11494c() {
            java.lang.Object r0 = p251o9.C5180d.f20309i
            monitor-enter(r0)
            java.util.Map<java.lang.String, o9.d> r1 = p251o9.C5180d.f20311k     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "[DEFAULT]"
            s.h r1 = (p319s.C5941h) r1     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L33
            o9.d r1 = (p251o9.C5180d) r1     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r1
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r2.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "Default FirebaseApp is not initialized in this process "
            r2.append(r3)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = p353u6.C6346i.m12996a()     // Catch: java.lang.Throwable -> L33
            r2.append(r3)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = ". Make sure to call FirebaseApp.initializeApp(Context) first."
            r2.append(r3)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L33
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.lang.Throwable -> L33
        L33:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r1
    }

    /* renamed from: d */
    public static p251o9.C5180d m11495d(java.lang.String r5) {
            java.lang.Object r0 = p251o9.C5180d.f20309i
            monitor-enter(r0)
            java.util.Map<java.lang.String, o9.d> r1 = p251o9.C5180d.f20311k     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = r5.trim()     // Catch: java.lang.Throwable -> L51
            s.h r1 = (p319s.C5941h) r1     // Catch: java.lang.Throwable -> L51
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L51
            o9.d r1 = (p251o9.C5180d) r1     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            return r1
        L15:
            java.util.List r1 = m11493b()     // Catch: java.lang.Throwable -> L51
            r2 = r1
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L51
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L25
            java.lang.String r1 = ""
            goto L3c
        L25:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r2.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "Available app names: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = ", "
            java.lang.String r1 = android.text.TextUtils.join(r3, r1)     // Catch: java.lang.Throwable -> L51
            r2.append(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L51
        L3c:
            java.lang.String r2 = "FirebaseApp with name %s doesn't exist. %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L51
            r4 = 0
            r3[r4] = r5     // Catch: java.lang.Throwable -> L51
            r5 = 1
            r3[r5] = r1     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L51
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L51
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L51
            throw r1     // Catch: java.lang.Throwable -> L51
        L51:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            throw r5
    }

    /* renamed from: g */
    public static p251o9.C5180d m11496g(android.content.Context r5, p251o9.C5184h r6, java.lang.String r7) {
            java.util.concurrent.atomic.AtomicReference<o9.d$c> r0 = p251o9.C5180d.c.f20320a
            android.content.Context r0 = r5.getApplicationContext()
            boolean r0 = r0 instanceof android.app.Application
            if (r0 != 0) goto Lb
            goto L2f
        Lb:
            android.content.Context r0 = r5.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            java.util.concurrent.atomic.AtomicReference<o9.d$c> r1 = p251o9.C5180d.c.f20320a
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L2f
            o9.d$c r1 = new o9.d$c
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference<o9.d$c> r2 = p251o9.C5180d.c.f20320a
            r3 = 0
            boolean r2 = r2.compareAndSet(r3, r1)
            if (r2 == 0) goto L2f
            com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.m3050b(r0)
            com.google.android.gms.common.api.internal.a r0 = com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.f5552c0
            r0.m3051a(r1)
        L2f:
            java.lang.String r7 = r7.trim()
            android.content.Context r0 = r5.getApplicationContext()
            if (r0 != 0) goto L3a
            goto L3e
        L3a:
            android.content.Context r5 = r5.getApplicationContext()
        L3e:
            java.lang.Object r0 = p251o9.C5180d.f20309i
            monitor-enter(r0)
            java.util.Map<java.lang.String, o9.d> r1 = p251o9.C5180d.f20311k     // Catch: java.lang.Throwable -> L7c
            r2 = r1
            s.h r2 = (p319s.C5941h) r2     // Catch: java.lang.Throwable -> L7c
            boolean r2 = r2.containsKey(r7)     // Catch: java.lang.Throwable -> L7c
            if (r2 != 0) goto L4e
            r2 = 1
            goto L4f
        L4e:
            r2 = 0
        L4f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r3.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = "FirebaseApp name "
            r3.append(r4)     // Catch: java.lang.Throwable -> L7c
            r3.append(r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = " already exists!"
            r3.append(r4)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7c
            com.google.android.gms.common.internal.C1101a.m3106k(r2, r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = "Application context cannot be null."
            com.google.android.gms.common.internal.C1101a.m3104i(r5, r2)     // Catch: java.lang.Throwable -> L7c
            o9.d r2 = new o9.d     // Catch: java.lang.Throwable -> L7c
            r2.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> L7c
            s.h r1 = (p319s.C5941h) r1     // Catch: java.lang.Throwable -> L7c
            r1.put(r7, r2)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            r2.m11499f()
            return r2
        L7c:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            throw r5
    }

    /* renamed from: a */
    public final void m11497a() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f20317f
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            java.lang.String r1 = "FirebaseApp was deleted"
            com.google.android.gms.common.internal.C1101a.m3106k(r0, r1)
            return
    }

    /* renamed from: e */
    public java.lang.String m11498e() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5.m11497a()
            java.lang.String r1 = r5.f20313b
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()
            byte[] r1 = r1.getBytes(r2)
            r2 = 0
            r3 = 11
            if (r1 != 0) goto L19
            r1 = r2
            goto L1d
        L19:
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)
        L1d:
            r0.append(r1)
            java.lang.String r1 = "+"
            r0.append(r1)
            r5.m11497a()
            o9.h r1 = r5.f20314c
            java.lang.String r1 = r1.f20325b
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()
            byte[] r1 = r1.getBytes(r4)
            if (r1 != 0) goto L37
            goto L3b
        L37:
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r3)
        L3b:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p251o9.C5180d
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r0 = r1.f20313b
            o9.d r2 = (p251o9.C5180d) r2
            r2.m11497a()
            java.lang.String r2 = r2.f20313b
            boolean r2 = r0.equals(r2)
            return r2
    }

    /* renamed from: f */
    public final void m11499f() {
            r5 = this;
            android.content.Context r0 = r5.f20312a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L15
            java.lang.Class<android.os.UserManager> r1 = android.os.UserManager.class
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.UserManager r0 = (android.os.UserManager) r0
            boolean r0 = r0.isUserUnlocked()
            goto L16
        L15:
            r0 = 1
        L16:
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L58
            java.lang.String r0 = "FirebaseApp"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app "
            r2.append(r3)
            r5.m11497a()
            java.lang.String r3 = r5.f20313b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r0, r2)
            android.content.Context r0 = r5.f20312a
            java.util.concurrent.atomic.AtomicReference<o9.d$e> r2 = p251o9.C5180d.e.f20322b
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L92
            o9.d$e r2 = new o9.d$e
            r2.<init>(r0)
            java.util.concurrent.atomic.AtomicReference<o9.d$e> r3 = p251o9.C5180d.e.f20322b
            boolean r1 = r3.compareAndSet(r1, r2)
            if (r1 == 0) goto L92
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.USER_UNLOCKED"
            r1.<init>(r3)
            r0.registerReceiver(r2, r1)
            goto L92
        L58:
            java.lang.String r0 = "FirebaseApp"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Device unlocked: initializing all Firebase APIs for app "
            r2.append(r3)
            r5.m11497a()
            java.lang.String r3 = r5.f20313b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r0, r2)
            y9.i r0 = r5.f20315d
            boolean r2 = r5.m11501i()
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r3 = r0.f27582f
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            boolean r1 = r3.compareAndSet(r1, r4)
            if (r1 != 0) goto L86
            goto L92
        L86:
            monitor-enter(r0)
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L93
            java.util.Map<y9.c<?>, wa.b<?>> r3 = r0.f27577a     // Catch: java.lang.Throwable -> L93
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L93
            r0.m14258f(r1, r2)
        L92:
            return
        L93:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L93
            throw r1
    }

    /* renamed from: h */
    public boolean m11500h() {
            r2 = this;
            r2.m11497a()
            y9.o<bb.a> r0 = r2.f20318g
            java.lang.Object r0 = r0.get()
            bb.a r0 = (bb.C0730a) r0
            monitor-enter(r0)
            boolean r1 = r0.f4009d     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f20313b
            int r0 = r0.hashCode()
            return r0
    }

    /* renamed from: i */
    public boolean m11501i() {
            r2 = this;
            r2.m11497a()
            java.lang.String r0 = r2.f20313b
            java.lang.String r1 = "[DEFAULT]"
            boolean r0 = r1.equals(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            o6.o$a r0 = new o6.o$a
            r1 = 0
            r0.<init>(r3, r1)
            java.lang.String r1 = r3.f20313b
            java.lang.String r2 = "name"
            r0.m11075a(r2, r1)
            o9.h r1 = r3.f20314c
            java.lang.String r2 = "options"
            r0.m11075a(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
