package p085f1;

/* renamed from: f1.e */
/* loaded from: classes.dex */
public class C1958e extends p085f1.AbstractC1966i {

    /* renamed from: p0 */
    public static final /* synthetic */ int f8524p0 = 0;

    /* renamed from: g0 */
    public final android.media.MediaRouter2 f8525g0;

    /* renamed from: h0 */
    public final p085f1.C1958e.a f8526h0;

    /* renamed from: i0 */
    public final java.util.Map<android.media.MediaRouter2.RoutingController, p085f1.C1958e.c> f8527i0;

    /* renamed from: j0 */
    public final android.media.MediaRouter2.RouteCallback f8528j0;

    /* renamed from: k0 */
    public final android.media.MediaRouter2.TransferCallback f8529k0;

    /* renamed from: l0 */
    public final android.media.MediaRouter2.ControllerCallback f8530l0;

    /* renamed from: m0 */
    public final java.util.concurrent.Executor f8531m0;

    /* renamed from: n0 */
    public java.util.List<android.media.MediaRoute2Info> f8532n0;

    /* renamed from: o0 */
    public java.util.Map<java.lang.String, java.lang.String> f8533o0;

    /* renamed from: f1.e$a */
    public static abstract class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: f1.e$b */
    public class b extends android.media.MediaRouter2.ControllerCallback {

        /* renamed from: a */
        public final /* synthetic */ p085f1.C1958e f8534a;

        public b(p085f1.C1958e r1) {
                r0 = this;
                r0.f8534a = r1
                r0.<init>()
                return
        }

        @Override // android.media.MediaRouter2.ControllerCallback
        public void onControllerUpdated(android.media.MediaRouter2.RoutingController r2) {
                r1 = this;
                f1.e r0 = r1.f8534a
                r0.m4869t(r2)
                return
        }
    }

    /* renamed from: f1.e$c */
    public class c extends p085f1.AbstractC1966i.b {

        /* renamed from: f */
        public final java.lang.String f8535f;

        /* renamed from: g */
        public final android.media.MediaRouter2.RoutingController f8536g;

        /* renamed from: h */
        public final android.os.Messenger f8537h;

        /* renamed from: i */
        public final android.os.Messenger f8538i;

        /* renamed from: j */
        public final android.util.SparseArray<p085f1.C1974o.d> f8539j;

        /* renamed from: k */
        public final android.os.Handler f8540k;

        /* renamed from: l */
        public java.util.concurrent.atomic.AtomicInteger f8541l;

        /* renamed from: m */
        public final java.lang.Runnable f8542m;

        /* renamed from: n */
        public int f8543n;

        /* renamed from: o */
        public final /* synthetic */ p085f1.C1958e f8544o;

        /* renamed from: f1.e$c$a */
        public class a extends android.os.Handler {

            /* renamed from: a */
            public final /* synthetic */ p085f1.C1958e.c f8545a;

            public a(p085f1.C1958e.c r1) {
                    r0 = this;
                    r0.f8545a = r1
                    android.os.Looper r1 = android.os.Looper.getMainLooper()
                    r0.<init>(r1)
                    return
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message r6) {
                    r5 = this;
                    int r0 = r6.what
                    int r1 = r6.arg1
                    java.lang.Object r2 = r6.obj
                    android.os.Bundle r6 = r6.peekData()
                    f1.e$c r3 = r5.f8545a
                    android.util.SparseArray<f1.o$d> r3 = r3.f8539j
                    java.lang.Object r3 = r3.get(r1)
                    f1.o$d r3 = (p085f1.C1974o.d) r3
                    if (r3 != 0) goto L1e
                    java.lang.String r6 = "MR2Provider"
                    java.lang.String r0 = "Pending callback not found for control request."
                    android.util.Log.w(r6, r0)
                    return
                L1e:
                    f1.e$c r4 = r5.f8545a
                    android.util.SparseArray<f1.o$d> r4 = r4.f8539j
                    r4.remove(r1)
                    r1 = 3
                    if (r0 == r1) goto L3c
                    r1 = 4
                    if (r0 == r1) goto L2c
                    goto L41
                L2c:
                    if (r6 != 0) goto L30
                    r6 = 0
                    goto L36
                L30:
                    java.lang.String r0 = "error"
                    java.lang.String r6 = r6.getString(r0)
                L36:
                    android.os.Bundle r2 = (android.os.Bundle) r2
                    r3.mo4900a(r6, r2)
                    goto L41
                L3c:
                    android.os.Bundle r2 = (android.os.Bundle) r2
                    r3.mo4901b(r2)
                L41:
                    return
            }
        }

