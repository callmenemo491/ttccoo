package androidx.activity;

/* loaded from: classes.dex */
public class ComponentActivity extends p030c0.ActivityC0820g implements androidx.lifecycle.InterfaceC0469t0, androidx.savedstate.InterfaceC0622c, androidx.activity.InterfaceC0187c, androidx.activity.result.InterfaceC0197e {

    /* renamed from: Z */
    public final p029c.C0812a f585Z;

    /* renamed from: a0 */
    public final androidx.lifecycle.C0472w f586a0;

    /* renamed from: b0 */
    public final androidx.savedstate.C0621b f587b0;

    /* renamed from: c0 */
    public androidx.lifecycle.C0467s0 f588c0;

    /* renamed from: d0 */
    public final androidx.activity.OnBackPressedDispatcher f589d0;

    /* renamed from: e0 */
    public final androidx.activity.result.ActivityResultRegistry f590e0;




    /* renamed from: androidx.activity.ComponentActivity$a */
    public class RunnableC0180a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.activity.ComponentActivity f594Y;

        public RunnableC0180a(androidx.activity.ComponentActivity r1) {
                r0 = this;
                r0.f594Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.activity.ComponentActivity r0 = r3.f594Y     // Catch: java.lang.IllegalStateException -> L6
                androidx.activity.ComponentActivity.m427q(r0)     // Catch: java.lang.IllegalStateException -> L6
                goto L13
            L6:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                java.lang.String r2 = "Can not perform this action after onSaveInstanceState"
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L14
            L13:
                return
            L14:
                throw r0
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    public class C0181b extends androidx.activity.result.ActivityResultRegistry {

        /* renamed from: i */
        public final /* synthetic */ androidx.activity.ComponentActivity f595i;

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        public class a implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ int f596Y;

            /* renamed from: Z */
            public final /* synthetic */ p045d.AbstractC1255a.a f597Z;

            /* renamed from: a0 */
            public final /* synthetic */ androidx.activity.ComponentActivity.C0181b f598a0;

            public a(androidx.activity.ComponentActivity.C0181b r1, int r2, p045d.AbstractC1255a.a r3) {
                    r0 = this;
                    r0.f598a0 = r1
                    r0.f596Y = r2
                    r0.f597Z = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    androidx.activity.ComponentActivity$b r0 = r4.f598a0
                    int r1 = r4.f596Y
                    d.a$a r2 = r4.f597Z
                    T r2 = r2.f6732a
                    java.util.Map<java.lang.Integer, java.lang.String> r3 = r0.f619b
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.Object r1 = r3.get(r1)
                    java.lang.String r1 = (java.lang.String) r1
                    if (r1 != 0) goto L17
                    goto L39
                L17:
                    java.util.ArrayList<java.lang.String> r3 = r0.f622e
                    r3.remove(r1)
                    java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$c<?>> r3 = r0.f623f
                    java.lang.Object r3 = r3.get(r1)
                    androidx.activity.result.ActivityResultRegistry$c r3 = (androidx.activity.result.ActivityResultRegistry.C0191c) r3
                    if (r3 == 0) goto L2f
                    androidx.activity.result.b<O> r3 = r3.f638a
                    if (r3 != 0) goto L2b
                    goto L2f
                L2b:
                    r3.mo448d(r2)
                    goto L39
                L2f:
                    android.os.Bundle r3 = r0.f625h
                    r3.remove(r1)
                    java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f624g
                    r0.put(r1, r2)
                L39:
                    return
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        public class b implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ int f599Y;

            /* renamed from: Z */
            public final /* synthetic */ android.content.IntentSender.SendIntentException f600Z;

            /* renamed from: a0 */
            public final /* synthetic */ androidx.activity.ComponentActivity.C0181b f601a0;

            public b(androidx.activity.ComponentActivity.C0181b r1, int r2, android.content.IntentSender.SendIntentException r3) {
                    r0 = this;
                    r0.f601a0 = r1
                    r0.f599Y = r2
                    r0.f600Z = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r5 = this;
                    androidx.activity.ComponentActivity$b r0 = r5.f601a0
                    int r1 = r5.f599Y
                    android.content.Intent r2 = new android.content.Intent
                    r2.<init>()
                    java.lang.String r3 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                    android.content.Intent r2 = r2.setAction(r3)
                    android.content.IntentSender$SendIntentException r3 = r5.f600Z
                    java.lang.String r4 = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"
                    android.content.Intent r2 = r2.putExtra(r4, r3)
                    r3 = 0
                    r0.m441a(r1, r3, r2)
                    return
            }
        }

        public C0181b(androidx.activity.ComponentActivity r1) {
                r0 = this;
                r0.f595i = r1
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* renamed from: b */
        public <I, O> void mo436b(int r9, p045d.AbstractC1255a<I, O> r10, I r11, p030c0.C0816c r12) {
                r8 = this;
                androidx.activity.ComponentActivity r0 = r8.f595i
                d.a$a r12 = r10.mo3704b(r0, r11)
                if (r12 == 0) goto L1a
                android.os.Handler r10 = new android.os.Handler
                android.os.Looper r11 = android.os.Looper.getMainLooper()
                r10.<init>(r11)
                androidx.activity.ComponentActivity$b$a r11 = new androidx.activity.ComponentActivity$b$a
                r11.<init>(r8, r9, r12)
                r10.post(r11)
                return
            L1a:
                android.content.Intent r10 = r10.mo1198a(r0, r11)
                r11 = 0
                android.os.Bundle r12 = r10.getExtras()
                if (r12 == 0) goto L36
                android.os.Bundle r12 = r10.getExtras()
                java.lang.ClassLoader r12 = r12.getClassLoader()
                if (r12 != 0) goto L36
                java.lang.ClassLoader r12 = r0.getClassLoader()
                r10.setExtrasClassLoader(r12)
            L36:
                java.lang.String r12 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
                boolean r1 = r10.hasExtra(r12)
                if (r1 == 0) goto L45
                android.os.Bundle r11 = r10.getBundleExtra(r12)
                r10.removeExtra(r12)
            L45:
                r7 = r11
                java.lang.String r11 = r10.getAction()
                java.lang.String r12 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
                boolean r11 = r12.equals(r11)
                if (r11 == 0) goto L61
                java.lang.String r11 = "androidx.activity.result.contract.extra.PERMISSIONS"
                java.lang.String[] r10 = r10.getStringArrayExtra(r11)
                if (r10 != 0) goto L5d
                r10 = 0
                java.lang.String[] r10 = new java.lang.String[r10]
            L5d:
                p030c0.C0814a.m2463c(r0, r10, r9)
                goto L9d
            L61:
                java.lang.String r11 = r10.getAction()
                java.lang.String r12 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                boolean r11 = r12.equals(r11)
                if (r11 == 0) goto L98
                java.lang.String r11 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                android.os.Parcelable r10 = r10.getParcelableExtra(r11)
                androidx.activity.result.f r10 = (androidx.activity.result.C0198f) r10
                android.content.IntentSender r1 = r10.f644Y     // Catch: android.content.IntentSender.SendIntentException -> L85
                android.content.Intent r3 = r10.f645Z     // Catch: android.content.IntentSender.SendIntentException -> L85
                int r4 = r10.f646a0     // Catch: android.content.IntentSender.SendIntentException -> L85
                int r5 = r10.f647b0     // Catch: android.content.IntentSender.SendIntentException -> L85
                r6 = 0
                int r10 = p030c0.C0814a.f4421c     // Catch: android.content.IntentSender.SendIntentException -> L85
                r2 = r9
                r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)     // Catch: android.content.IntentSender.SendIntentException -> L85
                goto L9d
            L85:
                r10 = move-exception
                android.os.Handler r11 = new android.os.Handler
                android.os.Looper r12 = android.os.Looper.getMainLooper()
                r11.<init>(r12)
                androidx.activity.ComponentActivity$b$b r12 = new androidx.activity.ComponentActivity$b$b
                r12.<init>(r8, r9, r10)
                r11.post(r12)
                goto L9d
            L98:
                int r11 = p030c0.C0814a.f4421c
                r0.startActivityForResult(r10, r9, r7)
            L9d:
                return
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    public static final class C0182c {

        /* renamed from: a */
        public androidx.lifecycle.C0467s0 f602a;

        public C0182c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ComponentActivity() {
            r3 = this;
            r3.<init>()
            c.a r0 = new c.a
            r0.<init>()
            r3.f585Z = r0
            androidx.lifecycle.w r0 = new androidx.lifecycle.w
            r0.<init>(r3)
            r3.f586a0 = r0
            androidx.savedstate.b r1 = new androidx.savedstate.b
            r1.<init>(r3)
            r3.f587b0 = r1
            androidx.activity.OnBackPressedDispatcher r1 = new androidx.activity.OnBackPressedDispatcher
            androidx.activity.ComponentActivity$a r2 = new androidx.activity.ComponentActivity$a
            r2.<init>(r3)
            r1.<init>(r2)
            r3.f589d0 = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            androidx.activity.ComponentActivity$b r1 = new androidx.activity.ComponentActivity$b
            r1.<init>(r3)
            r3.f590e0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            androidx.activity.ComponentActivity$3 r2 = new androidx.activity.ComponentActivity$3
            r2.<init>(r3)
            r0.mo1454a(r2)
            androidx.activity.ComponentActivity$4 r2 = new androidx.activity.ComponentActivity$4
            r2.<init>(r3)
            r0.mo1454a(r2)
            androidx.activity.ComponentActivity$5 r2 = new androidx.activity.ComponentActivity$5
            r2.<init>(r3)
            r0.mo1454a(r2)
            r2 = 23
            if (r1 > r2) goto L56
            androidx.activity.ImmLeaksCleaner r1 = new androidx.activity.ImmLeaksCleaner
            r1.<init>(r3)
            r0.mo1454a(r1)
        L56:
            return
    }

    /* renamed from: q */
    public static /* synthetic */ void m427q(androidx.activity.ComponentActivity r0) {
            super.onBackPressed()
            return
    }

    @Override // android.app.Activity
    public void addContentView(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.View r1, @android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.m434s()
            super.addContentView(r1, r2)
            return
    }

    @Override // androidx.lifecycle.InterfaceC0471v
    /* renamed from: b */
    public androidx.lifecycle.AbstractC0458o mo428b() {
            r1 = this;
            androidx.lifecycle.w r0 = r1.f586a0
            return r0
    }

    @Override // androidx.activity.InterfaceC0187c
    /* renamed from: e */
    public final androidx.activity.OnBackPressedDispatcher mo429e() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.f589d0
            return r0
    }

    @Override // androidx.savedstate.InterfaceC0622c
    /* renamed from: f */
    public final androidx.savedstate.C0620a mo430f() {
            r1 = this;
            androidx.savedstate.b r0 = r1.f587b0
            androidx.savedstate.a r0 = r0.f3684b
            return r0
    }

    @Override // androidx.activity.result.InterfaceC0197e
    /* renamed from: m */
    public final androidx.activity.result.ActivityResultRegistry mo431m() {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.f590e0
            return r0
    }

    @Override // androidx.lifecycle.InterfaceC0469t0
    /* renamed from: o */
    public androidx.lifecycle.C0467s0 mo432o() {
            r2 = this;
            android.app.Application r0 = r2.getApplication()
            if (r0 == 0) goto Lc
            r2.m433r()
            androidx.lifecycle.s0 r0 = r2.f588c0
            return r0
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.f590e0
            boolean r0 = r0.m441a(r2, r3, r4)
            if (r0 != 0) goto Lb
            super.onActivityResult(r2, r3, r4)
        Lb:
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.f589d0
            r0.m438b()
            return
    }

    @Override // p030c0.ActivityC0820g, android.app.Activity
    public void onCreate(android.os.Bundle r10) {
            r9 = this;
            androidx.savedstate.b r0 = r9.f587b0
            r0.m2156a(r10)
            c.a r0 = r9.f585Z
            r0.f4420b = r9
            java.util.Set<c.b> r0 = r0.f4419a
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            c.b r1 = (p029c.InterfaceC0813b) r1
            r1.mo1351a(r9)
            goto Lf
        L1f:
            super.onCreate(r10)
            androidx.activity.result.ActivityResultRegistry r0 = r9.f590e0
            java.util.Objects.requireNonNull(r0)
            if (r10 != 0) goto L2a
            goto L84
        L2a:
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            java.util.ArrayList r1 = r10.getIntegerArrayList(r1)
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            java.util.ArrayList r2 = r10.getStringArrayList(r2)
            if (r2 == 0) goto L84
            if (r1 != 0) goto L3b
            goto L84
        L3b:
            int r3 = r2.size()
            r4 = 0
        L40:
            if (r4 >= r3) goto L67
            java.lang.Object r5 = r1.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r6 = r2.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map<java.lang.Integer, java.lang.String> r7 = r0.f619b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r6)
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r0.f620c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7.put(r6, r5)
            int r4 = r4 + 1
            goto L40
        L67:
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            java.util.ArrayList r1 = r10.getStringArrayList(r1)
            r0.f622e = r1
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT"
            java.io.Serializable r1 = r10.getSerializable(r1)
            java.util.Random r1 = (java.util.Random) r1
            r0.f618a = r1
            android.os.Bundle r0 = r0.f625h
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            android.os.Bundle r10 = r10.getBundle(r1)
            r0.putAll(r10)
        L84:
            androidx.lifecycle.FragmentC0451k0.m1441c(r9)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int r4, java.lang.String[] r5, int[] r6) {
            r3 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r3.f590e0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r1 = r1.putExtra(r2, r5)
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            android.content.Intent r1 = r1.putExtra(r2, r6)
            r2 = -1
            boolean r0 = r0.m441a(r4, r2, r1)
            if (r0 != 0) goto L23
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L23
            super.onRequestPermissionsResult(r4, r5, r6)
        L23:
            return
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
            r2 = this;
            androidx.lifecycle.s0 r0 = r2.f588c0
            if (r0 != 0) goto Le
            java.lang.Object r1 = r2.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$c r1 = (androidx.activity.ComponentActivity.C0182c) r1
            if (r1 == 0) goto Le
            androidx.lifecycle.s0 r0 = r1.f602a
        Le:
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            androidx.activity.ComponentActivity$c r1 = new androidx.activity.ComponentActivity$c
            r1.<init>()
            r1.f602a = r0
            return r1
    }

    @Override // p030c0.ActivityC0820g, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle r4) {
            r3 = this;
            androidx.lifecycle.w r0 = r3.f586a0
            boolean r1 = r0 instanceof androidx.lifecycle.C0472w
            if (r1 == 0) goto L10
            androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2548a0
            java.lang.String r2 = "setCurrentState"
            r0.m1461d(r2)
            r0.m1463g(r1)
        L10:
            super.onSaveInstanceState(r4)
            androidx.savedstate.b r0 = r3.f587b0
            r0.m2157b(r4)
            androidx.activity.result.ActivityResultRegistry r0 = r3.f590e0
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r0.f619b
            java.util.Set r2 = r2.keySet()
            r1.<init>(r2)
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            r4.putIntegerArrayList(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r0.f619b
            java.util.Collection r2 = r2.values()
            r1.<init>(r2)
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            r4.putStringArrayList(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r2 = r0.f622e
            r1.<init>(r2)
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            r4.putStringArrayList(r2, r1)
            android.os.Bundle r1 = r0.f625h
            java.lang.Object r1 = r1.clone()
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            r4.putBundle(r2, r1)
            java.util.Random r0 = r0.f618a
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT"
            r4.putSerializable(r1, r0)
            return
    }

    /* renamed from: r */
    public void m433r() {
            r1 = this;
            androidx.lifecycle.s0 r0 = r1.f588c0
            if (r0 != 0) goto L1b
            java.lang.Object r0 = r1.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$c r0 = (androidx.activity.ComponentActivity.C0182c) r0
            if (r0 == 0) goto L10
            androidx.lifecycle.s0 r0 = r0.f602a
            r1.f588c0 = r0
        L10:
            androidx.lifecycle.s0 r0 = r1.f588c0
            if (r0 != 0) goto L1b
            androidx.lifecycle.s0 r0 = new androidx.lifecycle.s0
            r0.<init>()
            r1.f588c0 = r0
        L1b:
            return
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
            r1 = this;
            boolean r0 = p321s1.C5944a.m12354a()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lb
            java.lang.String r0 = "reportFullyDrawn() for ComponentActivity"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L12
        Lb:
            super.reportFullyDrawn()     // Catch: java.lang.Throwable -> L12
            android.os.Trace.endSection()
            return
        L12:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
    }

    /* renamed from: s */
    public final void m434s() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 2131362755(0x7f0a03c3, float:1.83453E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 2131362757(0x7f0a03c5, float:1.8345304E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 2131362756(0x7f0a03c4, float:1.8345302E38)
            r0.setTag(r1, r2)
            return
    }

    @Override // android.app.Activity
    public void setContentView(int r1) {
            r0 = this;
            r0.m434s()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Activity
    public void setContentView(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.View r1) {
            r0 = this;
            r0.m434s()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Activity
    public void setContentView(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.View r1, @android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.m434s()
            super.setContentView(r1, r2)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(@android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent r1, int r2) {
            r0 = this;
            super.startActivityForResult(r1, r2)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(@android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent r1, int r2, android.os.Bundle r3) {
            r0 = this;
            super.startActivityForResult(r1, r2, r3)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(@android.annotation.SuppressLint({"UnknownNullness"}) android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6) {
            r0 = this;
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(@android.annotation.SuppressLint({"UnknownNullness"}) android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6, android.os.Bundle r7) {
            r0 = this;
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
