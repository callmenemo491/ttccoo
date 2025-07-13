package p085f1;

/* renamed from: f1.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC1969j0 extends p085f1.AbstractC1966i {

    /* renamed from: f1.j0$a */
    public static class a extends p085f1.AbstractC1969j0.d {
        public a(android.content.Context r1, p085f1.AbstractC1969j0.e r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // p085f1.AbstractC1969j0.d, p085f1.AbstractC1969j0.c, p085f1.AbstractC1969j0.b
        /* renamed from: B */
        public void mo4939B(p085f1.AbstractC1969j0.b.C7379b r2, p085f1.C1962g.a r3) {
                r1 = this;
                super.mo4939B(r2, r3)
                java.lang.Object r2 = r2.f8659a
                android.media.MediaRouter$RouteInfo r2 = (android.media.MediaRouter.RouteInfo) r2
                int r2 = r2.getDeviceType()
                android.os.Bundle r3 = r3.f8594a
                java.lang.String r0 = "deviceType"
                r3.putInt(r0, r2)
                return
        }
    }

    /* renamed from: f1.j0$b */
    public static class b extends p085f1.AbstractC1969j0 implements p085f1.InterfaceC1981v, p085f1.InterfaceC1984y {

        /* renamed from: q0 */
        public static final java.util.ArrayList<android.content.IntentFilter> f8646q0 = null;

        /* renamed from: r0 */
        public static final java.util.ArrayList<android.content.IntentFilter> f8647r0 = null;

        /* renamed from: g0 */
        public final p085f1.AbstractC1969j0.e f8648g0;

        /* renamed from: h0 */
        public final java.lang.Object f8649h0;

        /* renamed from: i0 */
        public final java.lang.Object f8650i0;

        /* renamed from: j0 */
        public final java.lang.Object f8651j0;

        /* renamed from: k0 */
        public final java.lang.Object f8652k0;

        /* renamed from: l0 */
        public int f8653l0;

        /* renamed from: m0 */
        public boolean f8654m0;

        /* renamed from: n0 */
        public boolean f8655n0;

        /* renamed from: o0 */
        public final java.util.ArrayList<p085f1.AbstractC1969j0.b.C7379b> f8656o0;

        /* renamed from: p0 */
        public final java.util.ArrayList<p085f1.AbstractC1969j0.b.c> f8657p0;

        /* renamed from: f1.j0$b$a */
        public static final class a extends p085f1.AbstractC1966i.e {

            /* renamed from: a */
            public final java.lang.Object f8658a;

            public a(java.lang.Object r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f8658a = r1
                    return
            }

            @Override // p085f1.AbstractC1966i.e
            /* renamed from: f */
            public void mo4871f(int r2) {
                    r1 = this;
                    java.lang.Object r0 = r1.f8658a
                    android.media.MediaRouter$RouteInfo r0 = (android.media.MediaRouter.RouteInfo) r0
                    r0.requestSetVolume(r2)
                    return
            }

            @Override // p085f1.AbstractC1966i.e
            /* renamed from: i */
            public void mo4872i(int r2) {
                    r1 = this;
                    java.lang.Object r0 = r1.f8658a
                    android.media.MediaRouter$RouteInfo r0 = (android.media.MediaRouter.RouteInfo) r0
                    r0.requestUpdateVolume(r2)
                    return
            }
        }

        /* renamed from: f1.j0$b$b, reason: collision with other inner class name */
        public static final class C7379b {

            /* renamed from: a */
            public final java.lang.Object f8659a;

            /* renamed from: b */
            public final java.lang.String f8660b;

            /* renamed from: c */
            public p085f1.C1962g f8661c;

            public C7379b(java.lang.Object r1, java.lang.String r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f8659a = r1
                    r0.f8660b = r2
                    return
            }
        }

        /* renamed from: f1.j0$b$c */
        public static final class c {

            /* renamed from: a */
            public final p085f1.C1974o.i f8662a;

            /* renamed from: b */
            public final java.lang.Object f8663b;

            public c(p085f1.C1974o.i r1, java.lang.Object r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f8662a = r1
                    r0.f8663b = r2
                    return
            }
        }

        static {
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>()
                java.lang.String r1 = "android.media.intent.category.LIVE_AUDIO"
                r0.addCategory(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                p085f1.AbstractC1969j0.b.f8646q0 = r1
                r1.add(r0)
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>()
                java.lang.String r1 = "android.media.intent.category.LIVE_VIDEO"
                r0.addCategory(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                p085f1.AbstractC1969j0.b.f8647r0 = r1
                r1.add(r0)
                return
        }

        public b(android.content.Context r3, p085f1.AbstractC1969j0.e r4) {
                r2 = this;
                r2.<init>(r3)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f8656o0 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f8657p0 = r0
                r2.f8648g0 = r4
                java.lang.String r4 = "media_router"
                java.lang.Object r4 = r3.getSystemService(r4)
                r2.f8649h0 = r4
                r0 = r2
                f1.j0$c r0 = (p085f1.AbstractC1969j0.c) r0
                f1.b0 r1 = new f1.b0
                r1.<init>(r0)
                r2.f8650i0 = r1
                f1.z r0 = new f1.z
                r0.<init>(r2)
                r2.f8651j0 = r0
                android.content.res.Resources r3 = r3.getResources()
                r0 = 2131951902(0x7f13011e, float:1.9540232E38)
                java.lang.String r3 = r3.getString(r0)
                r0 = 0
                android.media.MediaRouter r4 = (android.media.MediaRouter) r4
                android.media.MediaRouter$RouteCategory r3 = r4.createRouteCategory(r3, r0)
                r2.f8652k0 = r3
                r2.m4945G()
                return
        }

        /* renamed from: A */
        public p085f1.AbstractC1969j0.b.c m4940A(java.lang.Object r2) {
                r1 = this;
                android.media.MediaRouter$RouteInfo r2 = (android.media.MediaRouter.RouteInfo) r2
                java.lang.Object r2 = r2.getTag()
                boolean r0 = r2 instanceof p085f1.AbstractC1969j0.b.c
                if (r0 == 0) goto Ld
                f1.j0$b$c r2 = (p085f1.AbstractC1969j0.b.c) r2
                goto Le
            Ld:
                r2 = 0
            Le:
                return r2
        }

        /* renamed from: B */
        public void mo4939B(p085f1.AbstractC1969j0.b.C7379b r4, p085f1.C1962g.a r5) {
                r3 = this;
                java.lang.Object r0 = r4.f8659a
                android.media.MediaRouter$RouteInfo r0 = (android.media.MediaRouter.RouteInfo) r0
                int r0 = r0.getSupportedTypes()
                r1 = r0 & 1
                if (r1 == 0) goto L11
                java.util.ArrayList<android.content.IntentFilter> r1 = p085f1.AbstractC1969j0.b.f8646q0
                r5.m4920a(r1)
            L11:
                r0 = r0 & 2
                if (r0 == 0) goto L1a
                java.util.ArrayList<android.content.IntentFilter> r0 = p085f1.AbstractC1969j0.b.f8647r0
                r5.m4920a(r0)
            L1a:
                java.lang.Object r0 = r4.f8659a
                android.media.MediaRouter$RouteInfo r0 = (android.media.MediaRouter.RouteInfo) r0
                int r0 = r0.getPlaybackType()
                r5.m4923d(r0)
                java.lang.Object r0 = r4.f8659a
                android.media.MediaRouter$RouteInfo r0 = (android.media.MediaRouter.RouteInfo) r0
                int r0 = r0.getPlaybackStream()
                android.os.Bundle r1 = r5.f8594a
                java.lang.String r2 = "playbackStream"
                r1.putInt(r2, r0)
                java.lang.Object r0 = r4.f8659a
                android.media.MediaRouter$RouteInfo r0 = (android.media.MediaRouter.RouteInfo) r0
                int r0 = r0.getVolume()
                r5.m4924e(r0)
                java.lang.Object r0 = r4.f8659a
                android.media.MediaRouter$RouteInfo r0 = (android.media.MediaRouter.RouteInfo) r0
                int r0 = r0.getVolumeMax()
                r5.m4926g(r0)
                java.lang.Object r4 = r4.f8659a
                android.media.MediaRouter$RouteInfo r4 = (android.media.MediaRouter.RouteInfo) r4
                int r4 = r4.getVolumeHandling()
                r5.m4925f(r4)
                return
        }

        /* renamed from: C */
        public void m4941C() {
                r6 = this;
                java.util.ArrayList<f1.j0$b$b> r0 = r6.f8656o0
                int r0 = r0.size()
                r1 = 0
                r2 = 0
                r3 = 0
            L9:
                if (r3 >= r0) goto L3b
                java.util.ArrayList<f1.j0$b$b> r4 = r6.f8656o0
                java.lang.Object r4 = r4.get(r3)
                f1.j0$b$b r4 = (p085f1.AbstractC1969j0.b.C7379b) r4
                f1.g r4 = r4.f8661c
                if (r4 == 0) goto L33
                if (r2 != 0) goto L1f
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                goto L25
            L1f:
                boolean r5 = r2.contains(r4)
                if (r5 != 0) goto L2b
            L25:
                r2.add(r4)
                int r3 = r3 + 1
                goto L9
            L2b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "route descriptor already added"
                r0.<init>(r1)
                throw r0
            L33:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "route must not be null"
                r0.<init>(r1)
                throw r0
            L3b:
                f1.k r0 = new f1.k
                r0.<init>(r2, r1)
                r6.m4931p(r0)
                return
        }

        /* renamed from: D */
        public void mo4942D(java.lang.Object r1) {
                r0 = this;
                r0 = 0
                throw r0
        }

        /* renamed from: E */
        public void mo4943E() {
                r0 = this;
                r0 = 0
                throw r0
        }

        /* renamed from: F */
        public void m4944F(p085f1.AbstractC1969j0.b.C7379b r5) {
                r4 = this;
                f1.g$a r0 = new f1.g$a
                java.lang.String r1 = r5.f8660b
                java.lang.Object r2 = r5.f8659a
                android.content.Context r3 = r4.f8612Y
                android.media.MediaRouter$RouteInfo r2 = (android.media.MediaRouter.RouteInfo) r2
                java.lang.CharSequence r2 = r2.getName(r3)
                if (r2 == 0) goto L15
                java.lang.String r2 = r2.toString()
                goto L17
            L15:
                java.lang.String r2 = ""
            L17:
                r0.<init>(r1, r2)
                r4.mo4939B(r5, r0)
                f1.g r0 = r0.m4921b()
                r5.f8661c = r0
                return
        }

        /* renamed from: G */
        public final void m4945G() {
                r6 = this;
                r6.mo4943E()
                java.lang.Object r0 = r6.f8649h0
                android.media.MediaRouter r0 = (android.media.MediaRouter) r0
                int r1 = r0.getRouteCount()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                r3 = 0
                r4 = 0
            L12:
                if (r4 >= r1) goto L1e
                android.media.MediaRouter$RouteInfo r5 = r0.getRouteAt(r4)
                r2.add(r5)
                int r4 = r4 + 1
                goto L12
            L1e:
                java.util.Iterator r0 = r2.iterator()
            L22:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L32
                java.lang.Object r1 = r0.next()
                boolean r1 = r6.m4957v(r1)
                r3 = r3 | r1
                goto L22
            L32:
                if (r3 == 0) goto L37
                r6.m4941C()
            L37:
                return
        }

        /* renamed from: H */
        public void mo4946H(p085f1.AbstractC1969j0.b.c r3) {
                r2 = this;
                java.lang.Object r0 = r3.f8663b
                f1.o$i r1 = r3.f8662a
                java.lang.String r1 = r1.f8736d
                android.media.MediaRouter$UserRouteInfo r0 = (android.media.MediaRouter.UserRouteInfo) r0
                r0.setName(r1)
                java.lang.Object r0 = r3.f8663b
                f1.o$i r1 = r3.f8662a
                int r1 = r1.f8743k
                android.media.MediaRouter$UserRouteInfo r0 = (android.media.MediaRouter.UserRouteInfo) r0
                r0.setPlaybackType(r1)
                java.lang.Object r0 = r3.f8663b
                f1.o$i r1 = r3.f8662a
                int r1 = r1.f8744l
                android.media.MediaRouter$UserRouteInfo r0 = (android.media.MediaRouter.UserRouteInfo) r0
                r0.setPlaybackStream(r1)
                java.lang.Object r0 = r3.f8663b
                f1.o$i r1 = r3.f8662a
                int r1 = r1.f8747o
                android.media.MediaRouter$UserRouteInfo r0 = (android.media.MediaRouter.UserRouteInfo) r0
                r0.setVolume(r1)
                java.lang.Object r0 = r3.f8663b
                f1.o$i r1 = r3.f8662a
                int r1 = r1.f8748p
                android.media.MediaRouter$UserRouteInfo r0 = (android.media.MediaRouter.UserRouteInfo) r0
                r0.setVolumeMax(r1)
                java.lang.Object r0 = r3.f8663b
                f1.o$i r3 = r3.f8662a
                int r3 = r3.f8746n
                android.media.MediaRouter$UserRouteInfo r0 = (android.media.MediaRouter.UserRouteInfo) r0
                r0.setVolumeHandling(r3)
                return
        }

        @Override // p085f1.InterfaceC1981v
        /* renamed from: b */
        public void mo4947b(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                return
        }

        @Override // p085f1.InterfaceC1981v
        /* renamed from: c */
        public void mo4948c(java.lang.Object r2) {
                r1 = this;
                f1.j0$b$c r0 = r1.m4940A(r2)
                if (r0 != 0) goto L1a
                int r2 = r1.m4958w(r2)
                if (r2 < 0) goto L1a
                java.util.ArrayList<f1.j0$b$b> r0 = r1.f8656o0
                java.lang.Object r2 = r0.get(r2)
                f1.j0$b$b r2 = (p085f1.AbstractC1969j0.b.C7379b) r2
                r1.m4944F(r2)
                r1.m4941C()
            L1a:
                return
        }

        @Override // p085f1.InterfaceC1981v
        /* renamed from: d */
        public void mo4949d(int r1, java.lang.Object r2) {
                r0 = this;
                return
        }

        @Override // p085f1.InterfaceC1984y
        /* renamed from: e */
        public void mo4950e(java.lang.Object r1, int r2) {
                r0 = this;
                f1.j0$b$c r1 = r0.m4940A(r1)
                if (r1 == 0) goto Lb
                f1.o$i r1 = r1.f8662a
                r1.m5073l(r2)
            Lb:
                return
        }

        @Override // p085f1.InterfaceC1981v
        /* renamed from: f */
        public void mo4951f(java.lang.Object r1, java.lang.Object r2, int r3) {
                r0 = this;
                return
        }

        @Override // p085f1.InterfaceC1981v
        /* renamed from: g */
        public void mo4952g(java.lang.Object r2) {
                r1 = this;
                f1.j0$b$c r0 = r1.m4940A(r2)
                if (r0 != 0) goto L14
                int r2 = r1.m4958w(r2)
                if (r2 < 0) goto L14
                java.util.ArrayList<f1.j0$b$b> r0 = r1.f8656o0
                r0.remove(r2)
                r1.m4941C()
            L14:
                return
        }

        @Override // p085f1.InterfaceC1981v
        /* renamed from: h */
        public void mo4953h(java.lang.Object r1) {
                r0 = this;
                boolean r1 = r0.m4957v(r1)
                if (r1 == 0) goto L9
                r0.m4941C()
            L9:
                return
        }

        @Override // p085f1.InterfaceC1984y
        /* renamed from: i */
        public void mo4954i(java.lang.Object r1, int r2) {
                r0 = this;
                f1.j0$b$c r1 = r0.m4940A(r1)
                if (r1 == 0) goto Lb
                f1.o$i r1 = r1.f8662a
                r1.m5072k(r2)
            Lb:
                return
        }

        @Override // p085f1.InterfaceC1981v
        /* renamed from: j */
        public void mo4955j(java.lang.Object r7) {
                r6 = this;
                f1.j0$b$c r0 = r6.m4940A(r7)
                if (r0 != 0) goto L7b
                int r0 = r6.m4958w(r7)
                if (r0 < 0) goto L7b
                java.util.ArrayList<f1.j0$b$b> r1 = r6.f8656o0
                java.lang.Object r0 = r1.get(r0)
                f1.j0$b$b r0 = (p085f1.AbstractC1969j0.b.C7379b) r0
                android.media.MediaRouter$RouteInfo r7 = (android.media.MediaRouter.RouteInfo) r7
                int r7 = r7.getVolume()
                f1.g r1 = r0.f8661c
                int r1 = r1.m4915n()
                if (r7 == r1) goto L7b
                f1.g r1 = r0.f8661c
                if (r1 == 0) goto L73
                android.os.Bundle r2 = new android.os.Bundle
                android.os.Bundle r3 = r1.f8591a
                r2.<init>(r3)
                java.util.List r3 = r1.m4908g()
                boolean r3 = r3.isEmpty()
                r4 = 0
                if (r3 != 0) goto L42
                java.util.ArrayList r3 = new java.util.ArrayList
                java.util.List r5 = r1.m4908g()
                r3.<init>(r5)
                goto L43
            L42:
                r3 = r4
            L43:
                r1.m4903a()
                java.util.List<android.content.IntentFilter> r5 = r1.f8593c
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L55
                java.util.ArrayList r4 = new java.util.ArrayList
                java.util.List<android.content.IntentFilter> r1 = r1.f8593c
                r4.<init>(r1)
            L55:
                java.lang.String r1 = "volume"
                r2.putInt(r1, r7)
                if (r4 == 0) goto L61
                java.lang.String r7 = "controlFilters"
                r2.putParcelableArrayList(r7, r4)
            L61:
                if (r3 == 0) goto L68
                java.lang.String r7 = "groupMemberIds"
                r2.putStringArrayList(r7, r3)
            L68:
                f1.g r7 = new f1.g
                r7.<init>(r2)
                r0.f8661c = r7
                r6.m4941C()
                goto L7b
            L73:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "descriptor must not be null"
                r7.<init>(r0)
                throw r7
            L7b:
                return
        }

        @Override // p085f1.InterfaceC1981v
        /* renamed from: k */
        public void mo4956k(int r3, java.lang.Object r4) {
                r2 = this;
                java.lang.Object r3 = r2.f8649h0
                android.media.MediaRouter r3 = (android.media.MediaRouter) r3
                r0 = 8388611(0x800003, float:1.1754948E-38)
                android.media.MediaRouter$RouteInfo r3 = r3.getSelectedRoute(r0)
                if (r4 == r3) goto Le
                return
            Le:
                f1.j0$b$c r3 = r2.m4940A(r4)
                if (r3 == 0) goto L1a
                f1.o$i r3 = r3.f8662a
                r3.m5074m()
                goto L46
            L1a:
                int r3 = r2.m4958w(r4)
                if (r3 < 0) goto L46
                java.util.ArrayList<f1.j0$b$b> r4 = r2.f8656o0
                java.lang.Object r3 = r4.get(r3)
                f1.j0$b$b r3 = (p085f1.AbstractC1969j0.b.C7379b) r3
                f1.j0$e r4 = r2.f8648g0
                java.lang.String r3 = r3.f8660b
                f1.o$e r4 = (p085f1.C1974o.e) r4
                f1.o$e$c r0 = r4.f8691k
                r1 = 262(0x106, float:3.67E-43)
                r0.removeMessages(r1)
                f1.j0 r0 = r4.f8692l
                f1.o$h r4 = r4.m5039d(r0)
                if (r4 == 0) goto L46
                f1.o$i r3 = r4.m5060a(r3)
                if (r3 == 0) goto L46
                r3.m5074m()
            L46:
                return
        }

        @Override // p085f1.AbstractC1966i
        /* renamed from: m */
        public p085f1.AbstractC1966i.e mo4864m(java.lang.String r2) {
                r1 = this;
                int r2 = r1.m4959x(r2)
                if (r2 < 0) goto L16
                java.util.ArrayList<f1.j0$b$b> r0 = r1.f8656o0
                java.lang.Object r2 = r0.get(r2)
                f1.j0$b$b r2 = (p085f1.AbstractC1969j0.b.C7379b) r2
                f1.j0$b$a r0 = new f1.j0$b$a
                java.lang.Object r2 = r2.f8659a
                r0.<init>(r2)
                return r0
            L16:
                r2 = 0
                return r2
        }

        @Override // p085f1.AbstractC1966i
        /* renamed from: o */
        public void mo4866o(p085f1.C1964h r7) {
                r6 = this;
                r0 = 0
                if (r7 == 0) goto L3d
                r7.m4928a()
                f1.n r1 = r7.f8601b
                r1.m5023a()
                java.util.List<java.lang.String> r1 = r1.f8668b
                int r2 = r1.size()
                r3 = 0
            L12:
                if (r0 >= r2) goto L36
                java.lang.Object r4 = r1.get(r0)
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r5 = "android.media.intent.category.LIVE_AUDIO"
                boolean r5 = r4.equals(r5)
                if (r5 == 0) goto L25
                r3 = r3 | 1
                goto L33
            L25:
                java.lang.String r5 = "android.media.intent.category.LIVE_VIDEO"
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L30
                r3 = r3 | 2
                goto L33
            L30:
                r4 = 8388608(0x800000, float:1.1754944E-38)
                r3 = r3 | r4
            L33:
                int r0 = r0 + 1
                goto L12
            L36:
                boolean r0 = r7.m4929b()
                r7 = r0
                r0 = r3
                goto L3e
            L3d:
                r7 = 0
            L3e:
                int r1 = r6.f8653l0
                if (r1 != r0) goto L46
                boolean r1 = r6.f8654m0
                if (r1 == r7) goto L4d
            L46:
                r6.f8653l0 = r0
                r6.f8654m0 = r7
                r6.m4945G()
            L4d:
                return
        }

        @Override // p085f1.AbstractC1969j0
        /* renamed from: r */
        public void mo4935r(p085f1.C1974o.i r3) {
                r2 = this;
                f1.i r0 = r3.m5065d()
                if (r0 == r2) goto L2f
                java.lang.Object r0 = r2.f8649h0
                java.lang.Object r1 = r2.f8652k0
                android.media.MediaRouter r0 = (android.media.MediaRouter) r0
                android.media.MediaRouter$RouteCategory r1 = (android.media.MediaRouter.RouteCategory) r1
                android.media.MediaRouter$UserRouteInfo r0 = r0.createUserRoute(r1)
                f1.j0$b$c r1 = new f1.j0$b$c
                r1.<init>(r3, r0)
                r0.setTag(r1)
                java.lang.Object r3 = r2.f8651j0
                p085f1.C1983x.m5080a(r0, r3)
                r2.mo4946H(r1)
                java.util.ArrayList<f1.j0$b$c> r3 = r2.f8657p0
                r3.add(r1)
                java.lang.Object r3 = r2.f8649h0
                android.media.MediaRouter r3 = (android.media.MediaRouter) r3
                r3.addUserRoute(r0)
                goto L55
            L2f:
                java.lang.Object r0 = r2.f8649h0
                r1 = 8388611(0x800003, float:1.1754948E-38)
                android.media.MediaRouter r0 = (android.media.MediaRouter) r0
                android.media.MediaRouter$RouteInfo r0 = r0.getSelectedRoute(r1)
                int r0 = r2.m4958w(r0)
                if (r0 < 0) goto L55
                java.util.ArrayList<f1.j0$b$b> r1 = r2.f8656o0
                java.lang.Object r0 = r1.get(r0)
                f1.j0$b$b r0 = (p085f1.AbstractC1969j0.b.C7379b) r0
                java.lang.String r0 = r0.f8660b
                java.lang.String r1 = r3.f8734b
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L55
                r3.m5074m()
            L55:
                return
        }

        @Override // p085f1.AbstractC1969j0
        /* renamed from: s */
        public void mo4936s(p085f1.C1974o.i r2) {
                r1 = this;
                f1.i r0 = r2.m5065d()
                if (r0 == r1) goto L17
                int r2 = r1.m4960y(r2)
                if (r2 < 0) goto L17
                java.util.ArrayList<f1.j0$b$c> r0 = r1.f8657p0
                java.lang.Object r2 = r0.get(r2)
                f1.j0$b$c r2 = (p085f1.AbstractC1969j0.b.c) r2
                r1.mo4946H(r2)
            L17:
                return
        }

        @Override // p085f1.AbstractC1969j0
        /* renamed from: t */
        public void mo4937t(p085f1.C1974o.i r3) {
                r2 = this;
                f1.i r0 = r3.m5065d()
                if (r0 == r2) goto L2c
                int r3 = r2.m4960y(r3)
                if (r3 < 0) goto L2c
                java.util.ArrayList<f1.j0$b$c> r0 = r2.f8657p0
                java.lang.Object r3 = r0.remove(r3)
                f1.j0$b$c r3 = (p085f1.AbstractC1969j0.b.c) r3
                java.lang.Object r0 = r3.f8663b
                android.media.MediaRouter$RouteInfo r0 = (android.media.MediaRouter.RouteInfo) r0
                r1 = 0
                r0.setTag(r1)
                java.lang.Object r0 = r3.f8663b
                p085f1.C1983x.m5080a(r0, r1)
                java.lang.Object r0 = r2.f8649h0
                java.lang.Object r3 = r3.f8663b
                android.media.MediaRouter r0 = (android.media.MediaRouter) r0
                android.media.MediaRouter$UserRouteInfo r3 = (android.media.MediaRouter.UserRouteInfo) r3
                r0.removeUserRoute(r3)
            L2c:
                return
        }

        @Override // p085f1.AbstractC1969j0
        /* renamed from: u */
        public void mo4938u(p085f1.C1974o.i r2) {
                r1 = this;
                boolean r0 = r2.m5069h()
                if (r0 != 0) goto L7
                return
            L7:
                f1.i r0 = r2.m5065d()
                if (r0 == r1) goto L1e
                int r2 = r1.m4960y(r2)
                if (r2 < 0) goto L33
                java.util.ArrayList<f1.j0$b$c> r0 = r1.f8657p0
                java.lang.Object r2 = r0.get(r2)
                f1.j0$b$c r2 = (p085f1.AbstractC1969j0.b.c) r2
                java.lang.Object r2 = r2.f8663b
                goto L30
            L1e:
                java.lang.String r2 = r2.f8734b
                int r2 = r1.m4959x(r2)
                if (r2 < 0) goto L33
                java.util.ArrayList<f1.j0$b$b> r0 = r1.f8656o0
                java.lang.Object r2 = r0.get(r2)
                f1.j0$b$b r2 = (p085f1.AbstractC1969j0.b.C7379b) r2
                java.lang.Object r2 = r2.f8659a
            L30:
                r1.mo4942D(r2)
            L33:
                return
        }

        /* renamed from: v */
        public final boolean m4957v(java.lang.Object r9) {
                r8 = this;
                f1.j0$b$c r0 = r8.m4940A(r9)
                r1 = 0
                if (r0 != 0) goto L75
                int r0 = r8.m4958w(r9)
                if (r0 >= 0) goto L75
                java.lang.Object r0 = r8.mo4961z()
                r2 = 1
                if (r0 != r9) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                if (r0 == 0) goto L1c
                java.lang.String r0 = "DEFAULT_ROUTE"
                goto L42
            L1c:
                java.util.Locale r0 = java.util.Locale.US
                java.lang.Object[] r3 = new java.lang.Object[r2]
                android.content.Context r4 = r8.f8612Y
                r5 = r9
                android.media.MediaRouter$RouteInfo r5 = (android.media.MediaRouter.RouteInfo) r5
                java.lang.CharSequence r4 = r5.getName(r4)
                if (r4 == 0) goto L30
                java.lang.String r4 = r4.toString()
                goto L32
            L30:
                java.lang.String r4 = ""
            L32:
                int r4 = r4.hashCode()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r1] = r4
                java.lang.String r4 = "ROUTE_%08x"
                java.lang.String r0 = java.lang.String.format(r0, r4, r3)
            L42:
                int r3 = r8.m4959x(r0)
                if (r3 >= 0) goto L49
                goto L64
            L49:
                r3 = 2
                r4 = 2
            L4b:
                java.util.Locale r5 = java.util.Locale.US
                java.lang.Object[] r6 = new java.lang.Object[r3]
                r6[r1] = r0
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
                r6[r2] = r7
                java.lang.String r7 = "%s_%d"
                java.lang.String r5 = java.lang.String.format(r5, r7, r6)
                int r6 = r8.m4959x(r5)
                if (r6 >= 0) goto L72
                r0 = r5
            L64:
                f1.j0$b$b r1 = new f1.j0$b$b
                r1.<init>(r9, r0)
                r8.m4944F(r1)
                java.util.ArrayList<f1.j0$b$b> r9 = r8.f8656o0
                r9.add(r1)
                return r2
            L72:
                int r4 = r4 + 1
                goto L4b
            L75:
                return r1
        }

        /* renamed from: w */
        public int m4958w(java.lang.Object r4) {
                r3 = this;
                java.util.ArrayList<f1.j0$b$b> r0 = r3.f8656o0
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L19
                java.util.ArrayList<f1.j0$b$b> r2 = r3.f8656o0
                java.lang.Object r2 = r2.get(r1)
                f1.j0$b$b r2 = (p085f1.AbstractC1969j0.b.C7379b) r2
                java.lang.Object r2 = r2.f8659a
                if (r2 != r4) goto L16
                return r1
            L16:
                int r1 = r1 + 1
                goto L7
            L19:
                r4 = -1
                return r4
        }

        /* renamed from: x */
        public int m4959x(java.lang.String r4) {
                r3 = this;
                java.util.ArrayList<f1.j0$b$b> r0 = r3.f8656o0
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L1d
                java.util.ArrayList<f1.j0$b$b> r2 = r3.f8656o0
                java.lang.Object r2 = r2.get(r1)
                f1.j0$b$b r2 = (p085f1.AbstractC1969j0.b.C7379b) r2
                java.lang.String r2 = r2.f8660b
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L1a
                return r1
            L1a:
                int r1 = r1 + 1
                goto L7
            L1d:
                r4 = -1
                return r4
        }

        /* renamed from: y */
        public int m4960y(p085f1.C1974o.i r4) {
                r3 = this;
                java.util.ArrayList<f1.j0$b$c> r0 = r3.f8657p0
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L19
                java.util.ArrayList<f1.j0$b$c> r2 = r3.f8657p0
                java.lang.Object r2 = r2.get(r1)
                f1.j0$b$c r2 = (p085f1.AbstractC1969j0.b.c) r2
                f1.o$i r2 = r2.f8662a
                if (r2 != r4) goto L16
                return r1
            L16:
                int r1 = r1 + 1
                goto L7
            L19:
                r4 = -1
                return r4
        }

        /* renamed from: z */
        public java.lang.Object mo4961z() {
                r0 = this;
                r0 = 0
                throw r0
        }
    }

    /* renamed from: f1.j0$c */
    public static class c extends p085f1.AbstractC1969j0.b implements p085f1.InterfaceC1951a0 {
        public c(android.content.Context r1, p085f1.AbstractC1969j0.e r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // p085f1.AbstractC1969j0.b
        /* renamed from: B */
        public void mo4939B(p085f1.AbstractC1969j0.b.C7379b r4, p085f1.C1962g.a r5) {
                r3 = this;
                super.mo4939B(r4, r5)
                java.lang.Object r0 = r4.f8659a
                android.media.MediaRouter$RouteInfo r0 = (android.media.MediaRouter.RouteInfo) r0
                boolean r0 = r0.isEnabled()
                if (r0 != 0) goto L15
                r0 = 0
                android.os.Bundle r1 = r5.f8594a
                java.lang.String r2 = "enabled"
                r1.putBoolean(r2, r0)
            L15:
                boolean r0 = r3.mo4962I(r4)
                if (r0 == 0) goto L1f
                r0 = 1
                r5.m4922c(r0)
            L1f:
                java.lang.Object r4 = r4.f8659a
                android.media.MediaRouter$RouteInfo r4 = (android.media.MediaRouter.RouteInfo) r4     // Catch: java.lang.NoSuchMethodError -> L28
                android.view.Display r4 = r4.getPresentationDisplay()     // Catch: java.lang.NoSuchMethodError -> L28
                goto L31
            L28:
                r4 = move-exception
                java.lang.String r0 = "MediaRouterJellybeanMr1"
                java.lang.String r1 = "Cannot get presentation display for the route."
                android.util.Log.w(r0, r1, r4)
                r4 = 0
            L31:
                if (r4 == 0) goto L3e
                int r4 = r4.getDisplayId()
                android.os.Bundle r5 = r5.f8594a
                java.lang.String r0 = "presentationDisplayId"
                r5.putInt(r0, r4)
            L3e:
                return
        }

        /* renamed from: I */
        public boolean mo4962I(p085f1.AbstractC1969j0.b.C7379b r1) {
                r0 = this;
                r0 = 0
                throw r0
        }

        @Override // p085f1.InterfaceC1951a0
        /* renamed from: a */
        public void mo4862a(java.lang.Object r7) {
                r6 = this;
                int r0 = r6.m4958w(r7)
                if (r0 < 0) goto L87
                java.util.ArrayList<f1.j0$b$b> r1 = r6.f8656o0
                java.lang.Object r0 = r1.get(r0)
                f1.j0$b$b r0 = (p085f1.AbstractC1969j0.b.C7379b) r0
                r1 = 0
                android.media.MediaRouter$RouteInfo r7 = (android.media.MediaRouter.RouteInfo) r7     // Catch: java.lang.NoSuchMethodError -> L16
                android.view.Display r7 = r7.getPresentationDisplay()     // Catch: java.lang.NoSuchMethodError -> L16
                goto L1f
            L16:
                r7 = move-exception
                java.lang.String r2 = "MediaRouterJellybeanMr1"
                java.lang.String r3 = "Cannot get presentation display for the route."
                android.util.Log.w(r2, r3, r7)
                r7 = r1
            L1f:
                if (r7 == 0) goto L26
                int r7 = r7.getDisplayId()
                goto L27
            L26:
                r7 = -1
            L27:
                f1.g r2 = r0.f8661c
                int r2 = r2.m4914m()
                if (r7 == r2) goto L87
                f1.g r2 = r0.f8661c
                if (r2 == 0) goto L7f
                android.os.Bundle r3 = new android.os.Bundle
                android.os.Bundle r4 = r2.f8591a
                r3.<init>(r4)
                java.util.List r4 = r2.m4908g()
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L4e
                java.util.ArrayList r4 = new java.util.ArrayList
                java.util.List r5 = r2.m4908g()
                r4.<init>(r5)
                goto L4f
            L4e:
                r4 = r1
            L4f:
                r2.m4903a()
                java.util.List<android.content.IntentFilter> r5 = r2.f8593c
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L61
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.List<android.content.IntentFilter> r2 = r2.f8593c
                r1.<init>(r2)
            L61:
                java.lang.String r2 = "presentationDisplayId"
                r3.putInt(r2, r7)
                if (r1 == 0) goto L6d
                java.lang.String r7 = "controlFilters"
                r3.putParcelableArrayList(r7, r1)
            L6d:
                if (r4 == 0) goto L74
                java.lang.String r7 = "groupMemberIds"
                r3.putStringArrayList(r7, r4)
            L74:
                f1.g r7 = new f1.g
                r7.<init>(r3)
                r0.f8661c = r7
                r6.m4941C()
                goto L87
            L7f:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "descriptor must not be null"
                r7.<init>(r0)
                throw r7
            L87:
                return
        }
    }

    /* renamed from: f1.j0$d */
    public static class d extends p085f1.AbstractC1969j0.c {
        public d(android.content.Context r1, p085f1.AbstractC1969j0.e r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // p085f1.AbstractC1969j0.c, p085f1.AbstractC1969j0.b
        /* renamed from: B */
        public void mo4939B(p085f1.AbstractC1969j0.b.C7379b r2, p085f1.C1962g.a r3) {
                r1 = this;
                super.mo4939B(r2, r3)
                java.lang.Object r2 = r2.f8659a
                android.media.MediaRouter$RouteInfo r2 = (android.media.MediaRouter.RouteInfo) r2
                java.lang.CharSequence r2 = r2.getDescription()
                if (r2 == 0) goto L18
                java.lang.String r2 = r2.toString()
                android.os.Bundle r3 = r3.f8594a
                java.lang.String r0 = "status"
                r3.putString(r0, r2)
            L18:
                return
        }

        @Override // p085f1.AbstractC1969j0.b
        /* renamed from: D */
        public void mo4942D(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.f8649h0
                android.media.MediaRouter r0 = (android.media.MediaRouter) r0
                android.media.MediaRouter$RouteInfo r3 = (android.media.MediaRouter.RouteInfo) r3
                r1 = 8388611(0x800003, float:1.1754948E-38)
                r0.selectRoute(r1, r3)
                return
        }

        @Override // p085f1.AbstractC1969j0.b
        /* renamed from: E */
        public void mo4943E() {
                r4 = this;
                boolean r0 = r4.f8655n0
                if (r0 == 0) goto Lf
                java.lang.Object r0 = r4.f8649h0
                java.lang.Object r1 = r4.f8650i0
                android.media.MediaRouter r0 = (android.media.MediaRouter) r0
                android.media.MediaRouter$Callback r1 = (android.media.MediaRouter.Callback) r1
                r0.removeCallback(r1)
            Lf:
                r0 = 1
                r4.f8655n0 = r0
                java.lang.Object r0 = r4.f8649h0
                int r1 = r4.f8653l0
                java.lang.Object r2 = r4.f8650i0
                boolean r3 = r4.f8654m0
                r3 = r3 | 2
                android.media.MediaRouter r0 = (android.media.MediaRouter) r0
                android.media.MediaRouter$Callback r2 = (android.media.MediaRouter.Callback) r2
                r0.addCallback(r1, r2, r3)
                return
        }

        @Override // p085f1.AbstractC1969j0.b
        /* renamed from: H */
        public void mo4946H(p085f1.AbstractC1969j0.b.c r2) {
                r1 = this;
                super.mo4946H(r2)
                java.lang.Object r0 = r2.f8663b
                f1.o$i r2 = r2.f8662a
                java.lang.String r2 = r2.f8737e
                android.media.MediaRouter$UserRouteInfo r0 = (android.media.MediaRouter.UserRouteInfo) r0
                r0.setDescription(r2)
                return
        }

        @Override // p085f1.AbstractC1969j0.c
        /* renamed from: I */
        public boolean mo4962I(p085f1.AbstractC1969j0.b.C7379b r1) {
                r0 = this;
                java.lang.Object r1 = r1.f8659a
                android.media.MediaRouter$RouteInfo r1 = (android.media.MediaRouter.RouteInfo) r1
                boolean r1 = r1.isConnecting()
                return r1
        }

        @Override // p085f1.AbstractC1969j0.b
        /* renamed from: z */
        public java.lang.Object mo4961z() {
                r1 = this;
                java.lang.Object r0 = r1.f8649h0
                android.media.MediaRouter r0 = (android.media.MediaRouter) r0
                android.media.MediaRouter$RouteInfo r0 = r0.getDefaultRoute()
                return r0
        }
    }

    /* renamed from: f1.j0$e */
    public interface e {
    }

    public AbstractC1969j0(android.content.Context r5) {
            r4 = this;
            f1.i$d r0 = new f1.i$d
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<f1.j0> r2 = p085f1.AbstractC1969j0.class
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "android"
            r1.<init>(r3, r2)
            r0.<init>(r1)
            r4.<init>(r5, r0)
            return
    }

    /* renamed from: r */
    public void mo4935r(p085f1.C1974o.i r1) {
            r0 = this;
            return
    }

    /* renamed from: s */
    public void mo4936s(p085f1.C1974o.i r1) {
            r0 = this;
            return
    }

    /* renamed from: t */
    public void mo4937t(p085f1.C1974o.i r1) {
            r0 = this;
            return
    }

    /* renamed from: u */
    public void mo4938u(p085f1.C1974o.i r1) {
            r0 = this;
            return
    }
}