        public c(p085f1.C1958e r2, android.media.MediaRouter2.RoutingController r3, java.lang.String r4) {
                r1 = this;
                r1.f8544o = r2
                r1.<init>()
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                r1.f8539j = r2
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r0 = 1
                r2.<init>(r0)
                r1.f8541l = r2
                f1.f r2 = new f1.f
                r2.<init>(r1)
                r1.f8542m = r2
                r2 = -1
                r1.f8543n = r2
                r1.f8536g = r3
                r1.f8535f = r4
                int r2 = p085f1.C1958e.f8524p0
                android.os.Bundle r2 = r3.getControlHints()
                r3 = 0
                if (r2 != 0) goto L2d
                r2 = r3
                goto L35
            L2d:
                java.lang.String r4 = "androidx.mediarouter.media.KEY_MESSENGER"
                android.os.Parcelable r2 = r2.getParcelable(r4)
                android.os.Messenger r2 = (android.os.Messenger) r2
            L35:
                r1.f8537h = r2
                if (r2 != 0) goto L3a
                goto L44
            L3a:
                android.os.Messenger r3 = new android.os.Messenger
                f1.e$c$a r2 = new f1.e$c$a
                r2.<init>(r1)
                r3.<init>(r2)
            L44:
                r1.f8538i = r3
                android.os.Handler r2 = new android.os.Handler
                android.os.Looper r3 = android.os.Looper.getMainLooper()
                r2.<init>(r3)
                r1.f8540k = r2
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: d */
        public void mo4870d() {
                r1 = this;
                android.media.MediaRouter2$RoutingController r0 = r1.f8536g
                r0.release()
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: f */
        public void mo4871f(int r4) {
                r3 = this;
                android.media.MediaRouter2$RoutingController r0 = r3.f8536g
                if (r0 != 0) goto L5
                return
            L5:
                r0.setVolume(r4)
                r3.f8543n = r4
                android.os.Handler r4 = r3.f8540k
                java.lang.Runnable r0 = r3.f8542m
                r4.removeCallbacks(r0)
                android.os.Handler r4 = r3.f8540k
                java.lang.Runnable r0 = r3.f8542m
                r1 = 1000(0x3e8, double:4.94E-321)
                r4.postDelayed(r0, r1)
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: i */
        public void mo4872i(int r4) {
                r3 = this;
                android.media.MediaRouter2$RoutingController r0 = r3.f8536g
                if (r0 != 0) goto L5
                return
            L5:
                int r1 = r3.f8543n
                if (r1 >= 0) goto Ld
                int r1 = r0.getVolume()
            Ld:
                r0 = 0
                int r1 = r1 + r4
                android.media.MediaRouter2$RoutingController r4 = r3.f8536g
                int r4 = r4.getVolumeMax()
                int r4 = java.lang.Math.min(r1, r4)
                int r4 = java.lang.Math.max(r0, r4)
                r3.f8543n = r4
                android.media.MediaRouter2$RoutingController r0 = r3.f8536g
                r0.setVolume(r4)
                android.os.Handler r4 = r3.f8540k
                java.lang.Runnable r0 = r3.f8542m
                r4.removeCallbacks(r0)
                android.os.Handler r4 = r3.f8540k
                java.lang.Runnable r0 = r3.f8542m
                r1 = 1000(0x3e8, double:4.94E-321)
                r4.postDelayed(r0, r1)
                return
        }

        @Override // p085f1.AbstractC1966i.b
        /* renamed from: m */
        public void mo4873m(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "MR2Provider"
                if (r4 == 0) goto L2e
                boolean r1 = r4.isEmpty()
                if (r1 == 0) goto Lb
                goto L2e
            Lb:
                f1.e r1 = r3.f8544o
                android.media.MediaRoute2Info r1 = r1.m4867r(r4)
                if (r1 != 0) goto L28
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onAddMemberRoute: Specified route not found. routeId="
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                android.util.Log.w(r0, r4)
                return
            L28:
                android.media.MediaRouter2$RoutingController r4 = r3.f8536g
                r4.selectRoute(r1)
                return
            L2e:
                java.lang.String r4 = "onAddMemberRoute: Ignoring null or empty routeId."
                android.util.Log.w(r0, r4)
                return
        }

        @Override // p085f1.AbstractC1966i.b
        /* renamed from: n */
        public void mo4874n(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "MR2Provider"
                if (r4 == 0) goto L2e
                boolean r1 = r4.isEmpty()
                if (r1 == 0) goto Lb
                goto L2e
            Lb:
                f1.e r1 = r3.f8544o
                android.media.MediaRoute2Info r1 = r1.m4867r(r4)
                if (r1 != 0) goto L28
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onRemoveMemberRoute: Specified route not found. routeId="
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                android.util.Log.w(r0, r4)
                return
            L28:
                android.media.MediaRouter2$RoutingController r4 = r3.f8536g
                r4.deselectRoute(r1)
                return
            L2e:
                java.lang.String r4 = "onRemoveMemberRoute: Ignoring null or empty routeId."
                android.util.Log.w(r0, r4)
                return
        }

        @Override // p085f1.AbstractC1966i.b
        /* renamed from: o */
        public void mo4875o(java.util.List<java.lang.String> r4) {
                r3 = this;
                java.lang.String r0 = "MR2Provider"
                if (r4 == 0) goto L37
                boolean r1 = r4.isEmpty()
                if (r1 == 0) goto Lb
                goto L37
            Lb:
                r1 = 0
                java.lang.Object r4 = r4.get(r1)
                java.lang.String r4 = (java.lang.String) r4
                f1.e r1 = r3.f8544o
                android.media.MediaRoute2Info r1 = r1.m4867r(r4)
                if (r1 != 0) goto L2f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onUpdateMemberRoutes: Specified route not found. routeId="
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                android.util.Log.w(r0, r4)
                return
            L2f:
                f1.e r4 = r3.f8544o
                android.media.MediaRouter2 r4 = r4.f8525g0
                r4.transferTo(r1)
                return
            L37:
                java.lang.String r4 = "onUpdateMemberRoutes: Ignoring null or empty routeIds."
                android.util.Log.w(r0, r4)
                return
        }
    }

    /* renamed from: f1.e$d */
    public class d extends p085f1.AbstractC1966i.e {

        /* renamed from: a */
        public final java.lang.String f8546a;

        /* renamed from: b */
        public final p085f1.C1958e.c f8547b;

        public d(p085f1.C1958e r1, java.lang.String r2, p085f1.C1958e.c r3) {
                r0 = this;
                r0.<init>()
                r0.f8546a = r2
                r0.f8547b = r3
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: f */
        public void mo4871f(int r6) {
                r5 = this;
                java.lang.String r0 = r5.f8546a
                if (r0 == 0) goto L3c
                f1.e$c r1 = r5.f8547b
                if (r1 != 0) goto L9
                goto L3c
            L9:
                java.util.concurrent.atomic.AtomicInteger r2 = r1.f8541l
                int r2 = r2.getAndIncrement()
                android.os.Message r3 = android.os.Message.obtain()
                r4 = 7
                r3.what = r4
                r3.arg1 = r2
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                java.lang.String r4 = "volume"
                r2.putInt(r4, r6)
                java.lang.String r6 = "routeId"
                r2.putString(r6, r0)
                r3.setData(r2)
                android.os.Messenger r6 = r1.f8538i
                r3.replyTo = r6
                android.os.Messenger r6 = r1.f8537h     // Catch: android.os.RemoteException -> L34 android.os.DeadObjectException -> L3c
                r6.send(r3)     // Catch: android.os.RemoteException -> L34 android.os.DeadObjectException -> L3c
                goto L3c
            L34:
                r6 = move-exception
                java.lang.String r0 = "MR2Provider"
                java.lang.String r1 = "Could not send control request to service."
                android.util.Log.e(r0, r1, r6)
            L3c:
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: i */
        public void mo4872i(int r6) {
                r5 = this;
                java.lang.String r0 = r5.f8546a
                if (r0 == 0) goto L3d
                f1.e$c r1 = r5.f8547b
                if (r1 != 0) goto L9
                goto L3d
            L9:
                java.util.concurrent.atomic.AtomicInteger r2 = r1.f8541l
                int r2 = r2.getAndIncrement()
                android.os.Message r3 = android.os.Message.obtain()
                r4 = 8
                r3.what = r4
                r3.arg1 = r2
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                java.lang.String r4 = "volume"
                r2.putInt(r4, r6)
                java.lang.String r6 = "routeId"
                r2.putString(r6, r0)
                r3.setData(r2)
                android.os.Messenger r6 = r1.f8538i
                r3.replyTo = r6
                android.os.Messenger r6 = r1.f8537h     // Catch: android.os.RemoteException -> L35 android.os.DeadObjectException -> L3d
                r6.send(r3)     // Catch: android.os.RemoteException -> L35 android.os.DeadObjectException -> L3d
                goto L3d
            L35:
                r6 = move-exception
                java.lang.String r0 = "MR2Provider"
                java.lang.String r1 = "Could not send control request to service."
                android.util.Log.e(r0, r1, r6)
            L3d:
                return
        }
    }

    /* renamed from: f1.e$e */
    public class e extends android.media.MediaRouter2.RouteCallback {

        /* renamed from: a */
        public final /* synthetic */ p085f1.C1958e f8548a;

        public e(p085f1.C1958e r1) {
                r0 = this;
                r0.f8548a = r1
                r0.<init>()
                return
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public void onRoutesAdded(java.util.List<android.media.MediaRoute2Info> r1) {
                r0 = this;
                f1.e r1 = r0.f8548a
                r1.m4868s()
                return
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public void onRoutesChanged(java.util.List<android.media.MediaRoute2Info> r1) {
                r0 = this;
                f1.e r1 = r0.f8548a
                r1.m4868s()
                return
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public void onRoutesRemoved(java.util.List<android.media.MediaRoute2Info> r1) {
                r0 = this;
                f1.e r1 = r0.f8548a
                r1.m4868s()
                return
        }
    }

    /* renamed from: f1.e$f */
    public class f extends android.media.MediaRouter2.TransferCallback {

        /* renamed from: a */
        public final /* synthetic */ p085f1.C1958e f8549a;

        public f(p085f1.C1958e r1) {
                r0 = this;
                r0.f8549a = r1
                r0.<init>()
                return
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public void onStop(android.media.MediaRouter2.RoutingController r4) {
                r3 = this;
                f1.e r0 = r3.f8549a
                java.util.Map<android.media.MediaRouter2$RoutingController, f1.e$c> r0 = r0.f8527i0
                java.lang.Object r0 = r0.remove(r4)
                f1.i$e r0 = (p085f1.AbstractC1966i.e) r0
                if (r0 == 0) goto L46
                f1.e r4 = r3.f8549a
                f1.e$a r4 = r4.f8526h0
                f1.o$e$e r4 = (p085f1.C1974o.e.C7380e) r4
                f1.o$e r1 = r4.f8715a
                f1.i$e r2 = r1.f8698r
                if (r0 != r2) goto L2b
                r0 = 2
                f1.o$i r1 = r1.m5038c()
                f1.o$e r2 = r4.f8715a
                f1.o$i r2 = r2.m5042g()
                if (r2 == r1) goto L5c
                f1.o$e r4 = r4.f8715a
                r4.m5047l(r1, r0)
                goto L5c
            L2b:
                boolean r4 = p085f1.C1974o.f8669c
                if (r4 == 0) goto L5c
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r1 = "A RouteController unrelated to the selected route is released. controller="
                r4.append(r1)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = "MediaRouter"
                android.util.Log.d(r0, r4)
                goto L5c
            L46:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onStop: No matching routeController found. routingController="
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.String r0 = "MR2Provider"
                android.util.Log.w(r0, r4)
            L5c:
                return
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public void onTransfer(android.media.MediaRouter2.RoutingController r7, android.media.MediaRouter2.RoutingController r8) {
                r6 = this;
                f1.e r0 = r6.f8549a
                java.util.Map<android.media.MediaRouter2$RoutingController, f1.e$c> r0 = r0.f8527i0
                r0.remove(r7)
                f1.e r7 = r6.f8549a
                android.media.MediaRouter2 r7 = r7.f8525g0
                android.media.MediaRouter2$RoutingController r7 = r7.getSystemController()
                r0 = 3
                if (r8 != r7) goto L2d
                f1.e r7 = r6.f8549a
                f1.e$a r7 = r7.f8526h0
                f1.o$e$e r7 = (p085f1.C1974o.e.C7380e) r7
                f1.o$e r8 = r7.f8715a
                f1.o$i r8 = r8.m5038c()
                f1.o$e r1 = r7.f8715a
                f1.o$i r1 = r1.m5042g()
                if (r1 == r8) goto Laa
                f1.o$e r7 = r7.f8715a
                r7.m5047l(r8, r0)
                goto Laa
            L2d:
                java.util.List r7 = r8.getSelectedRoutes()
                boolean r1 = r7.isEmpty()
                if (r1 == 0) goto L3f
                java.lang.String r7 = "MR2Provider"
                java.lang.String r8 = "Selected routes are empty. This shouldn't happen."
                android.util.Log.w(r7, r8)
                return
            L3f:
                r1 = 0
                java.lang.Object r7 = r7.get(r1)
                android.media.MediaRoute2Info r7 = (android.media.MediaRoute2Info) r7
                java.lang.String r7 = r7.getId()
                f1.e$c r1 = new f1.e$c
                f1.e r2 = r6.f8549a
                r1.<init>(r2, r8, r7)
                f1.e r2 = r6.f8549a
                java.util.Map<android.media.MediaRouter2$RoutingController, f1.e$c> r2 = r2.f8527i0
                r2.put(r8, r1)
                f1.e r1 = r6.f8549a
                f1.e$a r1 = r1.f8526h0
                f1.o$e$e r1 = (p085f1.C1974o.e.C7380e) r1
                f1.o$e r2 = r1.f8715a
                java.util.ArrayList<f1.o$i> r2 = r2.f8685e
                java.util.Iterator r2 = r2.iterator()
            L66:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L86
                java.lang.Object r3 = r2.next()
                f1.o$i r3 = (p085f1.C1974o.i) r3
                f1.i r4 = r3.m5065d()
                f1.o$e r5 = r1.f8715a
                f1.e r5 = r5.f8683c
                if (r4 == r5) goto L7d
                goto L66
            L7d:
                java.lang.String r4 = r3.f8734b
                boolean r4 = android.text.TextUtils.equals(r7, r4)
                if (r4 == 0) goto L66
                goto L87
            L86:
                r3 = 0
            L87:
                if (r3 != 0) goto La0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onSelectRoute: The target RouteInfo is not found for descriptorId="
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.String r0 = "MediaRouter"
                android.util.Log.w(r0, r7)
                goto La5
            La0:
                f1.o$e r7 = r1.f8715a
                r7.m5047l(r3, r0)
            La5:
                f1.e r7 = r6.f8549a
                r7.m4869t(r8)
            Laa:
                return
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public void onTransferFailure(android.media.MediaRoute2Info r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Transfer failed. requestedRoute="
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "MR2Provider"
                android.util.Log.w(r0, r3)
                return
        }
    }

    static {
            java.lang.String r0 = "MR2Provider"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)
            return
    }

    public C1958e(android.content.Context r2, p085f1.C1958e.a r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r0.<init>()
            r1.f8527i0 = r0
            f1.e$e r0 = new f1.e$e
            r0.<init>(r1)
            r1.f8528j0 = r0
            f1.e$f r0 = new f1.e$f
            r0.<init>(r1)
            r1.f8529k0 = r0
            f1.e$b r0 = new f1.e$b
            r0.<init>(r1)
            r1.f8530l0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f8532n0 = r0
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r0.<init>()
            r1.f8533o0 = r0
            android.media.MediaRouter2 r2 = android.media.MediaRouter2.getInstance(r2)
            r1.f8525g0 = r2
            r1.f8526h0 = r3
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            f1.a r3 = new f1.a
            r0 = 0
            r3.<init>(r2, r0)
            r1.f8531m0 = r3
            return
    }

    @Override // p085f1.AbstractC1966i
    /* renamed from: l */
    public p085f1.AbstractC1966i.b mo4863l(java.lang.String r4) {
            r3 = this;
            java.util.Map<android.media.MediaRouter2$RoutingController, f1.e$c> r0 = r3.f8527i0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            f1.e$c r1 = (p085f1.C1958e.c) r1
            java.lang.String r2 = r1.f8535f
            boolean r2 = android.text.TextUtils.equals(r4, r2)
            if (r2 == 0) goto La
            return r1
        L25:
            r4 = 0
            return r4
    }

    @Override // p085f1.AbstractC1966i
    /* renamed from: m */
    public p085f1.AbstractC1966i.e mo4864m(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f8533o0
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            f1.e$d r0 = new f1.e$d
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // p085f1.AbstractC1966i
    /* renamed from: n */
    public p085f1.AbstractC1966i.e mo4865n(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f8533o0
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map<android.media.MediaRouter2$RoutingController, f1.e$c> r1 = r4.f8527i0
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            f1.e$c r2 = (p085f1.C1958e.c) r2
            android.media.MediaRouter2$RoutingController r3 = r2.f8536g
            java.lang.String r3 = r3.getId()
            boolean r3 = android.text.TextUtils.equals(r6, r3)
            if (r3 == 0) goto L12
            f1.e$d r5 = new f1.e$d
            r5.<init>(r4, r0, r2)
            return r5
        L30:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not find the matching GroupRouteController. routeId="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ", routeGroupId="
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            java.lang.String r6 = "MR2Provider"
            android.util.Log.w(r6, r5)
            f1.e$d r5 = new f1.e$d
            r6 = 0
            r5.<init>(r4, r0, r6)
            return r5
    }

    @Override // p085f1.AbstractC1966i
    /* renamed from: o */
    public void mo4866o(p085f1.C1964h r9) {
            r8 = this;
            f1.o$e r0 = p085f1.C1974o.f8670d
            r1 = 0
            if (r0 != 0) goto L7
            r2 = 0
            goto L9
        L7:
            int r2 = r0.f8704x
        L9:
            if (r2 <= 0) goto L10a
            if (r0 != 0) goto Le
            goto L12
        Le:
            f1.c0 r0 = r0.f8694n
            if (r0 != 0) goto L14
        L12:
            r0 = 0
            goto L16
        L14:
            boolean r0 = r0.f8516c
        L16:
            if (r9 != 0) goto L1f
            f1.h r9 = new f1.h
            f1.n r2 = p085f1.C1973n.f8666c
            r9.<init>(r2, r1)
        L1f:
            r9.m4928a()
            f1.n r2 = r9.f8601b
            r2.m5023a()
            java.util.List<java.lang.String> r2 = r2.f8668b
            java.lang.String r3 = "android.media.intent.category.LIVE_AUDIO"
            if (r0 == 0) goto L37
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L3a
            r2.add(r3)
            goto L3a
        L37:
            r2.remove(r3)
        L3a:
            if (r2 == 0) goto L102
            boolean r0 = r2.isEmpty()
            r3 = 0
            if (r0 != 0) goto L6f
            java.util.Iterator r0 = r2.iterator()
            r2 = r3
        L48:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L70
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L67
            if (r2 != 0) goto L5d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L5d:
            boolean r5 = r2.contains(r4)
            if (r5 != 0) goto L48
            r2.add(r4)
            goto L48
        L67:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "category must not be null"
            r9.<init>(r0)
            throw r9
        L6f:
            r2 = r3
        L70:
            if (r2 != 0) goto L75
            f1.n r0 = p085f1.C1973n.f8666c
            goto L85
        L75:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r4 = "controlCategories"
            r0.putStringArrayList(r4, r2)
            f1.n r4 = new f1.n
            r4.<init>(r0, r2)
            r0 = r4
        L85:
            boolean r9 = r9.m4929b()
            if (r0 == 0) goto Lfa
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.os.Bundle r4 = r0.f8667a
            java.lang.String r5 = "selector"
            r2.putBundle(r5, r4)
            java.lang.String r4 = "activeScan"
            r2.putBoolean(r4, r9)
            android.media.MediaRouter2 r9 = r8.f8525g0
            java.util.concurrent.Executor r5 = r8.f8531m0
            android.media.MediaRouter2$RouteCallback r6 = r8.f8528j0
            r0.m5023a()
            java.util.List<java.lang.String> r7 = r0.f8668b
            boolean r3 = r7.contains(r3)
            r3 = r3 ^ 1
            if (r3 != 0) goto Lbe
            android.media.RouteDiscoveryPreference$Builder r0 = new android.media.RouteDiscoveryPreference$Builder
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.<init>(r2, r1)
            android.media.RouteDiscoveryPreference r0 = r0.build()
            goto Le4
        Lbe:
            boolean r1 = r2.getBoolean(r4)
            r0.m5023a()
            java.util.List<java.lang.String> r0 = r0.f8668b
            java.util.stream.Stream r0 = r0.stream()
            f1.b r2 = p085f1.C1952b.f8510c
            java.util.stream.Stream r0 = r0.map(r2)
            java.util.stream.Collector r2 = java.util.stream.Collectors.toList()
            java.lang.Object r0 = r0.collect(r2)
            java.util.List r0 = (java.util.List) r0
            android.media.RouteDiscoveryPreference$Builder r2 = new android.media.RouteDiscoveryPreference$Builder
            r2.<init>(r0, r1)
            android.media.RouteDiscoveryPreference r0 = r2.build()
        Le4:
            r9.registerRouteCallback(r5, r6, r0)
            android.media.MediaRouter2 r9 = r8.f8525g0
            java.util.concurrent.Executor r0 = r8.f8531m0
            android.media.MediaRouter2$TransferCallback r1 = r8.f8529k0
            r9.registerTransferCallback(r0, r1)
            android.media.MediaRouter2 r9 = r8.f8525g0
            java.util.concurrent.Executor r0 = r8.f8531m0
            android.media.MediaRouter2$ControllerCallback r1 = r8.f8530l0
            r9.registerControllerCallback(r0, r1)
            goto L11f
        Lfa:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "selector must not be null"
            r9.<init>(r0)
            throw r9
        L102:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "categories must not be null"
            r9.<init>(r0)
            throw r9
        L10a:
            android.media.MediaRouter2 r9 = r8.f8525g0
            android.media.MediaRouter2$RouteCallback r0 = r8.f8528j0
            r9.unregisterRouteCallback(r0)
            android.media.MediaRouter2 r9 = r8.f8525g0
            android.media.MediaRouter2$TransferCallback r0 = r8.f8529k0
            r9.unregisterTransferCallback(r0)
            android.media.MediaRouter2 r9 = r8.f8525g0
            android.media.MediaRouter2$ControllerCallback r0 = r8.f8530l0
            r9.unregisterControllerCallback(r0)
        L11f:
            return
    }

    /* renamed from: r */
    public android.media.MediaRoute2Info m4867r(java.lang.String r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.List<android.media.MediaRoute2Info> r1 = r4.f8532n0
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            android.media.MediaRoute2Info r2 = (android.media.MediaRoute2Info) r2
            java.lang.String r3 = r2.getId()
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 == 0) goto La
            return r2
        L21:
            return r0
    }

    /* renamed from: s */
    public void m4868s() {
            r5 = this;
            android.media.MediaRouter2 r0 = r5.f8525g0
            java.util.List r0 = r0.getRoutes()
            java.util.stream.Stream r0 = r0.stream()
            java.util.stream.Stream r0 = r0.distinct()
            f1.c r1 = p085f1.C1954c.f8513a
            java.util.stream.Stream r0 = r0.filter(r1)
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()
            java.lang.Object r0 = r0.collect(r1)
            java.util.List r0 = (java.util.List) r0
            java.util.List<android.media.MediaRoute2Info> r1 = r5.f8532n0
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L27
            return
        L27:
            r5.f8532n0 = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.f8533o0
            r0.clear()
            java.util.List<android.media.MediaRoute2Info> r0 = r5.f8532n0
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r0.next()
            android.media.MediaRoute2Info r1 = (android.media.MediaRoute2Info) r1
            android.os.Bundle r2 = r1.getExtras()
            if (r2 == 0) goto L5d
            java.lang.String r3 = "androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"
            java.lang.String r4 = r2.getString(r3)
            if (r4 != 0) goto L4f
            goto L5d
        L4f:
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.f8533o0
            java.lang.String r1 = r1.getId()
            java.lang.String r2 = r2.getString(r3)
            r4.put(r1, r2)
            goto L34
        L5d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot find the original route Id. route="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MR2Provider"
            android.util.Log.w(r2, r1)
            goto L34
        L74:
            java.util.List<android.media.MediaRoute2Info> r0 = r5.f8532n0
            java.util.stream.Stream r0 = r0.stream()
            f1.b r1 = p085f1.C1952b.f8509b
            java.util.stream.Stream r0 = r0.map(r1)
            f1.d r1 = p085f1.C1956d.f8520b
            java.util.stream.Stream r0 = r0.filter(r1)
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()
            java.lang.Object r0 = r0.collect(r1)
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld7
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto Lce
            java.util.Iterator r0 = r0.iterator()
        L9e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lce
            java.lang.Object r3 = r0.next()
            f1.g r3 = (p085f1.C1962g) r3
            if (r3 == 0) goto Lc6
            if (r1 != 0) goto Lb4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto Lba
        Lb4:
            boolean r4 = r1.contains(r3)
            if (r4 != 0) goto Lbe
        Lba:
            r1.add(r3)
            goto L9e
        Lbe:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "route descriptor already added"
            r0.<init>(r1)
            throw r0
        Lc6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "route must not be null"
            r0.<init>(r1)
            throw r0
        Lce:
            f1.k r0 = new f1.k
            r0.<init>(r1, r2)
            r5.m4931p(r0)
            return
        Ld7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "routes must not be null"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: t */
    public void m4869t(android.media.MediaRouter2.RoutingController r15) {
            r14 = this;
            java.util.Map<android.media.MediaRouter2$RoutingController, f1.e$c> r0 = r14.f8527i0
            java.lang.Object r0 = r0.get(r15)
            f1.e$c r0 = (p085f1.C1958e.c) r0
            java.lang.String r1 = "MR2Provider"
            if (r0 != 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "setDynamicRouteDescriptors: No matching routeController found. routingController="
            r0.append(r2)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
        L1d:
            android.util.Log.w(r1, r15)
            return
        L21:
            java.util.List r2 = r15.getSelectedRoutes()
            java.util.List r2 = p085f1.C1980u.m5078a(r2)
            java.util.List r3 = r15.getSelectedRoutes()
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            android.media.MediaRoute2Info r3 = (android.media.MediaRoute2Info) r3
            f1.g r3 = p085f1.C1980u.m5079b(r3)
            android.os.Bundle r4 = r15.getControlHints()
            android.content.Context r5 = r14.f8612Y
            r6 = 2131951898(0x7f13011a, float:1.9540224E38)
            java.lang.String r5 = r5.getString(r6)
            r6 = 0
            if (r4 == 0) goto L68
            java.lang.String r7 = "androidx.mediarouter.media.KEY_SESSION_NAME"
            java.lang.String r7 = r4.getString(r7)     // Catch: java.lang.Exception -> L62
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L62
            if (r8 != 0) goto L55
            r5 = r7
        L55:
            java.lang.String r7 = "androidx.mediarouter.media.KEY_GROUP_ROUTE"
            android.os.Bundle r4 = r4.getBundle(r7)     // Catch: java.lang.Exception -> L62
            if (r4 == 0) goto L68
            f1.g r4 = p085f1.C1962g.m4902b(r4)     // Catch: java.lang.Exception -> L62
            goto L69
        L62:
            r4 = move-exception
            java.lang.String r7 = "Exception while unparceling control hints."
            android.util.Log.w(r1, r7, r4)
        L68:
            r4 = r6
        L69:
            r7 = 1
            if (r4 != 0) goto L13a
            java.lang.String r4 = r15.getId()
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r9 = "id"
            r8.putString(r9, r4)
            java.lang.String r4 = "name"
            r8.putString(r4, r5)
            r4 = 2
            java.lang.String r5 = "connectionState"
            r8.putInt(r5, r4)
            java.lang.String r4 = "playbackType"
            r8.putInt(r4, r7)
            int r4 = r15.getVolume()
            java.lang.String r5 = "volume"
            r8.putInt(r5, r4)
            int r4 = r15.getVolumeMax()
            java.lang.String r5 = "volumeMax"
            r8.putInt(r5, r4)
            int r4 = r15.getVolumeHandling()
            java.lang.String r5 = "volumeHandling"
            r8.putInt(r5, r4)
            r3.m4903a()
            java.util.List<android.content.IntentFilter> r3 = r3.f8593c
            if (r3 == 0) goto L132
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto Lde
            java.util.Iterator r3 = r3.iterator()
            r4 = r6
        Lb7:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Ldf
            java.lang.Object r5 = r3.next()
            android.content.IntentFilter r5 = (android.content.IntentFilter) r5
            if (r5 == 0) goto Ld6
            if (r4 != 0) goto Lcc
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        Lcc:
            boolean r9 = r4.contains(r5)
            if (r9 != 0) goto Lb7
            r4.add(r5)
            goto Lb7
        Ld6:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "filter must not be null"
            r15.<init>(r0)
            throw r15
        Lde:
            r4 = r6
        Ldf:
            if (r2 == 0) goto L12a
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L116
            java.util.Iterator r3 = r2.iterator()
        Leb:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L116
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            if (r9 != 0) goto L10e
            if (r6 != 0) goto L104
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L104:
            boolean r9 = r6.contains(r5)
            if (r9 != 0) goto Leb
            r6.add(r5)
            goto Leb
        L10e:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "groupMemberId must not be empty"
            r15.<init>(r0)
            throw r15
        L116:
            if (r4 == 0) goto L11d
            java.lang.String r3 = "controlFilters"
            r8.putParcelableArrayList(r3, r4)
        L11d:
            if (r6 == 0) goto L124
            java.lang.String r3 = "groupMemberIds"
            r8.putStringArrayList(r3, r6)
        L124:
            f1.g r4 = new f1.g
            r4.<init>(r8)
            goto L13a
        L12a:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "groupMemberIds must not be null"
            r15.<init>(r0)
            throw r15
        L132:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "filters must not be null"
            r15.<init>(r0)
            throw r15
        L13a:
            java.util.List r3 = r15.getSelectableRoutes()
            java.util.List r3 = p085f1.C1980u.m5078a(r3)
            java.util.List r15 = r15.getDeselectableRoutes()
            java.util.List r15 = p085f1.C1980u.m5078a(r15)
            f1.k r5 = r14.f8618e0
            if (r5 != 0) goto L152
            java.lang.String r15 = "setDynamicRouteDescriptors: providerDescriptor is not set."
            goto L1d
        L152:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<f1.g> r5 = r5.f8664a
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L191
            java.util.Iterator r5 = r5.iterator()
        L163:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L191
            java.lang.Object r6 = r5.next()
            r9 = r6
            f1.g r9 = (p085f1.C1962g) r9
            java.lang.String r6 = r9.m4910i()
            boolean r8 = r2.contains(r6)
            if (r8 == 0) goto L17d
            r8 = 3
            r10 = 3
            goto L17e
        L17d:
            r10 = 1
        L17e:
            boolean r12 = r3.contains(r6)
            boolean r11 = r15.contains(r6)
            r13 = 1
            f1.i$b$b r6 = new f1.i$b$b
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r1.add(r6)
            goto L163
        L191:
            r0.m4933l(r4, r1)
            return
    }
}
