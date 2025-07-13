package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: classes.dex */
public class C1082b implements android.os.Handler.Callback {

    /* renamed from: m0 */
    @androidx.annotation.RecentlyNonNull
    public static final com.google.android.gms.common.api.Status f5557m0 = null;

    /* renamed from: n0 */
    public static final com.google.android.gms.common.api.Status f5558n0 = null;

    /* renamed from: o0 */
    public static final java.lang.Object f5559o0 = null;

    /* renamed from: p0 */
    public static com.google.android.gms.common.api.internal.C1082b f5560p0;

    /* renamed from: Y */
    public long f5561Y;

    /* renamed from: Z */
    public boolean f5562Z;

    /* renamed from: a0 */
    public p248o6.C4930r f5563a0;

    /* renamed from: b0 */
    public p248o6.InterfaceC4932s f5564b0;

    /* renamed from: c0 */
    public final android.content.Context f5565c0;

    /* renamed from: d0 */
    public final p184k6.C3702e f5566d0;

    /* renamed from: e0 */
    public final p248o6.C4946z f5567e0;

    /* renamed from: f0 */
    public final java.util.concurrent.atomic.AtomicInteger f5568f0;

    /* renamed from: g0 */
    public final java.util.concurrent.atomic.AtomicInteger f5569g0;

    /* renamed from: h0 */
    public final java.util.Map<p218m6.C4388b<?>, com.google.android.gms.common.api.internal.C1082b.a<?>> f5570h0;

    /* renamed from: i0 */
    public final java.util.Set<p218m6.C4388b<?>> f5571i0;

    /* renamed from: j0 */
    public final java.util.Set<p218m6.C4388b<?>> f5572j0;

    /* renamed from: k0 */
    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    public final android.os.Handler f5573k0;

    /* renamed from: l0 */
    public volatile boolean f5574l0;

    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public class a<O extends p201l6.C4181a.c> implements p201l6.AbstractC4184d.a, p201l6.AbstractC4184d.b {

        /* renamed from: a */
        public final java.util.Queue<com.google.android.gms.common.api.internal.AbstractC1087g> f5575a;

        /* renamed from: b */
        @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
        public final p201l6.C4181a.e f5576b;

        /* renamed from: c */
        public final p218m6.C4388b<O> f5577c;

        /* renamed from: d */
        public final p218m6.C4413z f5578d;

        /* renamed from: e */
        public final java.util.Set<p218m6.C4411x> f5579e;

        /* renamed from: f */
        public final java.util.Map<com.google.android.gms.common.api.internal.C1083c.a<?>, p218m6.C4404q> f5580f;

        /* renamed from: g */
        public final int f5581g;

        /* renamed from: h */
        public final p218m6.BinderC4407t f5582h;

        /* renamed from: i */
        public boolean f5583i;

        /* renamed from: j */
        public final java.util.List<com.google.android.gms.common.api.internal.C1082b.b> f5584j;

        /* renamed from: k */
        public p184k6.C3698b f5585k;

        /* renamed from: l */
        public int f5586l;

        /* renamed from: m */
        public final /* synthetic */ com.google.android.gms.common.api.internal.C1082b f5587m;

        public a(com.google.android.gms.common.api.internal.C1082b r10, p201l6.C4183c<O> r11) {
                r9 = this;
                r9.f5587m = r10
                r9.<init>()
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r9.f5575a = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r9.f5579e = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r9.f5580f = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r9.f5584j = r0
                r0 = 0
                r9.f5585k = r0
                r1 = 0
                r9.f5586l = r1
                android.os.Handler r1 = r10.f5573k0
                android.os.Looper r4 = r1.getLooper()
                o6.d$a r1 = r11.m9325a()
                o6.d r5 = r1.m11064a()
                l6.a<O extends l6.a$c> r1 = r11.f17348c
                l6.a$a<?, O extends l6.a$c> r2 = r1.f17342a
                java.lang.String r1 = "null reference"
                java.util.Objects.requireNonNull(r2, r1)
                android.content.Context r3 = r11.f17346a
                O extends l6.a$c r6 = r11.f17349d
                r7 = r9
                r8 = r9
                l6.a$e r1 = r2.mo2942a(r3, r4, r5, r6, r7, r8)
                java.lang.String r2 = r11.f17347b
                if (r2 == 0) goto L55
                boolean r3 = r1 instanceof p248o6.AbstractC4900c
                if (r3 == 0) goto L55
                r3 = r1
                o6.c r3 = (p248o6.AbstractC4900c) r3
                r3.f19434r0 = r2
            L55:
                if (r2 == 0) goto L61
                boolean r2 = r1 instanceof p218m6.ServiceConnectionC4394g
                if (r2 == 0) goto L61
                r2 = r1
                m6.g r2 = (p218m6.ServiceConnectionC4394g) r2
                java.util.Objects.requireNonNull(r2)
            L61:
                r9.f5576b = r1
                m6.b<O extends l6.a$c> r2 = r11.f17350e
                r9.f5577c = r2
                m6.z r2 = new m6.z
                r2.<init>()
                r9.f5578d = r2
                int r2 = r11.f17352g
                r9.f5581g = r2
                boolean r1 = r1.mo9323o()
                if (r1 == 0) goto L8c
                android.content.Context r0 = r10.f5565c0
                android.os.Handler r10 = r10.f5573k0
                m6.t r1 = new m6.t
                o6.d$a r11 = r11.m9325a()
                o6.d r11 = r11.m11064a()
                r1.<init>(r0, r10, r11)
                r9.f5582h = r1
                return
            L8c:
                r9.f5582h = r0
                return
        }

        @Override // p218m6.InterfaceC4391d
        /* renamed from: H */
        public final void mo3061H(android.os.Bundle r2) {
                r1 = this;
                android.os.Looper r2 = android.os.Looper.myLooper()
                com.google.android.gms.common.api.internal.b r0 = r1.f5587m
                android.os.Handler r0 = r0.f5573k0
                android.os.Looper r0 = r0.getLooper()
                if (r2 != r0) goto L12
                r1.m3076o()
                return
            L12:
                com.google.android.gms.common.api.internal.b r2 = r1.f5587m
                android.os.Handler r2 = r2.f5573k0
                com.google.android.gms.common.api.internal.j r0 = new com.google.android.gms.common.api.internal.j
                r0.<init>(r1)
                r2.post(r0)
                return
        }

        /* renamed from: a */
        public final p184k6.C3701d m3062a(p184k6.C3701d[] r11) {
                r10 = this;
                r0 = 0
                if (r11 == 0) goto L4e
                int r1 = r11.length
                if (r1 != 0) goto L7
                goto L4e
            L7:
                l6.a$e r1 = r10.f5576b
                k6.d[] r1 = r1.mo9320k()
                r2 = 0
                if (r1 != 0) goto L12
                k6.d[] r1 = new p184k6.C3701d[r2]
            L12:
                s.a r3 = new s.a
                int r4 = r1.length
                r3.<init>(r4)
                int r4 = r1.length
                r5 = 0
            L1a:
                if (r5 >= r4) goto L2e
                r6 = r1[r5]
                java.lang.String r7 = r6.f16401Y
                long r8 = r6.m8162X()
                java.lang.Long r6 = java.lang.Long.valueOf(r8)
                r3.put(r7, r6)
                int r5 = r5 + 1
                goto L1a
            L2e:
                int r1 = r11.length
            L2f:
                if (r2 >= r1) goto L4e
                r4 = r11[r2]
                java.lang.String r5 = r4.f16401Y
                java.lang.Object r5 = r3.get(r5)
                java.lang.Long r5 = (java.lang.Long) r5
                if (r5 == 0) goto L4d
                long r5 = r5.longValue()
                long r7 = r4.m8162X()
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 >= 0) goto L4a
                goto L4d
            L4a:
                int r2 = r2 + 1
                goto L2f
            L4d:
                return r4
            L4e:
                return r0
        }

        /* renamed from: b */
        public final void m3063b() {
                r6 = this;
                com.google.android.gms.common.api.internal.b r0 = r6.f5587m
                android.os.Handler r0 = r0.f5573k0
                com.google.android.gms.common.internal.C1101a.m3098c(r0)
                com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.internal.C1082b.f5557m0
                r6.m3065d(r0)
                m6.z r1 = r6.f5578d
                java.util.Objects.requireNonNull(r1)
                r2 = 0
                r1.m9837a(r2, r0)
                java.util.Map<com.google.android.gms.common.api.internal.c$a<?>, m6.q> r0 = r6.f5580f
                java.util.Set r0 = r0.keySet()
                com.google.android.gms.common.api.internal.c$a[] r1 = new com.google.android.gms.common.api.internal.C1083c.a[r2]
                java.lang.Object[] r0 = r0.toArray(r1)
                com.google.android.gms.common.api.internal.c$a[] r0 = (com.google.android.gms.common.api.internal.C1083c.a[]) r0
                int r1 = r0.length
            L24:
                if (r2 >= r1) goto L38
                r3 = r0[r2]
                com.google.android.gms.common.api.internal.s r4 = new com.google.android.gms.common.api.internal.s
                s7.j r5 = new s7.j
                r5.<init>()
                r4.<init>(r3, r5)
                r6.m3067f(r4)
                int r2 = r2 + 1
                goto L24
            L38:
                k6.b r0 = new k6.b
                r1 = 4
                r0.<init>(r1)
                r6.m3072k(r0)
                l6.a$e r0 = r6.f5576b
                boolean r0 = r0.mo9314a()
                if (r0 == 0) goto L53
                l6.a$e r0 = r6.f5576b
                com.google.android.gms.common.api.internal.k r1 = new com.google.android.gms.common.api.internal.k
                r1.<init>(r6)
                r0.mo9318g(r1)
            L53:
                return
        }

