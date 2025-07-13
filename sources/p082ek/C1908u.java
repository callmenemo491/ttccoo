package p082ek;

/* renamed from: ek.u */
/* loaded from: classes.dex */
public class C1908u {

    /* renamed from: c */
    public static final p082ek.C1908u f8250c = null;

    /* renamed from: a */
    public final boolean f8251a;

    /* renamed from: b */
    public final java.lang.reflect.Constructor<java.lang.invoke.MethodHandles.Lookup> f8252b;

    /* renamed from: ek.u$a */
    public static final class a extends p082ek.C1908u {

        /* renamed from: ek.u$a$a, reason: collision with other inner class name */
        public static final class ExecutorC7376a implements java.util.concurrent.Executor {

            /* renamed from: Y */
            public final android.os.Handler f8253Y;

            public ExecutorC7376a() {
                    r2 = this;
                    r2.<init>()
                    android.os.Handler r0 = new android.os.Handler
                    android.os.Looper r1 = android.os.Looper.getMainLooper()
                    r0.<init>(r1)
                    r2.f8253Y = r0
                    return
            }

            @Override // java.util.concurrent.Executor
            public void execute(java.lang.Runnable r2) {
                    r1 = this;
                    android.os.Handler r0 = r1.f8253Y
                    r0.post(r2)
                    return
            }
        }

        public a() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                r2.<init>(r0)
                return
        }

        @Override // p082ek.C1908u
        /* renamed from: a */
        public java.util.concurrent.Executor mo4685a() {
                r1 = this;
                ek.u$a$a r0 = new ek.u$a$a
                r0.<init>()
                return r0
        }

        @Override // p082ek.C1908u
        /* renamed from: b */
        public java.lang.Object mo4686b(java.lang.reflect.Method r3, java.lang.Class<?> r4, java.lang.Object r5, java.lang.Object... r6) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto Lb
                java.lang.Object r3 = super.mo4686b(r3, r4, r5, r6)
                return r3
            Lb:
                java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                java.lang.String r4 = "Calling default methods on API 24 and 25 is not supported"
                r3.<init>(r4)
                throw r3
        }
    }

    static {
            java.lang.String r0 = "java.vm.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "Dalvik"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            ek.u$a r0 = new ek.u$a
            r0.<init>()
            goto L1a
        L14:
            ek.u r0 = new ek.u
            r1 = 1
            r0.<init>(r1)
        L1a:
            p082ek.C1908u.f8250c = r0
            return
    }

    public C1908u(boolean r5) {
            r4 = this;
            r4.<init>()
            r4.f8251a = r5
            r0 = 0
            if (r5 == 0) goto L1e
            java.lang.Class<java.lang.invoke.MethodHandles$Lookup> r5 = java.lang.invoke.MethodHandles.Lookup.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            r1[r2] = r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.Throwable -> L1e
            java.lang.reflect.Constructor r0 = r5.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L1e
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L1e
        L1e:
            r4.f8252b = r0
            return
    }

    /* renamed from: a */
    public java.util.concurrent.Executor mo4685a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    /* renamed from: b */
    public java.lang.Object mo4686b(java.lang.reflect.Method r5, java.lang.Class<?> r6, java.lang.Object r7, java.lang.Object... r8) {
            r4 = this;
            java.lang.reflect.Constructor<java.lang.invoke.MethodHandles$Lookup> r0 = r4.f8252b
            if (r0 == 0) goto L19
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r2 = 1
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.Object r0 = r0.newInstance(r1)
            java.lang.invoke.MethodHandles$Lookup r0 = (java.lang.invoke.MethodHandles.Lookup) r0
            goto L1d
        L19:
            java.lang.invoke.MethodHandles$Lookup r0 = java.lang.invoke.MethodHandles.lookup()
        L1d:
            java.lang.invoke.MethodHandle r5 = r0.unreflectSpecial(r5, r6)
            java.lang.invoke.MethodHandle r5 = r5.bindTo(r7)
            java.lang.Object r5 = r5.invokeWithArguments(r8)
            return r5
    }
}
