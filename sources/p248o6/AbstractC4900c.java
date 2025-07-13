package p248o6;

import android.os.IInterface;

/* renamed from: o6.c */
/* loaded from: classes.dex */
public abstract class AbstractC4900c<T extends android.os.IInterface> {

    /* renamed from: w0 */
    public static final p184k6.C3701d[] f19414w0 = null;

    /* renamed from: Y */
    public volatile java.lang.String f19415Y;

    /* renamed from: Z */
    public p248o6.C4929q0 f19416Z;

    /* renamed from: a0 */
    public final android.content.Context f19417a0;

    /* renamed from: b0 */
    public final android.os.Looper f19418b0;

    /* renamed from: c0 */
    public final p248o6.AbstractC4912i f19419c0;

    /* renamed from: d0 */
    public final p184k6.C3703f f19420d0;

    /* renamed from: e0 */
    public final android.os.Handler f19421e0;

    /* renamed from: f0 */
    public final java.lang.Object f19422f0;

    /* renamed from: g0 */
    public final java.lang.Object f19423g0;

    /* renamed from: h0 */
    public p248o6.InterfaceC4920m f19424h0;

    /* renamed from: i0 */
    @androidx.annotation.RecentlyNonNull
    public p248o6.AbstractC4900c.c f19425i0;

    /* renamed from: j0 */
    public T f19426j0;

    /* renamed from: k0 */
    public final java.util.ArrayList<p248o6.AbstractC4900c.h<?>> f19427k0;

    /* renamed from: l0 */
    public p248o6.AbstractC4900c.i f19428l0;

    /* renamed from: m0 */
    public int f19429m0;

    /* renamed from: n0 */
    public final p248o6.AbstractC4900c.a f19430n0;

    /* renamed from: o0 */
    public final p248o6.AbstractC4900c.b f19431o0;

    /* renamed from: p0 */
    public final int f19432p0;

    /* renamed from: q0 */
    public final java.lang.String f19433q0;

    /* renamed from: r0 */
    public volatile java.lang.String f19434r0;

    /* renamed from: s0 */
    public p184k6.C3698b f19435s0;

    /* renamed from: t0 */
    public boolean f19436t0;

    /* renamed from: u0 */
    public volatile p248o6.C4913i0 f19437u0;

    /* renamed from: v0 */
    @androidx.annotation.RecentlyNonNull
    public java.util.concurrent.atomic.AtomicInteger f19438v0;

    /* renamed from: o6.c$a */
    public interface a {
        /* renamed from: H */
        void mo11054H(android.os.Bundle r1);

        /* renamed from: v */
        void mo11055v(int r1);
    }

    /* renamed from: o6.c$b */
    public interface b {
        /* renamed from: x */
        void mo11056x(@androidx.annotation.RecentlyNonNull p184k6.C3698b r1);
    }

    /* renamed from: o6.c$c */
    public interface c {
        /* renamed from: a */
        void mo3082a(@androidx.annotation.RecentlyNonNull p184k6.C3698b r1);
    }

    /* renamed from: o6.c$d */
    public class d implements p248o6.AbstractC4900c.c {

        /* renamed from: a */
        public final /* synthetic */ p248o6.AbstractC4900c f19439a;

        public d(@androidx.annotation.RecentlyNonNull p248o6.AbstractC4900c r1) {
                r0 = this;
                r0.f19439a = r1
                r0.<init>()
                return
        }

        @Override // p248o6.AbstractC4900c.c
        /* renamed from: a */
        public void mo3082a(@androidx.annotation.RecentlyNonNull p184k6.C3698b r3) {
                r2 = this;
                boolean r0 = r3.m8161X()
                if (r0 == 0) goto L11
                o6.c r3 = r2.f19439a
                r0 = 0
                java.util.Set r1 = r3.mo11052x()
                r3.m11041c(r0, r1)
                return
            L11:
                o6.c r0 = r2.f19439a
                o6.c$b r0 = r0.f19431o0
                if (r0 == 0) goto L1a
                r0.mo11056x(r3)
            L1a:
                return
        }
    }

    /* renamed from: o6.c$e */
    public interface e {
    }

    /* renamed from: o6.c$f */
    public abstract class f extends p248o6.AbstractC4900c.h<java.lang.Boolean> {

        /* renamed from: d */
        public final int f19440d;

        /* renamed from: e */
        public final android.os.Bundle f19441e;

        /* renamed from: f */
        public final /* synthetic */ p248o6.AbstractC4900c f19442f;

        public f(p248o6.AbstractC4900c r2, int r3, android.os.Bundle r4) {
                r1 = this;
                r1.f19442f = r2
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r1.<init>(r2, r0)
                r1.f19440d = r3
                r1.f19441e = r4
                return
        }

        @Override // p248o6.AbstractC4900c.h
        /* renamed from: a */
        public final /* synthetic */ void mo11057a(java.lang.Boolean r3) {
                r2 = this;
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                int r3 = r2.f19440d
                r0 = 1
                r1 = 0
                if (r3 != 0) goto L1e
                boolean r3 = r2.mo11060e()
                if (r3 != 0) goto L3a
                o6.c r3 = r2.f19442f
                r3.m11039G(r0, r1)
                k6.b r3 = new k6.b
                r0 = 8
                r3.<init>(r0, r1)
                r2.mo11059d(r3)
                return
            L1e:
                o6.c r3 = r2.f19442f
                r3.m11039G(r0, r1)
                android.os.Bundle r3 = r2.f19441e
                if (r3 == 0) goto L30
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r3 = r3.getParcelable(r0)
                r1 = r3
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L30:
                k6.b r3 = new k6.b
                int r0 = r2.f19440d
                r3.<init>(r0, r1)
                r2.mo11059d(r3)
            L3a:
                return
        }

        @Override // p248o6.AbstractC4900c.h
        /* renamed from: b */
        public final void mo11058b() {
                r0 = this;
                return
        }

        /* renamed from: d */
        public abstract void mo11059d(p184k6.C3698b r1);