        /* renamed from: c */
        public final void m3064c(int r6) {
                r5 = this;
                r5.m3073l()
                r0 = 1
                r5.f5583i = r0
                m6.z r1 = r5.f5578d
                l6.a$e r2 = r5.f5576b
                java.lang.String r2 = r2.mo9322m()
                java.util.Objects.requireNonNull(r1)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "The connection to Google Play services was lost"
                r3.<init>(r4)
                if (r6 != r0) goto L1d
                java.lang.String r6 = " due to service disconnection."
                goto L22
            L1d:
                r4 = 3
                if (r6 != r4) goto L25
                java.lang.String r6 = " due to dead object exception."
            L22:
                r3.append(r6)
            L25:
                if (r2 == 0) goto L2f
                java.lang.String r6 = " Last reason for disconnect: "
                r3.append(r6)
                r3.append(r2)
            L2f:
                com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
                r2 = 20
                java.lang.String r3 = r3.toString()
                r6.<init>(r2, r3)
                r1.m9837a(r0, r6)
                com.google.android.gms.common.api.internal.b r6 = r5.f5587m
                android.os.Handler r6 = r6.f5573k0
                r0 = 9
                m6.b<O extends l6.a$c> r1 = r5.f5577c
                android.os.Message r0 = android.os.Message.obtain(r6, r0, r1)
                com.google.android.gms.common.api.internal.b r1 = r5.f5587m
                java.util.Objects.requireNonNull(r1)
                r1 = 5000(0x1388, double:2.4703E-320)
                r6.sendMessageDelayed(r0, r1)
                com.google.android.gms.common.api.internal.b r6 = r5.f5587m
                android.os.Handler r6 = r6.f5573k0
                r0 = 11
                m6.b<O extends l6.a$c> r1 = r5.f5577c
                android.os.Message r0 = android.os.Message.obtain(r6, r0, r1)
                com.google.android.gms.common.api.internal.b r1 = r5.f5587m
                java.util.Objects.requireNonNull(r1)
                r1 = 120000(0x1d4c0, double:5.9288E-319)
                r6.sendMessageDelayed(r0, r1)
                com.google.android.gms.common.api.internal.b r6 = r5.f5587m
                o6.z r6 = r6.f5567e0
                android.util.SparseIntArray r6 = r6.f19555a
                r6.clear()
                java.util.Map<com.google.android.gms.common.api.internal.c$a<?>, m6.q> r6 = r5.f5580f
                java.util.Collection r6 = r6.values()
                java.util.Iterator r6 = r6.iterator()
            L7d:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L8f
                java.lang.Object r0 = r6.next()
                m6.q r0 = (p218m6.C4404q) r0
                java.lang.Runnable r0 = r0.f17975c
                r0.run()
                goto L7d
            L8f:
                return
        }

        /* renamed from: d */
        public final void m3065d(com.google.android.gms.common.api.Status r3) {
                r2 = this;
                com.google.android.gms.common.api.internal.b r0 = r2.f5587m
                android.os.Handler r0 = r0.f5573k0
                com.google.android.gms.common.internal.C1101a.m3098c(r0)
                r0 = 0
                r1 = 0
                r2.m3066e(r3, r0, r1)
                return
        }

        /* renamed from: e */
        public final void m3066e(com.google.android.gms.common.api.Status r5, java.lang.Exception r6, boolean r7) {
                r4 = this;
                com.google.android.gms.common.api.internal.b r0 = r4.f5587m
                android.os.Handler r0 = r0.f5573k0
                com.google.android.gms.common.internal.C1101a.m3098c(r0)
                r0 = 1
                r1 = 0
                if (r5 != 0) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = 0
            Le:
                if (r6 != 0) goto L11
                goto L12
            L11:
                r0 = 0
            L12:
                if (r2 == r0) goto L3b
                java.util.Queue<com.google.android.gms.common.api.internal.g> r0 = r4.f5575a
                java.util.Iterator r0 = r0.iterator()
            L1a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3a
                java.lang.Object r1 = r0.next()
                com.google.android.gms.common.api.internal.g r1 = (com.google.android.gms.common.api.internal.AbstractC1087g) r1
                if (r7 == 0) goto L2d
                int r2 = r1.f5611a
                r3 = 2
                if (r2 != r3) goto L1a
            L2d:
                if (r5 == 0) goto L33
                r1.mo3087b(r5)
                goto L36
            L33:
                r1.mo3089d(r6)
            L36:
                r0.remove()
                goto L1a
            L3a:
                return
            L3b:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "Status XOR exception should be null"
                r5.<init>(r6)
                throw r5
        }

        /* renamed from: f */
        public final void m3067f(com.google.android.gms.common.api.internal.AbstractC1087g r2) {
                r1 = this;
                com.google.android.gms.common.api.internal.b r0 = r1.f5587m
                android.os.Handler r0 = r0.f5573k0
                com.google.android.gms.common.internal.C1101a.m3098c(r0)
                l6.a$e r0 = r1.f5576b
                boolean r0 = r0.mo9314a()
                if (r0 == 0) goto L1f
                boolean r0 = r1.m3070i(r2)
                if (r0 == 0) goto L19
                r1.m3079r()
                return
            L19:
                java.util.Queue<com.google.android.gms.common.api.internal.g> r0 = r1.f5575a
                r0.add(r2)
                return
            L1f:
                java.util.Queue<com.google.android.gms.common.api.internal.g> r0 = r1.f5575a
                r0.add(r2)
                k6.b r2 = r1.f5585k
                if (r2 == 0) goto L3a
                int r0 = r2.f16394Z
                if (r0 == 0) goto L32
                android.app.PendingIntent r0 = r2.f16395a0
                if (r0 == 0) goto L32
                r0 = 1
                goto L33
            L32:
                r0 = 0
            L33:
                if (r0 == 0) goto L3a
                r0 = 0
                r1.m3068g(r2, r0)
                return
            L3a:
                r1.m3074m()
                return
        }

        /* renamed from: g */
        public final void m3068g(p184k6.C3698b r6, java.lang.Exception r7) {
                r5 = this;
                com.google.android.gms.common.api.internal.b r0 = r5.f5587m
                android.os.Handler r0 = r0.f5573k0
                com.google.android.gms.common.internal.C1101a.m3098c(r0)
                m6.t r0 = r5.f5582h
                if (r0 == 0) goto L12
                p7.d r0 = r0.f17984f
                if (r0 == 0) goto L12
                r0.mo6389n()
            L12:
                r5.m3073l()
                com.google.android.gms.common.api.internal.b r0 = r5.f5587m
                o6.z r0 = r0.f5567e0
                android.util.SparseIntArray r0 = r0.f19555a
                r0.clear()
                r5.m3072k(r6)
                l6.a$e r0 = r5.f5576b
                boolean r0 = r0 instanceof p286q6.C5581d
                r1 = 1
                if (r0 == 0) goto L3a
                com.google.android.gms.common.api.internal.b r0 = r5.f5587m
                r0.f5562Z = r1
                android.os.Handler r0 = r0.f5573k0
                r2 = 19
                android.os.Message r2 = r0.obtainMessage(r2)
                r3 = 300000(0x493e0, double:1.482197E-318)
                r0.sendMessageDelayed(r2, r3)
            L3a:
                int r0 = r6.f16394Z
                r2 = 4
                if (r0 != r2) goto L45
                com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.internal.C1082b.f5558n0
                r5.m3065d(r6)
                return
            L45:
                java.util.Queue<com.google.android.gms.common.api.internal.g> r0 = r5.f5575a
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L50
                r5.f5585k = r6
                return
            L50:
                r0 = 0
                r2 = 0
                if (r7 == 0) goto L5f
                com.google.android.gms.common.api.internal.b r6 = r5.f5587m
                android.os.Handler r6 = r6.f5573k0
                com.google.android.gms.common.internal.C1101a.m3098c(r6)
                r5.m3066e(r2, r7, r0)
                return
            L5f:
                com.google.android.gms.common.api.internal.b r7 = r5.f5587m
                boolean r7 = r7.f5574l0
                if (r7 != 0) goto L76
                m6.b<O extends l6.a$c> r7 = r5.f5577c
                com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.internal.C1082b.m3055d(r7, r6)
                com.google.android.gms.common.api.internal.b r7 = r5.f5587m
                android.os.Handler r7 = r7.f5573k0
                com.google.android.gms.common.internal.C1101a.m3098c(r7)
                r5.m3066e(r6, r2, r0)
                return
            L76:
                m6.b<O extends l6.a$c> r7 = r5.f5577c
                com.google.android.gms.common.api.Status r7 = com.google.android.gms.common.api.internal.C1082b.m3055d(r7, r6)
                r5.m3066e(r7, r2, r1)
                java.util.Queue<com.google.android.gms.common.api.internal.g> r7 = r5.f5575a
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L88
                return
            L88:
                java.lang.Object r7 = com.google.android.gms.common.api.internal.C1082b.f5559o0
                monitor-enter(r7)
                com.google.android.gms.common.api.internal.b r3 = r5.f5587m     // Catch: java.lang.Throwable -> Lcf
                java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> Lcf
                monitor-exit(r7)     // Catch: java.lang.Throwable -> Lcf
                com.google.android.gms.common.api.internal.b r7 = r5.f5587m
                int r3 = r5.f5581g
                boolean r7 = r7.m3057c(r6, r3)
                if (r7 != 0) goto Lce
                int r7 = r6.f16394Z
                r3 = 18
                if (r7 != r3) goto La3
                r5.f5583i = r1
            La3:
                boolean r7 = r5.f5583i
                if (r7 == 0) goto Lbe
                com.google.android.gms.common.api.internal.b r6 = r5.f5587m
                android.os.Handler r6 = r6.f5573k0
                r7 = 9
                m6.b<O extends l6.a$c> r0 = r5.f5577c
                android.os.Message r7 = android.os.Message.obtain(r6, r7, r0)
                com.google.android.gms.common.api.internal.b r0 = r5.f5587m
                java.util.Objects.requireNonNull(r0)
                r0 = 5000(0x1388, double:2.4703E-320)
                r6.sendMessageDelayed(r7, r0)
                return
            Lbe:
                m6.b<O extends l6.a$c> r7 = r5.f5577c
                com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.internal.C1082b.m3055d(r7, r6)
                com.google.android.gms.common.api.internal.b r7 = r5.f5587m
                android.os.Handler r7 = r7.f5573k0
                com.google.android.gms.common.internal.C1101a.m3098c(r7)
                r5.m3066e(r6, r2, r0)
            Lce:
                return
            Lcf:
                r6 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> Lcf
                throw r6
        }

