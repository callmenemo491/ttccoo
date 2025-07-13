package p179k1;

/* renamed from: k1.v */
/* loaded from: classes.dex */
public abstract class AbstractC3664v {

    /* renamed from: a */
    @java.lang.Deprecated
    public volatile p243o1.InterfaceC4871a f16187a;

    /* renamed from: b */
    public java.util.concurrent.Executor f16188b;

    /* renamed from: c */
    public java.util.concurrent.Executor f16189c;

    /* renamed from: d */
    public p243o1.InterfaceC4873c f16190d;

    /* renamed from: e */
    public final p179k1.C3662t f16191e;

    /* renamed from: f */
    public boolean f16192f;

    /* renamed from: g */
    @java.lang.Deprecated
    public java.util.List<p179k1.AbstractC3664v.b> f16193g;

    /* renamed from: h */
    public java.util.Map<java.lang.Class<? extends p196l1.InterfaceC4162a>, p196l1.InterfaceC4162a> f16194h;

    /* renamed from: i */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f16195i;

    /* renamed from: j */
    public p179k1.C3640a f16196j;

    /* renamed from: k */
    public final java.lang.ThreadLocal<java.lang.Integer> f16197k;

    /* renamed from: l */
    public final java.util.Map<java.lang.String, java.lang.Object> f16198l;

    /* renamed from: m */
    public final java.util.Map<java.lang.Class<?>, java.lang.Object> f16199m;

    /* renamed from: k1.v$a */
    public static class a<T extends p179k1.AbstractC3664v> {

        /* renamed from: a */
        public final java.lang.Class<T> f16200a;

        /* renamed from: b */
        public final java.lang.String f16201b;

        /* renamed from: c */
        public final android.content.Context f16202c;

        /* renamed from: d */
        public java.util.concurrent.Executor f16203d;

        /* renamed from: e */
        public java.util.concurrent.Executor f16204e;

        /* renamed from: f */
        public boolean f16205f;

        /* renamed from: g */
        public boolean f16206g;

        /* renamed from: h */
        public final p179k1.AbstractC3664v.c f16207h;

        public a(android.content.Context r1, java.lang.Class<T> r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.f16202c = r1
                r0.f16200a = r2
                r0.f16201b = r3
                r1 = 1
                r0.f16205f = r1
                k1.v$c r1 = new k1.v$c
                r1.<init>()
                r0.f16207h = r1
                return
        }