        /* renamed from: e */
        public abstract boolean mo11060e();
    }

    /* renamed from: o6.c$g */
    public final class g extends p110g7.HandlerC2297c {

        /* renamed from: a */
        public final /* synthetic */ p248o6.AbstractC4900c f19443a;

        public g(p248o6.AbstractC4900c r1, android.os.Looper r2) {
                r0 = this;
                r0.f19443a = r1
                r0.<init>(r2)
                return
        }

        /* renamed from: a */
        public static boolean m11061a(android.os.Message r2) {
                int r2 = r2.what
                r0 = 1
                r1 = 2
                if (r2 == r1) goto Le
                if (r2 == r0) goto Le
                r1 = 7
                if (r2 != r1) goto Lc
                goto Le
            Lc:
                r2 = 0
                return r2
            Le:
                return r0
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r8) {
                r7 = this;
                o6.c r0 = r7.f19443a
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f19438v0
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L1d
                boolean r0 = m11061a(r8)
                if (r0 == 0) goto L1c
                java.lang.Object r8 = r8.obj
                o6.c$h r8 = (p248o6.AbstractC4900c.h) r8
                r8.mo11058b()
                r8.m11062c()
            L1c:
                return
            L1d:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                if (r0 == r2) goto L31
                r4 = 7
                if (r0 == r4) goto L31
                if (r0 != r1) goto L2f
                o6.c r0 = r7.f19443a
                java.util.Objects.requireNonNull(r0)
                goto L31
            L2f:
                if (r0 != r3) goto L44
            L31:
                o6.c r0 = r7.f19443a
                boolean r0 = r0.m11044i()
                if (r0 != 0) goto L44
                java.lang.Object r8 = r8.obj
                o6.c$h r8 = (p248o6.AbstractC4900c.h) r8
                r8.mo11058b()
                r8.m11062c()
                return
            L44:
                int r0 = r8.what
                r4 = 8
                r5 = 3
                r6 = 0
                if (r0 != r1) goto L82
                o6.c r0 = r7.f19443a
                k6.b r1 = new k6.b
                int r8 = r8.arg2
                r1.<init>(r8)
                r0.f19435s0 = r1
                o6.c r8 = r7.f19443a
                boolean r8 = p248o6.AbstractC4900c.m11037J(r8)
                if (r8 == 0) goto L69
                o6.c r8 = r7.f19443a
                boolean r0 = r8.f19436t0
                if (r0 != 0) goto L69
                r8.m11039G(r5, r6)
                return
            L69:
                o6.c r8 = r7.f19443a
                k6.b r8 = r8.f19435s0
                if (r8 == 0) goto L70
                goto L75
            L70:
                k6.b r8 = new k6.b
                r8.<init>(r4)
            L75:
                o6.c r0 = r7.f19443a
                o6.c$c r0 = r0.f19425i0
                r0.mo3082a(r8)
                o6.c r0 = r7.f19443a
                r0.mo6384C(r8)
                return
            L82:
                if (r0 != r3) goto L9d
                o6.c r8 = r7.f19443a
                k6.b r8 = r8.f19435s0
                if (r8 == 0) goto L8b
                goto L90
            L8b:
                k6.b r8 = new k6.b
                r8.<init>(r4)
            L90:
                o6.c r0 = r7.f19443a
                o6.c$c r0 = r0.f19425i0
                r0.mo3082a(r8)
                o6.c r0 = r7.f19443a
                r0.mo6384C(r8)
                return
            L9d:
                if (r0 != r5) goto Lbc
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto La8
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            La8:
                k6.b r0 = new k6.b
                int r8 = r8.arg2
                r0.<init>(r8, r6)
                o6.c r8 = r7.f19443a
                o6.c$c r8 = r8.f19425i0
                r8.mo3082a(r0)
                o6.c r8 = r7.f19443a
                r8.mo6384C(r0)
                return
            Lbc:
                r1 = 6
                if (r0 != r1) goto Ldd
                o6.c r0 = r7.f19443a
                r0.m11039G(r3, r6)
                o6.c r0 = r7.f19443a
                o6.c$a r0 = r0.f19430n0
                if (r0 == 0) goto Lcf
                int r8 = r8.arg2
                r0.mo11055v(r8)
            Lcf:
                o6.c r8 = r7.f19443a
                java.util.Objects.requireNonNull(r8)
                java.lang.System.currentTimeMillis()
                o6.c r8 = r7.f19443a
                p248o6.AbstractC4900c.m11036I(r8, r3, r2, r6)
                return
            Ldd:
                r1 = 2
                if (r0 != r1) goto Lf3
                o6.c r0 = r7.f19443a
                boolean r0 = r0.m11040a()
                if (r0 != 0) goto Lf3
                java.lang.Object r8 = r8.obj
                o6.c$h r8 = (p248o6.AbstractC4900c.h) r8
                r8.mo11058b()
                r8.m11062c()
                return
            Lf3:
                boolean r0 = m11061a(r8)
                if (r0 == 0) goto L147
                java.lang.Object r8 = r8.obj
                r0 = r8
                o6.c$h r0 = (p248o6.AbstractC4900c.h) r0
                monitor-enter(r0)
                TListener r8 = r0.f19444a     // Catch: java.lang.Throwable -> L144
                boolean r1 = r0.f19445b     // Catch: java.lang.Throwable -> L144
                if (r1 == 0) goto L12a
                java.lang.String r1 = "GmsClient"
                java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L144
                int r4 = r3.length()     // Catch: java.lang.Throwable -> L144
                int r4 = r4 + 47
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L144
                r5.<init>(r4)     // Catch: java.lang.Throwable -> L144
                java.lang.String r4 = "Callback proxy "
                r5.append(r4)     // Catch: java.lang.Throwable -> L144
                r5.append(r3)     // Catch: java.lang.Throwable -> L144
                java.lang.String r3 = " being reused. This is not safe."
                r5.append(r3)     // Catch: java.lang.Throwable -> L144
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L144
                android.util.Log.w(r1, r3)     // Catch: java.lang.Throwable -> L144
            L12a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L144
                if (r8 == 0) goto L136
                r0.mo11057a(r8)     // Catch: java.lang.RuntimeException -> L131
                goto L139
            L131:
                r8 = move-exception
                r0.mo11058b()
                throw r8
            L136:
                r0.mo11058b()
            L139:
                monitor-enter(r0)
                r0.f19445b = r2     // Catch: java.lang.Throwable -> L141
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L141
                r0.m11062c()
                return
            L141:
                r8 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L141
                throw r8
            L144:
                r8 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L144
                throw r8
            L147:
                java.lang.String r0 = "GmsClient"
                int r8 = r8.what
                r1 = 45
                java.lang.String r2 = "Don't know how to handle message: "
                java.lang.String r8 = p064e.C1490d.m4039a(r1, r2, r8)
                java.lang.Exception r1 = new java.lang.Exception
                r1.<init>()
                android.util.Log.wtf(r0, r8, r1)
                return
        }
    }