        /* renamed from: h */
        public final boolean m3069h(boolean r5) {
                r4 = this;
                com.google.android.gms.common.api.internal.b r0 = r4.f5587m
                android.os.Handler r0 = r0.f5573k0
                com.google.android.gms.common.internal.C1101a.m3098c(r0)
                l6.a$e r0 = r4.f5576b
                boolean r0 = r0.mo9314a()
                r1 = 0
                if (r0 == 0) goto L3f
                java.util.Map<com.google.android.gms.common.api.internal.c$a<?>, m6.q> r0 = r4.f5580f
                int r0 = r0.size()
                if (r0 != 0) goto L3f
                m6.z r0 = r4.f5578d
                java.util.Map<com.google.android.gms.common.api.internal.BasePendingResult<?>, java.lang.Boolean> r2 = r0.f17988a
                boolean r2 = r2.isEmpty()
                r3 = 1
                if (r2 == 0) goto L2e
                java.util.Map<s7.j<?>, java.lang.Boolean> r0 = r0.f17989b
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L2c
                goto L2e
            L2c:
                r0 = 0
                goto L2f
            L2e:
                r0 = 1
            L2f:
                if (r0 == 0) goto L37
                if (r5 == 0) goto L36
                r4.m3079r()
            L36:
                return r1
            L37:
                l6.a$e r5 = r4.f5576b
                java.lang.String r0 = "Timing out service connection."
                r5.mo9317d(r0)
                return r3
            L3f:
                return r1
        }

        /* renamed from: i */
        public final boolean m3070i(com.google.android.gms.common.api.internal.AbstractC1087g r11) {
                r10 = this;
                boolean r0 = r11 instanceof com.google.android.gms.common.api.internal.AbstractC1097q
                r1 = 1
                if (r0 != 0) goto L9
                r10.m3071j(r11)
                return r1
            L9:
                r0 = r11
                com.google.android.gms.common.api.internal.q r0 = (com.google.android.gms.common.api.internal.AbstractC1097q) r0
                k6.d[] r2 = r0.mo3094f(r10)
                k6.d r2 = r10.m3062a(r2)
                if (r2 != 0) goto L1a
                r10.m3071j(r11)
                return r1
            L1a:
                java.lang.String r11 = "GoogleApiManager"
                l6.a$e r3 = r10.f5576b
                java.lang.Class r3 = r3.getClass()
                java.lang.String r3 = r3.getName()
                java.lang.String r4 = r2.f16401Y
                long r5 = r2.m8162X()
                int r7 = r3.length()
                int r7 = r7 + 77
                int r7 = p064e.C1489c.m4038a(r4, r7)
                java.lang.String r8 = " could not execute call because it requires feature ("
                java.lang.String r9 = ", "
                java.lang.StringBuilder r3 = p064e.C1491e.m4040a(r7, r3, r8, r4, r9)
                r3.append(r5)
                java.lang.String r4 = ")."
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                android.util.Log.w(r11, r3)
                com.google.android.gms.common.api.internal.b r11 = r10.f5587m
                boolean r11 = r11.f5574l0
                if (r11 == 0) goto Ld2
                boolean r11 = r0.mo3095g(r10)
                if (r11 == 0) goto Ld2
                com.google.android.gms.common.api.internal.b$b r11 = new com.google.android.gms.common.api.internal.b$b
                m6.b<O extends l6.a$c> r0 = r10.f5577c
                r1 = 0
                r11.<init>(r0, r2, r1)
                java.util.List<com.google.android.gms.common.api.internal.b$b> r0 = r10.f5584j
                int r0 = r0.indexOf(r11)
                r2 = 5000(0x1388, double:2.4703E-320)
                r4 = 15
                if (r0 < 0) goto L8d
                java.util.List<com.google.android.gms.common.api.internal.b$b> r11 = r10.f5584j
                java.lang.Object r11 = r11.get(r0)
                com.google.android.gms.common.api.internal.b$b r11 = (com.google.android.gms.common.api.internal.C1082b.b) r11
                com.google.android.gms.common.api.internal.b r0 = r10.f5587m
                android.os.Handler r0 = r0.f5573k0
                r0.removeMessages(r4, r11)
                com.google.android.gms.common.api.internal.b r0 = r10.f5587m
                android.os.Handler r0 = r0.f5573k0
                android.os.Message r11 = android.os.Message.obtain(r0, r4, r11)
                com.google.android.gms.common.api.internal.b r1 = r10.f5587m
                java.util.Objects.requireNonNull(r1)
                r0.sendMessageDelayed(r11, r2)
                goto Lcd
            L8d:
                java.util.List<com.google.android.gms.common.api.internal.b$b> r0 = r10.f5584j
                r0.add(r11)
                com.google.android.gms.common.api.internal.b r0 = r10.f5587m
                android.os.Handler r0 = r0.f5573k0
                android.os.Message r4 = android.os.Message.obtain(r0, r4, r11)
                com.google.android.gms.common.api.internal.b r5 = r10.f5587m
                java.util.Objects.requireNonNull(r5)
                r0.sendMessageDelayed(r4, r2)
                com.google.android.gms.common.api.internal.b r0 = r10.f5587m
                android.os.Handler r0 = r0.f5573k0
                r2 = 16
                android.os.Message r11 = android.os.Message.obtain(r0, r2, r11)
                com.google.android.gms.common.api.internal.b r2 = r10.f5587m
                java.util.Objects.requireNonNull(r2)
                r2 = 120000(0x1d4c0, double:5.9288E-319)
                r0.sendMessageDelayed(r11, r2)
                k6.b r11 = new k6.b
                r0 = 2
                r11.<init>(r0, r1)
                java.lang.Object r3 = com.google.android.gms.common.api.internal.C1082b.f5559o0
                monitor-enter(r3)
                com.google.android.gms.common.api.internal.b r0 = r10.f5587m     // Catch: java.lang.Throwable -> Lcf
                java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> Lcf
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lcf
                com.google.android.gms.common.api.internal.b r0 = r10.f5587m
                int r1 = r10.f5581g
                r0.m3057c(r11, r1)
            Lcd:
                r11 = 0
                return r11
            Lcf:
                r11 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lcf
                throw r11
            Ld2:
                l6.j r11 = new l6.j
                r11.<init>(r2)
                r0.mo3089d(r11)
                return r1
        }

