package p085f1;

/* renamed from: f1.f0 */
/* loaded from: classes.dex */
public final class ServiceConnectionC1961f0 extends p085f1.AbstractC1966i implements android.content.ServiceConnection {

    /* renamed from: o0 */
    public static final boolean f8553o0 = false;

    /* renamed from: g0 */
    public final android.content.ComponentName f8554g0;

    /* renamed from: h0 */
    public final p085f1.ServiceConnectionC1961f0.d f8555h0;

    /* renamed from: i0 */
    public final java.util.ArrayList<p085f1.ServiceConnectionC1961f0.c> f8556i0;

    /* renamed from: j0 */
    public boolean f8557j0;

    /* renamed from: k0 */
    public boolean f8558k0;

    /* renamed from: l0 */
    public p085f1.ServiceConnectionC1961f0.a f8559l0;

    /* renamed from: m0 */
    public boolean f8560m0;

    /* renamed from: n0 */
    public p085f1.ServiceConnectionC1961f0.b f8561n0;

    /* renamed from: f1.f0$a */
    public final class a implements android.os.IBinder.DeathRecipient {

        /* renamed from: a */
        public final android.os.Messenger f8562a;

        /* renamed from: b */
        public final p085f1.ServiceConnectionC1961f0.e f8563b;

        /* renamed from: c */
        public final android.os.Messenger f8564c;

        /* renamed from: d */
        public int f8565d;

        /* renamed from: e */
        public int f8566e;

        /* renamed from: f */
        public int f8567f;

        /* renamed from: g */
        public int f8568g;

        /* renamed from: h */
        public final android.util.SparseArray<p085f1.C1974o.d> f8569h;

        /* renamed from: i */
        public final /* synthetic */ p085f1.ServiceConnectionC1961f0 f8570i;

        /* renamed from: f1.f0$a$a, reason: collision with other inner class name */
        public class RunnableC7377a implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ p085f1.ServiceConnectionC1961f0.a f8571Y;

            public RunnableC7377a(p085f1.ServiceConnectionC1961f0.a r1) {
                    r0 = this;
                    r0.f8571Y = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    f1.f0$a r0 = r3.f8571Y
                    f1.f0 r1 = r0.f8570i
                    f1.f0$a r2 = r1.f8559l0
                    if (r2 != r0) goto L25
                    boolean r0 = p085f1.ServiceConnectionC1961f0.f8553o0
                    if (r0 == 0) goto L22
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    java.lang.String r2 = ": Service connection died"
                    r0.append(r2)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r2 = "MediaRouteProviderProxy"
                    android.util.Log.d(r2, r0)
                L22:
                    r1.m4879t()
                L25:
                    return
            }
        }

        public a(p085f1.ServiceConnectionC1961f0 r1, android.os.Messenger r2) {
                r0 = this;
                r0.f8570i = r1
                r0.<init>()
                r1 = 1
                r0.f8565d = r1
                r0.f8566e = r1
                android.util.SparseArray r1 = new android.util.SparseArray
                r1.<init>()
                r0.f8569h = r1
                r0.f8562a = r2
                f1.f0$e r1 = new f1.f0$e
                r1.<init>(r0)
                r0.f8563b = r1
                android.os.Messenger r2 = new android.os.Messenger
                r2.<init>(r1)
                r0.f8564c = r2
                return
        }

        /* renamed from: a */
        public void m4886a(int r7) {
                r6 = this;
                int r2 = r6.f8565d
                int r0 = r2 + 1
                r6.f8565d = r0
                r1 = 5
                r4 = 0
                r5 = 0
                r0 = r6
                r3 = r7
                r0.m4887b(r1, r2, r3, r4, r5)
                return
        }

        /* renamed from: b */
        public final boolean m4887b(int r2, int r3, int r4, java.lang.Object r5, android.os.Bundle r6) {
                r1 = this;
                android.os.Message r0 = android.os.Message.obtain()
                r0.what = r2
                r0.arg1 = r3
                r0.arg2 = r4
                r0.obj = r5
                r0.setData(r6)
                android.os.Messenger r3 = r1.f8564c
                r0.replyTo = r3
                android.os.Messenger r3 = r1.f8562a     // Catch: android.os.RemoteException -> L1a android.os.DeadObjectException -> L25
                r3.send(r0)     // Catch: android.os.RemoteException -> L1a android.os.DeadObjectException -> L25
                r2 = 1
                return r2
            L1a:
                r3 = move-exception
                r4 = 2
                if (r2 == r4) goto L25
                java.lang.String r2 = "MediaRouteProviderProxy"
                java.lang.String r4 = "Could not send message to service."
                android.util.Log.e(r2, r4, r3)
            L25:
                r2 = 0
                return r2
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
                r2 = this;
                f1.f0 r0 = r2.f8570i
                f1.f0$d r0 = r0.f8555h0
                f1.f0$a$a r1 = new f1.f0$a$a
                r1.<init>(r2)
                r0.post(r1)
                return
        }

        /* renamed from: c */
        public void m4888c(p085f1.C1964h r7) {
                r6 = this;
                int r2 = r6.f8565d
                int r0 = r2 + 1
                r6.f8565d = r0
                if (r7 == 0) goto Lb
                android.os.Bundle r7 = r7.f8600a
                goto Lc
            Lb:
                r7 = 0
            Lc:
                r4 = r7
                r5 = 0
                r1 = 10
                r3 = 0
                r0 = r6
                r0.m4887b(r1, r2, r3, r4, r5)
                return
        }