    /* renamed from: o6.c$h */
    public abstract class h<TListener> {

        /* renamed from: a */
        public TListener f19444a;

        /* renamed from: b */
        public boolean f19445b;

        /* renamed from: c */
        public final /* synthetic */ p248o6.AbstractC4900c f19446c;

        public h(p248o6.AbstractC4900c r1, TListener r2) {
                r0 = this;
                r0.f19446c = r1
                r0.<init>()
                r0.f19444a = r2
                r1 = 0
                r0.f19445b = r1
                return
        }

        /* renamed from: a */
        public abstract void mo11057a(TListener r1);

        /* renamed from: b */
        public abstract void mo11058b();

        /* renamed from: c */
        public final void m11062c() {
                r2 = this;
                monitor-enter(r2)
                r0 = 0
                r2.f19444a = r0     // Catch: java.lang.Throwable -> L16
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
                o6.c r0 = r2.f19446c
                java.util.ArrayList<o6.c$h<?>> r0 = r0.f19427k0
                monitor-enter(r0)
                o6.c r1 = r2.f19446c     // Catch: java.lang.Throwable -> L13
                java.util.ArrayList<o6.c$h<?>> r1 = r1.f19427k0     // Catch: java.lang.Throwable -> L13
                r1.remove(r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return
            L13:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
            L16:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
                throw r0
        }
    }

    /* renamed from: o6.c$i */
    public final class i implements android.content.ServiceConnection {

        /* renamed from: Y */
        public final int f19447Y;

        /* renamed from: Z */
        public final /* synthetic */ p248o6.AbstractC4900c f19448Z;

        public i(p248o6.AbstractC4900c r1, int r2) {
                r0 = this;
                r0.f19448Z = r1
                r0.<init>()
                r0.f19447Y = r2
                return
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
                r3 = this;
                o6.c r4 = r3.f19448Z
                if (r5 != 0) goto L8
                p248o6.AbstractC4900c.m11035H(r4)
                return
            L8:
                java.lang.Object r4 = r4.f19423g0
                monitor-enter(r4)
                o6.c r0 = r3.f19448Z     // Catch: java.lang.Throwable -> L3a
                java.lang.String r1 = "com.google.android.gms.common.internal.IGmsServiceBroker"
                android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch: java.lang.Throwable -> L3a
                if (r1 == 0) goto L1c
                boolean r2 = r1 instanceof p248o6.InterfaceC4920m     // Catch: java.lang.Throwable -> L3a
                if (r2 == 0) goto L1c
                o6.m r1 = (p248o6.InterfaceC4920m) r1     // Catch: java.lang.Throwable -> L3a
                goto L21
            L1c:
                o6.m$a$a r1 = new o6.m$a$a     // Catch: java.lang.Throwable -> L3a
                r1.<init>(r5)     // Catch: java.lang.Throwable -> L3a
            L21:
                r0.f19424h0 = r1     // Catch: java.lang.Throwable -> L3a
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
                o6.c r4 = r3.f19448Z
                r5 = 0
                int r0 = r3.f19447Y
                android.os.Handler r1 = r4.f19421e0
                o6.c$l r2 = new o6.c$l
                r2.<init>(r4, r5)
                r4 = 7
                r5 = -1
                android.os.Message r4 = r1.obtainMessage(r4, r0, r5, r2)
                r1.sendMessage(r4)
                return
            L3a:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
                throw r5
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName r4) {
                r3 = this;
                o6.c r4 = r3.f19448Z
                java.lang.Object r4 = r4.f19423g0
                monitor-enter(r4)
                o6.c r0 = r3.f19448Z     // Catch: java.lang.Throwable -> L19
                r1 = 0
                r0.f19424h0 = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
                android.os.Handler r4 = r0.f19421e0
                r0 = 6
                int r1 = r3.f19447Y
                r2 = 1
                android.os.Message r0 = r4.obtainMessage(r0, r1, r2)
                r4.sendMessage(r0)
                return
            L19:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
                throw r0
        }
    }

    /* renamed from: o6.c$j */
    public static final class j extends p248o6.InterfaceC4918l.a {

        /* renamed from: a */
        public p248o6.AbstractC4900c f19449a;

        /* renamed from: b */
        public final int f19450b;

        public j(p248o6.AbstractC4900c r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f19449a = r1
                r0.f19450b = r2
                return
        }

        @Override // p248o6.InterfaceC4918l
        /* renamed from: h2 */
        public final void mo11063h2(int r3, android.os.IBinder r4, android.os.Bundle r5) {
                r2 = this;
                o6.c r0 = r2.f19449a
                java.lang.String r1 = "onPostInitComplete can be called only once per call to getRemoteService"
                com.google.android.gms.common.internal.C1101a.m3104i(r0, r1)
                o6.c r0 = r2.f19449a
                int r1 = r2.f19450b
                r0.mo6385D(r3, r4, r5, r1)
                r3 = 0
                r2.f19449a = r3
                return
        }
    }

    /* renamed from: o6.c$k */
    public final class k extends p248o6.AbstractC4900c.f {