        /* renamed from: j */
        public final void m3071j(com.google.android.gms.common.api.internal.AbstractC1087g r4) {
                r3 = this;
                m6.z r0 = r3.f5578d
                boolean r1 = r3.m3075n()
                r4.mo3090e(r0, r1)
                r0 = 1
                r4.mo3088c(r3)     // Catch: java.lang.Throwable -> Le android.os.DeadObjectException -> L2a
                return
            Le:
                r4 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                l6.a$e r2 = r3.f5576b
                java.lang.Class r2 = r2.getClass()
                java.lang.String r2 = r2.getName()
                r0[r1] = r2
                java.lang.String r1 = "Error in GoogleApi implementation for client %s."
                java.lang.String r0 = java.lang.String.format(r1, r0)
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0, r4)
                throw r1
            L2a:
                r3.mo3080v(r0)
                l6.a$e r4 = r3.f5576b
                java.lang.String r0 = "DeadObjectException thrown while running ApiCallRunner."
                r4.mo9317d(r0)
                return
        }

        /* renamed from: k */
        public final void m3072k(p184k6.C3698b r3) {
                r2 = this;
                java.util.Set<m6.x> r0 = r2.f5579e
                java.util.Iterator r0 = r0.iterator()
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r0 = r0.next()
                m6.x r0 = (p218m6.C4411x) r0
                k6.b r1 = p184k6.C3698b.f16392c0
                boolean r3 = p248o6.C4924o.m11074a(r3, r1)
                if (r3 == 0) goto L1f
                l6.a$e r3 = r2.f5576b
                r3.mo9321l()
            L1f:
                java.util.Objects.requireNonNull(r0)
                r3 = 0
                throw r3
            L24:
                java.util.Set<m6.x> r3 = r2.f5579e
                r3.clear()
                return
        }

        /* renamed from: l */
        public final void m3073l() {
                r1 = this;
                com.google.android.gms.common.api.internal.b r0 = r1.f5587m
                android.os.Handler r0 = r0.f5573k0
                com.google.android.gms.common.internal.C1101a.m3098c(r0)
                r0 = 0
                r1.f5585k = r0
                return
        }

        /* renamed from: m */
        public final void m3074m() {
                r10 = this;
                com.google.android.gms.common.api.internal.b r0 = r10.f5587m
                android.os.Handler r0 = r0.f5573k0
                com.google.android.gms.common.internal.C1101a.m3098c(r0)
                l6.a$e r0 = r10.f5576b
                boolean r0 = r0.mo9314a()
                if (r0 != 0) goto Le1
                l6.a$e r0 = r10.f5576b
                boolean r0 = r0.mo9319i()
                if (r0 == 0) goto L19
                goto Le1
            L19:
                r0 = 10
                com.google.android.gms.common.api.internal.b r1 = r10.f5587m     // Catch: java.lang.IllegalStateException -> Lda
                o6.z r2 = r1.f5567e0     // Catch: java.lang.IllegalStateException -> Lda
                android.content.Context r1 = r1.f5565c0     // Catch: java.lang.IllegalStateException -> Lda
                l6.a$e r3 = r10.f5576b     // Catch: java.lang.IllegalStateException -> Lda
                int r1 = r2.m11085a(r1, r3)     // Catch: java.lang.IllegalStateException -> Lda
                if (r1 == 0) goto L6a
                k6.b r2 = new k6.b     // Catch: java.lang.IllegalStateException -> Lda
                r3 = 0
                r2.<init>(r1, r3)     // Catch: java.lang.IllegalStateException -> Lda
                java.lang.String r1 = "GoogleApiManager"
                l6.a$e r4 = r10.f5576b     // Catch: java.lang.IllegalStateException -> Lda
                java.lang.Class r4 = r4.getClass()     // Catch: java.lang.IllegalStateException -> Lda
                java.lang.String r4 = r4.getName()     // Catch: java.lang.IllegalStateException -> Lda
                java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch: java.lang.IllegalStateException -> Lda
                int r6 = r4.length()     // Catch: java.lang.IllegalStateException -> Lda
                int r6 = r6 + 35
                int r7 = r5.length()     // Catch: java.lang.IllegalStateException -> Lda
                int r6 = r6 + r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> Lda
                r7.<init>(r6)     // Catch: java.lang.IllegalStateException -> Lda
                java.lang.String r6 = "The service for "
                r7.append(r6)     // Catch: java.lang.IllegalStateException -> Lda
                r7.append(r4)     // Catch: java.lang.IllegalStateException -> Lda
                java.lang.String r4 = " is not available: "
                r7.append(r4)     // Catch: java.lang.IllegalStateException -> Lda
                r7.append(r5)     // Catch: java.lang.IllegalStateException -> Lda
                java.lang.String r4 = r7.toString()     // Catch: java.lang.IllegalStateException -> Lda
                android.util.Log.w(r1, r4)     // Catch: java.lang.IllegalStateException -> Lda
                r10.m3068g(r2, r3)     // Catch: java.lang.IllegalStateException -> Lda
                return
            L6a:
                com.google.android.gms.common.api.internal.b$c r1 = new com.google.android.gms.common.api.internal.b$c
                com.google.android.gms.common.api.internal.b r2 = r10.f5587m
                l6.a$e r3 = r10.f5576b
                m6.b<O extends l6.a$c> r4 = r10.f5577c
                r1.<init>(r2, r3, r4)
                boolean r2 = r3.mo9323o()
                if (r2 == 0) goto Lca
                m6.t r2 = r10.f5582h
                java.lang.String r3 = "null reference"
                java.util.Objects.requireNonNull(r2, r3)
                p7.d r3 = r2.f17984f
                if (r3 == 0) goto L89
                r3.mo6389n()
            L89:
                o6.d r3 = r2.f17983e
                int r4 = java.lang.System.identityHashCode(r2)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3.f19465h = r4
                l6.a$a<? extends p7.d, p7.a> r3 = r2.f17981c
                android.content.Context r4 = r2.f17979a
                android.os.Handler r5 = r2.f17980b
                android.os.Looper r5 = r5.getLooper()
                o6.d r6 = r2.f17983e
                p7.a r7 = r6.f19464g
                r8 = r2
                r9 = r2
                l6.a$e r3 = r3.mo2942a(r4, r5, r6, r7, r8, r9)
                p7.d r3 = (p271p7.InterfaceC5374d) r3
                r2.f17984f = r3
                r2.f17985g = r1
                java.util.Set<com.google.android.gms.common.api.Scope> r3 = r2.f17982d
                if (r3 == 0) goto Lc0
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto Lba
                goto Lc0
            Lba:
                p7.d r2 = r2.f17984f
                r2.mo11728p()
                goto Lca
            Lc0:
                android.os.Handler r3 = r2.f17980b
                f6.i r4 = new f6.i
                r4.<init>(r2)
                r3.post(r4)
            Lca:
                l6.a$e r2 = r10.f5576b     // Catch: java.lang.SecurityException -> Ld0
                r2.mo9324q(r1)     // Catch: java.lang.SecurityException -> Ld0
                return
            Ld0:
                r1 = move-exception
                k6.b r2 = new k6.b
                r2.<init>(r0)
            Ld6:
                r10.m3068g(r2, r1)
                return
            Lda:
                r1 = move-exception
                k6.b r2 = new k6.b
                r2.<init>(r0)
                goto Ld6
            Le1:
                return
        }

        /* renamed from: n */
        public final boolean m3075n() {
                r1 = this;
                l6.a$e r0 = r1.f5576b
                boolean r0 = r0.mo9323o()
                return r0
        }

        /* renamed from: o */
        public final void m3076o() {
                r4 = this;
                r4.m3073l()
                k6.b r0 = p184k6.C3698b.f16392c0
                r4.m3072k(r0)
                r4.m3078q()
                java.util.Map<com.google.android.gms.common.api.internal.c$a<?>, m6.q> r0 = r4.f5580f
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            L15:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L4e
                java.lang.Object r1 = r0.next()
                m6.q r1 = (p218m6.C4404q) r1
                com.google.android.gms.common.api.internal.d<java.lang.Object, ?> r2 = r1.f17973a
                k6.d[] r2 = r2.f5602b
                k6.d r2 = r4.m3062a(r2)
                if (r2 == 0) goto L2c
                goto L3f
            L2c:
                com.google.android.gms.common.api.internal.d<java.lang.Object, ?> r1 = r1.f17973a     // Catch: android.os.RemoteException -> L3f android.os.DeadObjectException -> L43
                l6.a$e r2 = r4.f5576b     // Catch: android.os.RemoteException -> L3f android.os.DeadObjectException -> L43
                s7.j r3 = new s7.j     // Catch: android.os.RemoteException -> L3f android.os.DeadObjectException -> L43
                r3.<init>()     // Catch: android.os.RemoteException -> L3f android.os.DeadObjectException -> L43
                m6.s r1 = (p218m6.C4406s) r1     // Catch: android.os.RemoteException -> L3f android.os.DeadObjectException -> L43
                com.google.android.gms.common.api.internal.e r1 = r1.f17977e     // Catch: android.os.RemoteException -> L3f android.os.DeadObjectException -> L43
                m6.i<A, s7.j<java.lang.Void>> r1 = r1.f5605a     // Catch: android.os.RemoteException -> L3f android.os.DeadObjectException -> L43
                r1.mo813c(r2, r3)     // Catch: android.os.RemoteException -> L3f android.os.DeadObjectException -> L43
                goto L15
            L3f:
                r0.remove()
                goto L15
            L43:
                r0 = 3
                r4.mo3080v(r0)
                l6.a$e r0 = r4.f5576b
                java.lang.String r1 = "DeadObjectException thrown while calling register listener method."
                r0.mo9317d(r1)
            L4e:
                r4.m3077p()
                r4.m3079r()
                return
        }

        /* renamed from: p */
        public final void m3077p() {
                r5 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.Queue<com.google.android.gms.common.api.internal.g> r1 = r5.f5575a
                r0.<init>(r1)
                int r1 = r0.size()
                r2 = 0
            Lc:
                if (r2 >= r1) goto L2a
                java.lang.Object r3 = r0.get(r2)
                int r2 = r2 + 1
                com.google.android.gms.common.api.internal.g r3 = (com.google.android.gms.common.api.internal.AbstractC1087g) r3
                l6.a$e r4 = r5.f5576b
                boolean r4 = r4.mo9314a()
                if (r4 == 0) goto L2a
                boolean r4 = r5.m3070i(r3)
                if (r4 == 0) goto Lc
                java.util.Queue<com.google.android.gms.common.api.internal.g> r4 = r5.f5575a
                r4.remove(r3)
                goto Lc
            L2a:
                return
        }

        /* renamed from: q */
        public final void m3078q() {
                r3 = this;
                boolean r0 = r3.f5583i
                if (r0 == 0) goto L1d
                com.google.android.gms.common.api.internal.b r0 = r3.f5587m
                android.os.Handler r0 = r0.f5573k0
                r1 = 11
                m6.b<O extends l6.a$c> r2 = r3.f5577c
                r0.removeMessages(r1, r2)
                com.google.android.gms.common.api.internal.b r0 = r3.f5587m
                android.os.Handler r0 = r0.f5573k0
                r1 = 9
                m6.b<O extends l6.a$c> r2 = r3.f5577c
                r0.removeMessages(r1, r2)
                r0 = 0
                r3.f5583i = r0
            L1d:
                return
        }

        /* renamed from: r */
        public final void m3079r() {
                r4 = this;
                com.google.android.gms.common.api.internal.b r0 = r4.f5587m
                android.os.Handler r0 = r0.f5573k0
                m6.b<O extends l6.a$c> r1 = r4.f5577c
                r2 = 12
                r0.removeMessages(r2, r1)
                com.google.android.gms.common.api.internal.b r0 = r4.f5587m
                android.os.Handler r0 = r0.f5573k0
                m6.b<O extends l6.a$c> r1 = r4.f5577c
                android.os.Message r1 = r0.obtainMessage(r2, r1)
                com.google.android.gms.common.api.internal.b r2 = r4.f5587m
                long r2 = r2.f5561Y
                r0.sendMessageDelayed(r1, r2)
                return
        }

        @Override // p218m6.InterfaceC4391d
        /* renamed from: v */
        public final void mo3080v(int r3) {
                r2 = this;
                android.os.Looper r0 = android.os.Looper.myLooper()
                com.google.android.gms.common.api.internal.b r1 = r2.f5587m
                android.os.Handler r1 = r1.f5573k0
                android.os.Looper r1 = r1.getLooper()
                if (r0 != r1) goto L12
                r2.m3064c(r3)
                return
            L12:
                com.google.android.gms.common.api.internal.b r0 = r2.f5587m
                android.os.Handler r0 = r0.f5573k0
                com.google.android.gms.common.api.internal.i r1 = new com.google.android.gms.common.api.internal.i
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }

        @Override // p218m6.InterfaceC4395h
        /* renamed from: x */
        public final void mo3081x(p184k6.C3698b r2) {
                r1 = this;
                r0 = 0
                r1.m3068g(r2, r0)
                return
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.b$b */
    public static class b {

        /* renamed from: a */
        public final p218m6.C4388b<?> f5588a;

        /* renamed from: b */
        public final p184k6.C3701d f5589b;

        public b(p218m6.C4388b r1, p184k6.C3701d r2, com.google.android.gms.common.api.internal.C1088h r3) {
                r0 = this;
                r0.<init>()
                r0.f5588a = r1
                r0.f5589b = r2
                return
        }

        public final boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L1f
                boolean r1 = r4 instanceof com.google.android.gms.common.api.internal.C1082b.b
                if (r1 == 0) goto L1f
                com.google.android.gms.common.api.internal.b$b r4 = (com.google.android.gms.common.api.internal.C1082b.b) r4
                m6.b<?> r1 = r3.f5588a
                m6.b<?> r2 = r4.f5588a
                boolean r1 = p248o6.C4924o.m11074a(r1, r2)
                if (r1 == 0) goto L1f
                k6.d r1 = r3.f5589b
                k6.d r4 = r4.f5589b
                boolean r4 = p248o6.C4924o.m11074a(r1, r4)
                if (r4 == 0) goto L1f
                r4 = 1
                return r4
            L1f:
                return r0
        }

        public final int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                m6.b<?> r1 = r3.f5588a
                r2 = 0
                r0[r2] = r1
                k6.d r1 = r3.f5589b
                r2 = 1
                r0[r2] = r1
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }

        public final java.lang.String toString() {
                r3 = this;
                o6.o$a r0 = new o6.o$a
                r1 = 0
                r0.<init>(r3, r1)
                m6.b<?> r1 = r3.f5588a
                java.lang.String r2 = "key"
                r0.m11075a(r2, r1)
                k6.d r1 = r3.f5589b
                java.lang.String r2 = "feature"
                r0.m11075a(r2, r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.b$c */
    public class c implements p218m6.InterfaceC4408u, p248o6.AbstractC4900c.c {

        /* renamed from: a */
        public final p201l6.C4181a.e f5590a;

        /* renamed from: b */
        public final p218m6.C4388b<?> f5591b;

        /* renamed from: c */
        public p248o6.InterfaceC4916k f5592c;

        /* renamed from: d */
        public java.util.Set<com.google.android.gms.common.api.Scope> f5593d;

        /* renamed from: e */
        public boolean f5594e;

        /* renamed from: f */
        public final /* synthetic */ com.google.android.gms.common.api.internal.C1082b f5595f;

        public c(com.google.android.gms.common.api.internal.C1082b r1, p201l6.C4181a.e r2, p218m6.C4388b<?> r3) {
                r0 = this;
                r0.f5595f = r1
                r0.<init>()
                r1 = 0
                r0.f5592c = r1
                r0.f5593d = r1
                r1 = 0
                r0.f5594e = r1
                r0.f5590a = r2
                r0.f5591b = r3
                return
        }

        @Override // p248o6.AbstractC4900c.c
        /* renamed from: a */
        public final void mo3082a(p184k6.C3698b r3) {
                r2 = this;
                com.google.android.gms.common.api.internal.b r0 = r2.f5595f
                android.os.Handler r0 = r0.f5573k0
                com.google.android.gms.common.api.internal.m r1 = new com.google.android.gms.common.api.internal.m
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }

        /* renamed from: b */
        public final void m3083b(p184k6.C3698b r7) {
                r6 = this;
                com.google.android.gms.common.api.internal.b r0 = r6.f5595f
                java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r0 = r0.f5570h0
                m6.b<?> r1 = r6.f5591b
                java.lang.Object r0 = r0.get(r1)
                com.google.android.gms.common.api.internal.b$a r0 = (com.google.android.gms.common.api.internal.C1082b.a) r0
                if (r0 == 0) goto L4e
                com.google.android.gms.common.api.internal.b r1 = r0.f5587m
                android.os.Handler r1 = r1.f5573k0
                com.google.android.gms.common.internal.C1101a.m3098c(r1)
                l6.a$e r1 = r0.f5576b
                java.lang.Class r2 = r1.getClass()
                java.lang.String r2 = r2.getName()
                java.lang.String r3 = java.lang.String.valueOf(r7)
                int r4 = r2.length()
                int r4 = r4 + 25
                int r5 = r3.length()
                int r5 = r5 + r4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r5)
                java.lang.String r5 = "onSignInFailed for "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r2 = " with "
                r4.append(r2)
                r4.append(r3)
                java.lang.String r2 = r4.toString()
                r1.mo9317d(r2)
                r1 = 0
                r0.m3068g(r7, r1)
            L4e:
                return
        }
    }

    static {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 4
            java.lang.String r2 = "Sign-out occurred while this API call was in progress."
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.C1082b.f5557m0 = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = "The user must be signed in to make this API call."
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.C1082b.f5558n0 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.api.internal.C1082b.f5559o0 = r0
            return
    }

    public C1082b(android.content.Context r6, android.os.Looper r7, p184k6.C3702e r8) {
            r5 = this;
            r5.<init>()
            r0 = 10000(0x2710, double:4.9407E-320)
            r5.f5561Y = r0
            r0 = 0
            r5.f5562Z = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 1
            r1.<init>(r2)
            r5.f5568f0 = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r5.f5569g0 = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r3 = 5
            r4 = 1061158912(0x3f400000, float:0.75)
            r1.<init>(r3, r4, r2)
            r5.f5570h0 = r1
            s.c r1 = new s.c
            r1.<init>(r0)
            r5.f5571i0 = r1
            s.c r1 = new s.c
            r1.<init>(r0)
            r5.f5572j0 = r1
            r5.f5574l0 = r2
            r5.f5565c0 = r6
            d7.e r1 = new d7.e
            r1.<init>(r7, r5)
            r5.f5573k0 = r1
            r5.f5566d0 = r8
            o6.z r7 = new o6.z
            r7.<init>(r8)
            r5.f5567e0 = r7
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.Boolean r7 = p353u6.C6342e.f24793d
            if (r7 != 0) goto L63
            boolean r7 = p353u6.C6345h.m12995a()
            if (r7 == 0) goto L5c
            java.lang.String r7 = "android.hardware.type.automotive"
            boolean r6 = r6.hasSystemFeature(r7)
            if (r6 == 0) goto L5c
            goto L5d
        L5c:
            r2 = 0
        L5d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            p353u6.C6342e.f24793d = r6
        L63:
            java.lang.Boolean r6 = p353u6.C6342e.f24793d
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L6d
            r5.f5574l0 = r0
        L6d:
            r6 = 6
            android.os.Message r6 = r1.obtainMessage(r6)
            r1.sendMessage(r6)
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public static com.google.android.gms.common.api.internal.C1082b m3054a(@androidx.annotation.RecentlyNonNull android.content.Context r4) {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C1082b.f5559o0
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.b r1 = com.google.android.gms.common.api.internal.C1082b.f5560p0     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L26
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "GoogleApiHandler"
            r3 = 9
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L2a
            r1.start()     // Catch: java.lang.Throwable -> L2a
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.common.api.internal.b r2 = new com.google.android.gms.common.api.internal.b     // Catch: java.lang.Throwable -> L2a
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r3 = p184k6.C3702e.f16404c     // Catch: java.lang.Throwable -> L2a
            k6.e r3 = p184k6.C3702e.f16405d     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r4, r1, r3)     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.common.api.internal.C1082b.f5560p0 = r2     // Catch: java.lang.Throwable -> L2a
        L26:
            com.google.android.gms.common.api.internal.b r4 = com.google.android.gms.common.api.internal.C1082b.f5560p0     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return r4
        L2a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r4
    }

    /* renamed from: d */
    public static com.google.android.gms.common.api.Status m3055d(p218m6.C4388b<?> r7, p184k6.C3698b r8) {
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            l6.a<O extends l6.a$c> r7 = r7.f17955b
            java.lang.String r7 = r7.f17343b
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r1 = 63
            int r1 = p064e.C1489c.m4038a(r7, r1)
            int r2 = r0.length()
            int r2 = r2 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r2 = "API: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " is not available on this device. Connection failed with: "
            r1.append(r7)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            android.app.PendingIntent r4 = r8.f16395a0
            r1 = 1
            r2 = 17
            r0 = r6
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    /* renamed from: b */
    public final <T> void m3056b(p327s7.C5986j<T> r7, int r8, p201l6.C4183c<?> r9) {
            r6 = this;
            if (r8 == 0) goto L73
            m6.b<O extends l6.a$c> r3 = r9.f17350e
            boolean r9 = r6.m3059f()
            r0 = 0
            if (r9 != 0) goto Lc
            goto L56
        Lc:
            o6.p r9 = p248o6.C4926p.m11076a()
            o6.q r9 = r9.f19532a
            r1 = 1
            if (r9 == 0) goto L44
            boolean r2 = r9.f19534Z
            if (r2 != 0) goto L1a
            goto L56
        L1a:
            boolean r9 = r9.f19535a0
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r2 = r6.f5570h0
            java.lang.Object r2 = r2.get(r3)
            com.google.android.gms.common.api.internal.b$a r2 = (com.google.android.gms.common.api.internal.C1082b.a) r2
            if (r2 == 0) goto L43
            l6.a$e r4 = r2.f5576b
            boolean r4 = r4.mo9314a()
            if (r4 == 0) goto L43
            l6.a$e r4 = r2.f5576b
            boolean r4 = r4 instanceof p248o6.AbstractC4900c
            if (r4 == 0) goto L43
            o6.e r9 = com.google.android.gms.common.api.internal.C1094n.m3091b(r2, r8)
            if (r9 != 0) goto L3b
            goto L56
        L3b:
            int r0 = r2.f5586l
            int r0 = r0 + r1
            r2.f5586l = r0
            boolean r1 = r9.f19477a0
            goto L44
        L43:
            r1 = r9
        L44:
            com.google.android.gms.common.api.internal.n r9 = new com.google.android.gms.common.api.internal.n
            if (r1 == 0) goto L4d
            long r0 = java.lang.System.currentTimeMillis()
            goto L4f
        L4d:
            r0 = 0
        L4f:
            r4 = r0
            r0 = r9
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2, r3, r4)
        L56:
            if (r0 == 0) goto L73
            s7.q<TResult> r7 = r7.f23075a
            android.os.Handler r8 = r6.f5573k0
            java.util.Objects.requireNonNull(r8)
            m6.m r9 = new m6.m
            r9.<init>(r8)
            z2.n r8 = r7.f23097b
            s7.n r1 = new s7.n
            int r2 = p327s7.C5994r.f23102a
            r1.<init>(r9, r0)
            r8.m14310g(r1)
            r7.m12476u()
        L73:
            return
    }

    /* renamed from: c */
    public final boolean m3057c(p184k6.C3698b r9, int r10) {
            r8 = this;
            k6.e r0 = r8.f5566d0
            android.content.Context r1 = r8.f5565c0
            java.util.Objects.requireNonNull(r0)
            int r2 = r9.f16394Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L13
            android.app.PendingIntent r5 = r9.f16395a0
            if (r5 == 0) goto L13
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            r6 = 134217728(0x8000000, float:3.85186E-34)
            if (r5 == 0) goto L1b
            android.app.PendingIntent r2 = r9.f16395a0
            goto L28
        L1b:
            r5 = 0
            android.content.Intent r2 = r0.mo8163a(r1, r2, r5)
            if (r2 != 0) goto L24
            r2 = r5
            goto L28
        L24:
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r1, r3, r2, r6)
        L28:
            if (r2 == 0) goto L4c
            int r9 = r9.f16394Z
            int r5 = com.google.android.gms.common.api.GoogleApiActivity.f5528Z
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<com.google.android.gms.common.api.GoogleApiActivity> r7 = com.google.android.gms.common.api.GoogleApiActivity.class
            r5.<init>(r1, r7)
            java.lang.String r7 = "pending_intent"
            r5.putExtra(r7, r2)
            java.lang.String r2 = "failing_client_id"
            r5.putExtra(r2, r10)
            java.lang.String r10 = "notify_manager"
            r5.putExtra(r10, r4)
            android.app.PendingIntent r10 = android.app.PendingIntent.getActivity(r1, r3, r5, r6)
            r0.m8166d(r1, r9, r10)
            r3 = 1
        L4c:
            return r3
    }

    /* renamed from: e */
    public final com.google.android.gms.common.api.internal.C1082b.a<?> m3058e(p201l6.C4183c<?> r3) {
            r2 = this;
            m6.b<O extends l6.a$c> r0 = r3.f17350e
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r1 = r2.f5570h0
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.common.api.internal.b$a r1 = (com.google.android.gms.common.api.internal.C1082b.a) r1
            if (r1 != 0) goto L16
            com.google.android.gms.common.api.internal.b$a r1 = new com.google.android.gms.common.api.internal.b$a
            r1.<init>(r2, r3)
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r3 = r2.f5570h0
            r3.put(r0, r1)
        L16:
            boolean r3 = r1.m3075n()
            if (r3 == 0) goto L21
            java.util.Set<m6.b<?>> r3 = r2.f5572j0
            r3.add(r0)
        L21:
            r1.m3074m()
            return r1
    }

    /* renamed from: f */
    public final boolean m3059f() {
            r4 = this;
            boolean r0 = r4.f5562Z
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            o6.p r0 = p248o6.C4926p.m11076a()
            o6.q r0 = r0.f19532a
            if (r0 == 0) goto L13
            boolean r0 = r0.f19534Z
            if (r0 != 0) goto L13
            return r1
        L13:
            o6.z r0 = r4.f5567e0
            r2 = 203390000(0xc1f7c30, float:1.2286286E-31)
            android.util.SparseIntArray r0 = r0.f19555a
            r3 = -1
            int r0 = r0.get(r2, r3)
            if (r0 == r3) goto L25
            if (r0 != 0) goto L24
            goto L25
        L24:
            return r1
        L25:
            r0 = 1
            return r0
    }

    /* renamed from: g */
    public final void m3060g() {
            r3 = this;
            o6.r r0 = r3.f5563a0
            if (r0 == 0) goto L25
            int r1 = r0.f19541Y
            if (r1 > 0) goto Le
            boolean r1 = r3.m3059f()
            if (r1 == 0) goto L22
        Le:
            o6.s r1 = r3.f5564b0
            if (r1 != 0) goto L1b
            android.content.Context r1 = r3.f5565c0
            q6.c r2 = new q6.c
            r2.<init>(r1)
            r3.f5564b0 = r2
        L1b:
            o6.s r1 = r3.f5564b0
            q6.c r1 = (p286q6.C5580c) r1
            r1.m11869e(r0)
        L22:
            r0 = 0
            r3.f5563a0 = r0
        L25:
            return
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@androidx.annotation.RecentlyNonNull android.os.Message r11) {
            r10 = this;
            int r0 = r11.what
            r1 = 0
            r2 = 1
            r3 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r5 = "GoogleApiManager"
            r6 = 17
            r7 = 0
            switch(r0) {
                case 1: goto L3a7;
                case 2: goto L39f;
                case 3: goto L382;
                case 4: goto L349;
                case 5: goto L2a8;
                case 6: goto L25a;
                case 7: goto L251;
                case 8: goto L349;
                case 9: goto L22d;
                case 10: goto L206;
                case 11: goto L1ae;
                case 12: goto L195;
                case 13: goto L349;
                case 14: goto L179;
                case 15: goto L141;
                case 16: goto Lab;
                case 17: goto La6;
                case 18: goto L1b;
                case 19: goto L17;
                default: goto Lf;
            }
        Lf:
            r11 = 31
            java.lang.String r2 = "Unknown message id: "
            p088f4.C1999d.m5182a(r11, r2, r0, r5)
            return r1
        L17:
            r10.f5562Z = r1
            goto L3de
        L1b:
            java.lang.Object r11 = r11.obj
            m6.o r11 = (p218m6.C4402o) r11
            long r3 = r11.f17968c
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L4e
            o6.r r0 = new o6.r
            int r3 = r11.f17967b
            o6.b0[] r4 = new p248o6.C4898b0[r2]
            o6.b0 r11 = r11.f17966a
            r4[r1] = r11
            java.util.List r11 = java.util.Arrays.asList(r4)
            r0.<init>(r3, r11)
            o6.s r11 = r10.f5564b0
            if (r11 != 0) goto L45
            android.content.Context r11 = r10.f5565c0
            q6.c r1 = new q6.c
            r1.<init>(r11)
            r10.f5564b0 = r1
        L45:
            o6.s r11 = r10.f5564b0
            q6.c r11 = (p286q6.C5580c) r11
            r11.m11869e(r0)
            goto L3de
        L4e:
            o6.r r0 = r10.f5563a0
            if (r0 == 0) goto L82
            java.util.List<o6.b0> r1 = r0.f19542Z
            int r0 = r0.f19541Y
            int r3 = r11.f17967b
            if (r0 != r3) goto L7a
            if (r1 == 0) goto L65
            int r0 = r1.size()
            int r1 = r11.f17969d
            if (r0 < r1) goto L65
            goto L7a
        L65:
            o6.r r0 = r10.f5563a0
            o6.b0 r1 = r11.f17966a
            java.util.List<o6.b0> r3 = r0.f19542Z
            if (r3 != 0) goto L74
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f19542Z = r3
        L74:
            java.util.List<o6.b0> r0 = r0.f19542Z
            r0.add(r1)
            goto L82
        L7a:
            android.os.Handler r0 = r10.f5573k0
            r0.removeMessages(r6)
            r10.m3060g()
        L82:
            o6.r r0 = r10.f5563a0
            if (r0 != 0) goto L3de
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            o6.b0 r1 = r11.f17966a
            r0.add(r1)
            o6.r r1 = new o6.r
            int r3 = r11.f17967b
            r1.<init>(r3, r0)
            r10.f5563a0 = r1
            android.os.Handler r0 = r10.f5573k0
            android.os.Message r1 = r0.obtainMessage(r6)
            long r3 = r11.f17968c
            r0.sendMessageDelayed(r1, r3)
            goto L3de
        La6:
            r10.m3060g()
            goto L3de
        Lab:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.common.api.internal.b$b r11 = (com.google.android.gms.common.api.internal.C1082b.b) r11
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r0 = r10.f5570h0
            m6.b<?> r3 = r11.f5588a
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L3de
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r0 = r10.f5570h0
            m6.b<?> r3 = r11.f5588a
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.common.api.internal.b$a r0 = (com.google.android.gms.common.api.internal.C1082b.a) r0
            java.util.List<com.google.android.gms.common.api.internal.b$b> r3 = r0.f5584j
            boolean r3 = r3.remove(r11)
            if (r3 == 0) goto L3de
            com.google.android.gms.common.api.internal.b r3 = r0.f5587m
            android.os.Handler r3 = r3.f5573k0
            r4 = 15
            r3.removeMessages(r4, r11)
            com.google.android.gms.common.api.internal.b r3 = r0.f5587m
            android.os.Handler r3 = r3.f5573k0
            r4 = 16
            r3.removeMessages(r4, r11)
            k6.d r11 = r11.f5589b
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Queue<com.google.android.gms.common.api.internal.g> r4 = r0.f5575a
            int r4 = r4.size()
            r3.<init>(r4)
            java.util.Queue<com.google.android.gms.common.api.internal.g> r4 = r0.f5575a
            java.util.Iterator r4 = r4.iterator()
        Lf0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L125
            java.lang.Object r5 = r4.next()
            com.google.android.gms.common.api.internal.g r5 = (com.google.android.gms.common.api.internal.AbstractC1087g) r5
            boolean r6 = r5 instanceof com.google.android.gms.common.api.internal.AbstractC1097q
            if (r6 == 0) goto Lf0
            r6 = r5
            com.google.android.gms.common.api.internal.q r6 = (com.google.android.gms.common.api.internal.AbstractC1097q) r6
            k6.d[] r6 = r6.mo3094f(r0)
            if (r6 == 0) goto Lf0
            int r7 = r6.length
            r8 = 0
        L10b:
            if (r8 >= r7) goto L119
            r9 = r6[r8]
            boolean r9 = p248o6.C4924o.m11074a(r9, r11)
            if (r9 == 0) goto L116
            goto L11a
        L116:
            int r8 = r8 + 1
            goto L10b
        L119:
            r8 = -1
        L11a:
            if (r8 < 0) goto L11e
            r6 = 1
            goto L11f
        L11e:
            r6 = 0
        L11f:
            if (r6 == 0) goto Lf0
            r3.add(r5)
            goto Lf0
        L125:
            int r4 = r3.size()
        L129:
            if (r1 >= r4) goto L3de
            java.lang.Object r5 = r3.get(r1)
            int r1 = r1 + 1
            com.google.android.gms.common.api.internal.g r5 = (com.google.android.gms.common.api.internal.AbstractC1087g) r5
            java.util.Queue<com.google.android.gms.common.api.internal.g> r6 = r0.f5575a
            r6.remove(r5)
            l6.j r6 = new l6.j
            r6.<init>(r11)
            r5.mo3089d(r6)
            goto L129
        L141:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.common.api.internal.b$b r11 = (com.google.android.gms.common.api.internal.C1082b.b) r11
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r0 = r10.f5570h0
            m6.b<?> r1 = r11.f5588a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L3de
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r0 = r10.f5570h0
            m6.b<?> r1 = r11.f5588a
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.b$a r0 = (com.google.android.gms.common.api.internal.C1082b.a) r0
            java.util.List<com.google.android.gms.common.api.internal.b$b> r1 = r0.f5584j
            boolean r11 = r1.contains(r11)
            if (r11 != 0) goto L163
            goto L3de
        L163:
            boolean r11 = r0.f5583i
            if (r11 != 0) goto L3de
            l6.a$e r11 = r0.f5576b
            boolean r11 = r11.mo9314a()
            if (r11 != 0) goto L174
            r0.m3074m()
            goto L3de
        L174:
            r0.m3077p()
            goto L3de
        L179:
            java.lang.Object r11 = r11.obj
            m6.b0 r11 = (p218m6.C4389b0) r11
            java.util.Objects.requireNonNull(r11)
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r11 = r10.f5570h0
            boolean r11 = r11.containsKey(r7)
            if (r11 != 0) goto L189
            throw r7
        L189:
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r11 = r10.f5570h0
            java.lang.Object r11 = r11.get(r7)
            com.google.android.gms.common.api.internal.b$a r11 = (com.google.android.gms.common.api.internal.C1082b.a) r11
            r11.m3069h(r1)
            throw r7
        L195:
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r0 = r10.f5570h0
            java.lang.Object r1 = r11.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L3de
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r0 = r10.f5570h0
            java.lang.Object r11 = r11.obj
            java.lang.Object r11 = r0.get(r11)
            com.google.android.gms.common.api.internal.b$a r11 = (com.google.android.gms.common.api.internal.C1082b.a) r11
            r11.m3069h(r2)
            goto L3de
        L1ae:
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r0 = r10.f5570h0
            java.lang.Object r3 = r11.obj
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L3de
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r0 = r10.f5570h0
            java.lang.Object r11 = r11.obj
            java.lang.Object r11 = r0.get(r11)
            com.google.android.gms.common.api.internal.b$a r11 = (com.google.android.gms.common.api.internal.C1082b.a) r11
            com.google.android.gms.common.api.internal.b r0 = r11.f5587m
            android.os.Handler r0 = r0.f5573k0
            com.google.android.gms.common.internal.C1101a.m3098c(r0)
            boolean r0 = r11.f5583i
            if (r0 == 0) goto L3de
            r11.m3078q()
            com.google.android.gms.common.api.internal.b r0 = r11.f5587m
            k6.e r3 = r0.f5566d0
            android.content.Context r0 = r0.f5565c0
            int r4 = p184k6.C3703f.f16408a
            int r0 = r3.mo8164b(r0, r4)
            r3 = 18
            if (r0 != r3) goto L1ea
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r3 = 21
            java.lang.String r4 = "Connection timed out waiting for Google Play services update to complete."
            r0.<init>(r3, r4)
            goto L1f3
        L1ea:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r3 = 22
            java.lang.String r4 = "API failed to connect while resuming due to an unknown error."
            r0.<init>(r3, r4)
        L1f3:
            com.google.android.gms.common.api.internal.b r3 = r11.f5587m
            android.os.Handler r3 = r3.f5573k0
            com.google.android.gms.common.internal.C1101a.m3098c(r3)
            r11.m3066e(r0, r7, r1)
            l6.a$e r11 = r11.f5576b
            java.lang.String r0 = "Timing out connection while resuming."
            r11.mo9317d(r0)
            goto L3de
        L206:
            java.util.Set<m6.b<?>> r11 = r10.f5572j0
            java.util.Iterator r11 = r11.iterator()
        L20c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L226
            java.lang.Object r0 = r11.next()
            m6.b r0 = (p218m6.C4388b) r0
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r1 = r10.f5570h0
            java.lang.Object r0 = r1.remove(r0)
            com.google.android.gms.common.api.internal.b$a r0 = (com.google.android.gms.common.api.internal.C1082b.a) r0
            if (r0 == 0) goto L20c
            r0.m3063b()
            goto L20c
        L226:
            java.util.Set<m6.b<?>> r11 = r10.f5572j0
            r11.clear()
            goto L3de
        L22d:
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r0 = r10.f5570h0
            java.lang.Object r1 = r11.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L3de
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r0 = r10.f5570h0
            java.lang.Object r11 = r11.obj
            java.lang.Object r11 = r0.get(r11)
            com.google.android.gms.common.api.internal.b$a r11 = (com.google.android.gms.common.api.internal.C1082b.a) r11
            com.google.android.gms.common.api.internal.b r0 = r11.f5587m
            android.os.Handler r0 = r0.f5573k0
            com.google.android.gms.common.internal.C1101a.m3098c(r0)
            boolean r0 = r11.f5583i
            if (r0 == 0) goto L3de
            r11.m3074m()
            goto L3de
        L251:
            java.lang.Object r11 = r11.obj
            l6.c r11 = (p201l6.C4183c) r11
            r10.m3058e(r11)
            goto L3de
        L25a:
            android.content.Context r11 = r10.f5565c0
            android.content.Context r11 = r11.getApplicationContext()
            boolean r11 = r11 instanceof android.app.Application
            if (r11 == 0) goto L3de
            android.content.Context r11 = r10.f5565c0
            android.content.Context r11 = r11.getApplicationContext()
            android.app.Application r11 = (android.app.Application) r11
            com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.m3050b(r11)
            com.google.android.gms.common.api.internal.a r11 = com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.f5552c0
            com.google.android.gms.common.api.internal.h r0 = new com.google.android.gms.common.api.internal.h
            r0.<init>(r10)
            r11.m3051a(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f5554Z
            boolean r0 = r0.get()
            if (r0 != 0) goto L29c
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.f5554Z
            boolean r1 = r1.getAndSet(r2)
            if (r1 != 0) goto L29c
            int r0 = r0.importance
            r1 = 100
            if (r0 <= r1) goto L29c
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f5553Y
            r0.set(r2)
        L29c:
            java.util.concurrent.atomic.AtomicBoolean r11 = r11.f5553Y
            boolean r11 = r11.get()
            if (r11 != 0) goto L3de
            r10.f5561Y = r3
            goto L3de
        L2a8:
            int r0 = r11.arg1
            java.lang.Object r11 = r11.obj
            k6.b r11 = (p184k6.C3698b) r11
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r3 = r10.f5570h0
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L2b8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2c9
            java.lang.Object r4 = r3.next()
            com.google.android.gms.common.api.internal.b$a r4 = (com.google.android.gms.common.api.internal.C1082b.a) r4
            int r8 = r4.f5581g
            if (r8 != r0) goto L2b8
            goto L2ca
        L2c9:
            r4 = r7
        L2ca:
            if (r4 == 0) goto L327
            int r0 = r11.f16394Z
            r3 = 13
            if (r0 != r3) goto L315
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            k6.e r3 = r10.f5566d0
            int r5 = r11.f16394Z
            java.util.Objects.requireNonNull(r3)
            boolean r3 = p184k6.C3705h.f16411a
            java.lang.String r3 = p184k6.C3698b.m8160Y(r5)
            java.lang.String r11 = r11.f16396b0
            r5 = 69
            int r5 = p064e.C1489c.m4038a(r3, r5)
            int r5 = p064e.C1489c.m4038a(r11, r5)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r5)
            java.lang.String r5 = "Error resolution was canceled by the user, original error message: "
            r8.append(r5)
            r8.append(r3)
            java.lang.String r3 = ": "
            r8.append(r3)
            r8.append(r11)
            java.lang.String r11 = r8.toString()
            r0.<init>(r6, r11)
            com.google.android.gms.common.api.internal.b r11 = r4.f5587m
            android.os.Handler r11 = r11.f5573k0
            com.google.android.gms.common.internal.C1101a.m3098c(r11)
            r4.m3066e(r0, r7, r1)
            goto L3de
        L315:
            m6.b<O extends l6.a$c> r0 = r4.f5577c
            com.google.android.gms.common.api.Status r11 = m3055d(r0, r11)
            com.google.android.gms.common.api.internal.b r0 = r4.f5587m
            android.os.Handler r0 = r0.f5573k0
            com.google.android.gms.common.internal.C1101a.m3098c(r0)
            r4.m3066e(r11, r7, r1)
            goto L3de
        L327:
            r11 = 76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r11)
            java.lang.String r11 = "Could not find API instance "
            r1.append(r11)
            r1.append(r0)
            java.lang.String r11 = " while trying to fail enqueued calls."
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            android.util.Log.wtf(r5, r11, r0)
            goto L3de
        L349:
            java.lang.Object r11 = r11.obj
            m6.p r11 = (p218m6.C4403p) r11
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r0 = r10.f5570h0
            l6.c<?> r1 = r11.f17972c
            m6.b<O extends l6.a$c> r1 = r1.f17350e
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.b$a r0 = (com.google.android.gms.common.api.internal.C1082b.a) r0
            if (r0 != 0) goto L361
            l6.c<?> r0 = r11.f17972c
            com.google.android.gms.common.api.internal.b$a r0 = r10.m3058e(r0)
        L361:
            boolean r1 = r0.m3075n()
            if (r1 == 0) goto L37c
            java.util.concurrent.atomic.AtomicInteger r1 = r10.f5569g0
            int r1 = r1.get()
            int r3 = r11.f17971b
            if (r1 == r3) goto L37c
            com.google.android.gms.common.api.internal.g r11 = r11.f17970a
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.internal.C1082b.f5557m0
            r11.mo3087b(r1)
            r0.m3063b()
            goto L3de
        L37c:
            com.google.android.gms.common.api.internal.g r11 = r11.f17970a
            r0.m3067f(r11)
            goto L3de
        L382:
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r11 = r10.f5570h0
            java.util.Collection r11 = r11.values()
            java.util.Iterator r11 = r11.iterator()
        L38c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L3de
            java.lang.Object r0 = r11.next()
            com.google.android.gms.common.api.internal.b$a r0 = (com.google.android.gms.common.api.internal.C1082b.a) r0
            r0.m3073l()
            r0.m3074m()
            goto L38c
        L39f:
            java.lang.Object r11 = r11.obj
            m6.x r11 = (p218m6.C4411x) r11
            java.util.Objects.requireNonNull(r11)
            throw r7
        L3a7:
            java.lang.Object r11 = r11.obj
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L3b3
            r3 = 10000(0x2710, double:4.9407E-320)
        L3b3:
            r10.f5561Y = r3
            android.os.Handler r11 = r10.f5573k0
            r0 = 12
            r11.removeMessages(r0)
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r11 = r10.f5570h0
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L3c6:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L3de
            java.lang.Object r1 = r11.next()
            m6.b r1 = (p218m6.C4388b) r1
            android.os.Handler r3 = r10.f5573k0
            android.os.Message r1 = r3.obtainMessage(r0, r1)
            long r4 = r10.f5561Y
            r3.sendMessageDelayed(r1, r4)
            goto L3c6
        L3de:
            return r2
    }
}