        /* renamed from: d */
        public void m4889d(int r7, int r8) {
                r6 = this;
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                java.lang.String r0 = "volume"
                r5.putInt(r0, r8)
                int r2 = r6.f8565d
                int r8 = r2 + 1
                r6.f8565d = r8
                r1 = 7
                r4 = 0
                r0 = r6
                r3 = r7
                r0.m4887b(r1, r2, r3, r4, r5)
                return
        }

        /* renamed from: e */
        public void m4890e(int r7, int r8) {
                r6 = this;
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                java.lang.String r0 = "unselectReason"
                r5.putInt(r0, r8)
                int r2 = r6.f8565d
                int r8 = r2 + 1
                r6.f8565d = r8
                r1 = 6
                r4 = 0
                r0 = r6
                r3 = r7
                r0.m4887b(r1, r2, r3, r4, r5)
                return
        }

        /* renamed from: f */
        public void m4891f(int r7, int r8) {
                r6 = this;
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                java.lang.String r0 = "volume"
                r5.putInt(r0, r8)
                int r2 = r6.f8565d
                int r8 = r2 + 1
                r6.f8565d = r8
                r1 = 8
                r4 = 0
                r0 = r6
                r3 = r7
                r0.m4887b(r1, r2, r3, r4, r5)
                return
        }
    }

    /* renamed from: f1.f0$b */
    public interface b {
    }

    /* renamed from: f1.f0$c */
    public interface c {
        /* renamed from: a */
        int mo4892a();

        /* renamed from: b */
        void mo4893b();

        /* renamed from: c */
        void mo4894c(p085f1.ServiceConnectionC1961f0.a r1);
    }

    /* renamed from: f1.f0$d */
    public static final class d extends android.os.Handler {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: f1.f0$e */
    public static final class e extends android.os.Handler {

        /* renamed from: a */
        public final java.lang.ref.WeakReference<p085f1.ServiceConnectionC1961f0.a> f8572a;

        public e(p085f1.ServiceConnectionC1961f0.a r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f8572a = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r20) {
                r19 = this;
                r0 = r19
                r1 = r20
                java.lang.ref.WeakReference<f1.f0$a> r2 = r0.f8572a
                java.lang.Object r2 = r2.get()
                f1.f0$a r2 = (p085f1.ServiceConnectionC1961f0.a) r2
                if (r2 == 0) goto L21a
                int r3 = r1.what
                int r4 = r1.arg1
                int r5 = r1.arg2
                java.lang.Object r6 = r1.obj
                android.os.Bundle r7 = r20.peekData()
                r8 = 0
                r9 = 0
                java.lang.String r10 = "MediaRouteProviderProxy"
                r11 = 1
                switch(r3) {
                    case 0: goto L1c0;
                    case 1: goto Led;
                    case 2: goto L176;
                    case 3: goto L15a;
                    case 4: goto L136;
                    case 5: goto L120;
                    case 6: goto Lf0;
                    case 7: goto L58;
                    case 8: goto L24;
                    default: goto L22;
                }
            L22:
                goto L200
            L24:
                f1.f0 r3 = r2.f8570i
                f1.f0$a r4 = r3.f8559l0
                if (r4 != r2) goto L200
                f1.f0$c r2 = r3.m4880u(r5)
                f1.f0$b r4 = r3.f8561n0
                if (r4 == 0) goto L53
                boolean r5 = r2 instanceof p085f1.AbstractC1966i.e
                if (r5 == 0) goto L53
                r5 = r2
                f1.i$e r5 = (p085f1.AbstractC1966i.e) r5
                f1.g0 r4 = (p085f1.C1963g0) r4
                java.lang.Object r6 = r4.f8598Z
                f1.h0 r6 = (p085f1.C1965h0) r6
                java.lang.Object r4 = r4.f8599a0
                f1.f0 r4 = (p085f1.ServiceConnectionC1961f0) r4
                f1.h0$c r4 = r6.f8603b
                f1.o$e r4 = (p085f1.C1974o.e) r4
                f1.i$e r6 = r4.f8698r
                if (r6 != r5) goto L53
                f1.o$i r5 = r4.m5038c()
                r6 = 2
                r4.m5046k(r5, r6)
            L53:
                r3.m4882w(r2)
                goto L200
            L58:
                if (r6 == 0) goto L5e
                boolean r3 = r6 instanceof android.os.Bundle
                if (r3 == 0) goto L200
            L5e:
                android.os.Bundle r6 = (android.os.Bundle) r6
                int r3 = r2.f8567f
                if (r3 == 0) goto L200
                java.lang.String r3 = "groupRoute"
                android.os.Parcelable r3 = r6.getParcelable(r3)
                android.os.Bundle r3 = (android.os.Bundle) r3
                if (r3 == 0) goto L73
                f1.g r3 = p085f1.C1962g.m4902b(r3)
                goto L74
            L73:
                r3 = r8
            L74:
                java.lang.String r4 = "dynamicRoutes"
                java.util.ArrayList r4 = r6.getParcelableArrayList(r4)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r4 = r4.iterator()
            L83:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto Lbf
                java.lang.Object r7 = r4.next()
                android.os.Bundle r7 = (android.os.Bundle) r7
                if (r7 != 0) goto L93
                r7 = r8
                goto Lbb
            L93:
                java.lang.String r12 = "mrDescriptor"
                android.os.Bundle r12 = r7.getBundle(r12)
                f1.g r14 = p085f1.C1962g.m4902b(r12)
                java.lang.String r12 = "selectionState"
                int r15 = r7.getInt(r12, r11)
                java.lang.String r12 = "isUnselectable"
                boolean r16 = r7.getBoolean(r12, r9)
                java.lang.String r12 = "isGroupable"
                boolean r17 = r7.getBoolean(r12, r9)
                java.lang.String r12 = "isTransferable"
                boolean r18 = r7.getBoolean(r12, r9)
                f1.i$b$b r7 = new f1.i$b$b
                r13 = r7
                r13.<init>(r14, r15, r16, r17, r18)
            Lbb:
                r6.add(r7)
                goto L83
            Lbf:
                f1.f0 r4 = r2.f8570i
                f1.f0$a r7 = r4.f8559l0
                if (r7 != r2) goto Led
                boolean r2 = p085f1.ServiceConnectionC1961f0.f8553o0
                if (r2 == 0) goto Le0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                java.lang.String r7 = ": DynamicRouteDescriptors changed, descriptors="
                r2.append(r7)
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                android.util.Log.d(r10, r2)
            Le0:
                f1.f0$c r2 = r4.m4880u(r5)
                boolean r4 = r2 instanceof p085f1.ServiceConnectionC1961f0.f
                if (r4 == 0) goto Led
                f1.f0$f r2 = (p085f1.ServiceConnectionC1961f0.f) r2
                r2.m4933l(r3, r6)
            Led:
                r9 = 1
                goto L200
            Lf0:
                boolean r3 = r6 instanceof android.os.Bundle
                if (r3 == 0) goto L119
                android.os.Bundle r6 = (android.os.Bundle) r6
                android.util.SparseArray<f1.o$d> r3 = r2.f8569h
                java.lang.Object r3 = r3.get(r4)
                f1.o$d r3 = (p085f1.C1974o.d) r3
                if (r6 == 0) goto L112
                java.lang.String r5 = "routeId"
                boolean r5 = r6.containsKey(r5)
                if (r5 == 0) goto L112
                android.util.SparseArray<f1.o$d> r2 = r2.f8569h
                r2.remove(r4)
                r3.mo4901b(r6)
                goto L200
            L112:
                java.lang.String r2 = "DynamicGroupRouteController is created without valid route id."
                r3.mo4900a(r2, r6)
                goto L200
            L119:
                java.lang.String r2 = "No further information on the dynamic group controller"
                android.util.Log.w(r10, r2)
                goto L200
            L120:
                if (r6 == 0) goto L126
                boolean r3 = r6 instanceof android.os.Bundle
                if (r3 == 0) goto L200
            L126:
                android.os.Bundle r6 = (android.os.Bundle) r6
                int r3 = r2.f8567f
                if (r3 == 0) goto L200
                f1.f0 r3 = r2.f8570i
                f1.k r4 = p085f1.C1970k.m4963a(r6)
                r3.m4881v(r2, r4)
                goto Led
            L136:
                if (r6 == 0) goto L13c
                boolean r3 = r6 instanceof android.os.Bundle
                if (r3 == 0) goto L200
            L13c:
                if (r7 != 0) goto L13f
                goto L145
            L13f:
                java.lang.String r3 = "error"
                java.lang.String r8 = r7.getString(r3)
            L145:
                android.os.Bundle r6 = (android.os.Bundle) r6
                android.util.SparseArray<f1.o$d> r3 = r2.f8569h
                java.lang.Object r3 = r3.get(r4)
                f1.o$d r3 = (p085f1.C1974o.d) r3
                if (r3 == 0) goto L200
                android.util.SparseArray<f1.o$d> r2 = r2.f8569h
                r2.remove(r4)
                r3.mo4900a(r8, r6)
                goto Led
            L15a:
                if (r6 == 0) goto L160
                boolean r3 = r6 instanceof android.os.Bundle
                if (r3 == 0) goto L200
            L160:
                android.os.Bundle r6 = (android.os.Bundle) r6
                android.util.SparseArray<f1.o$d> r3 = r2.f8569h
                java.lang.Object r3 = r3.get(r4)
                f1.o$d r3 = (p085f1.C1974o.d) r3
                if (r3 == 0) goto L200
                android.util.SparseArray<f1.o$d> r2 = r2.f8569h
                r2.remove(r4)
                r3.mo4901b(r6)
                goto Led
            L176:
                if (r6 == 0) goto L17c
                boolean r3 = r6 instanceof android.os.Bundle
                if (r3 == 0) goto L200
            L17c:
                android.os.Bundle r6 = (android.os.Bundle) r6
                int r3 = r2.f8567f
                if (r3 != 0) goto L200
                int r3 = r2.f8568g
                if (r4 != r3) goto L200
                if (r5 < r11) goto L200
                r2.f8568g = r9
                r2.f8567f = r5
                f1.f0 r3 = r2.f8570i
                f1.k r4 = p085f1.C1970k.m4963a(r6)
                r3.m4881v(r2, r4)
                f1.f0 r3 = r2.f8570i
                f1.f0$a r4 = r3.f8559l0
                if (r4 != r2) goto Led
                r3.f8560m0 = r11
                java.util.ArrayList<f1.f0$c> r2 = r3.f8556i0
                int r2 = r2.size()
            L1a3:
                if (r9 >= r2) goto L1b5
                java.util.ArrayList<f1.f0$c> r4 = r3.f8556i0
                java.lang.Object r4 = r4.get(r9)
                f1.f0$c r4 = (p085f1.ServiceConnectionC1961f0.c) r4
                f1.f0$a r5 = r3.f8559l0
                r4.mo4894c(r5)
                int r9 = r9 + 1
                goto L1a3
            L1b5:
                f1.h r2 = r3.f8616c0
                if (r2 == 0) goto Led
                f1.f0$a r3 = r3.f8559l0
                r3.m4888c(r2)
                goto Led
            L1c0:
                int r3 = r2.f8568g
                if (r4 != r3) goto L1ec
                r2.f8568g = r9
                f1.f0 r3 = r2.f8570i
                f1.f0$a r5 = r3.f8559l0
                if (r5 != r2) goto L1ec
                boolean r5 = p085f1.ServiceConnectionC1961f0.f8553o0
                if (r5 == 0) goto L1e9
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r3)
                java.lang.String r6 = ": Service connection error - "
                r5.append(r6)
                java.lang.String r6 = "Registration failed"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                android.util.Log.d(r10, r5)
            L1e9:
                r3.m4885z()
            L1ec:
                android.util.SparseArray<f1.o$d> r3 = r2.f8569h
                java.lang.Object r3 = r3.get(r4)
                f1.o$d r3 = (p085f1.C1974o.d) r3
                if (r3 == 0) goto Led
                android.util.SparseArray<f1.o$d> r2 = r2.f8569h
                r2.remove(r4)
                r3.mo4900a(r8, r8)
                goto Led
            L200:
                if (r9 != 0) goto L21a
                boolean r2 = p085f1.ServiceConnectionC1961f0.f8553o0
                if (r2 == 0) goto L21a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unhandled message from server: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                android.util.Log.d(r10, r1)
            L21a:
                return
        }
    }

    /* renamed from: f1.f0$f */
    public final class f extends p085f1.AbstractC1966i.b implements p085f1.ServiceConnectionC1961f0.c {

        /* renamed from: f */
        public final java.lang.String f8573f;

        /* renamed from: g */
        public java.lang.String f8574g;

        /* renamed from: h */
        public java.lang.String f8575h;

        /* renamed from: i */
        public boolean f8576i;

        /* renamed from: j */
        public int f8577j;

        /* renamed from: k */
        public int f8578k;

        /* renamed from: l */
        public p085f1.ServiceConnectionC1961f0.a f8579l;

        /* renamed from: m */
        public int f8580m;

        /* renamed from: n */
        public final /* synthetic */ p085f1.ServiceConnectionC1961f0 f8581n;

        /* renamed from: f1.f0$f$a */
        public class a extends p085f1.C1974o.d {

            /* renamed from: a */
            public final /* synthetic */ p085f1.ServiceConnectionC1961f0.f f8582a;

            public a(p085f1.ServiceConnectionC1961f0.f r1) {
                    r0 = this;
                    r0.f8582a = r1
                    r0.<init>()
                    return
            }

            @Override // p085f1.C1974o.d
            /* renamed from: a */
            public void mo4900a(java.lang.String r3, android.os.Bundle r4) {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Error: "
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r3 = ", data: "
                    r0.append(r3)
                    r0.append(r4)
                    java.lang.String r3 = r0.toString()
                    java.lang.String r4 = "MediaRouteProviderProxy"
                    android.util.Log.d(r4, r3)
                    return
            }

            @Override // p085f1.C1974o.d
            /* renamed from: b */
            public void mo4901b(android.os.Bundle r3) {
                    r2 = this;
                    f1.f0$f r0 = r2.f8582a
                    java.lang.String r1 = "groupableTitle"
                    java.lang.String r1 = r3.getString(r1)
                    r0.f8574g = r1
                    f1.f0$f r0 = r2.f8582a
                    java.lang.String r1 = "transferableTitle"
                    java.lang.String r3 = r3.getString(r1)
                    r0.f8575h = r3
                    return
            }
        }

        public f(p085f1.ServiceConnectionC1961f0 r1, java.lang.String r2) {
                r0 = this;
                r0.f8581n = r1
                r0.<init>()
                r1 = -1
                r0.f8577j = r1
                r0.f8580m = r1
                r0.f8573f = r2
                return
        }

        @Override // p085f1.ServiceConnectionC1961f0.c
        /* renamed from: a */
        public int mo4892a() {
                r1 = this;
                int r0 = r1.f8580m
                return r0
        }

        @Override // p085f1.ServiceConnectionC1961f0.c
        /* renamed from: b */
        public void mo4893b() {
                r6 = this;
                f1.f0$a r0 = r6.f8579l
                if (r0 == 0) goto L18
                int r3 = r6.f8580m
                int r2 = r0.f8565d
                int r1 = r2 + 1
                r0.f8565d = r1
                r1 = 4
                r4 = 0
                r5 = 0
                r0.m4887b(r1, r2, r3, r4, r5)
                r0 = 0
                r6.f8579l = r0
                r0 = 0
                r6.f8580m = r0
            L18:
                return
        }

        @Override // p085f1.ServiceConnectionC1961f0.c
        /* renamed from: c */
        public void mo4894c(p085f1.ServiceConnectionC1961f0.a r11) {
                r10 = this;
                f1.f0$f$a r0 = new f1.f0$f$a
                r0.<init>(r10)
                r10.f8579l = r11
                java.lang.String r1 = r10.f8573f
                int r8 = r11.f8566e
                int r2 = r8 + 1
                r11.f8566e = r2
                int r9 = r11.f8565d
                int r2 = r9 + 1
                r11.f8565d = r2
                android.os.Bundle r7 = new android.os.Bundle
                r7.<init>()
                java.lang.String r2 = "memberRouteId"
                r7.putString(r2, r1)
                r3 = 11
                r6 = 0
                r2 = r11
                r4 = r9
                r5 = r8
                r2.m4887b(r3, r4, r5, r6, r7)
                android.util.SparseArray<f1.o$d> r1 = r11.f8569h
                r1.put(r9, r0)
                r10.f8580m = r8
                boolean r0 = r10.f8576i
                if (r0 == 0) goto L4e
                r11.m4886a(r8)
                int r0 = r10.f8577j
                if (r0 < 0) goto L42
                int r1 = r10.f8580m
                r11.m4889d(r1, r0)
                r0 = -1
                r10.f8577j = r0
            L42:
                int r0 = r10.f8578k
                if (r0 == 0) goto L4e
                int r1 = r10.f8580m
                r11.m4891f(r1, r0)
                r11 = 0
                r10.f8578k = r11
            L4e:
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: d */
        public void mo4870d() {
                r2 = this;
                f1.f0 r0 = r2.f8581n
                java.util.ArrayList<f1.f0$c> r1 = r0.f8556i0
                r1.remove(r2)
                r2.mo4893b()
                r0.m4876A()
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: e */
        public void mo4895e() {
                r2 = this;
                r0 = 1
                r2.f8576i = r0
                f1.f0$a r0 = r2.f8579l
                if (r0 == 0) goto Lc
                int r1 = r2.f8580m
                r0.m4886a(r1)
            Lc:
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: f */
        public void mo4871f(int r3) {
                r2 = this;
                f1.f0$a r0 = r2.f8579l
                if (r0 == 0) goto La
                int r1 = r2.f8580m
                r0.m4889d(r1, r3)
                goto Lf
            La:
                r2.f8577j = r3
                r3 = 0
                r2.f8578k = r3
            Lf:
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: g */
        public void mo4896g() {
                r1 = this;
                r0 = 0
                r1.mo4897h(r0)
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: h */
        public void mo4897h(int r3) {
                r2 = this;
                r0 = 0
                r2.f8576i = r0
                f1.f0$a r0 = r2.f8579l
                if (r0 == 0) goto Lc
                int r1 = r2.f8580m
                r0.m4890e(r1, r3)
            Lc:
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: i */
        public void mo4872i(int r3) {
                r2 = this;
                f1.f0$a r0 = r2.f8579l
                if (r0 == 0) goto La
                int r1 = r2.f8580m
                r0.m4891f(r1, r3)
                goto Lf
            La:
                int r0 = r2.f8578k
                int r0 = r0 + r3
                r2.f8578k = r0
            Lf:
                return
        }

        @Override // p085f1.AbstractC1966i.b
        /* renamed from: j */
        public java.lang.String mo4898j() {
                r1 = this;
                java.lang.String r0 = r1.f8574g
                return r0
        }

        @Override // p085f1.AbstractC1966i.b
        /* renamed from: k */
        public java.lang.String mo4899k() {
                r1 = this;
                java.lang.String r0 = r1.f8575h
                return r0
        }

        @Override // p085f1.AbstractC1966i.b
        /* renamed from: m */
        public void mo4873m(java.lang.String r7) {
                r6 = this;
                f1.f0$a r0 = r6.f8579l
                if (r0 == 0) goto L1f
                int r3 = r6.f8580m
                java.util.Objects.requireNonNull(r0)
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                java.lang.String r1 = "memberRouteId"
                r5.putString(r1, r7)
                int r2 = r0.f8565d
                int r7 = r2 + 1
                r0.f8565d = r7
                r1 = 12
                r4 = 0
                r0.m4887b(r1, r2, r3, r4, r5)
            L1f:
                return
        }

        @Override // p085f1.AbstractC1966i.b
        /* renamed from: n */
        public void mo4874n(java.lang.String r7) {
                r6 = this;
                f1.f0$a r0 = r6.f8579l
                if (r0 == 0) goto L1f
                int r3 = r6.f8580m
                java.util.Objects.requireNonNull(r0)
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                java.lang.String r1 = "memberRouteId"
                r5.putString(r1, r7)
                int r2 = r0.f8565d
                int r7 = r2 + 1
                r0.f8565d = r7
                r1 = 13
                r4 = 0
                r0.m4887b(r1, r2, r3, r4, r5)
            L1f:
                return
        }

        @Override // p085f1.AbstractC1966i.b
        /* renamed from: o */
        public void mo4875o(java.util.List<java.lang.String> r7) {
                r6 = this;
                f1.f0$a r0 = r6.f8579l
                if (r0 == 0) goto L24
                int r3 = r6.f8580m
                java.util.Objects.requireNonNull(r0)
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r7)
                java.lang.String r7 = "memberRouteIds"
                r5.putStringArrayList(r7, r1)
                int r2 = r0.f8565d
                int r7 = r2 + 1
                r0.f8565d = r7
                r1 = 14
                r4 = 0
                r0.m4887b(r1, r2, r3, r4, r5)
            L24:
                return
        }
    }

    /* renamed from: f1.f0$g */
    public final class g extends p085f1.AbstractC1966i.e implements p085f1.ServiceConnectionC1961f0.c {

        /* renamed from: a */
        public final java.lang.String f8583a;

        /* renamed from: b */
        public final java.lang.String f8584b;

        /* renamed from: c */
        public boolean f8585c;

        /* renamed from: d */
        public int f8586d;

        /* renamed from: e */
        public int f8587e;

        /* renamed from: f */
        public p085f1.ServiceConnectionC1961f0.a f8588f;

        /* renamed from: g */
        public int f8589g;

        /* renamed from: h */
        public final /* synthetic */ p085f1.ServiceConnectionC1961f0 f8590h;

        public g(p085f1.ServiceConnectionC1961f0 r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.f8590h = r1
                r0.<init>()
                r1 = -1
                r0.f8586d = r1
                r0.f8583a = r2
                r0.f8584b = r3
                return
        }

        @Override // p085f1.ServiceConnectionC1961f0.c
        /* renamed from: a */
        public int mo4892a() {
                r1 = this;
                int r0 = r1.f8589g
                return r0
        }

        @Override // p085f1.ServiceConnectionC1961f0.c
        /* renamed from: b */
        public void mo4893b() {
                r6 = this;
                f1.f0$a r0 = r6.f8588f
                if (r0 == 0) goto L18
                int r3 = r6.f8589g
                int r2 = r0.f8565d
                int r1 = r2 + 1
                r0.f8565d = r1
                r1 = 4
                r4 = 0
                r5 = 0
                r0.m4887b(r1, r2, r3, r4, r5)
                r0 = 0
                r6.f8588f = r0
                r0 = 0
                r6.f8589g = r0
            L18:
                return
        }

        @Override // p085f1.ServiceConnectionC1961f0.c
        /* renamed from: c */
        public void mo4894c(p085f1.ServiceConnectionC1961f0.a r10) {
                r9 = this;
                r9.f8588f = r10
                java.lang.String r0 = r9.f8583a
                java.lang.String r1 = r9.f8584b
                int r8 = r10.f8566e
                int r2 = r8 + 1
                r10.f8566e = r2
                android.os.Bundle r7 = new android.os.Bundle
                r7.<init>()
                java.lang.String r2 = "routeId"
                r7.putString(r2, r0)
                java.lang.String r0 = "routeGroupId"
                r7.putString(r0, r1)
                int r4 = r10.f8565d
                int r0 = r4 + 1
                r10.f8565d = r0
                r3 = 3
                r6 = 0
                r2 = r10
                r5 = r8
                r2.m4887b(r3, r4, r5, r6, r7)
                r9.f8589g = r8
                boolean r0 = r9.f8585c
                if (r0 == 0) goto L49
                r10.m4886a(r8)
                int r0 = r9.f8586d
                if (r0 < 0) goto L3d
                int r1 = r9.f8589g
                r10.m4889d(r1, r0)
                r0 = -1
                r9.f8586d = r0
            L3d:
                int r0 = r9.f8587e
                if (r0 == 0) goto L49
                int r1 = r9.f8589g
                r10.m4891f(r1, r0)
                r10 = 0
                r9.f8587e = r10
            L49:
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: d */
        public void mo4870d() {
                r2 = this;
                f1.f0 r0 = r2.f8590h
                java.util.ArrayList<f1.f0$c> r1 = r0.f8556i0
                r1.remove(r2)
                r2.mo4893b()
                r0.m4876A()
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: e */
        public void mo4895e() {
                r2 = this;
                r0 = 1
                r2.f8585c = r0
                f1.f0$a r0 = r2.f8588f
                if (r0 == 0) goto Lc
                int r1 = r2.f8589g
                r0.m4886a(r1)
            Lc:
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: f */
        public void mo4871f(int r3) {
                r2 = this;
                f1.f0$a r0 = r2.f8588f
                if (r0 == 0) goto La
                int r1 = r2.f8589g
                r0.m4889d(r1, r3)
                goto Lf
            La:
                r2.f8586d = r3
                r3 = 0
                r2.f8587e = r3
            Lf:
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: g */
        public void mo4896g() {
                r1 = this;
                r0 = 0
                r1.mo4897h(r0)
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: h */
        public void mo4897h(int r3) {
                r2 = this;
                r0 = 0
                r2.f8585c = r0
                f1.f0$a r0 = r2.f8588f
                if (r0 == 0) goto Lc
                int r1 = r2.f8589g
                r0.m4890e(r1, r3)
            Lc:
                return
        }

        @Override // p085f1.AbstractC1966i.e
        /* renamed from: i */
        public void mo4872i(int r3) {
                r2 = this;
                f1.f0$a r0 = r2.f8588f
                if (r0 == 0) goto La
                int r1 = r2.f8589g
                r0.m4891f(r1, r3)
                goto Lf
            La:
                int r0 = r2.f8587e
                int r0 = r0 + r3
                r2.f8587e = r0
            Lf:
                return
        }
    }

    static {
            java.lang.String r0 = "MediaRouteProviderProxy"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            p085f1.ServiceConnectionC1961f0.f8553o0 = r0
            return
    }

    public ServiceConnectionC1961f0(android.content.Context r2, android.content.ComponentName r3) {
            r1 = this;
            f1.i$d r0 = new f1.i$d
            r0.<init>(r3)
            r1.<init>(r2, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f8556i0 = r2
            r1.f8554g0 = r3
            f1.f0$d r2 = new f1.f0$d
            r2.<init>()
            r1.f8555h0 = r2
            return
    }

    /* renamed from: A */
    public final void m4876A() {
            r1 = this;
            boolean r0 = r1.m4883x()
            if (r0 == 0) goto La
            r1.m4877r()
            goto Ld
        La:
            r1.m4885z()
        Ld:
            return
    }

    @Override // p085f1.AbstractC1966i
    /* renamed from: l */
    public p085f1.AbstractC1966i.b mo4863l(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L3b
            f1.k r0 = r4.f8618e0
            if (r0 == 0) goto L39
            java.util.List<f1.g> r0 = r0.f8664a
            int r1 = r0.size()
            r2 = 0
        Ld:
            if (r2 >= r1) goto L39
            java.lang.Object r3 = r0.get(r2)
            f1.g r3 = (p085f1.C1962g) r3
            java.lang.String r3 = r3.m4910i()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L36
            f1.f0$f r0 = new f1.f0$f
            r0.<init>(r4, r5)
            java.util.ArrayList<f1.f0$c> r5 = r4.f8556i0
            r5.add(r0)
            boolean r5 = r4.f8560m0
            if (r5 == 0) goto L32
            f1.f0$a r5 = r4.f8559l0
            r0.mo4894c(r5)
        L32:
            r4.m4876A()
            goto L3a
        L36:
            int r2 = r2 + 1
            goto Ld
        L39:
            r0 = 0
        L3a:
            return r0
        L3b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "initialMemberRouteId cannot be null."
            r5.<init>(r0)
            throw r5
    }

    @Override // p085f1.AbstractC1966i
    /* renamed from: m */
    public p085f1.AbstractC1966i.e mo4864m(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L8
            r0 = 0
            f1.i$e r2 = r1.m4878s(r2, r0)
            return r2
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "routeId cannot be null"
            r2.<init>(r0)
            throw r2
    }

    @Override // p085f1.AbstractC1966i
    /* renamed from: n */
    public p085f1.AbstractC1966i.e mo4865n(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            if (r1 == 0) goto L11
            if (r2 == 0) goto L9
            f1.i$e r1 = r0.m4878s(r1, r2)
            return r1
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "routeGroupId cannot be null"
            r1.<init>(r2)
            throw r1
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "routeId cannot be null"
            r1.<init>(r2)
            throw r1
    }

    @Override // p085f1.AbstractC1966i
    /* renamed from: o */
    public void mo4866o(p085f1.C1964h r2) {
            r1 = this;
            boolean r0 = r1.f8560m0
            if (r0 == 0) goto L9
            f1.f0$a r0 = r1.f8559l0
            r0.m4888c(r2)
        L9:
            r1.m4876A()
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName r10, android.os.IBinder r11) {
            r9 = this;
            boolean r10 = p085f1.ServiceConnectionC1961f0.f8553o0
            java.lang.String r0 = "MediaRouteProviderProxy"
            if (r10 == 0) goto L1a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r1 = ": Connected"
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r0, r10)
        L1a:
            boolean r10 = r9.f8558k0
            if (r10 == 0) goto L92
            r9.m4879t()
            if (r11 == 0) goto L29
            android.os.Messenger r10 = new android.os.Messenger
            r10.<init>(r11)
            goto L2a
        L29:
            r10 = 0
        L2a:
            r11 = 0
            r1 = 1
            if (r10 == 0) goto L36
            android.os.IBinder r2 = r10.getBinder()     // Catch: java.lang.NullPointerException -> L36
            if (r2 == 0) goto L36
            r2 = 1
            goto L37
        L36:
            r2 = 0
        L37:
            if (r2 == 0) goto L7e
            f1.f0$a r2 = new f1.f0$a
            r2.<init>(r9, r10)
            int r5 = r2.f8565d
            int r10 = r5 + 1
            r2.f8565d = r10
            r2.f8568g = r5
            r4 = 1
            r6 = 4
            r7 = 0
            r8 = 0
            r3 = r2
            boolean r10 = r3.m4887b(r4, r5, r6, r7, r8)
            if (r10 != 0) goto L52
            goto L60
        L52:
            android.os.Messenger r10 = r2.f8562a     // Catch: android.os.RemoteException -> L5d
            android.os.IBinder r10 = r10.getBinder()     // Catch: android.os.RemoteException -> L5d
            r10.linkToDeath(r2, r11)     // Catch: android.os.RemoteException -> L5d
            r11 = 1
            goto L60
        L5d:
            r2.binderDied()
        L60:
            if (r11 == 0) goto L65
            r9.f8559l0 = r2
            goto L92
        L65:
            boolean r10 = p085f1.ServiceConnectionC1961f0.f8553o0
            if (r10 == 0) goto L92
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r11 = ": Registration failed"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r0, r10)
            goto L92
        L7e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r11 = ": Service returned invalid messenger binder"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r0, r10)
        L92:
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName r2) {
            r1 = this;
            boolean r2 = p085f1.ServiceConnectionC1961f0.f8553o0
            if (r2 == 0) goto L1a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r0 = ": Service disconnected"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "MediaRouteProviderProxy"
            android.util.Log.d(r0, r2)
        L1a:
            r1.m4879t()
            return
    }

    /* renamed from: r */
    public final void m4877r() {
            r7 = this;
            java.lang.String r0 = ": Bind failed"
            boolean r1 = r7.f8558k0
            if (r1 != 0) goto L6b
            boolean r1 = p085f1.ServiceConnectionC1961f0.f8553o0
            java.lang.String r2 = "MediaRouteProviderProxy"
            if (r1 == 0) goto L20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            java.lang.String r4 = ": Binding"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r2, r3)
        L20:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.media.MediaRouteProviderService"
            r3.<init>(r4)
            android.content.ComponentName r4 = r7.f8554g0
            r3.setComponent(r4)
            r4 = 1
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.SecurityException -> L54
            r6 = 29
            if (r5 < r6) goto L35
            r4 = 4097(0x1001, float:5.741E-42)
        L35:
            android.content.Context r5 = r7.f8612Y     // Catch: java.lang.SecurityException -> L54
            boolean r3 = r5.bindService(r3, r7, r4)     // Catch: java.lang.SecurityException -> L54
            r7.f8558k0 = r3     // Catch: java.lang.SecurityException -> L54
            if (r3 != 0) goto L6b
            if (r1 == 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L54
            r1.<init>()     // Catch: java.lang.SecurityException -> L54
            r1.append(r7)     // Catch: java.lang.SecurityException -> L54
            r1.append(r0)     // Catch: java.lang.SecurityException -> L54
            java.lang.String r1 = r1.toString()     // Catch: java.lang.SecurityException -> L54
            android.util.Log.d(r2, r1)     // Catch: java.lang.SecurityException -> L54
            goto L6b
        L54:
            r1 = move-exception
            boolean r3 = p085f1.ServiceConnectionC1961f0.f8553o0
            if (r3 == 0) goto L6b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.d(r2, r0, r1)
        L6b:
            return
    }

    /* renamed from: s */
    public final p085f1.AbstractC1966i.e m4878s(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            f1.k r0 = r4.f8618e0
            if (r0 == 0) goto L37
            java.util.List<f1.g> r0 = r0.f8664a
            int r1 = r0.size()
            r2 = 0
        Lb:
            if (r2 >= r1) goto L37
            java.lang.Object r3 = r0.get(r2)
            f1.g r3 = (p085f1.C1962g) r3
            java.lang.String r3 = r3.m4910i()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L34
            f1.f0$g r0 = new f1.f0$g
            r0.<init>(r4, r5, r6)
            java.util.ArrayList<f1.f0$c> r5 = r4.f8556i0
            r5.add(r0)
            boolean r5 = r4.f8560m0
            if (r5 == 0) goto L30
            f1.f0$a r5 = r4.f8559l0
            r0.mo4894c(r5)
        L30:
            r4.m4876A()
            return r0
        L34:
            int r2 = r2 + 1
            goto Lb
        L37:
            r5 = 0
            return r5
    }

    /* renamed from: t */
    public final void m4879t() {
            r10 = this;
            f1.f0$a r0 = r10.f8559l0
            if (r0 == 0) goto L4b
            r0 = 0
            r10.m4931p(r0)
            r1 = 0
            r10.f8560m0 = r1
            java.util.ArrayList<f1.f0$c> r2 = r10.f8556i0
            int r2 = r2.size()
            r3 = 0
        L12:
            if (r3 >= r2) goto L22
            java.util.ArrayList<f1.f0$c> r4 = r10.f8556i0
            java.lang.Object r4 = r4.get(r3)
            f1.f0$c r4 = (p085f1.ServiceConnectionC1961f0.c) r4
            r4.mo4893b()
            int r3 = r3 + 1
            goto L12
        L22:
            f1.f0$a r2 = r10.f8559l0
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r2
            r4.m4887b(r5, r6, r7, r8, r9)
            f1.f0$e r3 = r2.f8563b
            java.lang.ref.WeakReference<f1.f0$a> r3 = r3.f8572a
            r3.clear()
            android.os.Messenger r3 = r2.f8562a
            android.os.IBinder r3 = r3.getBinder()
            r3.unlinkToDeath(r2, r1)
            f1.f0 r1 = r2.f8570i
            f1.f0$d r1 = r1.f8555h0
            f1.e0 r3 = new f1.e0
            r3.<init>(r2)
            r1.post(r3)
            r10.f8559l0 = r0
        L4b:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Service connection "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            android.content.ComponentName r1 = r2.f8554g0
            java.lang.String r1 = r1.flattenToShortString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: u */
    public final p085f1.ServiceConnectionC1961f0.c m4880u(int r4) {
            r3 = this;
            java.util.ArrayList<f1.f0$c> r0 = r3.f8556i0
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            f1.f0$c r1 = (p085f1.ServiceConnectionC1961f0.c) r1
            int r2 = r1.mo4892a()
            if (r2 != r4) goto L6
            return r1
        L19:
            r4 = 0
            return r4
    }

    /* renamed from: v */
    public void m4881v(p085f1.ServiceConnectionC1961f0.a r2, p085f1.C1970k r3) {
            r1 = this;
            f1.f0$a r0 = r1.f8559l0
            if (r0 != r2) goto L24
            boolean r2 = p085f1.ServiceConnectionC1961f0.f8553o0
            if (r2 == 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r0 = ": Descriptor changed, descriptor="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "MediaRouteProviderProxy"
            android.util.Log.d(r0, r2)
        L21:
            r1.m4931p(r3)
        L24:
            return
    }

    /* renamed from: w */
    public void m4882w(p085f1.ServiceConnectionC1961f0.c r2) {
            r1 = this;
            java.util.ArrayList<f1.f0$c> r0 = r1.f8556i0
            r0.remove(r2)
            r2.mo4893b()
            r1.m4876A()
            return
    }

    /* renamed from: x */
    public final boolean m4883x() {
            r2 = this;
            boolean r0 = r2.f8557j0
            if (r0 == 0) goto L13
            f1.h r0 = r2.f8616c0
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            java.util.ArrayList<f1.f0$c> r0 = r2.f8556i0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            return r1
        L13:
            r0 = 0
            return r0
    }

    /* renamed from: y */
    public void m4884y() {
            r2 = this;
            boolean r0 = r2.f8557j0
            if (r0 != 0) goto L24
            boolean r0 = p085f1.ServiceConnectionC1961f0.f8553o0
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = ": Starting"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MediaRouteProviderProxy"
            android.util.Log.d(r1, r0)
        L1e:
            r0 = 1
            r2.f8557j0 = r0
            r2.m4876A()
        L24:
            return
    }

    /* renamed from: z */
    public final void m4885z() {
            r4 = this;
            boolean r0 = r4.f8558k0
            if (r0 == 0) goto L3f
            boolean r0 = p085f1.ServiceConnectionC1961f0.f8553o0
            java.lang.String r1 = "MediaRouteProviderProxy"
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r2 = ": Unbinding"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1e:
            r0 = 0
            r4.f8558k0 = r0
            r4.m4879t()
            android.content.Context r0 = r4.f8612Y     // Catch: java.lang.IllegalArgumentException -> L2a
            r0.unbindService(r4)     // Catch: java.lang.IllegalArgumentException -> L2a
            goto L3f
        L2a:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r3 = ": unbindService failed"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2, r0)
        L3f:
            return
    }
}