        /* renamed from: g */
        public final android.os.IBinder f19451g;

        /* renamed from: h */
        public final /* synthetic */ p248o6.AbstractC4900c f19452h;

        public k(p248o6.AbstractC4900c r1, int r2, android.os.IBinder r3, android.os.Bundle r4) {
                r0 = this;
                r0.f19452h = r1
                r0.<init>(r1, r2, r4)
                r0.f19451g = r3
                return
        }

        @Override // p248o6.AbstractC4900c.f
        /* renamed from: d */
        public final void mo11059d(p184k6.C3698b r2) {
                r1 = this;
                o6.c r0 = r1.f19452h
                o6.c$b r0 = r0.f19431o0
                if (r0 == 0) goto L9
                r0.mo11056x(r2)
            L9:
                o6.c r0 = r1.f19452h
                r0.mo6384C(r2)
                return
        }

        @Override // p248o6.AbstractC4900c.f
        /* renamed from: e */
        public final boolean mo11060e() {
                r6 = this;
                java.lang.String r0 = "GmsClient"
                r1 = 0
                android.os.IBinder r2 = r6.f19451g     // Catch: android.os.RemoteException -> L79
                java.lang.String r3 = "null reference"
                java.util.Objects.requireNonNull(r2, r3)     // Catch: android.os.RemoteException -> L79
                java.lang.String r2 = r2.getInterfaceDescriptor()     // Catch: android.os.RemoteException -> L79
                o6.c r3 = r6.f19452h
                java.lang.String r3 = r3.mo2639z()
                boolean r3 = r3.equals(r2)
                if (r3 != 0) goto L47
                o6.c r3 = r6.f19452h
                java.lang.String r3 = r3.mo2639z()
                r4 = 34
                int r4 = p064e.C1489c.m4038a(r3, r4)
                int r4 = p064e.C1489c.m4038a(r2, r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r4)
                java.lang.String r4 = "service descriptor mismatch: "
                r5.append(r4)
                r5.append(r3)
                java.lang.String r3 = " vs. "
                r5.append(r3)
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                android.util.Log.e(r0, r2)
                return r1
            L47:
                o6.c r0 = r6.f19452h
                android.os.IBinder r2 = r6.f19451g
                android.os.IInterface r0 = r0.mo2637s(r2)
                if (r0 == 0) goto L78
                o6.c r2 = r6.f19452h
                r3 = 2
                r4 = 4
                boolean r2 = p248o6.AbstractC4900c.m11036I(r2, r3, r4, r0)
                if (r2 != 0) goto L64
                o6.c r2 = r6.f19452h
                r3 = 3
                boolean r0 = p248o6.AbstractC4900c.m11036I(r2, r3, r4, r0)
                if (r0 == 0) goto L78
            L64:
                o6.c r0 = r6.f19452h
                r1 = 0
                r0.f19435s0 = r1
                android.os.Bundle r0 = r0.mo6390v()
                o6.c r1 = r6.f19452h
                o6.c$a r1 = r1.f19430n0
                if (r1 == 0) goto L76
                r1.mo11054H(r0)
            L76:
                r0 = 1
                return r0
            L78:
                return r1
            L79:
                java.lang.String r2 = "service probably died"
                android.util.Log.w(r0, r2)
                return r1
        }
    }

    /* renamed from: o6.c$l */
    public final class l extends p248o6.AbstractC4900c.f {

        /* renamed from: g */
        public final /* synthetic */ p248o6.AbstractC4900c f19453g;

        public l(p248o6.AbstractC4900c r2, int r3) {
                r1 = this;
                r1.f19453g = r2
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        @Override // p248o6.AbstractC4900c.f
        /* renamed from: d */
        public final void mo11059d(p184k6.C3698b r2) {
                r1 = this;
                o6.c r0 = r1.f19453g
                java.util.Objects.requireNonNull(r0)
                o6.c r0 = r1.f19453g
                o6.c$c r0 = r0.f19425i0
                r0.mo3082a(r2)
                o6.c r0 = r1.f19453g
                r0.mo6384C(r2)
                return
        }

        @Override // p248o6.AbstractC4900c.f
        /* renamed from: e */
        public final boolean mo11060e() {
                r2 = this;
                o6.c r0 = r2.f19453g
                o6.c$c r0 = r0.f19425i0
                k6.b r1 = p184k6.C3698b.f16392c0
                r0.mo3082a(r1)
                r0 = 1
                return r0
        }
    }

    static {
            r0 = 0
            k6.d[] r0 = new p184k6.C3701d[r0]
            p248o6.AbstractC4900c.f19414w0 = r0
            return
    }

    public AbstractC4900c(@androidx.annotation.RecentlyNonNull android.content.Context r3, @androidx.annotation.RecentlyNonNull android.os.Looper r4, @androidx.annotation.RecentlyNonNull p248o6.AbstractC4912i r5, @androidx.annotation.RecentlyNonNull p184k6.C3703f r6, int r7, p248o6.AbstractC4900c.a r8, p248o6.AbstractC4900c.b r9, java.lang.String r10) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f19415Y = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.f19422f0 = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.f19423g0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f19427k0 = r1
            r1 = 1
            r2.f19429m0 = r1
            r2.f19435s0 = r0
            r1 = 0
            r2.f19436t0 = r1
            r2.f19437u0 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r2.f19438v0 = r0
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r3, r0)
            android.content.Context r3 = (android.content.Context) r3
            r2.f19417a0 = r3
            java.lang.String r3 = "Looper must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r4, r3)
            r3 = r4
            android.os.Looper r3 = (android.os.Looper) r3
            r2.f19418b0 = r3
            java.lang.String r3 = "Supervisor must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r5, r3)
            o6.i r5 = (p248o6.AbstractC4912i) r5
            r2.f19419c0 = r5
            java.lang.String r3 = "API availability must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r6, r3)
            k6.f r6 = (p184k6.C3703f) r6
            r2.f19420d0 = r6
            o6.c$g r3 = new o6.c$g
            r3.<init>(r2, r4)
            r2.f19421e0 = r3
            r2.f19432p0 = r7
            r2.f19430n0 = r8
            r2.f19431o0 = r9
            r2.f19433q0 = r10
            return
    }

