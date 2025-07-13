package androidx.fragment.app;

/* renamed from: androidx.fragment.app.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC0375d0 {

    /* renamed from: A */
    public java.util.ArrayDeque<androidx.fragment.app.AbstractC0375d0.l> f2101A;

    /* renamed from: B */
    public boolean f2102B;

    /* renamed from: C */
    public boolean f2103C;

    /* renamed from: D */
    public boolean f2104D;

    /* renamed from: E */
    public boolean f2105E;

    /* renamed from: F */
    public boolean f2106F;

    /* renamed from: G */
    public java.util.ArrayList<androidx.fragment.app.C0365a> f2107G;

    /* renamed from: H */
    public java.util.ArrayList<java.lang.Boolean> f2108H;

    /* renamed from: I */
    public java.util.ArrayList<androidx.fragment.app.ComponentCallbacksC0395n> f2109I;

    /* renamed from: J */
    public java.util.ArrayList<androidx.fragment.app.AbstractC0375d0.p> f2110J;

    /* renamed from: K */
    public androidx.fragment.app.C0382g0 f2111K;

    /* renamed from: L */
    public java.lang.Runnable f2112L;

    /* renamed from: a */
    public final java.util.ArrayList<androidx.fragment.app.AbstractC0375d0.n> f2113a;

    /* renamed from: b */
    public boolean f2114b;

    /* renamed from: c */
    public final androidx.fragment.app.C0392l0 f2115c;

    /* renamed from: d */
    public java.util.ArrayList<androidx.fragment.app.C0365a> f2116d;

    /* renamed from: e */
    public java.util.ArrayList<androidx.fragment.app.ComponentCallbacksC0395n> f2117e;

    /* renamed from: f */
    public final androidx.fragment.app.LayoutInflaterFactory2C0369b0 f2118f;

    /* renamed from: g */
    public androidx.activity.OnBackPressedDispatcher f2119g;

    /* renamed from: h */
    public final androidx.activity.AbstractC0186b f2120h;

    /* renamed from: i */
    public final java.util.concurrent.atomic.AtomicInteger f2121i;

    /* renamed from: j */
    public final java.util.Map<java.lang.String, android.os.Bundle> f2122j;

    /* renamed from: k */
    public final java.util.Map<java.lang.String, java.lang.Object> f2123k;

    /* renamed from: l */
    public java.util.ArrayList<androidx.fragment.app.AbstractC0375d0.m> f2124l;

    /* renamed from: m */
    public java.util.Map<androidx.fragment.app.ComponentCallbacksC0395n, java.util.HashSet<p158j0.C3380b>> f2125m;

    /* renamed from: n */
    public final androidx.fragment.app.C0408t0.a f2126n;

    /* renamed from: o */
    public final androidx.fragment.app.C0372c0 f2127o;

    /* renamed from: p */
    public final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.InterfaceC0384h0> f2128p;

    /* renamed from: q */
    public int f2129q;

    /* renamed from: r */
    public androidx.fragment.app.AbstractC0366a0<?> f2130r;

    /* renamed from: s */
    public androidx.fragment.app.AbstractC0415x f2131s;

    /* renamed from: t */
    public androidx.fragment.app.ComponentCallbacksC0395n f2132t;

    /* renamed from: u */
    public androidx.fragment.app.ComponentCallbacksC0395n f2133u;

    /* renamed from: v */
    public androidx.fragment.app.C0419z f2134v;

    /* renamed from: w */
    public androidx.fragment.app.InterfaceC0373c1 f2135w;

    /* renamed from: x */
    public androidx.activity.result.AbstractC0195c<android.content.Intent> f2136x;

    /* renamed from: y */
    public androidx.activity.result.AbstractC0195c<androidx.activity.result.C0198f> f2137y;

    /* renamed from: z */
    public androidx.activity.result.AbstractC0195c<java.lang.String[]> f2138z;

    /* renamed from: androidx.fragment.app.d0$a */
    public class a implements androidx.activity.result.InterfaceC0194b<androidx.activity.result.C0193a> {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.AbstractC0375d0 f2139Y;

        public a(androidx.fragment.app.AbstractC0375d0 r1) {
                r0 = this;
                r0.f2139Y = r1
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.InterfaceC0194b
        /* renamed from: d */
        public void mo448d(androidx.activity.result.C0193a r4) {
                r3 = this;
                androidx.activity.result.a r4 = (androidx.activity.result.C0193a) r4
                androidx.fragment.app.d0 r0 = r3.f2139Y
                java.util.ArrayDeque<androidx.fragment.app.d0$l> r0 = r0.f2101A
                java.lang.Object r0 = r0.pollFirst()
                androidx.fragment.app.d0$l r0 = (androidx.fragment.app.AbstractC0375d0.l) r0
                if (r0 != 0) goto L1c
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "No IntentSenders were started for "
                r4.append(r0)
                r4.append(r3)
                goto L30
            L1c:
                java.lang.String r1 = r0.f2147Y
                int r0 = r0.f2148Z
                androidx.fragment.app.d0 r2 = r3.f2139Y
                androidx.fragment.app.l0 r2 = r2.f2115c
                androidx.fragment.app.n r2 = r2.m1286v(r1)
                if (r2 != 0) goto L3a
                java.lang.String r4 = "Intent Sender result delivered for unknown Fragment "
                java.lang.StringBuilder r4 = android.support.v4.media.C0143b.m255a(r4, r1)
            L30:
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.w(r0, r4)
                goto L41
            L3a:
                int r1 = r4.f642Y
                android.content.Intent r4 = r4.f643Z
                r2.m1315S(r0, r1, r4)
            L41:
                return
        }
    }

    /* renamed from: androidx.fragment.app.d0$b */
    public class b implements androidx.activity.result.InterfaceC0194b<java.util.Map<java.lang.String, java.lang.Boolean>> {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.AbstractC0375d0 f2140Y;

        public b(androidx.fragment.app.AbstractC0375d0 r1) {
                r0 = this;
                r0.f2140Y = r1
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.InterfaceC0194b
        @android.annotation.SuppressLint({"SyntheticAccessor"})
        /* renamed from: d */
        public void mo448d(java.util.Map<java.lang.String, java.lang.Boolean> r4) {
                r3 = this;
                java.util.Map r4 = (java.util.Map) r4
                java.util.Set r0 = r4.keySet()
                r1 = 0
                java.lang.String[] r1 = new java.lang.String[r1]
                java.lang.Object[] r0 = r0.toArray(r1)
                java.lang.String[] r0 = (java.lang.String[]) r0
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.Collection r4 = r4.values()
                r0.<init>(r4)
                int r4 = r0.size()
                int[] r4 = new int[r4]
                r1 = 0
            L1f:
                int r2 = r0.size()
                if (r1 >= r2) goto L39
                java.lang.Object r2 = r0.get(r1)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L33
                r2 = 0
                goto L34
            L33:
                r2 = -1
            L34:
                r4[r1] = r2
                int r1 = r1 + 1
                goto L1f
            L39:
                androidx.fragment.app.d0 r4 = r3.f2140Y
                java.util.ArrayDeque<androidx.fragment.app.d0$l> r4 = r4.f2101A
                java.lang.Object r4 = r4.pollFirst()
                androidx.fragment.app.d0$l r4 = (androidx.fragment.app.AbstractC0375d0.l) r4
                if (r4 != 0) goto L57
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "No permissions were requested for "
                r4.append(r0)
                r4.append(r3)
                java.lang.String r4 = r4.toString()
                goto L69
            L57:
                java.lang.String r4 = r4.f2147Y
                androidx.fragment.app.d0 r0 = r3.f2140Y
                androidx.fragment.app.l0 r0 = r0.f2115c
                androidx.fragment.app.n r0 = r0.m1286v(r4)
                if (r0 != 0) goto L6e
                java.lang.String r0 = "Permission request result delivered for unknown Fragment "
                java.lang.String r4 = p064e.C1493g.m4049a(r0, r4)
            L69:
                java.lang.String r0 = "FragmentManager"
                android.util.Log.w(r0, r4)
            L6e:
                return
        }
    }

    /* renamed from: androidx.fragment.app.d0$c */
    public class c extends androidx.activity.AbstractC0186b {

        /* renamed from: c */
        public final /* synthetic */ androidx.fragment.app.AbstractC0375d0 f2141c;

        public c(androidx.fragment.app.AbstractC0375d0 r1, boolean r2) {
                r0 = this;
                r0.f2141c = r1
                r0.<init>(r2)
                return
        }

        @Override // androidx.activity.AbstractC0186b
        /* renamed from: a */
        public void mo439a() {
                r2 = this;
                androidx.fragment.app.d0 r0 = r2.f2141c
                r1 = 1
                r0.m1134C(r1)
                androidx.activity.b r1 = r0.f2120h
                boolean r1 = r1.f616a
                if (r1 == 0) goto L10
                r0.m1154X()
                goto L15
            L10:
                androidx.activity.OnBackPressedDispatcher r0 = r0.f2119g
                r0.m438b()
            L15:
                return
        }
    }

    /* renamed from: androidx.fragment.app.d0$d */
    public class d implements androidx.fragment.app.C0408t0.a {

        /* renamed from: a */
        public final /* synthetic */ androidx.fragment.app.AbstractC0375d0 f2142a;

        public d(androidx.fragment.app.AbstractC0375d0 r1) {
                r0 = this;
                r0.f2142a = r1
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m1194a(androidx.fragment.app.ComponentCallbacksC0395n r3, p158j0.C3380b r4) {
                r2 = this;
                monitor-enter(r4)
                boolean r0 = r4.f14534a     // Catch: java.lang.Throwable -> L31
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
                if (r0 != 0) goto L30
                androidx.fragment.app.d0 r0 = r2.f2142a
                java.util.Map<androidx.fragment.app.n, java.util.HashSet<j0.b>> r1 = r0.f2125m
                java.lang.Object r1 = r1.get(r3)
                java.util.HashSet r1 = (java.util.HashSet) r1
                if (r1 == 0) goto L30
                boolean r4 = r1.remove(r4)
                if (r4 == 0) goto L30
                boolean r4 = r1.isEmpty()
                if (r4 == 0) goto L30
                java.util.Map<androidx.fragment.app.n, java.util.HashSet<j0.b>> r4 = r0.f2125m
                r4.remove(r3)
                int r4 = r3.f2277Y
                r1 = 5
                if (r4 >= r1) goto L30
                r0.m1173i(r3)
                int r4 = r0.f2129q
                r0.m1151U(r3, r4)
            L30:
                return
            L31:
                r3 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
                throw r3
        }

        /* renamed from: b */
        public void m1195b(androidx.fragment.app.ComponentCallbacksC0395n r4, p158j0.C3380b r5) {
                r3 = this;
                androidx.fragment.app.d0 r0 = r3.f2142a
                java.util.Map<androidx.fragment.app.n, java.util.HashSet<j0.b>> r1 = r0.f2125m
                java.lang.Object r1 = r1.get(r4)
                if (r1 != 0) goto L14
                java.util.Map<androidx.fragment.app.n, java.util.HashSet<j0.b>> r1 = r0.f2125m
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                r1.put(r4, r2)
            L14:
                java.util.Map<androidx.fragment.app.n, java.util.HashSet<j0.b>> r0 = r0.f2125m
                java.lang.Object r4 = r0.get(r4)
                java.util.HashSet r4 = (java.util.HashSet) r4
                r4.add(r5)
                return
        }
    }

    /* renamed from: androidx.fragment.app.d0$e */
    public class e extends androidx.fragment.app.C0419z {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.AbstractC0375d0 f2143b;

        public e(androidx.fragment.app.AbstractC0375d0 r1) {
                r0 = this;
                r0.f2143b = r1
                r0.<init>()
                return
        }

        @Override // androidx.fragment.app.C0419z
        /* renamed from: a */
        public androidx.fragment.app.ComponentCallbacksC0395n mo1196a(java.lang.ClassLoader r5, java.lang.String r6) {
                r4 = this;
                androidx.fragment.app.d0 r5 = r4.f2143b
                androidx.fragment.app.a0<?> r5 = r5.f2130r
                android.content.Context r0 = r5.f2034Z
                java.util.Objects.requireNonNull(r5)
                java.lang.Object r5 = androidx.fragment.app.ComponentCallbacksC0395n.f2257T0
                java.lang.String r5 = ": make sure class name exists, is public, and has an empty constructor that is public"
                java.lang.String r1 = "Unable to instantiate fragment "
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L34 java.lang.IllegalAccessException -> L41 java.lang.InstantiationException -> L4c
                java.lang.Class r0 = androidx.fragment.app.C0419z.m1403c(r0, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L34 java.lang.IllegalAccessException -> L41 java.lang.InstantiationException -> L4c
                r2 = 0
                java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L34 java.lang.IllegalAccessException -> L41 java.lang.InstantiationException -> L4c
                java.lang.reflect.Constructor r0 = r0.getConstructor(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L34 java.lang.IllegalAccessException -> L41 java.lang.InstantiationException -> L4c
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L34 java.lang.IllegalAccessException -> L41 java.lang.InstantiationException -> L4c
                java.lang.Object r0 = r0.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L34 java.lang.IllegalAccessException -> L41 java.lang.InstantiationException -> L4c
                androidx.fragment.app.n r0 = (androidx.fragment.app.ComponentCallbacksC0395n) r0     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L34 java.lang.IllegalAccessException -> L41 java.lang.InstantiationException -> L4c
                return r0
            L27:
                r5 = move-exception
                androidx.fragment.app.n$e r0 = new androidx.fragment.app.n$e
                java.lang.String r2 = ": calling Fragment constructor caused an exception"
                java.lang.String r6 = android.support.v4.media.C0145d.m257a(r1, r6, r2)
                r0.<init>(r6, r5)
                throw r0
            L34:
                r5 = move-exception
                androidx.fragment.app.n$e r0 = new androidx.fragment.app.n$e
                java.lang.String r2 = ": could not find Fragment constructor"
                java.lang.String r6 = android.support.v4.media.C0145d.m257a(r1, r6, r2)
                r0.<init>(r6, r5)
                throw r0
            L41:
                r0 = move-exception
                androidx.fragment.app.n$e r2 = new androidx.fragment.app.n$e
                java.lang.String r5 = android.support.v4.media.C0145d.m257a(r1, r6, r5)
                r2.<init>(r5, r0)
                throw r2
            L4c:
                r0 = move-exception
                androidx.fragment.app.n$e r2 = new androidx.fragment.app.n$e
                java.lang.String r5 = android.support.v4.media.C0145d.m257a(r1, r6, r5)
                r2.<init>(r5, r0)
                throw r2
        }
    }

    /* renamed from: androidx.fragment.app.d0$f */
    public class f implements androidx.fragment.app.InterfaceC0373c1 {
        public f(androidx.fragment.app.AbstractC0375d0 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: androidx.fragment.app.d0$g */
    public class g implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.AbstractC0375d0 f2144Y;

        public g(androidx.fragment.app.AbstractC0375d0 r1) {
                r0 = this;
                r0.f2144Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.fragment.app.d0 r0 = r2.f2144Y
                r1 = 1
                r0.m1134C(r1)
                return
        }
    }

    /* renamed from: androidx.fragment.app.d0$h */
    public class h implements androidx.fragment.app.InterfaceC0384h0 {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f2145Y;

        public h(androidx.fragment.app.AbstractC0375d0 r1, androidx.fragment.app.ComponentCallbacksC0395n r2) {
                r0 = this;
                r0.f2145Y = r2
                r0.<init>()
                return
        }

        @Override // androidx.fragment.app.InterfaceC0384h0
        /* renamed from: a */
        public void mo1197a(androidx.fragment.app.AbstractC0375d0 r1, androidx.fragment.app.ComponentCallbacksC0395n r2) {
                r0 = this;
                androidx.fragment.app.n r1 = r0.f2145Y
                r1.mo1316U(r2)
                return
        }
    }

    /* renamed from: androidx.fragment.app.d0$i */
    public class i implements androidx.activity.result.InterfaceC0194b<androidx.activity.result.C0193a> {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.AbstractC0375d0 f2146Y;

        public i(androidx.fragment.app.AbstractC0375d0 r1) {
                r0 = this;
                r0.f2146Y = r1
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.InterfaceC0194b
        /* renamed from: d */
        public void mo448d(androidx.activity.result.C0193a r4) {
                r3 = this;
                androidx.activity.result.a r4 = (androidx.activity.result.C0193a) r4
                androidx.fragment.app.d0 r0 = r3.f2146Y
                java.util.ArrayDeque<androidx.fragment.app.d0$l> r0 = r0.f2101A
                java.lang.Object r0 = r0.pollFirst()
                androidx.fragment.app.d0$l r0 = (androidx.fragment.app.AbstractC0375d0.l) r0
                if (r0 != 0) goto L1c
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "No Activities were started for result for "
                r4.append(r0)
                r4.append(r3)
                goto L30
            L1c:
                java.lang.String r1 = r0.f2147Y
                int r0 = r0.f2148Z
                androidx.fragment.app.d0 r2 = r3.f2146Y
                androidx.fragment.app.l0 r2 = r2.f2115c
                androidx.fragment.app.n r2 = r2.m1286v(r1)
                if (r2 != 0) goto L3a
                java.lang.String r4 = "Activity result delivered for unknown Fragment "
                java.lang.StringBuilder r4 = android.support.v4.media.C0143b.m255a(r4, r1)
            L30:
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.w(r0, r4)
                goto L41
            L3a:
                int r1 = r4.f642Y
                android.content.Intent r4 = r4.f643Z
                r2.m1315S(r0, r1, r4)
            L41:
                return
        }
    }

    /* renamed from: androidx.fragment.app.d0$j */
    public interface j {
        /* renamed from: a */
        java.lang.String mo1073a();
    }

    /* renamed from: androidx.fragment.app.d0$k */
    public static class k extends p045d.AbstractC1255a<androidx.activity.result.C0198f, androidx.activity.result.C0193a> {
        public k() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p045d.AbstractC1255a
        /* renamed from: a */
        public android.content.Intent mo1198a(android.content.Context r5, androidx.activity.result.C0198f r6) {
                r4 = this;
                androidx.activity.result.f r6 = (androidx.activity.result.C0198f) r6
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r0 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                r5.<init>(r0)
                android.content.Intent r0 = r6.f645Z
                if (r0 == 0) goto L31
                java.lang.String r1 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
                android.os.Bundle r2 = r0.getBundleExtra(r1)
                if (r2 == 0) goto L31
                r5.putExtra(r1, r2)
                r0.removeExtra(r1)
                r1 = 0
                java.lang.String r2 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
                boolean r0 = r0.getBooleanExtra(r2, r1)
                if (r0 == 0) goto L31
                android.content.IntentSender r0 = r6.f644Y
                r1 = 0
                int r2 = r6.f647b0
                int r6 = r6.f646a0
                androidx.activity.result.f r3 = new androidx.activity.result.f
                r3.<init>(r0, r1, r6, r2)
                r6 = r3
            L31:
                java.lang.String r0 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                r5.putExtra(r0, r6)
                r6 = 2
                boolean r6 = androidx.fragment.app.AbstractC0375d0.m1131O(r6)
                if (r6 == 0) goto L53
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "CreateIntent created the following intent: "
                r6.append(r0)
                r6.append(r5)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r6)
            L53:
                return r5
        }

        @Override // p045d.AbstractC1255a
        /* renamed from: c */
        public androidx.activity.result.C0193a mo1199c(int r2, android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.a r0 = new androidx.activity.result.a
                r0.<init>(r2, r3)
                return r0
        }
    }

    @android.annotation.SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.d0$l */
    public static class l implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.AbstractC0375d0.l> CREATOR = null;

        /* renamed from: Y */
        public java.lang.String f2147Y;

        /* renamed from: Z */
        public int f2148Z;

        /* renamed from: androidx.fragment.app.d0$l$a */
        public class a implements android.os.Parcelable.Creator<androidx.fragment.app.AbstractC0375d0.l> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public androidx.fragment.app.AbstractC0375d0.l createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    androidx.fragment.app.d0$l r0 = new androidx.fragment.app.d0$l
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public androidx.fragment.app.AbstractC0375d0.l[] newArray(int r1) {
                    r0 = this;
                    androidx.fragment.app.d0$l[] r1 = new androidx.fragment.app.AbstractC0375d0.l[r1]
                    return r1
            }
        }

        static {
                androidx.fragment.app.d0$l$a r0 = new androidx.fragment.app.d0$l$a
                r0.<init>()
                androidx.fragment.app.AbstractC0375d0.l.CREATOR = r0
                return
        }

        public l(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.f2147Y = r0
                int r2 = r2.readInt()
                r1.f2148Z = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.f2147Y
                r1.writeString(r2)
                int r2 = r0.f2148Z
                r1.writeInt(r2)
                return
        }
    }

    /* renamed from: androidx.fragment.app.d0$m */
    public interface m {
        /* renamed from: a */
        void mo1200a();
    }

    /* renamed from: androidx.fragment.app.d0$n */
    public interface n {
        /* renamed from: b */
        boolean mo1074b(java.util.ArrayList<androidx.fragment.app.C0365a> r1, java.util.ArrayList<java.lang.Boolean> r2);
    }

    /* renamed from: androidx.fragment.app.d0$o */
    public class o implements androidx.fragment.app.AbstractC0375d0.n {

        /* renamed from: a */
        public final java.lang.String f2149a;

        /* renamed from: b */
        public final int f2150b;

        /* renamed from: c */
        public final int f2151c;

        /* renamed from: d */
        public final /* synthetic */ androidx.fragment.app.AbstractC0375d0 f2152d;

        public o(androidx.fragment.app.AbstractC0375d0 r1, java.lang.String r2, int r3, int r4) {
                r0 = this;
                r0.f2152d = r1
                r0.<init>()
                r0.f2149a = r2
                r0.f2150b = r3
                r0.f2151c = r4
                return
        }

        @Override // androidx.fragment.app.AbstractC0375d0.n
        /* renamed from: b */
        public boolean mo1074b(java.util.ArrayList<androidx.fragment.app.C0365a> r7, java.util.ArrayList<java.lang.Boolean> r8) {
                r6 = this;
                androidx.fragment.app.d0 r0 = r6.f2152d
                androidx.fragment.app.n r0 = r0.f2133u
                if (r0 == 0) goto L1a
                int r1 = r6.f2150b
                if (r1 >= 0) goto L1a
                java.lang.String r1 = r6.f2149a
                if (r1 != 0) goto L1a
                androidx.fragment.app.d0 r0 = r0.m1337u()
                boolean r0 = r0.m1154X()
                if (r0 == 0) goto L1a
                r7 = 0
                return r7
            L1a:
                androidx.fragment.app.d0 r0 = r6.f2152d
                java.lang.String r3 = r6.f2149a
                int r4 = r6.f2150b
                int r5 = r6.f2151c
                r1 = r7
                r2 = r8
                boolean r7 = r0.m1155Y(r1, r2, r3, r4, r5)
                return r7
        }
    }

    /* renamed from: androidx.fragment.app.d0$p */
    public static class p implements androidx.fragment.app.ComponentCallbacksC0395n.g {

        /* renamed from: a */
        public final boolean f2153a;

        /* renamed from: b */
        public final androidx.fragment.app.C0365a f2154b;

        /* renamed from: c */
        public int f2155c;

        /* renamed from: a */
        public void m1201a() {
                r5 = this;
                int r0 = r5.f2155c
                r1 = 1
                if (r0 <= 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                androidx.fragment.app.a r2 = r5.f2154b
                androidx.fragment.app.d0 r2 = r2.f2030q
                java.util.List r2 = r2.m1143L()
                java.util.Iterator r2 = r2.iterator()
            L14:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L30
                java.lang.Object r3 = r2.next()
                androidx.fragment.app.n r3 = (androidx.fragment.app.ComponentCallbacksC0395n) r3
                r4 = 0
                r3.m1295A0(r4)
                if (r0 == 0) goto L14
                boolean r4 = r3.m1313Q()
                if (r4 == 0) goto L14
                r3.m1299C0()
                goto L14
            L30:
                androidx.fragment.app.a r2 = r5.f2154b
                androidx.fragment.app.d0 r3 = r2.f2030q
                boolean r4 = r5.f2153a
                r0 = r0 ^ r1
                r3.m1169g(r2, r4, r0, r1)
                return
        }
    }

    public AbstractC0375d0() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f2113a = r0
            androidx.fragment.app.l0 r0 = new androidx.fragment.app.l0
            r1 = 0
            r0.<init>(r1)
            r2.f2115c = r0
            androidx.fragment.app.b0 r0 = new androidx.fragment.app.b0
            r0.<init>(r2)
            r2.f2118f = r0
            androidx.fragment.app.d0$c r0 = new androidx.fragment.app.d0$c
            r0.<init>(r2, r1)
            r2.f2120h = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.f2121i = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.f2122j = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.f2123k = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.f2125m = r0
            androidx.fragment.app.d0$d r0 = new androidx.fragment.app.d0$d
            r0.<init>(r2)
            r2.f2126n = r0
            androidx.fragment.app.c0 r0 = new androidx.fragment.app.c0
            r0.<init>(r2)
            r2.f2127o = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.f2128p = r0
            r0 = -1
            r2.f2129q = r0
            androidx.fragment.app.d0$e r0 = new androidx.fragment.app.d0$e
            r0.<init>(r2)
            r2.f2134v = r0
            androidx.fragment.app.d0$f r0 = new androidx.fragment.app.d0$f
            r0.<init>(r2)
            r2.f2135w = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.f2101A = r0
            androidx.fragment.app.d0$g r0 = new androidx.fragment.app.d0$g
            r0.<init>(r2)
            r2.f2112L = r0
            return
    }

    /* renamed from: O */
    public static boolean m1131O(int r1) {
            java.lang.String r0 = "FragmentManager"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    /* renamed from: A */
    public void m1132A(androidx.fragment.app.AbstractC0375d0.n r3, boolean r4) {
            r2 = this;
            if (r4 != 0) goto L29
            androidx.fragment.app.a0<?> r0 = r2.f2130r
            if (r0 != 0) goto L1a
            boolean r3 = r2.f2105E
            if (r3 == 0) goto L12
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has been destroyed"
            r3.<init>(r4)
            throw r3
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has not been attached to a host."
            r3.<init>(r4)
            throw r3
        L1a:
            boolean r0 = r2.m1149S()
            if (r0 != 0) goto L21
            goto L29
        L21:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Can not perform this action after onSaveInstanceState"
            r3.<init>(r4)
            throw r3
        L29:
            java.util.ArrayList<androidx.fragment.app.d0$n> r0 = r2.f2113a
            monitor-enter(r0)
            androidx.fragment.app.a0<?> r1 = r2.f2130r     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L3c
            if (r4 == 0) goto L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return
        L34:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "Activity has been destroyed"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L46
            throw r3     // Catch: java.lang.Throwable -> L46
        L3c:
            java.util.ArrayList<androidx.fragment.app.d0$n> r4 = r2.f2113a     // Catch: java.lang.Throwable -> L46
            r4.add(r3)     // Catch: java.lang.Throwable -> L46
            r2.m1164d0()     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return
        L46:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r3
    }

    /* renamed from: B */
    public final void m1133B(boolean r3) {
            r2 = this;
            boolean r0 = r2.f2114b
            if (r0 != 0) goto L64
            androidx.fragment.app.a0<?> r0 = r2.f2130r
            if (r0 != 0) goto L1c
            boolean r3 = r2.f2105E
            if (r3 == 0) goto L14
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has been destroyed"
            r3.<init>(r0)
            throw r3
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has not been attached to a host."
            r3.<init>(r0)
            throw r3
        L1c:
            android.os.Looper r0 = android.os.Looper.myLooper()
            androidx.fragment.app.a0<?> r1 = r2.f2130r
            android.os.Handler r1 = r1.f2035a0
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L5c
            if (r3 != 0) goto L3b
            boolean r3 = r2.m1149S()
            if (r3 != 0) goto L33
            goto L3b
        L33:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can not perform this action after onSaveInstanceState"
            r3.<init>(r0)
            throw r3
        L3b:
            java.util.ArrayList<androidx.fragment.app.a> r3 = r2.f2107G
            if (r3 != 0) goto L4d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f2107G = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f2108H = r3
        L4d:
            r3 = 1
            r2.f2114b = r3
            r3 = 0
            r0 = 0
            r2.m1137F(r0, r0)     // Catch: java.lang.Throwable -> L58
            r2.f2114b = r3
            return
        L58:
            r0 = move-exception
            r2.f2114b = r3
            throw r0
        L5c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must be called from main thread of fragment host"
            r3.<init>(r0)
            throw r3
        L64:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager is already executing transactions"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: C */
    public boolean m1134C(boolean r10) {
            r9 = this;
            r9.m1133B(r10)
            r10 = 1
            r0 = 0
            r1 = 0
        L6:
            java.util.ArrayList<androidx.fragment.app.a> r2 = r9.f2107G
            java.util.ArrayList<java.lang.Boolean> r3 = r9.f2108H
            java.util.ArrayList<androidx.fragment.app.d0$n> r4 = r9.f2113a
            monitor-enter(r4)
            java.util.ArrayList<androidx.fragment.app.d0$n> r5 = r9.f2113a     // Catch: java.lang.Throwable -> L62
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L18
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L62
            r7 = 0
            goto L41
        L18:
            java.util.ArrayList<androidx.fragment.app.d0$n> r5 = r9.f2113a     // Catch: java.lang.Throwable -> L62
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L62
            r6 = 0
            r7 = 0
        L20:
            if (r6 >= r5) goto L32
            java.util.ArrayList<androidx.fragment.app.d0$n> r8 = r9.f2113a     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r8.get(r6)     // Catch: java.lang.Throwable -> L62
            androidx.fragment.app.d0$n r8 = (androidx.fragment.app.AbstractC0375d0.n) r8     // Catch: java.lang.Throwable -> L62
            boolean r8 = r8.mo1074b(r2, r3)     // Catch: java.lang.Throwable -> L62
            r7 = r7 | r8
            int r6 = r6 + 1
            goto L20
        L32:
            java.util.ArrayList<androidx.fragment.app.d0$n> r2 = r9.f2113a     // Catch: java.lang.Throwable -> L62
            r2.clear()     // Catch: java.lang.Throwable -> L62
            androidx.fragment.app.a0<?> r2 = r9.f2130r     // Catch: java.lang.Throwable -> L62
            android.os.Handler r2 = r2.f2035a0     // Catch: java.lang.Throwable -> L62
            java.lang.Runnable r3 = r9.f2112L     // Catch: java.lang.Throwable -> L62
            r2.removeCallbacks(r3)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L62
        L41:
            if (r7 == 0) goto L56
            r9.f2114b = r10
            java.util.ArrayList<androidx.fragment.app.a> r1 = r9.f2107G     // Catch: java.lang.Throwable -> L51
            java.util.ArrayList<java.lang.Boolean> r2 = r9.f2108H     // Catch: java.lang.Throwable -> L51
            r9.m1158a0(r1, r2)     // Catch: java.lang.Throwable -> L51
            r9.m1165e()
            r1 = 1
            goto L6
        L51:
            r10 = move-exception
            r9.m1165e()
            throw r10
        L56:
            r9.m1178k0()
            r9.m1191x()
            androidx.fragment.app.l0 r10 = r9.f2115c
            r10.m1275j()
            return r1
        L62:
            r10 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L62
            throw r10
    }

    /* renamed from: D */
    public void m1135D(androidx.fragment.app.AbstractC0375d0.n r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            androidx.fragment.app.a0<?> r0 = r1.f2130r
            if (r0 == 0) goto La
            boolean r0 = r1.f2105E
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            r1.m1133B(r3)
            java.util.ArrayList<androidx.fragment.app.a> r3 = r1.f2107G
            java.util.ArrayList<java.lang.Boolean> r0 = r1.f2108H
            androidx.fragment.app.a r2 = (androidx.fragment.app.C0365a) r2
            r2.mo1074b(r3, r0)
            r2 = 1
            r1.f2114b = r2
            java.util.ArrayList<androidx.fragment.app.a> r2 = r1.f2107G     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList<java.lang.Boolean> r3 = r1.f2108H     // Catch: java.lang.Throwable -> L30
            r1.m1158a0(r2, r3)     // Catch: java.lang.Throwable -> L30
            r1.m1165e()
            r1.m1178k0()
            r1.m1191x()
            androidx.fragment.app.l0 r2 = r1.f2115c
            r2.m1275j()
            return
        L30:
            r2 = move-exception
            r1.m1165e()
            throw r2
    }

    /* renamed from: E */
    public final void m1136E(java.util.ArrayList<androidx.fragment.app.C0365a> r20, java.util.ArrayList<java.lang.Boolean> r21, int r22, int r23) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.Object r5 = r1.get(r3)
            androidx.fragment.app.a r5 = (androidx.fragment.app.C0365a) r5
            boolean r5 = r5.f2248p
            java.util.ArrayList<androidx.fragment.app.n> r6 = r0.f2109I
            if (r6 != 0) goto L1e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.f2109I = r6
            goto L21
        L1e:
            r6.clear()
        L21:
            java.util.ArrayList<androidx.fragment.app.n> r6 = r0.f2109I
            androidx.fragment.app.l0 r7 = r0.f2115c
            java.util.List r7 = r7.m1243A()
            r6.addAll(r7)
            androidx.fragment.app.n r6 = r0.f2133u
            r8 = r3
            r9 = 0
        L30:
            r11 = 1
            if (r8 >= r4) goto L16e
            java.lang.Object r12 = r1.get(r8)
            androidx.fragment.app.a r12 = (androidx.fragment.app.C0365a) r12
            java.lang.Object r13 = r2.get(r8)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r15 = 3
            if (r13 != 0) goto L123
            java.util.ArrayList<androidx.fragment.app.n> r13 = r0.f2109I
            r7 = 0
        L49:
            java.util.ArrayList<androidx.fragment.app.m0$a> r14 = r12.f2233a
            int r14 = r14.size()
            if (r7 >= r14) goto L15c
            java.util.ArrayList<androidx.fragment.app.m0$a> r14 = r12.f2233a
            java.lang.Object r14 = r14.get(r7)
            androidx.fragment.app.m0$a r14 = (androidx.fragment.app.AbstractC0394m0.a) r14
            int r10 = r14.f2249a
            if (r10 == r11) goto L114
            r11 = 2
            r3 = 9
            if (r10 == r11) goto L99
            if (r10 == r15) goto L80
            r11 = 6
            if (r10 == r11) goto L80
            r11 = 7
            if (r10 == r11) goto L114
            r11 = 8
            if (r10 == r11) goto L70
            goto L10b
        L70:
            java.util.ArrayList<androidx.fragment.app.m0$a> r10 = r12.f2233a
            androidx.fragment.app.m0$a r11 = new androidx.fragment.app.m0$a
            r11.<init>(r3, r6)
            r10.add(r7, r11)
            int r7 = r7 + 1
            androidx.fragment.app.n r6 = r14.f2250b
            goto L10b
        L80:
            androidx.fragment.app.n r10 = r14.f2250b
            r13.remove(r10)
            androidx.fragment.app.n r10 = r14.f2250b
            if (r10 != r6) goto L10b
            java.util.ArrayList<androidx.fragment.app.m0$a> r6 = r12.f2233a
            androidx.fragment.app.m0$a r11 = new androidx.fragment.app.m0$a
            r11.<init>(r3, r10)
            r6.add(r7, r11)
            int r7 = r7 + 1
            r2 = 1
            r6 = 0
            goto L11a
        L99:
            androidx.fragment.app.n r10 = r14.f2250b
            int r11 = r10.f2299u0
            int r17 = r13.size()
            r16 = -1
            int r17 = r17 + (-1)
            r15 = r17
            r17 = 0
        La9:
            if (r15 < 0) goto L102
            java.lang.Object r18 = r13.get(r15)
            r3 = r18
            androidx.fragment.app.n r3 = (androidx.fragment.app.ComponentCallbacksC0395n) r3
            int r2 = r3.f2299u0
            if (r2 != r11) goto Lf7
            if (r3 != r10) goto Lbe
            r18 = r11
            r17 = 1
            goto Lf9
        Lbe:
            if (r3 != r6) goto Ld2
            java.util.ArrayList<androidx.fragment.app.m0$a> r2 = r12.f2233a
            androidx.fragment.app.m0$a r6 = new androidx.fragment.app.m0$a
            r18 = r11
            r11 = 9
            r6.<init>(r11, r3)
            r2.add(r7, r6)
            int r7 = r7 + 1
            r6 = 0
            goto Ld6
        Ld2:
            r18 = r11
            r11 = 9
        Ld6:
            androidx.fragment.app.m0$a r2 = new androidx.fragment.app.m0$a
            r11 = 3
            r2.<init>(r11, r3)
            int r11 = r14.f2251c
            r2.f2251c = r11
            int r11 = r14.f2253e
            r2.f2253e = r11
            int r11 = r14.f2252d
            r2.f2252d = r11
            int r11 = r14.f2254f
            r2.f2254f = r11
            java.util.ArrayList<androidx.fragment.app.m0$a> r11 = r12.f2233a
            r11.add(r7, r2)
            r13.remove(r3)
            r2 = 1
            int r7 = r7 + r2
            goto Lf9
        Lf7:
            r18 = r11
        Lf9:
            int r15 = r15 + (-1)
            r2 = r21
            r11 = r18
            r3 = 9
            goto La9
        L102:
            if (r17 == 0) goto L10d
            java.util.ArrayList<androidx.fragment.app.m0$a> r2 = r12.f2233a
            r2.remove(r7)
            int r7 = r7 + (-1)
        L10b:
            r2 = 1
            goto L11a
        L10d:
            r2 = 1
            r14.f2249a = r2
            r13.add(r10)
            goto L11a
        L114:
            r2 = 1
            androidx.fragment.app.n r3 = r14.f2250b
            r13.add(r3)
        L11a:
            int r7 = r7 + r2
            r2 = r21
            r3 = r22
            r11 = 1
            r15 = 3
            goto L49
        L123:
            r2 = 1
            java.util.ArrayList<androidx.fragment.app.n> r3 = r0.f2109I
            java.util.ArrayList<androidx.fragment.app.m0$a> r7 = r12.f2233a
            int r7 = r7.size()
            int r7 = r7 - r2
        L12d:
            if (r7 < 0) goto L15c
            java.util.ArrayList<androidx.fragment.app.m0$a> r10 = r12.f2233a
            java.lang.Object r10 = r10.get(r7)
            androidx.fragment.app.m0$a r10 = (androidx.fragment.app.AbstractC0394m0.a) r10
            int r11 = r10.f2249a
            if (r11 == r2) goto L152
            r2 = 3
            if (r11 == r2) goto L14c
            switch(r11) {
                case 6: goto L14c;
                case 7: goto L153;
                case 8: goto L14a;
                case 9: goto L147;
                case 10: goto L142;
                default: goto L141;
            }
        L141:
            goto L158
        L142:
            androidx.lifecycle.o$c r11 = r10.f2255g
            r10.f2256h = r11
            goto L158
        L147:
            androidx.fragment.app.n r6 = r10.f2250b
            goto L158
        L14a:
            r6 = 0
            goto L158
        L14c:
            androidx.fragment.app.n r10 = r10.f2250b
            r3.add(r10)
            goto L158
        L152:
            r2 = 3
        L153:
            androidx.fragment.app.n r10 = r10.f2250b
            r3.remove(r10)
        L158:
            int r7 = r7 + (-1)
            r2 = 1
            goto L12d
        L15c:
            if (r9 != 0) goto L165
            boolean r2 = r12.f2239g
            if (r2 == 0) goto L163
            goto L165
        L163:
            r9 = 0
            goto L166
        L165:
            r9 = 1
        L166:
            int r8 = r8 + 1
            r2 = r21
            r3 = r22
            goto L30
        L16e:
            java.util.ArrayList<androidx.fragment.app.n> r2 = r0.f2109I
            r2.clear()
            if (r5 != 0) goto L1ab
            int r2 = r0.f2129q
            r3 = 1
            if (r2 < r3) goto L1ab
            r2 = r22
        L17c:
            if (r2 >= r4) goto L1ab
            java.lang.Object r3 = r1.get(r2)
            androidx.fragment.app.a r3 = (androidx.fragment.app.C0365a) r3
            java.util.ArrayList<androidx.fragment.app.m0$a> r3 = r3.f2233a
            java.util.Iterator r3 = r3.iterator()
        L18a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L1a8
            java.lang.Object r5 = r3.next()
            androidx.fragment.app.m0$a r5 = (androidx.fragment.app.AbstractC0394m0.a) r5
            androidx.fragment.app.n r5 = r5.f2250b
            if (r5 == 0) goto L18a
            androidx.fragment.app.d0 r6 = r5.f2294p0
            if (r6 == 0) goto L18a
            androidx.fragment.app.j0 r5 = r0.m1171h(r5)
            androidx.fragment.app.l0 r6 = r0.f2115c
            r6.m1254L(r5)
            goto L18a
        L1a8:
            int r2 = r2 + 1
            goto L17c
        L1ab:
            r2 = r22
        L1ad:
            if (r2 >= r4) goto L1dc
            java.lang.Object r3 = r1.get(r2)
            androidx.fragment.app.a r3 = (androidx.fragment.app.C0365a) r3
            r5 = r21
            java.lang.Object r6 = r5.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L1d2
            r6 = -1
            r3.m1076f(r6)
            int r6 = r4 + (-1)
            if (r2 != r6) goto L1cd
            r6 = 1
            goto L1ce
        L1cd:
            r6 = 0
        L1ce:
            r3.m1084n(r6)
            goto L1d9
        L1d2:
            r6 = 1
            r3.m1076f(r6)
            r3.m1083m()
        L1d9:
            int r2 = r2 + 1
            goto L1ad
        L1dc:
            r5 = r21
            int r2 = r4 + (-1)
            java.lang.Object r2 = r5.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = r22
        L1ec:
            if (r3 >= r4) goto L237
            java.lang.Object r6 = r1.get(r3)
            androidx.fragment.app.a r6 = (androidx.fragment.app.C0365a) r6
            if (r2 == 0) goto L216
            java.util.ArrayList<androidx.fragment.app.m0$a> r7 = r6.f2233a
            int r7 = r7.size()
            r8 = 1
            int r7 = r7 - r8
        L1fe:
            if (r7 < 0) goto L234
            java.util.ArrayList<androidx.fragment.app.m0$a> r8 = r6.f2233a
            java.lang.Object r8 = r8.get(r7)
            androidx.fragment.app.m0$a r8 = (androidx.fragment.app.AbstractC0394m0.a) r8
            androidx.fragment.app.n r8 = r8.f2250b
            if (r8 == 0) goto L213
            androidx.fragment.app.j0 r8 = r0.m1171h(r8)
            r8.m1214k()
        L213:
            int r7 = r7 + (-1)
            goto L1fe
        L216:
            java.util.ArrayList<androidx.fragment.app.m0$a> r6 = r6.f2233a
            java.util.Iterator r6 = r6.iterator()
        L21c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L234
            java.lang.Object r7 = r6.next()
            androidx.fragment.app.m0$a r7 = (androidx.fragment.app.AbstractC0394m0.a) r7
            androidx.fragment.app.n r7 = r7.f2250b
            if (r7 == 0) goto L21c
            androidx.fragment.app.j0 r7 = r0.m1171h(r7)
            r7.m1214k()
            goto L21c
        L234:
            int r3 = r3 + 1
            goto L1ec
        L237:
            int r3 = r0.f2129q
            r6 = 1
            r0.m1150T(r3, r6)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r6 = r22
        L244:
            if (r6 >= r4) goto L275
            java.lang.Object r7 = r1.get(r6)
            androidx.fragment.app.a r7 = (androidx.fragment.app.C0365a) r7
            java.util.ArrayList<androidx.fragment.app.m0$a> r7 = r7.f2233a
            java.util.Iterator r7 = r7.iterator()
        L252:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L272
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.m0$a r8 = (androidx.fragment.app.AbstractC0394m0.a) r8
            androidx.fragment.app.n r8 = r8.f2250b
            if (r8 == 0) goto L252
            android.view.ViewGroup r8 = r8.f2259B0
            if (r8 == 0) goto L252
            androidx.fragment.app.c1 r10 = r19.m1144M()
            androidx.fragment.app.b1 r8 = androidx.fragment.app.AbstractC0370b1.m1094g(r8, r10)
            r3.add(r8)
            goto L252
        L272:
            int r6 = r6 + 1
            goto L244
        L275:
            java.util.Iterator r3 = r3.iterator()
        L279:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L28e
            java.lang.Object r6 = r3.next()
            androidx.fragment.app.b1 r6 = (androidx.fragment.app.AbstractC0370b1) r6
            r6.f2059d = r2
            r6.m1100h()
            r6.m1097c()
            goto L279
        L28e:
            r2 = r22
        L290:
            if (r2 >= r4) goto L2b3
            java.lang.Object r3 = r1.get(r2)
            androidx.fragment.app.a r3 = (androidx.fragment.app.C0365a) r3
            java.lang.Object r6 = r5.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L2ac
            int r6 = r3.f2032s
            if (r6 < 0) goto L2ac
            r6 = -1
            r3.f2032s = r6
            goto L2ad
        L2ac:
            r6 = -1
        L2ad:
            java.util.Objects.requireNonNull(r3)
            int r2 = r2 + 1
            goto L290
        L2b3:
            if (r9 == 0) goto L2d0
            java.util.ArrayList<androidx.fragment.app.d0$m> r1 = r0.f2124l
            if (r1 == 0) goto L2d0
            r7 = 0
        L2ba:
            java.util.ArrayList<androidx.fragment.app.d0$m> r1 = r0.f2124l
            int r1 = r1.size()
            if (r7 >= r1) goto L2d0
            java.util.ArrayList<androidx.fragment.app.d0$m> r1 = r0.f2124l
            java.lang.Object r1 = r1.get(r7)
            androidx.fragment.app.d0$m r1 = (androidx.fragment.app.AbstractC0375d0.m) r1
            r1.mo1200a()
            int r7 = r7 + 1
            goto L2ba
        L2d0:
            return
    }

    /* renamed from: F */
    public final void m1137F(java.util.ArrayList<androidx.fragment.app.C0365a> r9, java.util.ArrayList<java.lang.Boolean> r10) {
            r8 = this;
            java.util.ArrayList<androidx.fragment.app.d0$p> r0 = r8.f2110J
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.size()
        Lb:
            r2 = 0
        Lc:
            if (r2 >= r0) goto L89
            java.util.ArrayList<androidx.fragment.app.d0$p> r3 = r8.f2110J
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.d0$p r3 = (androidx.fragment.app.AbstractC0375d0.p) r3
            r4 = 1
            r5 = -1
            if (r9 == 0) goto L3e
            boolean r6 = r3.f2153a
            if (r6 != 0) goto L3e
            androidx.fragment.app.a r6 = r3.f2154b
            int r6 = r9.indexOf(r6)
            if (r6 == r5) goto L3e
            if (r10 == 0) goto L3e
            java.lang.Object r6 = r10.get(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L3e
            java.util.ArrayList<androidx.fragment.app.d0$p> r5 = r8.f2110J
            r5.remove(r2)
            int r2 = r2 + (-1)
            int r0 = r0 + (-1)
            goto L7a
        L3e:
            int r6 = r3.f2155c
            if (r6 != 0) goto L44
            r6 = 1
            goto L45
        L44:
            r6 = 0
        L45:
            if (r6 != 0) goto L55
            if (r9 == 0) goto L87
            androidx.fragment.app.a r6 = r3.f2154b
            int r7 = r9.size()
            boolean r6 = r6.m1086p(r9, r1, r7)
            if (r6 == 0) goto L87
        L55:
            java.util.ArrayList<androidx.fragment.app.d0$p> r6 = r8.f2110J
            r6.remove(r2)
            int r2 = r2 + (-1)
            int r0 = r0 + (-1)
            if (r9 == 0) goto L84
            boolean r6 = r3.f2153a
            if (r6 != 0) goto L84
            androidx.fragment.app.a r6 = r3.f2154b
            int r6 = r9.indexOf(r6)
            if (r6 == r5) goto L84
            if (r10 == 0) goto L84
            java.lang.Object r5 = r10.get(r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L84
        L7a:
            androidx.fragment.app.a r5 = r3.f2154b
            androidx.fragment.app.d0 r6 = r5.f2030q
            boolean r3 = r3.f2153a
            r6.m1169g(r5, r3, r1, r1)
            goto L87
        L84:
            r3.m1201a()
        L87:
            int r2 = r2 + r4
            goto Lc
        L89:
            return
    }

    /* renamed from: G */
    public androidx.fragment.app.ComponentCallbacksC0395n m1138G(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.l0 r0 = r1.f2115c
            androidx.fragment.app.n r2 = r0.m1285u(r2)
            return r2
    }

    /* renamed from: H */
    public androidx.fragment.app.ComponentCallbacksC0395n m1139H(int r5) {
            r4 = this;
            androidx.fragment.app.l0 r0 = r4.f2115c
            java.util.ArrayList<androidx.fragment.app.n> r1 = r0.f2230Z
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
        La:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L1f
            java.util.ArrayList<androidx.fragment.app.n> r2 = r0.f2230Z
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.n r2 = (androidx.fragment.app.ComponentCallbacksC0395n) r2
            if (r2 == 0) goto La
            int r3 = r2.f2298t0
            if (r3 != r5) goto La
            goto L41
        L1f:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r0.f2231a0
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.j0 r1 = (androidx.fragment.app.C0388j0) r1
            if (r1 == 0) goto L2b
            androidx.fragment.app.n r2 = r1.f2202c
            int r1 = r2.f2298t0
            if (r1 != r5) goto L2b
            goto L41
        L40:
            r2 = 0
        L41:
            return r2
    }

    /* renamed from: I */
    public androidx.fragment.app.ComponentCallbacksC0395n m1140I(java.lang.String r5) {
            r4 = this;
            androidx.fragment.app.l0 r0 = r4.f2115c
            java.util.Objects.requireNonNull(r0)
            if (r5 == 0) goto L28
            java.util.ArrayList<androidx.fragment.app.n> r1 = r0.f2230Z
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
        Lf:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L28
            java.util.ArrayList<androidx.fragment.app.n> r2 = r0.f2230Z
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.n r2 = (androidx.fragment.app.ComponentCallbacksC0395n) r2
            if (r2 == 0) goto Lf
            java.lang.String r3 = r2.f2300v0
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto Lf
            goto L50
        L28:
            if (r5 == 0) goto L4f
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r0.f2231a0
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.j0 r1 = (androidx.fragment.app.C0388j0) r1
            if (r1 == 0) goto L36
            androidx.fragment.app.n r2 = r1.f2202c
            java.lang.String r1 = r2.f2300v0
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L36
            goto L50
        L4f:
            r2 = 0
        L50:
            return r2
    }

    /* renamed from: J */
    public final android.view.ViewGroup m1141J(androidx.fragment.app.ComponentCallbacksC0395n r3) {
            r2 = this;
            android.view.ViewGroup r0 = r3.f2259B0
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r3.f2299u0
            r1 = 0
            if (r0 > 0) goto Lb
            return r1
        Lb:
            androidx.fragment.app.x r0 = r2.f2131s
            boolean r0 = r0.mo1241d()
            if (r0 == 0) goto L22
            androidx.fragment.app.x r0 = r2.f2131s
            int r3 = r3.f2299u0
            android.view.View r3 = r0.mo1240c(r3)
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L22
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        L22:
            return r1
    }

    /* renamed from: K */
    public androidx.fragment.app.C0419z m1142K() {
            r1 = this;
            androidx.fragment.app.n r0 = r1.f2132t
            if (r0 == 0) goto Lb
            androidx.fragment.app.d0 r0 = r0.f2294p0
            androidx.fragment.app.z r0 = r0.m1142K()
            return r0
        Lb:
            androidx.fragment.app.z r0 = r1.f2134v
            return r0
    }

    /* renamed from: L */
    public java.util.List<androidx.fragment.app.ComponentCallbacksC0395n> m1143L() {
            r1 = this;
            androidx.fragment.app.l0 r0 = r1.f2115c
            java.util.List r0 = r0.m1243A()
            return r0
    }

    /* renamed from: M */
    public androidx.fragment.app.InterfaceC0373c1 m1144M() {
            r1 = this;
            androidx.fragment.app.n r0 = r1.f2132t
            if (r0 == 0) goto Lb
            androidx.fragment.app.d0 r0 = r0.f2294p0
            androidx.fragment.app.c1 r0 = r0.m1144M()
            return r0
        Lb:
            androidx.fragment.app.c1 r0 = r1.f2135w
            return r0
    }

    /* renamed from: N */
    public void m1145N(androidx.fragment.app.ComponentCallbacksC0395n r3) {
            r2 = this;
            r0 = 2
            boolean r0 = m1131O(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hide: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            boolean r0 = r3.f2301w0
            if (r0 != 0) goto L2c
            r0 = 1
            r3.f2301w0 = r0
            boolean r1 = r3.f2264G0
            r0 = r0 ^ r1
            r3.f2264G0 = r0
            r2.m1172h0(r3)
        L2c:
            return
    }

    /* renamed from: P */
    public final boolean m1146P(androidx.fragment.app.ComponentCallbacksC0395n r5) {
            r4 = this;
            androidx.fragment.app.d0 r5 = r5.f2296r0
            androidx.fragment.app.l0 r0 = r5.f2115c
            java.util.List r0 = r0.m1288x()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L10:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.n r3 = (androidx.fragment.app.ComponentCallbacksC0395n) r3
            if (r3 == 0) goto L22
            boolean r2 = r5.m1146P(r3)
        L22:
            if (r2 == 0) goto L10
            r1 = 1
        L25:
            return r1
    }

    /* renamed from: Q */
    public boolean m1147Q(androidx.fragment.app.ComponentCallbacksC0395n r3) {
            r2 = this;
            r0 = 1
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3.f2304z0
            if (r1 == 0) goto L15
            androidx.fragment.app.d0 r1 = r3.f2294p0
            if (r1 == 0) goto L16
            androidx.fragment.app.n r3 = r3.f2297s0
            boolean r3 = r1.m1147Q(r3)
            if (r3 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    /* renamed from: R */
    public boolean m1148R(androidx.fragment.app.ComponentCallbacksC0395n r4) {
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            androidx.fragment.app.d0 r1 = r4.f2294p0
            androidx.fragment.app.n r2 = r1.f2133u
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L17
            androidx.fragment.app.n r4 = r1.f2132t
            boolean r4 = r3.m1148R(r4)
            if (r4 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    /* renamed from: S */
    public boolean m1149S() {
            r1 = this;
            boolean r0 = r1.f2103C
            if (r0 != 0) goto Lb
            boolean r0 = r1.f2104D
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    /* renamed from: T */
    public void m1150T(int r5, boolean r6) {
            r4 = this;
            androidx.fragment.app.a0<?> r0 = r4.f2130r
            if (r0 != 0) goto L10
            r0 = -1
            if (r5 != r0) goto L8
            goto L10
        L8:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "No activity"
            r5.<init>(r6)
            throw r5
        L10:
            if (r6 != 0) goto L17
            int r6 = r4.f2129q
            if (r5 != r6) goto L17
            return
        L17:
            r4.f2129q = r5
            androidx.fragment.app.l0 r5 = r4.f2115c
            java.util.ArrayList<androidx.fragment.app.n> r6 = r5.f2230Z
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.Iterator r6 = r6.iterator()
        L23:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r6.next()
            androidx.fragment.app.n r0 = (androidx.fragment.app.ComponentCallbacksC0395n) r0
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r5.f2231a0
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r0 = r0.f2281c0
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.j0 r0 = (androidx.fragment.app.C0388j0) r0
            if (r0 == 0) goto L23
            r0.m1214k()
            goto L23
        L41:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r6 = r5.f2231a0
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L4d:
            boolean r0 = r6.hasNext()
            r1 = 0
            if (r0 == 0) goto L72
            java.lang.Object r0 = r6.next()
            androidx.fragment.app.j0 r0 = (androidx.fragment.app.C0388j0) r0
            if (r0 == 0) goto L4d
            r0.m1214k()
            androidx.fragment.app.n r2 = r0.f2202c
            boolean r3 = r2.f2288j0
            if (r3 == 0) goto L6c
            boolean r2 = r2.m1312P()
            if (r2 != 0) goto L6c
            r1 = 1
        L6c:
            if (r1 == 0) goto L4d
            r5.m1255M(r0)
            goto L4d
        L72:
            r4.m1176j0()
            boolean r5 = r4.f2102B
            if (r5 == 0) goto L87
            androidx.fragment.app.a0<?> r5 = r4.f2130r
            if (r5 == 0) goto L87
            int r6 = r4.f2129q
            r0 = 7
            if (r6 != r0) goto L87
            r5.mo1091j()
            r4.f2102B = r1
        L87:
            return
    }

    /* renamed from: U */
    public void m1151U(androidx.fragment.app.ComponentCallbacksC0395n r17, int r18) {
            r16 = this;
            r0 = r16
            r7 = r17
            androidx.fragment.app.l0 r1 = r0.f2115c
            java.lang.String r2 = r7.f2281c0
            androidx.fragment.app.j0 r1 = r1.m1290z(r2)
            r8 = 1
            if (r1 != 0) goto L1a
            androidx.fragment.app.j0 r1 = new androidx.fragment.app.j0
            androidx.fragment.app.c0 r2 = r0.f2127o
            androidx.fragment.app.l0 r3 = r0.f2115c
            r1.<init>(r2, r3, r7)
            r1.f2204e = r8
        L1a:
            r9 = r1
            boolean r1 = r7.f2289k0
            r10 = 2
            if (r1 == 0) goto L2f
            boolean r1 = r7.f2290l0
            if (r1 == 0) goto L2f
            int r1 = r7.f2277Y
            if (r1 != r10) goto L2f
            r1 = r18
            int r1 = java.lang.Math.max(r1, r10)
            goto L31
        L2f:
            r1 = r18
        L31:
            int r2 = r9.m1207d()
            int r11 = java.lang.Math.min(r1, r2)
            int r1 = r7.f2277Y
            r12 = 3
            java.lang.String r13 = "FragmentManager"
            r2 = -1
            r3 = 5
            r4 = 4
            if (r1 > r11) goto L85
            if (r1 >= r11) goto L50
            java.util.Map<androidx.fragment.app.n, java.util.HashSet<j0.b>> r1 = r0.f2125m
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L50
            r16.m1163d(r17)
        L50:
            int r1 = r7.f2277Y
            if (r1 == r2) goto L60
            if (r1 == 0) goto L65
            if (r1 == r8) goto L6a
            if (r1 == r10) goto L74
            if (r1 == r4) goto L79
            if (r1 == r3) goto L7e
            goto L1ba
        L60:
            if (r11 <= r2) goto L65
            r9.m1206c()
        L65:
            if (r11 <= 0) goto L6a
            r9.m1208e()
        L6a:
            if (r11 <= r2) goto L6f
            r9.m1213j()
        L6f:
            if (r11 <= r8) goto L74
            r9.m1209f()
        L74:
            if (r11 <= r10) goto L79
            r9.m1204a()
        L79:
            if (r11 <= r4) goto L7e
            r9.m1219p()
        L7e:
            if (r11 <= r3) goto L1ba
            r9.m1217n()
            goto L1ba
        L85:
            if (r1 <= r11) goto L1ba
            if (r1 == 0) goto L1b3
            if (r1 == r8) goto L1a3
            if (r1 == r10) goto Lcf
            if (r1 == r4) goto La0
            if (r1 == r3) goto L9b
            r5 = 7
            if (r1 == r5) goto L96
            goto L1ba
        L96:
            if (r11 >= r5) goto L9b
            r9.m1215l()
        L9b:
            if (r11 >= r3) goto La0
            r9.m1220q()
        La0:
            if (r11 >= r4) goto Lcf
            boolean r1 = m1131O(r12)
            if (r1 == 0) goto Lbc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "movefrom ACTIVITY_CREATED: "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r13, r1)
        Lbc:
            android.view.View r1 = r7.f2260C0
            if (r1 == 0) goto Lcf
            androidx.fragment.app.a0<?> r1 = r0.f2130r
            boolean r1 = r1.mo1090i(r7)
            if (r1 == 0) goto Lcf
            android.util.SparseArray<android.os.Parcelable> r1 = r7.f2279a0
            if (r1 != 0) goto Lcf
            r9.m1218o()
        Lcf:
            if (r11 >= r10) goto L1a3
            r1 = 0
            android.view.View r3 = r7.f2260C0
            if (r3 == 0) goto L198
            android.view.ViewGroup r4 = r7.f2259B0
            if (r4 == 0) goto L198
            r4.endViewTransition(r3)
            android.view.View r3 = r7.f2260C0
            r3.clearAnimation()
            boolean r3 = r17.m1314R()
            if (r3 != 0) goto L198
            int r3 = r0.f2129q
            r4 = 0
            if (r3 <= r2) goto L10c
            boolean r2 = r0.f2105E
            if (r2 != 0) goto L10c
            android.view.View r2 = r7.f2260C0
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L10c
            float r2 = r7.f2265H0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L10c
            androidx.fragment.app.a0<?> r1 = r0.f2130r
            android.content.Context r1 = r1.f2034Z
            r2 = 0
            boolean r3 = r17.m1301E()
            androidx.fragment.app.w$a r1 = androidx.fragment.app.C0413w.m1398a(r1, r7, r2, r3)
        L10c:
            r7.f2265H0 = r4
            android.view.ViewGroup r14 = r7.f2259B0
            android.view.View r15 = r7.f2260C0
            if (r1 == 0) goto L166
            androidx.fragment.app.t0$a r2 = r0.f2126n
            r14.startViewTransition(r15)
            j0.b r6 = new j0.b
            r6.<init>()
            androidx.fragment.app.t r3 = new androidx.fragment.app.t
            r3.<init>(r7)
            r6.m7756b(r3)
            r5 = r2
            androidx.fragment.app.d0$d r5 = (androidx.fragment.app.AbstractC0375d0.d) r5
            r5.m1195b(r7, r6)
            android.view.animation.Animation r2 = r1.f2409a
            if (r2 == 0) goto L14a
            androidx.fragment.app.w$b r2 = new androidx.fragment.app.w$b
            android.view.animation.Animation r1 = r1.f2409a
            r2.<init>(r1, r14, r15)
            android.view.View r1 = r7.f2260C0
            r7.m1338u0(r1)
            androidx.fragment.app.u r1 = new androidx.fragment.app.u
            r1.<init>(r14, r7, r5, r6)
            r2.setAnimationListener(r1)
            android.view.View r1 = r7.f2260C0
            r1.startAnimation(r2)
            goto L166
        L14a:
            android.animation.Animator r4 = r1.f2410b
            r7.m1342w0(r4)
            androidx.fragment.app.v r3 = new androidx.fragment.app.v
            r1 = r3
            r2 = r14
            r12 = r3
            r3 = r15
            r8 = r4
            r4 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r8.addListener(r12)
            android.view.View r1 = r7.f2260C0
            r8.setTarget(r1)
            r8.start()
        L166:
            r14.removeView(r15)
            boolean r1 = m1131O(r10)
            if (r1 == 0) goto L193
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Removing view "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " for fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " from container "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r13, r1)
        L193:
            android.view.ViewGroup r1 = r7.f2259B0
            if (r14 == r1) goto L198
            return
        L198:
            java.util.Map<androidx.fragment.app.n, java.util.HashSet<j0.b>> r1 = r0.f2125m
            java.lang.Object r1 = r1.get(r7)
            if (r1 != 0) goto L1a3
            r9.m1211h()
        L1a3:
            r1 = 1
            if (r11 >= r1) goto L1b3
            java.util.Map<androidx.fragment.app.n, java.util.HashSet<j0.b>> r2 = r0.f2125m
            java.lang.Object r2 = r2.get(r7)
            if (r2 == 0) goto L1b0
            r8 = 1
            goto L1b4
        L1b0:
            r9.m1210g()
        L1b3:
            r8 = r11
        L1b4:
            if (r8 >= 0) goto L1b9
            r9.m1212i()
        L1b9:
            r11 = r8
        L1ba:
            int r1 = r7.f2277Y
            if (r1 == r11) goto L1ed
            r1 = 3
            boolean r1 = m1131O(r1)
            if (r1 == 0) goto L1eb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " not updated inline; expected state "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " found "
            r1.append(r2)
            int r2 = r7.f2277Y
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r13, r1)
        L1eb:
            r7.f2277Y = r11
        L1ed:
            return
    }

    /* renamed from: V */
    public void m1152V() {
            r2 = this;
            androidx.fragment.app.a0<?> r0 = r2.f2130r
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.f2103C = r0
            r2.f2104D = r0
            androidx.fragment.app.g0 r1 = r2.f2111K
            r1.f2178h = r0
            androidx.fragment.app.l0 r0 = r2.f2115c
            java.util.List r0 = r0.m1243A()
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.n r1 = (androidx.fragment.app.ComponentCallbacksC0395n) r1
            if (r1 == 0) goto L18
            androidx.fragment.app.d0 r1 = r1.f2296r0
            r1.m1152V()
            goto L18
        L2c:
            return
    }

    /* renamed from: W */
    public void m1153W(java.lang.String r3, int r4) {
            r2 = this;
            androidx.fragment.app.d0$o r0 = new androidx.fragment.app.d0$o
            r1 = -1
            r0.<init>(r2, r3, r1, r4)
            r3 = 0
            r2.m1132A(r0, r3)
            return
    }

    /* renamed from: X */
    public boolean m1154X() {
            r8 = this;
            r0 = 0
            r8.m1134C(r0)
            r0 = 1
            r8.m1133B(r0)
            androidx.fragment.app.n r1 = r8.f2133u
            if (r1 == 0) goto L17
            androidx.fragment.app.d0 r1 = r1.m1337u()
            boolean r1 = r1.m1154X()
            if (r1 == 0) goto L17
            goto L43
        L17:
            java.util.ArrayList<androidx.fragment.app.a> r3 = r8.f2107G
            java.util.ArrayList<java.lang.Boolean> r4 = r8.f2108H
            r5 = 0
            r6 = -1
            r7 = 0
            r2 = r8
            boolean r1 = r2.m1155Y(r3, r4, r5, r6, r7)
            if (r1 == 0) goto L37
            r8.f2114b = r0
            java.util.ArrayList<androidx.fragment.app.a> r0 = r8.f2107G     // Catch: java.lang.Throwable -> L32
            java.util.ArrayList<java.lang.Boolean> r2 = r8.f2108H     // Catch: java.lang.Throwable -> L32
            r8.m1158a0(r0, r2)     // Catch: java.lang.Throwable -> L32
            r8.m1165e()
            goto L37
        L32:
            r0 = move-exception
            r8.m1165e()
            throw r0
        L37:
            r8.m1178k0()
            r8.m1191x()
            androidx.fragment.app.l0 r0 = r8.f2115c
            r0.m1275j()
            r0 = r1
        L43:
            return r0
    }

    /* renamed from: Y */
    public boolean m1155Y(java.util.ArrayList<androidx.fragment.app.C0365a> r6, java.util.ArrayList<java.lang.Boolean> r7, java.lang.String r8, int r9, int r10) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.a> r0 = r5.f2116d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 1
            if (r8 != 0) goto L27
            if (r9 >= 0) goto L27
            r3 = r10 & 1
            if (r3 != 0) goto L27
            int r8 = r0.size()
            int r8 = r8 - r2
            if (r8 >= 0) goto L17
            return r1
        L17:
            java.util.ArrayList<androidx.fragment.app.a> r9 = r5.f2116d
            java.lang.Object r8 = r9.remove(r8)
            r6.add(r8)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7.add(r6)
            goto L9a
        L27:
            if (r8 != 0) goto L2e
            if (r9 < 0) goto L2c
            goto L2e
        L2c:
            r8 = -1
            goto L76
        L2e:
            int r0 = r0.size()
            int r0 = r0 - r2
        L33:
            if (r0 < 0) goto L52
            java.util.ArrayList<androidx.fragment.app.a> r3 = r5.f2116d
            java.lang.Object r3 = r3.get(r0)
            androidx.fragment.app.a r3 = (androidx.fragment.app.C0365a) r3
            if (r8 == 0) goto L48
            java.lang.String r4 = r3.f2241i
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L48
            goto L52
        L48:
            if (r9 < 0) goto L4f
            int r3 = r3.f2032s
            if (r9 != r3) goto L4f
            goto L52
        L4f:
            int r0 = r0 + (-1)
            goto L33
        L52:
            if (r0 >= 0) goto L55
            return r1
        L55:
            r10 = r10 & r2
            if (r10 == 0) goto L75
        L58:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L75
            java.util.ArrayList<androidx.fragment.app.a> r10 = r5.f2116d
            java.lang.Object r10 = r10.get(r0)
            androidx.fragment.app.a r10 = (androidx.fragment.app.C0365a) r10
            if (r8 == 0) goto L6e
            java.lang.String r3 = r10.f2241i
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L58
        L6e:
            if (r9 < 0) goto L75
            int r10 = r10.f2032s
            if (r9 != r10) goto L75
            goto L58
        L75:
            r8 = r0
        L76:
            java.util.ArrayList<androidx.fragment.app.a> r9 = r5.f2116d
            int r9 = r9.size()
            int r9 = r9 - r2
            if (r8 != r9) goto L80
            return r1
        L80:
            java.util.ArrayList<androidx.fragment.app.a> r9 = r5.f2116d
            int r9 = r9.size()
            int r9 = r9 - r2
        L87:
            if (r9 <= r8) goto L9a
            java.util.ArrayList<androidx.fragment.app.a> r10 = r5.f2116d
            java.lang.Object r10 = r10.remove(r9)
            r6.add(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r7.add(r10)
            int r9 = r9 + (-1)
            goto L87
        L9a:
            return r2
    }

    /* renamed from: Z */
    public void m1156Z(androidx.fragment.app.ComponentCallbacksC0395n r4) {
            r3 = this;
            r0 = 2
            boolean r0 = m1131O(r0)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "remove: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " nesting="
            r0.append(r1)
            int r1 = r4.f2293o0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L27:
            boolean r0 = r4.m1312P()
            r1 = 1
            r0 = r0 ^ r1
            boolean r2 = r4.f2302x0
            if (r2 == 0) goto L33
            if (r0 == 0) goto L45
        L33:
            androidx.fragment.app.l0 r0 = r3.f2115c
            r0.m1266X(r4)
            boolean r0 = r3.m1146P(r4)
            if (r0 == 0) goto L40
            r3.f2102B = r1
        L40:
            r4.f2288j0 = r1
            r3.m1172h0(r4)
        L45:
            return
    }

    /* renamed from: a */
    public androidx.fragment.app.C0388j0 m1157a(androidx.fragment.app.ComponentCallbacksC0395n r4) {
            r3 = this;
            r0 = 2
            boolean r0 = m1131O(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            androidx.fragment.app.j0 r0 = r3.m1171h(r4)
            r4.f2294p0 = r3
            androidx.fragment.app.l0 r1 = r3.f2115c
            r1.m1254L(r0)
            boolean r1 = r4.f2302x0
            if (r1 != 0) goto L43
            androidx.fragment.app.l0 r1 = r3.f2115c
            r1.m1271f(r4)
            r1 = 0
            r4.f2288j0 = r1
            android.view.View r2 = r4.f2260C0
            if (r2 != 0) goto L3a
            r4.f2264G0 = r1
        L3a:
            boolean r4 = r3.m1146P(r4)
            if (r4 == 0) goto L43
            r4 = 1
            r3.f2102B = r4
        L43:
            return r0
    }

    /* renamed from: a0 */
    public final void m1158a0(java.util.ArrayList<androidx.fragment.app.C0365a> r5, java.util.ArrayList<java.lang.Boolean> r6) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r5.size()
            int r1 = r6.size()
            if (r0 != r1) goto L62
            r4.m1137F(r5, r6)
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        L1a:
            if (r1 >= r0) goto L5c
            java.lang.Object r3 = r5.get(r1)
            androidx.fragment.app.a r3 = (androidx.fragment.app.C0365a) r3
            boolean r3 = r3.f2248p
            if (r3 != 0) goto L59
            if (r2 == r1) goto L2b
            r4.m1136E(r5, r6, r2, r1)
        L2b:
            int r2 = r1 + 1
            java.lang.Object r3 = r6.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L54
        L39:
            if (r2 >= r0) goto L54
            java.lang.Object r3 = r6.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r5.get(r2)
            androidx.fragment.app.a r3 = (androidx.fragment.app.C0365a) r3
            boolean r3 = r3.f2248p
            if (r3 != 0) goto L54
            int r2 = r2 + 1
            goto L39
        L54:
            r4.m1136E(r5, r6, r1, r2)
            int r1 = r2 + (-1)
        L59:
            int r1 = r1 + 1
            goto L1a
        L5c:
            if (r2 == r0) goto L61
            r4.m1136E(r5, r6, r2, r0)
        L61:
            return
        L62:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Internal error with the back stack records"
            r5.<init>(r6)
            throw r5
    }

    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: b */
    public void m1159b(androidx.fragment.app.AbstractC0366a0<?> r5, androidx.fragment.app.AbstractC0415x r6, androidx.fragment.app.ComponentCallbacksC0395n r7) {
            r4 = this;
            androidx.fragment.app.a0<?> r0 = r4.f2130r
            if (r0 != 0) goto L138
            r4.f2130r = r5
            r4.f2131s = r6
            r4.f2132t = r7
            if (r7 == 0) goto L12
            androidx.fragment.app.d0$h r6 = new androidx.fragment.app.d0$h
            r6.<init>(r4, r7)
            goto L19
        L12:
            boolean r6 = r5 instanceof androidx.fragment.app.InterfaceC0384h0
            if (r6 == 0) goto L1e
            r6 = r5
            androidx.fragment.app.h0 r6 = (androidx.fragment.app.InterfaceC0384h0) r6
        L19:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.h0> r0 = r4.f2128p
            r0.add(r6)
        L1e:
            androidx.fragment.app.n r6 = r4.f2132t
            if (r6 == 0) goto L25
            r4.m1178k0()
        L25:
            boolean r6 = r5 instanceof androidx.activity.InterfaceC0187c
            if (r6 == 0) goto L3a
            r6 = r5
            androidx.activity.c r6 = (androidx.activity.InterfaceC0187c) r6
            androidx.activity.OnBackPressedDispatcher r0 = r6.mo429e()
            r4.f2119g = r0
            if (r7 == 0) goto L35
            r6 = r7
        L35:
            androidx.activity.b r1 = r4.f2120h
            r0.m437a(r6, r1)
        L3a:
            if (r7 == 0) goto L5d
            androidx.fragment.app.d0 r5 = r7.f2294p0
            androidx.fragment.app.g0 r5 = r5.f2111K
            java.util.HashMap<java.lang.String, androidx.fragment.app.g0> r6 = r5.f2174d
            java.lang.String r0 = r7.f2281c0
            java.lang.Object r6 = r6.get(r0)
            androidx.fragment.app.g0 r6 = (androidx.fragment.app.C0382g0) r6
            if (r6 != 0) goto L5a
            androidx.fragment.app.g0 r6 = new androidx.fragment.app.g0
            boolean r0 = r5.f2176f
            r6.<init>(r0)
            java.util.HashMap<java.lang.String, androidx.fragment.app.g0> r5 = r5.f2174d
            java.lang.String r0 = r7.f2281c0
            r5.put(r0, r6)
        L5a:
            r4.f2111K = r6
            goto Lc3
        L5d:
            boolean r6 = r5 instanceof androidx.lifecycle.InterfaceC0469t0
            if (r6 == 0) goto Lbb
            androidx.lifecycle.t0 r5 = (androidx.lifecycle.InterfaceC0469t0) r5
            androidx.lifecycle.s0 r5 = r5.mo432o()
            androidx.lifecycle.p0 r6 = androidx.fragment.app.C0382g0.f2172i
            java.lang.Class<androidx.fragment.app.g0> r0 = androidx.fragment.app.C0382g0.class
            java.lang.String r1 = r0.getCanonicalName()
            if (r1 == 0) goto Lb3
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r1 = p064e.C1493g.m4049a(r2, r1)
            java.util.HashMap<java.lang.String, androidx.lifecycle.n0> r2 = r5.f2562a
            java.lang.Object r2 = r2.get(r1)
            androidx.lifecycle.n0 r2 = (androidx.lifecycle.AbstractC0457n0) r2
            boolean r3 = r0.isInstance(r2)
            if (r3 == 0) goto L8f
            boolean r5 = r6 instanceof androidx.lifecycle.C0465r0
            if (r5 == 0) goto Lae
            androidx.lifecycle.r0 r6 = (androidx.lifecycle.C0465r0) r6
            r6.mo1425b(r2)
            goto Lae
        L8f:
            boolean r2 = r6 instanceof androidx.lifecycle.AbstractC0463q0
            if (r2 == 0) goto L9a
            androidx.lifecycle.q0 r6 = (androidx.lifecycle.AbstractC0463q0) r6
            androidx.lifecycle.n0 r6 = r6.mo1426c(r1, r0)
            goto La0
        L9a:
            androidx.fragment.app.g0$a r6 = (androidx.fragment.app.C0382g0.a) r6
            androidx.lifecycle.n0 r6 = r6.mo9a(r0)
        La0:
            r2 = r6
            java.util.HashMap<java.lang.String, androidx.lifecycle.n0> r5 = r5.f2562a
            java.lang.Object r5 = r5.put(r1, r2)
            androidx.lifecycle.n0 r5 = (androidx.lifecycle.AbstractC0457n0) r5
            if (r5 == 0) goto Lae
            r5.mo8b()
        Lae:
            androidx.fragment.app.g0 r2 = (androidx.fragment.app.C0382g0) r2
            r4.f2111K = r2
            goto Lc3
        Lb3:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            r5.<init>(r6)
            throw r5
        Lbb:
            androidx.fragment.app.g0 r5 = new androidx.fragment.app.g0
            r6 = 0
            r5.<init>(r6)
            r4.f2111K = r5
        Lc3:
            androidx.fragment.app.g0 r5 = r4.f2111K
            boolean r6 = r4.m1149S()
            r5.f2178h = r6
            androidx.fragment.app.l0 r5 = r4.f2115c
            androidx.fragment.app.g0 r6 = r4.f2111K
            r5.f2232b0 = r6
            androidx.fragment.app.a0<?> r5 = r4.f2130r
            boolean r6 = r5 instanceof androidx.activity.result.InterfaceC0197e
            if (r6 == 0) goto L137
            androidx.activity.result.e r5 = (androidx.activity.result.InterfaceC0197e) r5
            androidx.activity.result.ActivityResultRegistry r5 = r5.mo431m()
            if (r7 == 0) goto Led
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.f2281c0
            java.lang.String r0 = ":"
            java.lang.String r6 = p346u.C6269n.m12888a(r6, r7, r0)
            goto Lef
        Led:
            java.lang.String r6 = ""
        Lef:
            java.lang.String r7 = "FragmentManager:"
            java.lang.String r6 = p064e.C1493g.m4049a(r7, r6)
            java.lang.String r7 = "StartActivityForResult"
            java.lang.String r7 = p064e.C1493g.m4049a(r6, r7)
            d.d r0 = new d.d
            r0.<init>()
            androidx.fragment.app.d0$i r1 = new androidx.fragment.app.d0$i
            r1.<init>(r4)
            androidx.activity.result.c r7 = r5.m443d(r7, r0, r1)
            r4.f2136x = r7
            java.lang.String r7 = "StartIntentSenderForResult"
            java.lang.String r7 = p064e.C1493g.m4049a(r6, r7)
            androidx.fragment.app.d0$k r0 = new androidx.fragment.app.d0$k
            r0.<init>()
            androidx.fragment.app.d0$a r1 = new androidx.fragment.app.d0$a
            r1.<init>(r4)
            androidx.activity.result.c r7 = r5.m443d(r7, r0, r1)
            r4.f2137y = r7
            java.lang.String r7 = "RequestPermissions"
            java.lang.String r6 = p064e.C1493g.m4049a(r6, r7)
            d.b r7 = new d.b
            r7.<init>()
            androidx.fragment.app.d0$b r0 = new androidx.fragment.app.d0$b
            r0.<init>(r4)
            androidx.activity.result.c r5 = r5.m443d(r6, r7, r0)
            r4.f2138z = r5
        L137:
            return
        L138:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: b0 */
    public void m1160b0(android.os.Parcelable r19) {
            r18 = this;
            r0 = r18
            if (r19 != 0) goto L5
            return
        L5:
            r1 = r19
            androidx.fragment.app.f0 r1 = (androidx.fragment.app.C0380f0) r1
            java.util.ArrayList<androidx.fragment.app.i0> r2 = r1.f2161Y
            if (r2 != 0) goto Le
            return
        Le:
            androidx.fragment.app.l0 r2 = r0.f2115c
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r2 = r2.f2231a0
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.clear()
            java.util.ArrayList<androidx.fragment.app.i0> r2 = r1.f2161Y
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "): "
            r5 = 2
            java.lang.String r6 = "FragmentManager"
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r2.next()
            r12 = r3
            androidx.fragment.app.i0 r12 = (androidx.fragment.app.C0386i0) r12
            if (r12 == 0) goto L1d
            androidx.fragment.app.g0 r3 = r0.f2111K
            java.lang.String r7 = r12.f2187Z
            java.util.HashMap<java.lang.String, androidx.fragment.app.n> r3 = r3.f2173c
            java.lang.Object r3 = r3.get(r7)
            androidx.fragment.app.n r3 = (androidx.fragment.app.ComponentCallbacksC0395n) r3
            if (r3 == 0) goto L63
            boolean r7 = m1131O(r5)
            if (r7 == 0) goto L59
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "restoreSaveState: re-attaching retained "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r6, r7)
        L59:
            androidx.fragment.app.j0 r7 = new androidx.fragment.app.j0
            androidx.fragment.app.c0 r8 = r0.f2127o
            androidx.fragment.app.l0 r9 = r0.f2115c
            r7.<init>(r8, r9, r3, r12)
            goto L79
        L63:
            androidx.fragment.app.j0 r3 = new androidx.fragment.app.j0
            androidx.fragment.app.c0 r8 = r0.f2127o
            androidx.fragment.app.l0 r9 = r0.f2115c
            androidx.fragment.app.a0<?> r7 = r0.f2130r
            android.content.Context r7 = r7.f2034Z
            java.lang.ClassLoader r10 = r7.getClassLoader()
            androidx.fragment.app.z r11 = r18.m1142K()
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12)
        L79:
            androidx.fragment.app.n r3 = r7.f2202c
            r3.f2294p0 = r0
            boolean r5 = m1131O(r5)
            if (r5 == 0) goto L9b
            java.lang.String r5 = "restoreSaveState: active ("
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            java.lang.String r8 = r3.f2281c0
            r5.append(r8)
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.v(r6, r3)
        L9b:
            androidx.fragment.app.a0<?> r3 = r0.f2130r
            android.content.Context r3 = r3.f2034Z
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r7.m1216m(r3)
            androidx.fragment.app.l0 r3 = r0.f2115c
            r3.m1254L(r7)
            int r3 = r0.f2129q
            r7.f2204e = r3
            goto L1d
        Lb1:
            androidx.fragment.app.g0 r2 = r0.f2111K
            java.util.Objects.requireNonNull(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.n> r2 = r2.f2173c
            java.util.Collection r2 = r2.values()
            r3.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        Lc5:
            boolean r3 = r2.hasNext()
            r7 = 1
            if (r3 == 0) goto L11b
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.n r3 = (androidx.fragment.app.ComponentCallbacksC0395n) r3
            androidx.fragment.app.l0 r8 = r0.f2115c
            java.lang.String r9 = r3.f2281c0
            boolean r8 = r8.m1276k(r9)
            if (r8 != 0) goto Lc5
            boolean r8 = m1131O(r5)
            if (r8 == 0) goto L100
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Discarding retained Fragment "
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = " that was not found in the set of active Fragments "
            r8.append(r9)
            java.util.ArrayList<androidx.fragment.app.i0> r9 = r1.f2161Y
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r6, r8)
        L100:
            androidx.fragment.app.g0 r8 = r0.f2111K
            r8.m1202d(r3)
            r3.f2294p0 = r0
            androidx.fragment.app.j0 r8 = new androidx.fragment.app.j0
            androidx.fragment.app.c0 r9 = r0.f2127o
            androidx.fragment.app.l0 r10 = r0.f2115c
            r8.<init>(r9, r10, r3)
            r8.f2204e = r7
            r8.m1214k()
            r3.f2288j0 = r7
            r8.m1214k()
            goto Lc5
        L11b:
            androidx.fragment.app.l0 r2 = r0.f2115c
            java.util.ArrayList<java.lang.String> r3 = r1.f2162Z
            java.util.ArrayList<androidx.fragment.app.n> r8 = r2.f2230Z
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.clear()
            if (r3 == 0) goto L170
            java.util.Iterator r3 = r3.iterator()
        L12c:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L170
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            androidx.fragment.app.n r9 = r2.m1285u(r8)
            if (r9 == 0) goto L162
            boolean r10 = m1131O(r5)
            if (r10 == 0) goto L15e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "restoreSaveState: added ("
            r10.append(r11)
            r10.append(r8)
            r10.append(r4)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
            android.util.Log.v(r6, r8)
        L15e:
            r2.m1271f(r9)
            goto L12c
        L162:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No instantiated fragment for ("
            java.lang.String r3 = ")"
            java.lang.String r2 = android.support.v4.media.C0145d.m257a(r2, r8, r3)
            r1.<init>(r2)
            throw r1
        L170:
            androidx.fragment.app.b[] r2 = r1.f2163a0
            r3 = 0
            if (r2 == 0) goto L28e
            java.util.ArrayList r2 = new java.util.ArrayList
            androidx.fragment.app.b[] r8 = r1.f2163a0
            int r8 = r8.length
            r2.<init>(r8)
            r0.f2116d = r2
            r2 = 0
        L180:
            androidx.fragment.app.b[] r8 = r1.f2163a0
            int r9 = r8.length
            if (r2 >= r9) goto L291
            r8 = r8[r2]
            java.util.Objects.requireNonNull(r8)
            androidx.fragment.app.a r9 = new androidx.fragment.app.a
            r9.<init>(r0)
            r10 = 0
            r11 = 0
        L191:
            int[] r12 = r8.f2039Y
            int r13 = r12.length
            if (r10 >= r13) goto L226
            androidx.fragment.app.m0$a r13 = new androidx.fragment.app.m0$a
            r13.<init>()
            int r14 = r10 + 1
            r10 = r12[r10]
            r13.f2249a = r10
            boolean r10 = m1131O(r5)
            if (r10 == 0) goto L1cf
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "Instantiate "
            r10.append(r12)
            r10.append(r9)
            java.lang.String r12 = " op #"
            r10.append(r12)
            r10.append(r11)
            java.lang.String r12 = " base fragment #"
            r10.append(r12)
            int[] r12 = r8.f2039Y
            r12 = r12[r14]
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r6, r10)
        L1cf:
            java.util.ArrayList<java.lang.String> r10 = r8.f2040Z
            java.lang.Object r10 = r10.get(r11)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L1e0
            androidx.fragment.app.l0 r12 = r0.f2115c
            androidx.fragment.app.n r10 = r12.m1285u(r10)
            goto L1e1
        L1e0:
            r10 = 0
        L1e1:
            r13.f2250b = r10
            androidx.lifecycle.o$c[] r10 = androidx.lifecycle.AbstractC0458o.c.values()
            int[] r12 = r8.f2041a0
            r12 = r12[r11]
            r10 = r10[r12]
            r13.f2255g = r10
            androidx.lifecycle.o$c[] r10 = androidx.lifecycle.AbstractC0458o.c.values()
            int[] r12 = r8.f2042b0
            r12 = r12[r11]
            r10 = r10[r12]
            r13.f2256h = r10
            int[] r10 = r8.f2039Y
            int r12 = r14 + 1
            r14 = r10[r14]
            r13.f2251c = r14
            int r15 = r12 + 1
            r12 = r10[r12]
            r13.f2252d = r12
            int r16 = r15 + 1
            r15 = r10[r15]
            r13.f2253e = r15
            int r17 = r16 + 1
            r10 = r10[r16]
            r13.f2254f = r10
            r9.f2234b = r14
            r9.f2235c = r12
            r9.f2236d = r15
            r9.f2237e = r10
            r9.m1292c(r13)
            int r11 = r11 + 1
            r10 = r17
            goto L191
        L226:
            int r10 = r8.f2043c0
            r9.f2238f = r10
            java.lang.String r10 = r8.f2044d0
            r9.f2241i = r10
            int r10 = r8.f2045e0
            r9.f2032s = r10
            r9.f2239g = r7
            int r10 = r8.f2046f0
            r9.f2242j = r10
            java.lang.CharSequence r10 = r8.f2047g0
            r9.f2243k = r10
            int r10 = r8.f2048h0
            r9.f2244l = r10
            java.lang.CharSequence r10 = r8.f2049i0
            r9.f2245m = r10
            java.util.ArrayList<java.lang.String> r10 = r8.f2050j0
            r9.f2246n = r10
            java.util.ArrayList<java.lang.String> r10 = r8.f2051k0
            r9.f2247o = r10
            boolean r8 = r8.f2052l0
            r9.f2248p = r8
            r9.m1076f(r7)
            boolean r8 = m1131O(r5)
            if (r8 == 0) goto L285
            java.lang.String r8 = "restoreAllState: back stack #"
            java.lang.String r10 = " (index "
            java.lang.StringBuilder r8 = androidx.appcompat.widget.C0300r0.m777a(r8, r2, r10)
            int r10 = r9.f2032s
            r8.append(r10)
            r8.append(r4)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r6, r8)
            androidx.fragment.app.a1 r8 = new androidx.fragment.app.a1
            r8.<init>(r6)
            java.io.PrintWriter r10 = new java.io.PrintWriter
            r10.<init>(r8)
            java.lang.String r8 = "  "
            r9.m1082l(r8, r10, r3)
            r10.close()
        L285:
            java.util.ArrayList<androidx.fragment.app.a> r8 = r0.f2116d
            r8.add(r9)
            int r2 = r2 + 1
            goto L180
        L28e:
            r2 = 0
            r0.f2116d = r2
        L291:
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f2121i
            int r4 = r1.f2164b0
            r2.set(r4)
            java.lang.String r2 = r1.f2165c0
            if (r2 == 0) goto L2a5
            androidx.fragment.app.n r2 = r0.m1138G(r2)
            r0.f2133u = r2
            r0.m1187t(r2)
        L2a5:
            java.util.ArrayList<java.lang.String> r2 = r1.f2166d0
            if (r2 == 0) goto L2ce
        L2a9:
            int r4 = r2.size()
            if (r3 >= r4) goto L2ce
            java.util.ArrayList<android.os.Bundle> r4 = r1.f2167e0
            java.lang.Object r4 = r4.get(r3)
            android.os.Bundle r4 = (android.os.Bundle) r4
            androidx.fragment.app.a0<?> r5 = r0.f2130r
            android.content.Context r5 = r5.f2034Z
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r4.setClassLoader(r5)
            java.util.Map<java.lang.String, android.os.Bundle> r5 = r0.f2122j
            java.lang.Object r6 = r2.get(r3)
            r5.put(r6, r4)
            int r3 = r3 + 1
            goto L2a9
        L2ce:
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            java.util.ArrayList<androidx.fragment.app.d0$l> r1 = r1.f2168f0
            r2.<init>(r1)
            r0.f2101A = r2
            return
    }

    /* renamed from: c */
    public void m1161c(androidx.fragment.app.ComponentCallbacksC0395n r5) {
            r4 = this;
            r0 = 2
            boolean r1 = m1131O(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "attach: "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1d:
            boolean r1 = r5.f2302x0
            if (r1 == 0) goto L50
            r1 = 0
            r5.f2302x0 = r1
            boolean r1 = r5.f2287i0
            if (r1 != 0) goto L50
            androidx.fragment.app.l0 r1 = r4.f2115c
            r1.m1271f(r5)
            boolean r0 = m1131O(r0)
            if (r0 == 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add from attach: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L47:
            boolean r5 = r4.m1146P(r5)
            if (r5 == 0) goto L50
            r5 = 1
            r4.f2102B = r5
        L50:
            return
    }

    /* renamed from: c0 */
    public android.os.Parcelable m1162c0() {
            r11 = this;
            java.util.Set r0 = r11.m1167f()
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b1 r1 = (androidx.fragment.app.AbstractC0370b1) r1
            boolean r3 = r1.f2060e
            if (r3 == 0) goto La
            r1.f2060e = r2
            r1.m1097c()
            goto La
        L21:
            r11.m1193z()
            r0 = 1
            r11.m1134C(r0)
            r11.f2103C = r0
            androidx.fragment.app.g0 r1 = r11.f2111K
            r1.f2178h = r0
            androidx.fragment.app.l0 r0 = r11.f2115c
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r3 = r0.f2231a0
            java.util.HashMap r3 = (java.util.HashMap) r3
            int r3 = r3.size()
            r1.<init>(r3)
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r0.f2231a0
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r3 = r0.hasNext()
            r4 = 0
            r5 = 2
            if (r3 == 0) goto L13d
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.j0 r3 = (androidx.fragment.app.C0388j0) r3
            if (r3 == 0) goto L4c
            androidx.fragment.app.n r6 = r3.f2202c
            androidx.fragment.app.i0 r7 = new androidx.fragment.app.i0
            r7.<init>(r6)
            androidx.fragment.app.n r8 = r3.f2202c
            int r9 = r8.f2277Y
            r10 = -1
            if (r9 <= r10) goto L10e
            android.os.Bundle r9 = r7.f2198k0
            if (r9 != 0) goto L10e
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            androidx.fragment.app.n r9 = r3.f2202c
            r9.mo1234f0(r8)
            androidx.savedstate.b r10 = r9.f2273P0
            r10.m2157b(r8)
            androidx.fragment.app.d0 r9 = r9.f2296r0
            android.os.Parcelable r9 = r9.m1162c0()
            if (r9 == 0) goto L8a
            java.lang.String r10 = "android:support:fragments"
            r8.putParcelable(r10, r9)
        L8a:
            androidx.fragment.app.c0 r9 = r3.f2200a
            androidx.fragment.app.n r10 = r3.f2202c
            r9.m1126j(r10, r8, r2)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L98
            goto L99
        L98:
            r4 = r8
        L99:
            androidx.fragment.app.n r8 = r3.f2202c
            android.view.View r8 = r8.f2260C0
            if (r8 == 0) goto La2
            r3.m1218o()
        La2:
            androidx.fragment.app.n r8 = r3.f2202c
            android.util.SparseArray<android.os.Parcelable> r8 = r8.f2279a0
            if (r8 == 0) goto Lb8
            if (r4 != 0) goto Laf
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        Laf:
            androidx.fragment.app.n r8 = r3.f2202c
            android.util.SparseArray<android.os.Parcelable> r8 = r8.f2279a0
            java.lang.String r9 = "android:view_state"
            r4.putSparseParcelableArray(r9, r8)
        Lb8:
            androidx.fragment.app.n r8 = r3.f2202c
            android.os.Bundle r8 = r8.f2280b0
            if (r8 == 0) goto Lce
            if (r4 != 0) goto Lc5
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        Lc5:
            androidx.fragment.app.n r8 = r3.f2202c
            android.os.Bundle r8 = r8.f2280b0
            java.lang.String r9 = "android:view_registry_state"
            r4.putBundle(r9, r8)
        Lce:
            androidx.fragment.app.n r8 = r3.f2202c
            boolean r8 = r8.f2262E0
            if (r8 != 0) goto Le4
            if (r4 != 0) goto Ldb
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        Ldb:
            androidx.fragment.app.n r8 = r3.f2202c
            boolean r8 = r8.f2262E0
            java.lang.String r9 = "android:user_visible_hint"
            r4.putBoolean(r9, r8)
        Le4:
            r7.f2198k0 = r4
            androidx.fragment.app.n r8 = r3.f2202c
            java.lang.String r8 = r8.f2284f0
            if (r8 == 0) goto L112
            if (r4 != 0) goto Lf5
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r7.f2198k0 = r4
        Lf5:
            android.os.Bundle r4 = r7.f2198k0
            androidx.fragment.app.n r8 = r3.f2202c
            java.lang.String r8 = r8.f2284f0
            java.lang.String r9 = "android:target_state"
            r4.putString(r9, r8)
            androidx.fragment.app.n r3 = r3.f2202c
            int r3 = r3.f2285g0
            if (r3 == 0) goto L112
            android.os.Bundle r4 = r7.f2198k0
            java.lang.String r8 = "android:target_req_state"
            r4.putInt(r8, r3)
            goto L112
        L10e:
            android.os.Bundle r3 = r8.f2278Z
            r7.f2198k0 = r3
        L112:
            r1.add(r7)
            boolean r3 = m1131O(r5)
            if (r3 == 0) goto L4c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Saved state of "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = ": "
            r3.append(r4)
            android.os.Bundle r4 = r7.f2198k0
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
            goto L4c
        L13d:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L151
            boolean r0 = m1131O(r5)
            if (r0 == 0) goto L150
            java.lang.String r0 = "FragmentManager"
            java.lang.String r1 = "saveAllState: no fragments!"
            android.util.Log.v(r0, r1)
        L150:
            return r4
        L151:
            androidx.fragment.app.l0 r0 = r11.f2115c
            java.util.ArrayList<androidx.fragment.app.n> r3 = r0.f2230Z
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            monitor-enter(r3)
            java.util.ArrayList<androidx.fragment.app.n> r6 = r0.f2230Z     // Catch: java.lang.Throwable -> L22e
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L22e
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L22e
            if (r6 == 0) goto L165
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22e
            r6 = r4
            goto L1b3
        L165:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22e
            java.util.ArrayList<androidx.fragment.app.n> r7 = r0.f2230Z     // Catch: java.lang.Throwable -> L22e
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> L22e
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L22e
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L22e
            java.util.ArrayList<androidx.fragment.app.n> r0 = r0.f2230Z     // Catch: java.lang.Throwable -> L22e
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L22e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L22e
        L17a:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L22e
            if (r7 == 0) goto L1b2
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L22e
            androidx.fragment.app.n r7 = (androidx.fragment.app.ComponentCallbacksC0395n) r7     // Catch: java.lang.Throwable -> L22e
            java.lang.String r8 = r7.f2281c0     // Catch: java.lang.Throwable -> L22e
            r6.add(r8)     // Catch: java.lang.Throwable -> L22e
            boolean r8 = m1131O(r5)     // Catch: java.lang.Throwable -> L22e
            if (r8 == 0) goto L17a
            java.lang.String r8 = "FragmentManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22e
            r9.<init>()     // Catch: java.lang.Throwable -> L22e
            java.lang.String r10 = "saveAllState: adding fragment ("
            r9.append(r10)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r10 = r7.f2281c0     // Catch: java.lang.Throwable -> L22e
            r9.append(r10)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r10 = "): "
            r9.append(r10)     // Catch: java.lang.Throwable -> L22e
            r9.append(r7)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L22e
            android.util.Log.v(r8, r7)     // Catch: java.lang.Throwable -> L22e
            goto L17a
        L1b2:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22e
        L1b3:
            java.util.ArrayList<androidx.fragment.app.a> r0 = r11.f2116d
            if (r0 == 0) goto L1f3
            int r0 = r0.size()
            if (r0 <= 0) goto L1f3
            androidx.fragment.app.b[] r4 = new androidx.fragment.app.C0368b[r0]
        L1bf:
            if (r2 >= r0) goto L1f3
            androidx.fragment.app.b r3 = new androidx.fragment.app.b
            java.util.ArrayList<androidx.fragment.app.a> r7 = r11.f2116d
            java.lang.Object r7 = r7.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.C0365a) r7
            r3.<init>(r7)
            r4[r2] = r3
            boolean r3 = m1131O(r5)
            if (r3 == 0) goto L1f0
            java.lang.String r3 = "FragmentManager"
            java.lang.String r7 = "saveAllState: adding back stack #"
            java.lang.String r8 = ": "
            java.lang.StringBuilder r7 = androidx.appcompat.widget.C0300r0.m777a(r7, r2, r8)
            java.util.ArrayList<androidx.fragment.app.a> r8 = r11.f2116d
            java.lang.Object r8 = r8.get(r2)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r3, r7)
        L1f0:
            int r2 = r2 + 1
            goto L1bf
        L1f3:
            androidx.fragment.app.f0 r0 = new androidx.fragment.app.f0
            r0.<init>()
            r0.f2161Y = r1
            r0.f2162Z = r6
            r0.f2163a0 = r4
            java.util.concurrent.atomic.AtomicInteger r1 = r11.f2121i
            int r1 = r1.get()
            r0.f2164b0 = r1
            androidx.fragment.app.n r1 = r11.f2133u
            if (r1 == 0) goto L20e
            java.lang.String r1 = r1.f2281c0
            r0.f2165c0 = r1
        L20e:
            java.util.ArrayList<java.lang.String> r1 = r0.f2166d0
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r11.f2122j
            java.util.Set r2 = r2.keySet()
            r1.addAll(r2)
            java.util.ArrayList<android.os.Bundle> r1 = r0.f2167e0
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r11.f2122j
            java.util.Collection r2 = r2.values()
            r1.addAll(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayDeque<androidx.fragment.app.d0$l> r2 = r11.f2101A
            r1.<init>(r2)
            r0.f2168f0 = r1
            return r0
        L22e:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22e
            throw r0
    }

    /* renamed from: d */
    public final void m1163d(androidx.fragment.app.ComponentCallbacksC0395n r4) {
            r3 = this;
            java.util.Map<androidx.fragment.app.n, java.util.HashSet<j0.b>> r0 = r3.f2125m
            java.lang.Object r0 = r0.get(r4)
            java.util.HashSet r0 = (java.util.HashSet) r0
            if (r0 == 0) goto L29
            java.util.Iterator r1 = r0.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            j0.b r2 = (p158j0.C3380b) r2
            r2.m7755a()
            goto Le
        L1e:
            r0.clear()
            r3.m1173i(r4)
            java.util.Map<androidx.fragment.app.n, java.util.HashSet<j0.b>> r0 = r3.f2125m
            r0.remove(r4)
        L29:
            return
    }

    /* renamed from: d0 */
    public void m1164d0() {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.d0$n> r0 = r5.f2113a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.d0$p> r1 = r5.f2110J     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L11
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            java.util.ArrayList<androidx.fragment.app.d0$n> r4 = r5.f2113a     // Catch: java.lang.Throwable -> L36
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L36
            if (r4 != r3) goto L1b
            r2 = 1
        L1b:
            if (r1 != 0) goto L1f
            if (r2 == 0) goto L34
        L1f:
            androidx.fragment.app.a0<?> r1 = r5.f2130r     // Catch: java.lang.Throwable -> L36
            android.os.Handler r1 = r1.f2035a0     // Catch: java.lang.Throwable -> L36
            java.lang.Runnable r2 = r5.f2112L     // Catch: java.lang.Throwable -> L36
            r1.removeCallbacks(r2)     // Catch: java.lang.Throwable -> L36
            androidx.fragment.app.a0<?> r1 = r5.f2130r     // Catch: java.lang.Throwable -> L36
            android.os.Handler r1 = r1.f2035a0     // Catch: java.lang.Throwable -> L36
            java.lang.Runnable r2 = r5.f2112L     // Catch: java.lang.Throwable -> L36
            r1.post(r2)     // Catch: java.lang.Throwable -> L36
            r5.m1178k0()     // Catch: java.lang.Throwable -> L36
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r1
    }

    /* renamed from: e */
    public final void m1165e() {
            r1 = this;
            r0 = 0
            r1.f2114b = r0
            java.util.ArrayList<java.lang.Boolean> r0 = r1.f2108H
            r0.clear()
            java.util.ArrayList<androidx.fragment.app.a> r0 = r1.f2107G
            r0.clear()
            return
    }

    /* renamed from: e0 */
    public void m1166e0(androidx.fragment.app.ComponentCallbacksC0395n r2, boolean r3) {
            r1 = this;
            android.view.ViewGroup r2 = r1.m1141J(r2)
            if (r2 == 0) goto L11
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentContainerView
            if (r0 == 0) goto L11
            androidx.fragment.app.FragmentContainerView r2 = (androidx.fragment.app.FragmentContainerView) r2
            r3 = r3 ^ 1
            r2.setDrawDisappearingViewsLast(r3)
        L11:
            return
    }

    /* renamed from: f */
    public final java.util.Set<androidx.fragment.app.AbstractC0370b1> m1167f() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.fragment.app.l0 r1 = r4.f2115c
            java.util.List r1 = r1.m1287w()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.j0 r2 = (androidx.fragment.app.C0388j0) r2
            androidx.fragment.app.n r2 = r2.f2202c
            android.view.ViewGroup r2 = r2.f2259B0
            if (r2 == 0) goto L11
            androidx.fragment.app.c1 r3 = r4.m1144M()
            androidx.fragment.app.b1 r2 = androidx.fragment.app.AbstractC0370b1.m1094g(r2, r3)
            r0.add(r2)
            goto L11
        L2f:
            return r0
    }

    /* renamed from: f0 */
    public void m1168f0(androidx.fragment.app.ComponentCallbacksC0395n r3, androidx.lifecycle.AbstractC0458o.c r4) {
            r2 = this;
            java.lang.String r0 = r3.f2281c0
            androidx.fragment.app.n r0 = r2.m1138G(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.a0<?> r0 = r3.f2295q0
            if (r0 == 0) goto L14
            androidx.fragment.app.d0 r0 = r3.f2294p0
            if (r0 != r2) goto L17
        L14:
            r3.f2268K0 = r4
            return
        L17:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is not an active fragment of FragmentManager "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    /* renamed from: g */
    public void m1169g(androidx.fragment.app.C0365a r10, boolean r11, boolean r12, boolean r13) {
            r9 = this;
            if (r11 == 0) goto L6
            r10.m1084n(r13)
            goto L9
        L6:
            r10.m1083m()
        L9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r8 = 1
            r2.<init>(r8)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r8)
            r2.add(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r11)
            r3.add(r10)
            if (r12 == 0) goto L32
            int r10 = r9.f2129q
            if (r10 < r8) goto L32
            androidx.fragment.app.a0<?> r10 = r9.f2130r
            android.content.Context r0 = r10.f2034Z
            androidx.fragment.app.x r1 = r9.f2131s
            r4 = 0
            r5 = 1
            r6 = 1
            androidx.fragment.app.t0$a r7 = r9.f2126n
            androidx.fragment.app.C0408t0.m1371p(r0, r1, r2, r3, r4, r5, r6, r7)
        L32:
            if (r13 == 0) goto L39
            int r10 = r9.f2129q
            r9.m1150T(r10, r8)
        L39:
            androidx.fragment.app.l0 r10 = r9.f2115c
            java.util.List r10 = r10.m1288x()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.util.Iterator r10 = r10.iterator()
        L45:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L56
            java.lang.Object r11 = r10.next()
            androidx.fragment.app.n r11 = (androidx.fragment.app.ComponentCallbacksC0395n) r11
            if (r11 == 0) goto L45
            android.view.View r11 = r11.f2260C0
            goto L45
        L56:
            return
    }

    /* renamed from: g0 */
    public void m1170g0(androidx.fragment.app.ComponentCallbacksC0395n r4) {
            r3 = this;
            if (r4 == 0) goto L36
            java.lang.String r0 = r4.f2281c0
            androidx.fragment.app.n r0 = r3.m1138G(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.a0<?> r0 = r4.f2295q0
            if (r0 == 0) goto L36
            androidx.fragment.app.d0 r0 = r4.f2294p0
            if (r0 != r3) goto L17
            goto L36
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not an active fragment of FragmentManager "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L36:
            androidx.fragment.app.n r0 = r3.f2133u
            r3.f2133u = r4
            r3.m1187t(r0)
            androidx.fragment.app.n r4 = r3.f2133u
            r3.m1187t(r4)
            return
    }

    /* renamed from: h */
    public androidx.fragment.app.C0388j0 m1171h(androidx.fragment.app.ComponentCallbacksC0395n r4) {
            r3 = this;
            androidx.fragment.app.l0 r0 = r3.f2115c
            java.lang.String r1 = r4.f2281c0
            androidx.fragment.app.j0 r0 = r0.m1290z(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            androidx.fragment.app.j0 r0 = new androidx.fragment.app.j0
            androidx.fragment.app.c0 r1 = r3.f2127o
            androidx.fragment.app.l0 r2 = r3.f2115c
            r0.<init>(r1, r2, r4)
            androidx.fragment.app.a0<?> r4 = r3.f2130r
            android.content.Context r4 = r4.f2034Z
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r0.m1216m(r4)
            int r4 = r3.f2129q
            r0.f2204e = r4
            return r0
    }

    /* renamed from: h0 */
    public final void m1172h0(androidx.fragment.app.ComponentCallbacksC0395n r4) {
            r3 = this;
            android.view.ViewGroup r0 = r3.m1141J(r4)
            if (r0 == 0) goto L34
            int r1 = r4.m1341w()
            int r2 = r4.m1347z()
            int r2 = r2 + r1
            int r1 = r4.m1302F()
            int r1 = r1 + r2
            int r2 = r4.m1303G()
            int r2 = r2 + r1
            if (r2 <= 0) goto L34
            r1 = 2131362759(0x7f0a03c7, float:1.8345308E38)
            java.lang.Object r2 = r0.getTag(r1)
            if (r2 != 0) goto L27
            r0.setTag(r1, r4)
        L27:
            java.lang.Object r0 = r0.getTag(r1)
            androidx.fragment.app.n r0 = (androidx.fragment.app.ComponentCallbacksC0395n) r0
            boolean r4 = r4.m1301E()
            r0.m1297B0(r4)
        L34:
            return
    }

    /* renamed from: i */
    public final void m1173i(androidx.fragment.app.ComponentCallbacksC0395n r4) {
            r3 = this;
            r4.m1324l0()
            androidx.fragment.app.c0 r0 = r3.f2127o
            r1 = 0
            r0.m1130n(r4, r1)
            r0 = 0
            r4.f2259B0 = r0
            r4.f2260C0 = r0
            r4.f2270M0 = r0
            androidx.lifecycle.d0<androidx.lifecycle.v> r2 = r4.f2271N0
            r2.mo7l(r0)
            r4.f2290l0 = r1
            return
    }

    /* renamed from: i0 */
    public void m1174i0(androidx.fragment.app.ComponentCallbacksC0395n r3) {
            r2 = this;
            r0 = 2
            boolean r0 = m1131O(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "show: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            boolean r0 = r3.f2301w0
            if (r0 == 0) goto L2a
            r0 = 0
            r3.f2301w0 = r0
            boolean r0 = r3.f2264G0
            r0 = r0 ^ 1
            r3.f2264G0 = r0
        L2a:
            return
    }

    /* renamed from: j */
    public void m1175j(androidx.fragment.app.ComponentCallbacksC0395n r5) {
            r4 = this;
            r0 = 2
            boolean r1 = m1131O(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "detach: "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1d:
            boolean r1 = r5.f2302x0
            if (r1 != 0) goto L52
            r1 = 1
            r5.f2302x0 = r1
            boolean r3 = r5.f2287i0
            if (r3 == 0) goto L52
            boolean r0 = m1131O(r0)
            if (r0 == 0) goto L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "remove from detach: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L42:
            androidx.fragment.app.l0 r0 = r4.f2115c
            r0.m1266X(r5)
            boolean r0 = r4.m1146P(r5)
            if (r0 == 0) goto L4f
            r4.f2102B = r1
        L4f:
            r4.m1172h0(r5)
        L52:
            return
    }

    /* renamed from: j0 */
    public final void m1176j0() {
            r4 = this;
            androidx.fragment.app.l0 r0 = r4.f2115c
            java.util.List r0 = r0.m1287w()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.j0 r1 = (androidx.fragment.app.C0388j0) r1
            androidx.fragment.app.n r2 = r1.f2202c
            boolean r3 = r2.f2261D0
            if (r3 == 0) goto Lc
            boolean r3 = r4.f2114b
            if (r3 == 0) goto L26
            r1 = 1
            r4.f2106F = r1
            goto Lc
        L26:
            r3 = 0
            r2.f2261D0 = r3
            r1.m1214k()
            goto Lc
        L2d:
            return
    }

    /* renamed from: k */
    public void m1177k(android.content.res.Configuration r3) {
            r2 = this;
            androidx.fragment.app.l0 r0 = r2.f2115c
            java.util.List r0 = r0.m1243A()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.n r1 = (androidx.fragment.app.ComponentCallbacksC0395n) r1
            if (r1 == 0) goto La
            r1.onConfigurationChanged(r3)
            androidx.fragment.app.d0 r1 = r1.f2296r0
            r1.m1177k(r3)
            goto La
        L21:
            return
    }

    /* renamed from: k0 */
    public final void m1178k0() {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.d0$n> r0 = r4.f2113a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.d0$n> r1 = r4.f2113a     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2f
            r2 = 1
            if (r1 != 0) goto L12
            androidx.activity.b r1 = r4.f2120h     // Catch: java.lang.Throwable -> L2f
            r1.f616a = r2     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            androidx.activity.b r0 = r4.f2120h
            java.util.ArrayList<androidx.fragment.app.a> r1 = r4.f2116d
            r3 = 0
            if (r1 == 0) goto L1f
            int r1 = r1.size()
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 <= 0) goto L2b
            androidx.fragment.app.n r1 = r4.f2132t
            boolean r1 = r4.m1148R(r1)
            if (r1 == 0) goto L2b
            goto L2c
        L2b:
            r2 = 0
        L2c:
            r0.f616a = r2
            return
        L2f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
    }

    /* renamed from: l */
    public boolean m1179l(android.view.MenuItem r6) {
            r5 = this;
            int r0 = r5.f2129q
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            androidx.fragment.app.l0 r0 = r5.f2115c
            java.util.List r0 = r0.m1243A()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.n r3 = (androidx.fragment.app.ComponentCallbacksC0395n) r3
            if (r3 == 0) goto L11
            boolean r4 = r3.f2301w0
            if (r4 != 0) goto L2a
            androidx.fragment.app.d0 r3 = r3.f2296r0
            boolean r3 = r3.m1179l(r6)
            goto L2b
        L2a:
            r3 = 0
        L2b:
            if (r3 == 0) goto L11
            return r1
        L2e:
            return r2
    }

    /* renamed from: m */
    public void m1180m() {
            r2 = this;
            r0 = 0
            r2.f2103C = r0
            r2.f2104D = r0
            androidx.fragment.app.g0 r1 = r2.f2111K
            r1.f2178h = r0
            r0 = 1
            r2.m1190w(r0)
            return
    }

    /* renamed from: n */
    public boolean m1181n(android.view.Menu r8, android.view.MenuInflater r9) {
            r7 = this;
            int r0 = r7.f2129q
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            r0 = 0
            androidx.fragment.app.l0 r3 = r7.f2115c
            java.util.List r3 = r3.m1243A()
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L13:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L42
            java.lang.Object r5 = r3.next()
            androidx.fragment.app.n r5 = (androidx.fragment.app.ComponentCallbacksC0395n) r5
            if (r5 == 0) goto L13
            boolean r6 = r7.m1147Q(r5)
            if (r6 == 0) goto L13
            boolean r6 = r5.f2301w0
            if (r6 != 0) goto L33
            androidx.fragment.app.d0 r6 = r5.f2296r0
            boolean r6 = r6.m1181n(r8, r9)
            r6 = r6 | r2
            goto L34
        L33:
            r6 = 0
        L34:
            if (r6 == 0) goto L13
            if (r0 != 0) goto L3d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L3d:
            r0.add(r5)
            r4 = 1
            goto L13
        L42:
            java.util.ArrayList<androidx.fragment.app.n> r8 = r7.f2117e
            if (r8 == 0) goto L64
        L46:
            java.util.ArrayList<androidx.fragment.app.n> r8 = r7.f2117e
            int r8 = r8.size()
            if (r2 >= r8) goto L64
            java.util.ArrayList<androidx.fragment.app.n> r8 = r7.f2117e
            java.lang.Object r8 = r8.get(r2)
            androidx.fragment.app.n r8 = (androidx.fragment.app.ComponentCallbacksC0395n) r8
            if (r0 == 0) goto L5e
            boolean r9 = r0.contains(r8)
            if (r9 != 0) goto L61
        L5e:
            java.util.Objects.requireNonNull(r8)
        L61:
            int r2 = r2 + 1
            goto L46
        L64:
            r7.f2117e = r0
            return r4
    }

    /* renamed from: o */
    public void m1182o() {
            r2 = this;
            r0 = 1
            r2.f2105E = r0
            r2.m1134C(r0)
            r2.m1193z()
            r0 = -1
            r2.m1190w(r0)
            r0 = 0
            r2.f2130r = r0
            r2.f2131s = r0
            r2.f2132t = r0
            androidx.activity.OnBackPressedDispatcher r1 = r2.f2119g
            if (r1 == 0) goto L1f
            androidx.activity.b r1 = r2.f2120h
            r1.m440b()
            r2.f2119g = r0
        L1f:
            androidx.activity.result.c<android.content.Intent> r0 = r2.f2136x
            if (r0 == 0) goto L30
            r0.mo447b()
            androidx.activity.result.c<androidx.activity.result.f> r0 = r2.f2137y
            r0.mo447b()
            androidx.activity.result.c<java.lang.String[]> r0 = r2.f2138z
            r0.mo447b()
        L30:
            return
    }

    /* renamed from: p */
    public void m1183p() {
            r2 = this;
            androidx.fragment.app.l0 r0 = r2.f2115c
            java.util.List r0 = r0.m1243A()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.n r1 = (androidx.fragment.app.ComponentCallbacksC0395n) r1
            if (r1 == 0) goto La
            r1.m1326n0()
            goto La
        L1c:
            return
    }

    /* renamed from: q */
    public void m1184q(boolean r3) {
            r2 = this;
            androidx.fragment.app.l0 r0 = r2.f2115c
            java.util.List r0 = r0.m1243A()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.n r1 = (androidx.fragment.app.ComponentCallbacksC0395n) r1
            if (r1 == 0) goto La
            androidx.fragment.app.d0 r1 = r1.f2296r0
            r1.m1184q(r3)
            goto La
        L1e:
            return
    }

    /* renamed from: r */
    public boolean m1185r(android.view.MenuItem r6) {
            r5 = this;
            int r0 = r5.f2129q
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            androidx.fragment.app.l0 r0 = r5.f2115c
            java.util.List r0 = r0.m1243A()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.n r3 = (androidx.fragment.app.ComponentCallbacksC0395n) r3
            if (r3 == 0) goto L11
            boolean r4 = r3.f2301w0
            if (r4 != 0) goto L2a
            androidx.fragment.app.d0 r3 = r3.f2296r0
            boolean r3 = r3.m1185r(r6)
            goto L2b
        L2a:
            r3 = 0
        L2b:
            if (r3 == 0) goto L11
            return r1
        L2e:
            return r2
    }

    /* renamed from: s */
    public void m1186s(android.view.Menu r4) {
            r3 = this;
            int r0 = r3.f2129q
            r1 = 1
            if (r0 >= r1) goto L6
            return
        L6:
            androidx.fragment.app.l0 r0 = r3.f2115c
            java.util.List r0 = r0.m1243A()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.n r1 = (androidx.fragment.app.ComponentCallbacksC0395n) r1
            if (r1 == 0) goto L10
            boolean r2 = r1.f2301w0
            if (r2 != 0) goto L10
            androidx.fragment.app.d0 r1 = r1.f2296r0
            r1.m1186s(r4)
            goto L10
        L28:
            return
    }

    /* renamed from: t */
    public final void m1187t(androidx.fragment.app.ComponentCallbacksC0395n r3) {
            r2 = this;
            if (r3 == 0) goto L31
            java.lang.String r0 = r3.f2281c0
            androidx.fragment.app.n r0 = r2.m1138G(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L31
            androidx.fragment.app.d0 r0 = r3.f2294p0
            boolean r0 = r0.m1148R(r3)
            java.lang.Boolean r1 = r3.f2286h0
            if (r1 == 0) goto L1e
            boolean r1 = r1.booleanValue()
            if (r1 == r0) goto L31
        L1e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r3.f2286h0 = r1
            r3.mo1321d0(r0)
            androidx.fragment.app.d0 r3 = r3.f2296r0
            r3.m1178k0()
            androidx.fragment.app.n r0 = r3.f2133u
            r3.m1187t(r0)
        L31:
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            androidx.fragment.app.n r1 = r4.f2132t
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            if (r1 == 0) goto L43
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            androidx.fragment.app.n r1 = r4.f2132t
        L34:
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L5d
        L43:
            androidx.fragment.app.a0<?> r1 = r4.f2130r
            if (r1 == 0) goto L58
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            androidx.fragment.app.a0<?> r1 = r4.f2130r
            goto L34
        L58:
            java.lang.String r1 = "null"
            r0.append(r1)
        L5d:
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: u */
    public void m1188u(boolean r3) {
            r2 = this;
            androidx.fragment.app.l0 r0 = r2.f2115c
            java.util.List r0 = r0.m1243A()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.n r1 = (androidx.fragment.app.ComponentCallbacksC0395n) r1
            if (r1 == 0) goto La
            androidx.fragment.app.d0 r1 = r1.f2296r0
            r1.m1188u(r3)
            goto La
        L1e:
            return
    }

    /* renamed from: v */
    public boolean m1189v(android.view.Menu r6) {
            r5 = this;
            int r0 = r5.f2129q
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            androidx.fragment.app.l0 r0 = r5.f2115c
            java.util.List r0 = r0.m1243A()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.n r3 = (androidx.fragment.app.ComponentCallbacksC0395n) r3
            if (r3 == 0) goto L11
            boolean r4 = r5.m1147Q(r3)
            if (r4 == 0) goto L11
            boolean r3 = r3.m1327o0(r6)
            if (r3 == 0) goto L11
            r2 = 1
            goto L11
        L2d:
            return r2
    }

    /* renamed from: w */
    public final void m1190w(int r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            r4.f2114b = r0     // Catch: java.lang.Throwable -> L46
            androidx.fragment.app.l0 r2 = r4.f2115c     // Catch: java.lang.Throwable -> L46
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r2 = r2.f2231a0     // Catch: java.lang.Throwable -> L46
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L46
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L46
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L46
            androidx.fragment.app.j0 r3 = (androidx.fragment.app.C0388j0) r3     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L12
            r3.f2204e = r5     // Catch: java.lang.Throwable -> L46
            goto L12
        L23:
            r4.m1150T(r5, r1)     // Catch: java.lang.Throwable -> L46
            java.util.Set r5 = r4.m1167f()     // Catch: java.lang.Throwable -> L46
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L46
        L30:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L40
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L46
            androidx.fragment.app.b1 r2 = (androidx.fragment.app.AbstractC0370b1) r2     // Catch: java.lang.Throwable -> L46
            r2.m1099e()     // Catch: java.lang.Throwable -> L46
            goto L30
        L40:
            r4.f2114b = r1
            r4.m1134C(r0)
            return
        L46:
            r5 = move-exception
            r4.f2114b = r1
            throw r5
    }

    /* renamed from: x */
    public final void m1191x() {
            r1 = this;
            boolean r0 = r1.f2106F
            if (r0 == 0) goto La
            r0 = 0
            r1.f2106F = r0
            r1.m1176j0()
        La:
            return
    }

    /* renamed from: y */
    public void m1192y(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
            r5 = this;
            java.lang.String r0 = "    "
            java.lang.String r0 = p064e.C1493g.m4049a(r6, r0)
            androidx.fragment.app.l0 r1 = r5.f2115c
            java.util.Objects.requireNonNull(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r3 = "    "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r3 = r1.f2231a0
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L5a
            r8.print(r6)
            java.lang.String r3 = "Active Fragments:"
            r8.println(r3)
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r3 = r1.f2231a0
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L3a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j0 r4 = (androidx.fragment.app.C0388j0) r4
            r8.print(r6)
            if (r4 == 0) goto L54
            androidx.fragment.app.n r4 = r4.f2202c
            r8.println(r4)
            r4.m1329q(r2, r7, r8, r9)
            goto L3a
        L54:
            java.lang.String r4 = "null"
            r8.println(r4)
            goto L3a
        L5a:
            java.util.ArrayList<androidx.fragment.app.n> r7 = r1.f2230Z
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r7 = r7.size()
            r9 = 0
            if (r7 <= 0) goto L94
            r8.print(r6)
            java.lang.String r2 = "Added Fragments:"
            r8.println(r2)
            r2 = 0
        L6e:
            if (r2 >= r7) goto L94
            java.util.ArrayList<androidx.fragment.app.n> r3 = r1.f2230Z
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.n r3 = (androidx.fragment.app.ComponentCallbacksC0395n) r3
            r8.print(r6)
            java.lang.String r4 = "  #"
            r8.print(r4)
            r8.print(r2)
            java.lang.String r4 = ": "
            r8.print(r4)
            java.lang.String r3 = r3.toString()
            r8.println(r3)
            int r2 = r2 + 1
            goto L6e
        L94:
            java.util.ArrayList<androidx.fragment.app.n> r7 = r5.f2117e
            if (r7 == 0) goto Lcb
            int r7 = r7.size()
            if (r7 <= 0) goto Lcb
            r8.print(r6)
            java.lang.String r1 = "Fragments Created Menus:"
            r8.println(r1)
            r1 = 0
        La7:
            if (r1 >= r7) goto Lcb
            java.util.ArrayList<androidx.fragment.app.n> r2 = r5.f2117e
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.n r2 = (androidx.fragment.app.ComponentCallbacksC0395n) r2
            r8.print(r6)
            java.lang.String r3 = "  #"
            r8.print(r3)
            r8.print(r1)
            java.lang.String r3 = ": "
            r8.print(r3)
            java.lang.String r2 = r2.toString()
            r8.println(r2)
            int r1 = r1 + 1
            goto La7
        Lcb:
            java.util.ArrayList<androidx.fragment.app.a> r7 = r5.f2116d
            if (r7 == 0) goto L106
            int r7 = r7.size()
            if (r7 <= 0) goto L106
            r8.print(r6)
            java.lang.String r1 = "Back Stack:"
            r8.println(r1)
            r1 = 0
        Lde:
            if (r1 >= r7) goto L106
            java.util.ArrayList<androidx.fragment.app.a> r2 = r5.f2116d
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.C0365a) r2
            r8.print(r6)
            java.lang.String r3 = "  #"
            r8.print(r3)
            r8.print(r1)
            java.lang.String r3 = ": "
            r8.print(r3)
            java.lang.String r3 = r2.toString()
            r8.println(r3)
            r3 = 1
            r2.m1082l(r0, r8, r3)
            int r1 = r1 + 1
            goto Lde
        L106:
            r8.print(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Back Stack Index: "
            r7.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r5.f2121i
            int r0 = r0.get()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r8.println(r7)
            java.util.ArrayList<androidx.fragment.app.d0$n> r7 = r5.f2113a
            monitor-enter(r7)
            java.util.ArrayList<androidx.fragment.app.d0$n> r0 = r5.f2113a     // Catch: java.lang.Throwable -> L1c7
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1c7
            if (r0 <= 0) goto L156
            r8.print(r6)     // Catch: java.lang.Throwable -> L1c7
            java.lang.String r1 = "Pending Actions:"
            r8.println(r1)     // Catch: java.lang.Throwable -> L1c7
        L136:
            if (r9 >= r0) goto L156
            java.util.ArrayList<androidx.fragment.app.d0$n> r1 = r5.f2113a     // Catch: java.lang.Throwable -> L1c7
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Throwable -> L1c7
            androidx.fragment.app.d0$n r1 = (androidx.fragment.app.AbstractC0375d0.n) r1     // Catch: java.lang.Throwable -> L1c7
            r8.print(r6)     // Catch: java.lang.Throwable -> L1c7
            java.lang.String r2 = "  #"
            r8.print(r2)     // Catch: java.lang.Throwable -> L1c7
            r8.print(r9)     // Catch: java.lang.Throwable -> L1c7
            java.lang.String r2 = ": "
            r8.print(r2)     // Catch: java.lang.Throwable -> L1c7
            r8.println(r1)     // Catch: java.lang.Throwable -> L1c7
            int r9 = r9 + 1
            goto L136
        L156:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1c7
            r8.print(r6)
            java.lang.String r7 = "FragmentManager misc state:"
            r8.println(r7)
            r8.print(r6)
            java.lang.String r7 = "  mHost="
            r8.print(r7)
            androidx.fragment.app.a0<?> r7 = r5.f2130r
            r8.println(r7)
            r8.print(r6)
            java.lang.String r7 = "  mContainer="
            r8.print(r7)
            androidx.fragment.app.x r7 = r5.f2131s
            r8.println(r7)
            androidx.fragment.app.n r7 = r5.f2132t
            if (r7 == 0) goto L18a
            r8.print(r6)
            java.lang.String r7 = "  mParent="
            r8.print(r7)
            androidx.fragment.app.n r7 = r5.f2132t
            r8.println(r7)
        L18a:
            r8.print(r6)
            java.lang.String r7 = "  mCurState="
            r8.print(r7)
            int r7 = r5.f2129q
            r8.print(r7)
            java.lang.String r7 = " mStateSaved="
            r8.print(r7)
            boolean r7 = r5.f2103C
            r8.print(r7)
            java.lang.String r7 = " mStopped="
            r8.print(r7)
            boolean r7 = r5.f2104D
            r8.print(r7)
            java.lang.String r7 = " mDestroyed="
            r8.print(r7)
            boolean r7 = r5.f2105E
            r8.println(r7)
            boolean r7 = r5.f2102B
            if (r7 == 0) goto L1c6
            r8.print(r6)
            java.lang.String r6 = "  mNeedMenuInvalidate="
            r8.print(r6)
            boolean r6 = r5.f2102B
            r8.println(r6)
        L1c6:
            return
        L1c7:
            r6 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1c7
            throw r6
    }

    /* renamed from: z */
    public final void m1193z() {
            r2 = this;
            java.util.Set r0 = r2.m1167f()
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b1 r1 = (androidx.fragment.app.AbstractC0370b1) r1
            r1.m1099e()
            goto La
        L1a:
            return
    }
}