        @android.annotation.SuppressLint({"RestrictedApi"})
        /* renamed from: a */
        public T m8118a() {
                r22 = this;
                r0 = r22
                android.content.Context r2 = r0.f16202c
                if (r2 == 0) goto L331
                java.lang.Class<T extends k1.v> r1 = r0.f16200a
                if (r1 == 0) goto L329
                java.util.concurrent.Executor r1 = r0.f16203d
                if (r1 != 0) goto L17
                java.util.concurrent.Executor r3 = r0.f16204e
                if (r3 != 0) goto L17
                java.util.concurrent.Executor r1 = p211m.C4308a.f17576c
                r0.f16204e = r1
                goto L26
            L17:
                if (r1 == 0) goto L20
                java.util.concurrent.Executor r3 = r0.f16204e
                if (r3 != 0) goto L20
                r0.f16204e = r1
                goto L28
            L20:
                if (r1 != 0) goto L28
                java.util.concurrent.Executor r1 = r0.f16204e
                if (r1 == 0) goto L28
            L26:
                r0.f16203d = r1
            L28:
                p1.c r4 = new p1.c
                r4.<init>()
                k1.m r8 = new k1.m
                java.lang.String r3 = r0.f16201b
                k1.v$c r5 = r0.f16207h
                r6 = 0
                r7 = 0
                java.lang.String r1 = "activity"
                java.lang.Object r1 = r2.getSystemService(r1)
                android.app.ActivityManager r1 = (android.app.ActivityManager) r1
                if (r1 == 0) goto L49
                boolean r1 = r1.isLowRamDevice()
                if (r1 != 0) goto L49
                r1 = 3
                r20 = 3
                goto L4c
            L49:
                r1 = 2
                r20 = 2
            L4c:
                java.util.concurrent.Executor r9 = r0.f16203d
                java.util.concurrent.Executor r10 = r0.f16204e
                r11 = 0
                boolean r12 = r0.f16205f
                boolean r13 = r0.f16206g
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r1 = r8
                r21 = r8
                r8 = r20
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                java.lang.Class<T extends k1.v> r1 = r0.f16200a
                java.lang.Package r2 = r1.getPackage()
                java.lang.String r2 = r2.getName()
                java.lang.String r3 = r1.getCanonicalName()
                boolean r4 = r2.isEmpty()
                r5 = 1
                if (r4 == 0) goto L7d
                goto L86
            L7d:
                int r4 = r2.length()
                int r4 = r4 + r5
                java.lang.String r3 = r3.substring(r4)
            L86:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r6 = 46
                r7 = 95
                java.lang.String r3 = r3.replace(r6, r7)
                r4.append(r3)
                java.lang.String r3 = "_Impl"
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                boolean r4 = r2.isEmpty()     // Catch: java.lang.InstantiationException -> L2d7 java.lang.IllegalAccessException -> L2ee java.lang.ClassNotFoundException -> L305
                if (r4 == 0) goto La7
                r2 = r3
                goto Lbb
            La7:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.InstantiationException -> L2d7 java.lang.IllegalAccessException -> L2ee java.lang.ClassNotFoundException -> L305
                r4.<init>()     // Catch: java.lang.InstantiationException -> L2d7 java.lang.IllegalAccessException -> L2ee java.lang.ClassNotFoundException -> L305
                r4.append(r2)     // Catch: java.lang.InstantiationException -> L2d7 java.lang.IllegalAccessException -> L2ee java.lang.ClassNotFoundException -> L305
                java.lang.String r2 = "."
                r4.append(r2)     // Catch: java.lang.InstantiationException -> L2d7 java.lang.IllegalAccessException -> L2ee java.lang.ClassNotFoundException -> L305
                r4.append(r3)     // Catch: java.lang.InstantiationException -> L2d7 java.lang.IllegalAccessException -> L2ee java.lang.ClassNotFoundException -> L305
                java.lang.String r2 = r4.toString()     // Catch: java.lang.InstantiationException -> L2d7 java.lang.IllegalAccessException -> L2ee java.lang.ClassNotFoundException -> L305
            Lbb:
                java.lang.ClassLoader r4 = r1.getClassLoader()     // Catch: java.lang.InstantiationException -> L2d7 java.lang.IllegalAccessException -> L2ee java.lang.ClassNotFoundException -> L305
                java.lang.Class r2 = java.lang.Class.forName(r2, r5, r4)     // Catch: java.lang.InstantiationException -> L2d7 java.lang.IllegalAccessException -> L2ee java.lang.ClassNotFoundException -> L305
                java.lang.Object r1 = r2.newInstance()     // Catch: java.lang.InstantiationException -> L2d7 java.lang.IllegalAccessException -> L2ee java.lang.ClassNotFoundException -> L305
                k1.v r1 = (p179k1.AbstractC3664v) r1
                r2 = r21
                o1.c r3 = r1.mo7715d(r2)
                r1.f16190d = r3
                java.util.Set r3 = r1.mo7717f()
                java.util.BitSet r4 = new java.util.BitSet
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            Lde:
                boolean r6 = r3.hasNext()
                r7 = -1
                if (r6 == 0) goto L138
                java.lang.Object r6 = r3.next()
                java.lang.Class r6 = (java.lang.Class) r6
                java.util.List<l1.a> r8 = r2.f16151f
                int r8 = r8.size()
                int r8 = r8 - r5
            Lf2:
                if (r8 < 0) goto L10c
                java.util.List<l1.a> r9 = r2.f16151f
                java.lang.Object r9 = r9.get(r8)
                java.lang.Class r9 = r9.getClass()
                boolean r9 = r6.isAssignableFrom(r9)
                if (r9 == 0) goto L109
                r4.set(r8)
                r7 = r8
                goto L10c
            L109:
                int r8 = r8 + (-1)
                goto Lf2
            L10c:
                if (r7 < 0) goto L11c
                java.util.Map<java.lang.Class<? extends l1.a>, l1.a> r8 = r1.f16194h
                java.util.List<l1.a> r9 = r2.f16151f
                java.lang.Object r7 = r9.get(r7)
                l1.a r7 = (p196l1.InterfaceC4162a) r7
                r8.put(r6, r7)
                goto Lde
            L11c:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "A required auto migration spec ("
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                java.lang.String r3 = r6.getCanonicalName()
                r2.append(r3)
                java.lang.String r3 = ") is missing in the database configuration."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L138:
                java.util.List<l1.a> r3 = r2.f16151f
                int r3 = r3.size()
                int r3 = r3 - r5
            L13f:
                if (r3 < 0) goto L152
                boolean r6 = r4.get(r3)
                if (r6 == 0) goto L14a
                int r3 = r3 + (-1)
                goto L13f
            L14a:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
                r1.<init>(r2)
                throw r1
            L152:
                java.util.Map<java.lang.Class<? extends l1.a>, l1.a> r3 = r1.f16194h
                java.util.List r3 = r1.mo7716e(r3)
                java.util.Iterator r3 = r3.iterator()
            L15c:
                boolean r4 = r3.hasNext()
                r6 = 0
                if (r4 == 0) goto L1d3
                java.lang.Object r4 = r3.next()
                l1.b r4 = (p196l1.AbstractC4163b) r4
                k1.v$c r7 = r2.f16149d
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, l1.b>> r7 = r7.f16208a
                java.util.Map r7 = java.util.Collections.unmodifiableMap(r7)
                java.util.Objects.requireNonNull(r4)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                boolean r7 = r7.containsKey(r8)
                if (r7 != 0) goto L15c
                k1.v$c r7 = r2.f16149d
                l1.b[] r8 = new p196l1.AbstractC4163b[r5]
                r8[r6] = r4
                java.util.Objects.requireNonNull(r7)
                r4 = 0
            L188:
                if (r4 >= r5) goto L15c
                r9 = r8[r4]
                java.util.Objects.requireNonNull(r9)
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, l1.b>> r10 = r7.f16208a
                java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
                java.lang.Object r10 = r10.get(r11)
                java.util.TreeMap r10 = (java.util.TreeMap) r10
                if (r10 != 0) goto L1a7
                java.util.TreeMap r10 = new java.util.TreeMap
                r10.<init>()
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, l1.b>> r12 = r7.f16208a
                r12.put(r11, r10)
            L1a7:
                java.lang.Object r12 = r10.get(r11)
                l1.b r12 = (p196l1.AbstractC4163b) r12
                if (r12 == 0) goto L1cd
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "Overriding migration "
                r13.append(r14)
                r13.append(r12)
                java.lang.String r12 = " with "
                r13.append(r12)
                r13.append(r9)
                java.lang.String r12 = r13.toString()
                java.lang.String r13 = "ROOM"
                android.util.Log.w(r13, r12)
            L1cd:
                r10.put(r11, r9)
                int r4 = r4 + 1
                goto L188
            L1d3:
                java.lang.Class<k1.z> r3 = p179k1.C3668z.class
                o1.c r4 = r1.f16190d
                java.lang.Object r3 = r1.m8117n(r3, r4)
                k1.z r3 = (p179k1.C3668z) r3
                if (r3 == 0) goto L1e1
                r3.f16242e0 = r2
            L1e1:
                java.lang.Class<k1.h> r3 = p179k1.C3650h.class
                o1.c r4 = r1.f16190d
                java.lang.Object r3 = r1.m8117n(r3, r4)
                k1.h r3 = (p179k1.C3650h) r3
                r4 = 0
                if (r3 != 0) goto L2d1
                int r3 = r2.f16152g
                r7 = 3
                if (r3 != r7) goto L1f5
                r3 = 1
                goto L1f6
            L1f5:
                r3 = 0
            L1f6:
                o1.c r7 = r1.f16190d
                r7.setWriteAheadLoggingEnabled(r3)
                r1.f16193g = r4
                java.util.concurrent.Executor r3 = r2.f16153h
                r1.f16188b = r3
                k1.c0 r3 = new k1.c0
                java.util.concurrent.Executor r4 = r2.f16154i
                r3.<init>(r4)
                r1.f16189c = r3
                r1.f16192f = r6
                java.util.Map r3 = r1.mo7718g()
                java.util.BitSet r4 = new java.util.BitSet
                r4.<init>()
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L21d:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L29c
                java.lang.Object r6 = r3.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r7 = r6.getKey()
                java.lang.Class r7 = (java.lang.Class) r7
                java.lang.Object r6 = r6.getValue()
                java.util.List r6 = (java.util.List) r6
                java.util.Iterator r6 = r6.iterator()
            L239:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L21d
                java.lang.Object r8 = r6.next()
                java.lang.Class r8 = (java.lang.Class) r8
                java.util.List<java.lang.Object> r9 = r2.f16150e
                int r9 = r9.size()
                int r9 = r9 - r5
            L24c:
                if (r9 < 0) goto L265
                java.util.List<java.lang.Object> r10 = r2.f16150e
                java.lang.Object r10 = r10.get(r9)
                java.lang.Class r10 = r10.getClass()
                boolean r10 = r8.isAssignableFrom(r10)
                if (r10 == 0) goto L262
                r4.set(r9)
                goto L266
            L262:
                int r9 = r9 + (-1)
                goto L24c
            L265:
                r9 = -1
            L266:
                if (r9 < 0) goto L274
                java.util.Map<java.lang.Class<?>, java.lang.Object> r10 = r1.f16199m
                java.util.List<java.lang.Object> r11 = r2.f16150e
                java.lang.Object r9 = r11.get(r9)
                r10.put(r8, r9)
                goto L239
            L274:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "A required type converter ("
                r2.append(r3)
                r2.append(r8)
                java.lang.String r3 = ") for "
                r2.append(r3)
                java.lang.String r3 = r7.getCanonicalName()
                r2.append(r3)
                java.lang.String r3 = " is missing in the database configuration."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L29c:
                java.util.List<java.lang.Object> r3 = r2.f16150e
                int r3 = r3.size()
                int r3 = r3 - r5
            L2a3:
                if (r3 < 0) goto L2d0
                boolean r5 = r4.get(r3)
                if (r5 == 0) goto L2ae
                int r3 = r3 + (-1)
                goto L2a3
            L2ae:
                java.util.List<java.lang.Object> r1 = r2.f16150e
                java.lang.Object r1 = r1.get(r3)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unexpected type converter "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            L2d0:
                return r1
            L2d1:
                k1.t r1 = r1.f16191e
                java.util.Objects.requireNonNull(r1)
                throw r4
            L2d7:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r3 = "Failed to create an instance of "
                java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
                java.lang.String r1 = r1.getCanonicalName()
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            L2ee:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r3 = "Cannot access the constructor"
                java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
                java.lang.String r1 = r1.getCanonicalName()
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            L305:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r4 = "cannot find implementation for "
                java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
                java.lang.String r1 = r1.getCanonicalName()
                r4.append(r1)
                java.lang.String r1 = ". "
                r4.append(r1)
                r4.append(r3)
                java.lang.String r1 = " does not exist"
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                r2.<init>(r1)
                throw r2
            L329:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Must provide an abstract class that extends RoomDatabase"
                r1.<init>(r2)
                throw r1
            L331:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot provide null context for the database."
                r1.<init>(r2)
                throw r1
        }
    }