    /* renamed from: H */
    public static void m11035H(p248o6.AbstractC4900c r4) {
            java.lang.Object r0 = r4.f19422f0
            monitor-enter(r0)
            int r1 = r4.f19429m0     // Catch: java.lang.Throwable -> L26
            r2 = 3
            r3 = 1
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L13
            r0 = 5
            r4.f19436t0 = r3
            goto L14
        L13:
            r0 = 4
        L14:
            android.os.Handler r1 = r4.f19421e0
            java.util.concurrent.atomic.AtomicInteger r4 = r4.f19438v0
            int r4 = r4.get()
            r2 = 16
            android.os.Message r4 = r1.obtainMessage(r0, r4, r2)
            r1.sendMessage(r4)
            return
        L26:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r4
    }

    /* renamed from: I */
    public static boolean m11036I(p248o6.AbstractC4900c r2, int r3, int r4, android.os.IInterface r5) {
            java.lang.Object r0 = r2.f19422f0
            monitor-enter(r0)
            int r1 = r2.f19429m0     // Catch: java.lang.Throwable -> L10
            if (r1 == r3) goto La
            r2 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            goto Lf
        La:
            r2.m11039G(r4, r5)     // Catch: java.lang.Throwable -> L10
            r2 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
        Lf:
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    /* renamed from: J */
    public static boolean m11037J(p248o6.AbstractC4900c r2) {
            boolean r0 = r2.f19436t0
            r1 = 0
            if (r0 == 0) goto L6
            goto L21
        L6:
            java.lang.String r0 = r2.mo2639z()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L21
        L11:
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L19
            goto L21
        L19:
            java.lang.String r2 = r2.mo2639z()     // Catch: java.lang.ClassNotFoundException -> L21
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L21
            r1 = 1
        L21:
            return r1
    }

    /* renamed from: A */
    public abstract java.lang.String mo2635A();

    @androidx.annotation.RecentlyNonNull
    /* renamed from: B */
    public java.lang.String mo6801B() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms"
            return r0
    }

    /* renamed from: C */
    public void mo6384C(@androidx.annotation.RecentlyNonNull p184k6.C3698b r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            java.lang.System.currentTimeMillis()
            return
    }

    /* renamed from: D */
    public void mo6385D(int r3, android.os.IBinder r4, android.os.Bundle r5, int r6) {
            r2 = this;
            android.os.Handler r0 = r2.f19421e0
            o6.c$k r1 = new o6.c$k
            r1.<init>(r2, r3, r4, r5)
            r3 = 1
            r4 = -1
            android.os.Message r3 = r0.obtainMessage(r3, r6, r4, r1)
            r0.sendMessage(r3)
            return
    }

    /* renamed from: E */
    public boolean mo6393E() {
            r0 = this;
            boolean r0 = r0 instanceof p123h6.C2517x
            return r0
    }

    /* renamed from: F */
    public final java.lang.String m11038F() {
            r1 = this;
            java.lang.String r0 = r1.f19433q0
            if (r0 != 0) goto Le
            android.content.Context r0 = r1.f19417a0
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
        Le:
            return r0
    }

    /* renamed from: G */
    public final void m11039G(int r11, T r12) {
            r10 = this;
            r0 = 0
            r1 = 1
            r2 = 4
            if (r11 != r2) goto L7
            r3 = 1
            goto L8
        L7:
            r3 = 0
        L8:
            if (r12 == 0) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            if (r3 != r4) goto L10
            r0 = 1
        L10:
            com.google.android.gms.common.internal.C1101a.m3096a(r0)
            java.lang.Object r0 = r10.f19422f0
            monitor-enter(r0)
            r10.f19429m0 = r11     // Catch: java.lang.Throwable -> L184
            r10.f19426j0 = r12     // Catch: java.lang.Throwable -> L184
            r3 = 4225(0x1081, float:5.92E-42)
            if (r11 == r1) goto L159
            r1 = 2
            r4 = 3
            if (r11 == r1) goto L32
            if (r11 == r4) goto L32
            if (r11 == r2) goto L28
            goto L182
        L28:
            java.lang.String r11 = "null reference"
            java.util.Objects.requireNonNull(r12, r11)     // Catch: java.lang.Throwable -> L184
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L184
            goto L182
        L32:
            o6.c$i r11 = r10.f19428l0     // Catch: java.lang.Throwable -> L184
            if (r11 == 0) goto L96
            o6.q0 r12 = r10.f19416Z     // Catch: java.lang.Throwable -> L184
            if (r12 == 0) goto L96
            java.lang.String r1 = "GmsClient"
            java.lang.String r2 = r12.f19538a     // Catch: java.lang.Throwable -> L184
            java.lang.String r12 = r12.f19539b     // Catch: java.lang.Throwable -> L184
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L184
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L184
            int r4 = r4 + 70
            java.lang.String r5 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L184
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L184
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L184
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L184
            java.lang.String r4 = "Calling connect() while still connected, missing disconnect() for "
            r5.append(r4)     // Catch: java.lang.Throwable -> L184
            r5.append(r2)     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = " on "
            r5.append(r2)     // Catch: java.lang.Throwable -> L184
            r5.append(r12)     // Catch: java.lang.Throwable -> L184
            java.lang.String r12 = r5.toString()     // Catch: java.lang.Throwable -> L184
            android.util.Log.e(r1, r12)     // Catch: java.lang.Throwable -> L184
            o6.i r12 = r10.f19419c0     // Catch: java.lang.Throwable -> L184
            o6.q0 r1 = r10.f19416Z     // Catch: java.lang.Throwable -> L184
            java.lang.String r1 = r1.f19538a     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L184
            o6.q0 r2 = r10.f19416Z     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = r2.f19539b     // Catch: java.lang.Throwable -> L184
            java.lang.String r4 = r10.m11038F()     // Catch: java.lang.Throwable -> L184
            o6.q0 r5 = r10.f19416Z     // Catch: java.lang.Throwable -> L184
            boolean r5 = r5.f19540c     // Catch: java.lang.Throwable -> L184
            java.util.Objects.requireNonNull(r12)     // Catch: java.lang.Throwable -> L184
            o6.i$a r6 = new o6.i$a     // Catch: java.lang.Throwable -> L184
            r6.<init>(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L184
            r12.mo11068c(r6, r11, r4)     // Catch: java.lang.Throwable -> L184
            java.util.concurrent.atomic.AtomicInteger r11 = r10.f19438v0     // Catch: java.lang.Throwable -> L184
            r11.incrementAndGet()     // Catch: java.lang.Throwable -> L184
        L96:
            o6.c$i r11 = new o6.c$i     // Catch: java.lang.Throwable -> L184
            java.util.concurrent.atomic.AtomicInteger r12 = r10.f19438v0     // Catch: java.lang.Throwable -> L184
            int r12 = r12.get()     // Catch: java.lang.Throwable -> L184
            r11.<init>(r10, r12)     // Catch: java.lang.Throwable -> L184
            r10.f19428l0 = r11     // Catch: java.lang.Throwable -> L184
            o6.q0 r12 = new o6.q0     // Catch: java.lang.Throwable -> L184
            java.lang.String r5 = r10.mo6801B()     // Catch: java.lang.Throwable -> L184
            java.lang.String r6 = r10.mo2635A()     // Catch: java.lang.Throwable -> L184
            r7 = 0
            java.lang.Object r1 = p248o6.AbstractC4912i.f19496a     // Catch: java.lang.Throwable -> L184
            r8 = 4225(0x1081, float:5.92E-42)
            boolean r1 = r10 instanceof p286q6.C5581d     // Catch: java.lang.Throwable -> L184
            r4 = r12
            r9 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L184
            r10.f19416Z = r12     // Catch: java.lang.Throwable -> L184
            if (r1 == 0) goto Le7
            int r12 = r10.mo2636h()     // Catch: java.lang.Throwable -> L184
            r1 = 17895000(0x1110e58, float:2.6642585E-38)
            if (r12 >= r1) goto Le7
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L184
            java.lang.String r12 = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "
            o6.q0 r1 = r10.f19416Z     // Catch: java.lang.Throwable -> L184
            java.lang.String r1 = r1.f19538a     // Catch: java.lang.Throwable -> L184
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L184
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L184
            if (r2 == 0) goto Ldd
            java.lang.String r12 = r12.concat(r1)     // Catch: java.lang.Throwable -> L184
            goto Le3
        Ldd:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L184
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L184
            r12 = r1
        Le3:
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L184
            throw r11     // Catch: java.lang.Throwable -> L184
        Le7:
            o6.i r12 = r10.f19419c0     // Catch: java.lang.Throwable -> L184
            o6.q0 r1 = r10.f19416Z     // Catch: java.lang.Throwable -> L184
            java.lang.String r1 = r1.f19538a     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L184
            o6.q0 r2 = r10.f19416Z     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = r2.f19539b     // Catch: java.lang.Throwable -> L184
            java.lang.String r4 = r10.m11038F()     // Catch: java.lang.Throwable -> L184
            o6.q0 r5 = r10.f19416Z     // Catch: java.lang.Throwable -> L184
            boolean r5 = r5.f19540c     // Catch: java.lang.Throwable -> L184
            o6.i$a r6 = new o6.i$a     // Catch: java.lang.Throwable -> L184
            r6.<init>(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L184
            boolean r11 = r12.mo11067b(r6, r11, r4)     // Catch: java.lang.Throwable -> L184
            if (r11 != 0) goto L182
            java.lang.String r11 = "GmsClient"
            o6.q0 r12 = r10.f19416Z     // Catch: java.lang.Throwable -> L184
            java.lang.String r1 = r12.f19538a     // Catch: java.lang.Throwable -> L184
            java.lang.String r12 = r12.f19539b     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L184
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L184
            int r2 = r2 + 34
            java.lang.String r3 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L184
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L184
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L184
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = "unable to connect to service: "
            r3.append(r2)     // Catch: java.lang.Throwable -> L184
            r3.append(r1)     // Catch: java.lang.Throwable -> L184
            java.lang.String r1 = " on "
            r3.append(r1)     // Catch: java.lang.Throwable -> L184
            r3.append(r12)     // Catch: java.lang.Throwable -> L184
            java.lang.String r12 = r3.toString()     // Catch: java.lang.Throwable -> L184
            android.util.Log.e(r11, r12)     // Catch: java.lang.Throwable -> L184
            r11 = 16
            java.util.concurrent.atomic.AtomicInteger r12 = r10.f19438v0     // Catch: java.lang.Throwable -> L184
            int r12 = r12.get()     // Catch: java.lang.Throwable -> L184
            android.os.Handler r1 = r10.f19421e0     // Catch: java.lang.Throwable -> L184
            o6.c$l r2 = new o6.c$l     // Catch: java.lang.Throwable -> L184
            r2.<init>(r10, r11)     // Catch: java.lang.Throwable -> L184
            r11 = 7
            r3 = -1
            android.os.Message r11 = r1.obtainMessage(r11, r12, r3, r2)     // Catch: java.lang.Throwable -> L184
            r1.sendMessage(r11)     // Catch: java.lang.Throwable -> L184
            goto L182
        L159:
            o6.c$i r11 = r10.f19428l0     // Catch: java.lang.Throwable -> L184
            if (r11 == 0) goto L182
            o6.i r12 = r10.f19419c0     // Catch: java.lang.Throwable -> L184
            o6.q0 r1 = r10.f19416Z     // Catch: java.lang.Throwable -> L184
            java.lang.String r1 = r1.f19538a     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L184
            o6.q0 r2 = r10.f19416Z     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = r2.f19539b     // Catch: java.lang.Throwable -> L184
            java.lang.String r4 = r10.m11038F()     // Catch: java.lang.Throwable -> L184
            o6.q0 r5 = r10.f19416Z     // Catch: java.lang.Throwable -> L184
            boolean r5 = r5.f19540c     // Catch: java.lang.Throwable -> L184
            java.util.Objects.requireNonNull(r12)     // Catch: java.lang.Throwable -> L184
            o6.i$a r6 = new o6.i$a     // Catch: java.lang.Throwable -> L184
            r6.<init>(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L184
            r12.mo11068c(r6, r11, r4)     // Catch: java.lang.Throwable -> L184
            r11 = 0
            r10.f19428l0 = r11     // Catch: java.lang.Throwable -> L184
        L182:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L184
            return
        L184:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L184
            throw r11
    }

    /* renamed from: a */
    public boolean m11040a() {
            r3 = this;
            java.lang.Object r0 = r3.f19422f0
            monitor-enter(r0)
            int r1 = r3.f19429m0     // Catch: java.lang.Throwable -> Ld
            r2 = 4
            if (r1 != r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    /* renamed from: c */
    public void m11041c(p248o6.InterfaceC4916k r5, @androidx.annotation.RecentlyNonNull java.util.Set<com.google.android.gms.common.api.Scope> r6) {
            r4 = this;
            android.os.Bundle r0 = r4.mo6391w()
            o6.g r1 = new o6.g
            int r2 = r4.f19432p0
            java.lang.String r3 = r4.f19434r0
            r1.<init>(r2, r3)
            android.content.Context r2 = r4.f19417a0
            java.lang.String r2 = r2.getPackageName()
            r1.f19483b0 = r2
            r1.f19486e0 = r0
            if (r6 == 0) goto L27
            int r0 = r6.size()
            com.google.android.gms.common.api.Scope[] r0 = new com.google.android.gms.common.api.Scope[r0]
            java.lang.Object[] r6 = r6.toArray(r0)
            com.google.android.gms.common.api.Scope[] r6 = (com.google.android.gms.common.api.Scope[]) r6
            r1.f19485d0 = r6
        L27:
            boolean r6 = r4.mo9323o()
            if (r6 == 0) goto L47
            android.accounts.Account r6 = r4.mo11051t()
            if (r6 == 0) goto L34
            goto L3d
        L34:
            android.accounts.Account r6 = new android.accounts.Account
            java.lang.String r0 = "<<default account>>"
            java.lang.String r2 = "com.google"
            r6.<init>(r0, r2)
        L3d:
            r1.f19487f0 = r6
            if (r5 == 0) goto L47
            android.os.IBinder r5 = r5.asBinder()
            r1.f19484c0 = r5
        L47:
            k6.d[] r5 = p248o6.AbstractC4900c.f19414w0
            r1.f19488g0 = r5
            k6.d[] r5 = r4.mo2638u()
            r1.f19489h0 = r5
            boolean r5 = r4.mo6393E()
            if (r5 == 0) goto L5a
            r5 = 1
            r1.f19492k0 = r5
        L5a:
            java.lang.Object r5 = r4.f19423g0     // Catch: java.lang.RuntimeException -> L7c android.os.RemoteException -> L7e java.lang.SecurityException -> L93 android.os.DeadObjectException -> L95
            monitor-enter(r5)     // Catch: java.lang.RuntimeException -> L7c android.os.RemoteException -> L7e java.lang.SecurityException -> L93 android.os.DeadObjectException -> L95
            o6.m r6 = r4.f19424h0     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L70
            o6.c$j r0 = new o6.c$j     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.atomic.AtomicInteger r2 = r4.f19438v0     // Catch: java.lang.Throwable -> L79
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L79
            r0.<init>(r4, r2)     // Catch: java.lang.Throwable -> L79
            r6.mo11072F0(r0, r1)     // Catch: java.lang.Throwable -> L79
            goto L77
        L70:
            java.lang.String r6 = "GmsClient"
            java.lang.String r0 = "mServiceBroker is null, client disconnected"
            android.util.Log.w(r6, r0)     // Catch: java.lang.Throwable -> L79
        L77:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L79
            return
        L79:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L79
            throw r6     // Catch: java.lang.RuntimeException -> L7c android.os.RemoteException -> L7e java.lang.SecurityException -> L93 android.os.DeadObjectException -> L95
        L7c:
            r5 = move-exception
            goto L7f
        L7e:
            r5 = move-exception
        L7f:
            java.lang.String r6 = "GmsClient"
            java.lang.String r0 = "IGmsServiceBroker.getService failed"
            android.util.Log.w(r6, r0, r5)
            r5 = 8
            java.util.concurrent.atomic.AtomicInteger r6 = r4.f19438v0
            int r6 = r6.get()
            r0 = 0
            r4.mo6385D(r5, r0, r0, r6)
            return
        L93:
            r5 = move-exception
            throw r5
        L95:
            r5 = move-exception
            java.lang.String r6 = "GmsClient"
            java.lang.String r0 = "IGmsServiceBroker.getService failed"
            android.util.Log.w(r6, r0, r5)
            r5 = 3
            android.os.Handler r6 = r4.f19421e0
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f19438v0
            int r0 = r0.get()
            r1 = 6
            android.os.Message r5 = r6.obtainMessage(r1, r0, r5)
            r6.sendMessage(r5)
            return
    }

    /* renamed from: d */
    public void m11042d(@androidx.annotation.RecentlyNonNull java.lang.String r1) {
            r0 = this;
            r0.f19415Y = r1
            r0.mo6389n()
            return
    }

    /* renamed from: f */
    public boolean mo6802f() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* renamed from: g */
    public void m11043g(@androidx.annotation.RecentlyNonNull p248o6.AbstractC4900c.e r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.k r3 = (com.google.android.gms.common.api.internal.C1091k) r3
            com.google.android.gms.common.api.internal.b$a r0 = r3.f5616a
            com.google.android.gms.common.api.internal.b r0 = r0.f5587m
            android.os.Handler r0 = r0.f5573k0
            com.google.android.gms.common.api.internal.l r1 = new com.google.android.gms.common.api.internal.l
            r1.<init>(r3)
            r0.post(r1)
            return
    }

    /* renamed from: h */
    public int mo2636h() {
            r1 = this;
            int r0 = p184k6.C3703f.f16408a
            return r0
    }

    /* renamed from: i */
    public boolean m11044i() {
            r3 = this;
            java.lang.Object r0 = r3.f19422f0
            monitor-enter(r0)
            int r1 = r3.f19429m0     // Catch: java.lang.Throwable -> L11
            r2 = 2
            if (r1 == r2) goto Le
            r2 = 3
            if (r1 != r2) goto Lc
            goto Le
        Lc:
            r1 = 0
            goto Lf
        Le:
            r1 = 1
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ p124h7.InterfaceC2876tc m11045j() {
            r1 = this;
            android.os.IInterface r0 = r1.m11053y()
            h7.tc r0 = (p124h7.InterfaceC2876tc) r0
            return r0
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: k */
    public final p184k6.C3701d[] m11046k() {
            r1 = this;
            o6.i0 r0 = r1.f19437u0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            k6.d[] r0 = r0.f19504Z
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: l */
    public java.lang.String m11047l() {
            r2 = this;
            boolean r0 = r2.m11040a()
            if (r0 == 0) goto Ld
            o6.q0 r0 = r2.f19416Z
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.f19539b
            return r0
        Ld:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed to connect when checking package"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: m */
    public java.lang.String m11048m() {
            r1 = this;
            java.lang.String r0 = r1.f19415Y
            return r0
    }

    /* renamed from: n */
    public void mo6389n() {
            r5 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r5.f19438v0
            r0.incrementAndGet()
            java.util.ArrayList<o6.c$h<?>> r0 = r5.f19427k0
            monitor-enter(r0)
            java.util.ArrayList<o6.c$h<?>> r1 = r5.f19427k0     // Catch: java.lang.Throwable -> L38
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L38
            r2 = 0
        Lf:
            r3 = 0
            if (r2 >= r1) goto L24
            java.util.ArrayList<o6.c$h<?>> r4 = r5.f19427k0     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L38
            o6.c$h r4 = (p248o6.AbstractC4900c.h) r4     // Catch: java.lang.Throwable -> L38
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L38
            r4.f19444a = r3     // Catch: java.lang.Throwable -> L21
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            int r2 = r2 + 1
            goto Lf
        L21:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            throw r1     // Catch: java.lang.Throwable -> L38
        L24:
            java.util.ArrayList<o6.c$h<?>> r1 = r5.f19427k0     // Catch: java.lang.Throwable -> L38
            r1.clear()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r5.f19423g0
            monitor-enter(r1)
            r5.f19424h0 = r3     // Catch: java.lang.Throwable -> L35
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            r0 = 1
            r5.m11039G(r0, r3)
            return
        L35:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            throw r0
        L38:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r1
    }

    /* renamed from: o */
    public boolean mo9323o() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: q */
    public void m11049q(@androidx.annotation.RecentlyNonNull p248o6.AbstractC4900c.c r2) {
            r1 = this;
            r1.f19425i0 = r2
            r2 = 2
            r0 = 0
            r1.m11039G(r2, r0)
            return
    }

    /* renamed from: r */
    public void m11050r() {
            r5 = this;
            k6.f r0 = r5.f19420d0
            android.content.Context r1 = r5.f19417a0
            int r2 = r5.mo2636h()
            int r0 = r0.mo8164b(r1, r2)
            if (r0 == 0) goto L30
            r1 = 1
            r2 = 0
            r5.m11039G(r1, r2)
            o6.c$d r1 = new o6.c$d
            r1.<init>(r5)
            java.lang.String r3 = "Connection progress callbacks cannot be null."
            com.google.android.gms.common.internal.C1101a.m3104i(r1, r3)
            r5.f19425i0 = r1
            android.os.Handler r1 = r5.f19421e0
            java.util.concurrent.atomic.AtomicInteger r3 = r5.f19438v0
            int r3 = r3.get()
            r4 = 3
            android.os.Message r0 = r1.obtainMessage(r4, r3, r0, r2)
            r1.sendMessage(r0)
            return
        L30:
            o6.c$d r0 = new o6.c$d
            r0.<init>(r5)
            r5.m11049q(r0)
            return
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: s */
    public abstract T mo2637s(@androidx.annotation.RecentlyNonNull android.os.IBinder r1);

    @androidx.annotation.RecentlyNullable
    /* renamed from: t */
    public android.accounts.Account mo11051t() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: u */
    public p184k6.C3701d[] mo2638u() {
            r1 = this;
            k6.d[] r0 = p248o6.AbstractC4900c.f19414w0
            return r0
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: v */
    public android.os.Bundle mo6390v() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: w */
    public android.os.Bundle mo6391w() {
            r1 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: x */
    public java.util.Set<com.google.android.gms.common.api.Scope> mo11052x() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: y */
    public final T m11053y() {
            r3 = this;
            java.lang.Object r0 = r3.f19422f0
            monitor-enter(r0)
            int r1 = r3.f19429m0     // Catch: java.lang.Throwable -> L27
            r2 = 5
            if (r1 == r2) goto L21
            boolean r1 = r3.m11040a()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L19
            T extends android.os.IInterface r1 = r3.f19426j0     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "Client is connected but service is null"
            com.google.android.gms.common.internal.C1101a.m3104i(r1, r2)     // Catch: java.lang.Throwable -> L27
            android.os.IInterface r1 = (android.os.IInterface) r1     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return r1
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "Not connected. Call connect() and wait for onConnected() to be called."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L27
            throw r1     // Catch: java.lang.Throwable -> L27
        L21:
            android.os.DeadObjectException r1 = new android.os.DeadObjectException     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            throw r1     // Catch: java.lang.Throwable -> L27
        L27:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r1
    }

    /* renamed from: z */
    public abstract java.lang.String mo2639z();
}