    /* renamed from: k1.v$b */
    public static abstract class b {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: k1.v$c */
    public static class c {

        /* renamed from: a */
        public java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, p196l1.AbstractC4163b>> f16208a;

        public c() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f16208a = r0
                return
        }
    }

    public AbstractC3664v() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.f16195i = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.f16197k = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r1.f16198l = r0
            k1.t r0 = r1.mo7714c()
            r1.f16191e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f16199m = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f16194h = r0
            return
    }

    /* renamed from: a */
    public void m8109a() {
            r2 = this;
            boolean r0 = r2.f16192f
            if (r0 == 0) goto L5
            return
        L5:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 != 0) goto L19
            return
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public void m8110b() {
            r2 = this;
            boolean r0 = r2.m8111h()
            if (r0 != 0) goto L17
            java.lang.ThreadLocal<java.lang.Integer> r0 = r2.f16197k
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot access database on a different coroutine context inherited from a suspending transaction."
            r0.<init>(r1)
            throw r0
        L17:
            return
    }

    /* renamed from: c */
    public abstract p179k1.C3662t mo7714c();

    /* renamed from: d */
    public abstract p243o1.InterfaceC4873c mo7715d(p179k1.C3655m r1);

    /* renamed from: e */
    public java.util.List<p196l1.AbstractC4163b> mo7716e(java.util.Map<java.lang.Class<? extends p196l1.InterfaceC4162a>, p196l1.InterfaceC4162a> r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
    }

    /* renamed from: f */
    public java.util.Set<java.lang.Class<? extends p196l1.InterfaceC4162a>> mo7717f() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
    }

    /* renamed from: g */
    public java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> mo7718g() {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
    }

    /* renamed from: h */
    public boolean m8111h() {
            r1 = this;
            o1.c r0 = r1.f16190d
            o1.a r0 = r0.mo8083o0()
            boolean r0 = r0.mo11007M()
            return r0
    }

    /* renamed from: i */
    public final void m8112i() {
            r2 = this;
            r2.m8109a()
            o1.c r0 = r2.f16190d
            o1.a r0 = r0.mo8083o0()
            k1.t r1 = r2.f16191e
            r1.m8099i(r0)
            boolean r1 = r0.mo11009U()
            if (r1 == 0) goto L18
            r0.mo11011c0()
            goto L1b
        L18:
            r0.mo11014g()
        L1b:
            return
    }

    /* renamed from: j */
    public final void m8113j() {
            r4 = this;
            o1.c r0 = r4.f16190d
            o1.a r0 = r0.mo8083o0()
            r0.mo11013f()
            boolean r0 = r4.m8111h()
            if (r0 != 0) goto L24
            k1.t r0 = r4.f16191e
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f16165e
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L24
            k1.v r1 = r0.f16164d
            java.util.concurrent.Executor r1 = r1.f16188b
            java.lang.Runnable r0 = r0.f16171k
            r1.execute(r0)
        L24:
            return
    }

    /* renamed from: k */
    public boolean m8114k() {
            r2 = this;
            k1.a r0 = r2.f16196j
            r1 = 1
            if (r0 == 0) goto L9
            boolean r0 = r0.f16047a
            r0 = r0 ^ r1
            return r0
        L9:
            o1.a r0 = r2.f16187a
            if (r0 == 0) goto L14
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    /* renamed from: l */
    public android.database.Cursor m8115l(p243o1.InterfaceC4875e r2, android.os.CancellationSignal r3) {
            r1 = this;
            r1.m8109a()
            r1.m8110b()
            if (r3 == 0) goto L13
            o1.c r0 = r1.f16190d
            o1.a r0 = r0.mo8083o0()
            android.database.Cursor r2 = r0.mo11008T(r2, r3)
            return r2
        L13:
            o1.c r3 = r1.f16190d
            o1.a r3 = r3.mo8083o0()
            android.database.Cursor r2 = r3.mo11012e0(r2)
            return r2
    }

    @java.lang.Deprecated
    /* renamed from: m */
    public void m8116m() {
            r1 = this;
            o1.c r0 = r1.f16190d
            o1.a r0 = r0.mo8083o0()
            r0.mo11010Y()
            return
    }

    /* renamed from: n */
    public final <T> T m8117n(java.lang.Class<T> r2, p243o1.InterfaceC4873c r3) {
            r1 = this;
            boolean r0 = r2.isInstance(r3)
            if (r0 == 0) goto L7
            return r3
        L7:
            boolean r0 = r3 instanceof p179k1.InterfaceC3656n
            if (r0 == 0) goto L16
            k1.n r3 = (p179k1.InterfaceC3656n) r3
            o1.c r3 = r3.mo8082a()
            java.lang.Object r2 = r1.m8117n(r2, r3)
            return r2
        L16:
            r2 = 0
            return r2
    }
}
