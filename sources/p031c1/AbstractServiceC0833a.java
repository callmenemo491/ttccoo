package p031c1;

/* renamed from: c1.a */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0833a extends android.app.Service {

    /* renamed from: e0 */
    public static final boolean f4516e0 = false;

    /* renamed from: Y */
    public p031c1.AbstractServiceC0833a.d f4517Y;

    /* renamed from: Z */
    public final p031c1.AbstractServiceC0833a.c f4518Z;

    /* renamed from: a0 */
    public final java.util.ArrayList<p031c1.AbstractServiceC0833a.c> f4519a0;

    /* renamed from: b0 */
    public final p319s.C5934a<android.os.IBinder, p031c1.AbstractServiceC0833a.c> f4520b0;

    /* renamed from: c0 */
    public final p031c1.AbstractServiceC0833a.n f4521c0;

    /* renamed from: d0 */
    public android.support.v4.media.session.MediaSessionCompat.Token f4522d0;

    /* renamed from: c1.a$a */
    public class a extends p031c1.AbstractServiceC0833a.i<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> {

        /* renamed from: f */
        public final /* synthetic */ p031c1.AbstractServiceC0833a.c f4523f;

        /* renamed from: g */
        public final /* synthetic */ java.lang.String f4524g;

        /* renamed from: h */
        public final /* synthetic */ android.os.Bundle f4525h;

        /* renamed from: i */
        public final /* synthetic */ android.os.Bundle f4526i;

        /* renamed from: j */
        public final /* synthetic */ p031c1.AbstractServiceC0833a f4527j;

        public a(p031c1.AbstractServiceC0833a r1, java.lang.Object r2, p031c1.AbstractServiceC0833a.c r3, java.lang.String r4, android.os.Bundle r5, android.os.Bundle r6) {
                r0 = this;
                r0.f4527j = r1
                r0.f4523f = r3
                r0.f4524g = r4
                r0.f4525h = r5
                r0.f4526i = r6
                r0.<init>(r2)
                return
        }

        @Override // p031c1.AbstractServiceC0833a.i
        /* renamed from: c */
        public void mo2505c(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r6) {
                r5 = this;
                java.util.List r6 = (java.util.List) r6
                c1.a r0 = r5.f4527j
                s.a<android.os.IBinder, c1.a$c> r0 = r0.f4520b0
                c1.a$c r1 = r5.f4523f
                c1.a$l r1 = r1.f4533d
                c1.a$m r1 = (p031c1.AbstractServiceC0833a.m) r1
                android.os.IBinder r1 = r1.m2512a()
                java.lang.Object r0 = r0.get(r1)
                c1.a$c r1 = r5.f4523f
                java.lang.String r2 = "MBServiceCompat"
                if (r0 == r1) goto L3d
                boolean r6 = p031c1.AbstractServiceC0833a.f4516e0
                if (r6 == 0) goto L79
                java.lang.String r6 = "Not sending onLoadChildren result for connection that has been disconnected. pkg="
                java.lang.StringBuilder r6 = android.support.v4.media.C0144c.m256a(r6)
                c1.a$c r0 = r5.f4523f
                java.lang.String r0 = r0.f4530a
                r6.append(r0)
                java.lang.String r0 = " id="
                r6.append(r0)
                java.lang.String r0 = r5.f4524g
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                android.util.Log.d(r2, r6)
                goto L79
            L3d:
                int r0 = r5.f4551e
                r0 = r0 & 1
                if (r0 == 0) goto L4b
                c1.a r0 = r5.f4527j
                android.os.Bundle r1 = r5.f4525h
                java.util.List r6 = r0.m2501a(r6, r1)
            L4b:
                c1.a$c r0 = r5.f4523f     // Catch: android.os.RemoteException -> L5b
                c1.a$l r0 = r0.f4533d     // Catch: android.os.RemoteException -> L5b
                java.lang.String r1 = r5.f4524g     // Catch: android.os.RemoteException -> L5b
                android.os.Bundle r3 = r5.f4525h     // Catch: android.os.RemoteException -> L5b
                android.os.Bundle r4 = r5.f4526i     // Catch: android.os.RemoteException -> L5b
                c1.a$m r0 = (p031c1.AbstractServiceC0833a.m) r0     // Catch: android.os.RemoteException -> L5b
                r0.m2514c(r1, r6, r3, r4)     // Catch: android.os.RemoteException -> L5b
                goto L79
            L5b:
                java.lang.String r6 = "Calling onLoadChildren() failed for id="
                java.lang.StringBuilder r6 = android.support.v4.media.C0144c.m256a(r6)
                java.lang.String r0 = r5.f4524g
                r6.append(r0)
                java.lang.String r0 = " package="
                r6.append(r0)
                c1.a$c r0 = r5.f4523f
                java.lang.String r0 = r0.f4530a
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                android.util.Log.w(r2, r6)
            L79:
                return
        }
    }

    /* renamed from: c1.a$b */
    public static final class b {

        /* renamed from: a */
        public final java.lang.String f4528a;

        /* renamed from: b */
        public final android.os.Bundle f4529b;

        public b(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto La
                r0.f4528a = r1
                r0.f4529b = r2
                return
            La:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead"
                r1.<init>(r2)
                throw r1
        }
    }

    /* renamed from: c1.a$c */
    public class c implements android.os.IBinder.DeathRecipient {

        /* renamed from: a */
        public final java.lang.String f4530a;

        /* renamed from: b */
        public final int f4531b;

        /* renamed from: c */
        public final int f4532c;

        /* renamed from: d */
        public final p031c1.AbstractServiceC0833a.l f4533d;

        /* renamed from: e */
        public final java.util.HashMap<java.lang.String, java.util.List<p212m0.C4312b<android.os.IBinder, android.os.Bundle>>> f4534e;

        /* renamed from: f */
        public p031c1.AbstractServiceC0833a.b f4535f;

        /* renamed from: g */
        public final /* synthetic */ p031c1.AbstractServiceC0833a f4536g;

        /* renamed from: c1.a$c$a */
        public class a implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ p031c1.AbstractServiceC0833a.c f4537Y;

            public a(p031c1.AbstractServiceC0833a.c r1) {
                    r0 = this;
                    r0.f4537Y = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    c1.a$c r0 = r2.f4537Y
                    c1.a r1 = r0.f4536g
                    s.a<android.os.IBinder, c1.a$c> r1 = r1.f4520b0
                    c1.a$l r0 = r0.f4533d
                    c1.a$m r0 = (p031c1.AbstractServiceC0833a.m) r0
                    android.os.IBinder r0 = r0.m2512a()
                    r1.remove(r0)
                    return
            }
        }

        public c(p031c1.AbstractServiceC0833a r1, java.lang.String r2, int r3, int r4, android.os.Bundle r5, p031c1.AbstractServiceC0833a.l r6) {
                r0 = this;
                r0.f4536g = r1
                r0.<init>()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.f4534e = r1
                r0.f4530a = r2
                r0.f4531b = r3
                r0.f4532c = r4
                java.lang.String r1 = "package shouldn't be null"
                java.util.Objects.requireNonNull(r2, r1)
                boolean r1 = android.text.TextUtils.isEmpty(r2)
                if (r1 != 0) goto L2b
                int r1 = android.os.Build.VERSION.SDK_INT
                r5 = 28
                if (r1 < r5) goto L28
                c1.r r1 = new c1.r
                r1.<init>(r2, r3, r4)
            L28:
                r0.f4533d = r6
                return
            L2b:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "packageName should be nonempty"
                r1.<init>(r2)
                throw r1
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
                r2 = this;
                c1.a r0 = r2.f4536g
                c1.a$n r0 = r0.f4521c0
                c1.a$c$a r1 = new c1.a$c$a
                r1.<init>(r2)
                r0.post(r1)
                return
        }
    }

    /* renamed from: c1.a$d */
    public interface d {
        /* renamed from: a */
        void mo2506a();
    }

    /* renamed from: c1.a$e */
    public class e implements p031c1.AbstractServiceC0833a.d {

        /* renamed from: a */
        public final java.util.List<android.os.Bundle> f4538a;

        /* renamed from: b */
        public android.service.media.MediaBrowserService f4539b;

        /* renamed from: c */
        public android.os.Messenger f4540c;

        /* renamed from: d */
        public final /* synthetic */ p031c1.AbstractServiceC0833a f4541d;

        /* renamed from: c1.a$e$a */
        public class a extends android.service.media.MediaBrowserService {

            /* renamed from: Y */
            public final /* synthetic */ p031c1.AbstractServiceC0833a.e f4542Y;

            public a(p031c1.AbstractServiceC0833a.e r1, android.content.Context r2) {
                    r0 = this;
                    r0.f4542Y = r1
                    r0.<init>()
                    r0.attachBaseContext(r2)
                    return
            }

            @Override // android.service.media.MediaBrowserService
            @android.annotation.SuppressLint({"SyntheticAccessor"})
            public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String r11, int r12, android.os.Bundle r13) {
                    r10 = this;
                    android.support.v4.media.session.MediaSessionCompat.m283a(r13)
                    c1.a$e r0 = r10.f4542Y
                    r1 = 0
                    if (r13 != 0) goto La
                    r2 = r1
                    goto Lf
                La:
                    android.os.Bundle r2 = new android.os.Bundle
                    r2.<init>(r13)
                Lf:
                    java.util.Objects.requireNonNull(r0)
                    r13 = -1
                    if (r2 == 0) goto L6a
                    r3 = 0
                    java.lang.String r4 = "extra_client_version"
                    int r3 = r2.getInt(r4, r3)
                    if (r3 == 0) goto L6a
                    r2.remove(r4)
                    android.os.Messenger r3 = new android.os.Messenger
                    c1.a r4 = r0.f4541d
                    c1.a$n r4 = r4.f4521c0
                    r3.<init>(r4)
                    r0.f4540c = r3
                    android.os.Bundle r3 = new android.os.Bundle
                    r3.<init>()
                    r4 = 2
                    java.lang.String r5 = "extra_service_version"
                    r3.putInt(r5, r4)
                    android.os.Messenger r4 = r0.f4540c
                    android.os.IBinder r4 = r4.getBinder()
                    java.lang.String r5 = "extra_messenger"
                    r3.putBinder(r5, r4)
                    c1.a r4 = r0.f4541d
                    android.support.v4.media.session.MediaSessionCompat$Token r4 = r4.f4522d0
                    if (r4 == 0) goto L59
                    android.support.v4.media.session.b r4 = r4.m295b()
                    if (r4 != 0) goto L4f
                    goto L53
                L4f:
                    android.os.IBinder r1 = r4.asBinder()
                L53:
                    java.lang.String r4 = "extra_session_binder"
                    r3.putBinder(r4, r1)
                    goto L5e
                L59:
                    java.util.List<android.os.Bundle> r1 = r0.f4538a
                    r1.add(r3)
                L5e:
                    java.lang.String r1 = "extra_calling_pid"
                    int r13 = r2.getInt(r1, r13)
                    r2.remove(r1)
                    r6 = r13
                    r1 = r3
                    goto L6b
                L6a:
                    r6 = -1
                L6b:
                    c1.a$c r13 = new c1.a$c
                    c1.a r4 = r0.f4541d
                    r9 = 0
                    r3 = r13
                    r5 = r11
                    r7 = r12
                    r8 = r2
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    c1.a r3 = r0.f4541d
                    java.util.Objects.requireNonNull(r3)
                    c1.a r3 = r0.f4541d
                    c1.a$b r11 = r3.mo2502b(r11, r12, r2)
                    c1.a r12 = r0.f4541d
                    java.util.Objects.requireNonNull(r12)
                    android.os.Messenger r12 = r0.f4540c
                    if (r12 == 0) goto L92
                    c1.a r12 = r0.f4541d
                    java.util.ArrayList<c1.a$c> r12 = r12.f4519a0
                    r12.add(r13)
                L92:
                    if (r1 != 0) goto L97
                    android.os.Bundle r1 = r11.f4529b
                    goto L9e
                L97:
                    android.os.Bundle r12 = r11.f4529b
                    if (r12 == 0) goto L9e
                    r1.putAll(r12)
                L9e:
                    java.lang.String r11 = r11.f4528a
                    if (r11 == 0) goto La8
                    android.service.media.MediaBrowserService$BrowserRoot r12 = new android.service.media.MediaBrowserService$BrowserRoot
                    r12.<init>(r11, r1)
                    return r12
                La8:
                    java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                    java.lang.String r12 = "The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead"
                    r11.<init>(r12)
                    throw r11
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(java.lang.String r4, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> r5) {
                    r3 = this;
                    c1.a$e r0 = r3.f4542Y
                    c1.a$j r1 = new c1.a$j
                    r1.<init>(r5)
                    c1.d r5 = new c1.d
                    r5.<init>(r0, r4, r1)
                    c1.a r1 = r0.f4541d
                    c1.a$c r2 = r1.f4518Z
                    r1.mo2503c(r4, r5)
                    c1.a r4 = r0.f4541d
                    java.util.Objects.requireNonNull(r4)
                    return
            }
        }

        public e(p031c1.AbstractServiceC0833a r1) {
                r0 = this;
                r0.f4541d = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f4538a = r1
                return
        }

        @Override // p031c1.AbstractServiceC0833a.d
        /* renamed from: a */
        public void mo2506a() {
                r2 = this;
                c1.a$e$a r0 = new c1.a$e$a
                c1.a r1 = r2.f4541d
                r0.<init>(r2, r1)
                r2.f4539b = r0
                r0.onCreate()
                return
        }

        /* renamed from: b */
        public void mo2507b(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                android.service.media.MediaBrowserService r2 = r0.f4539b
                r2.notifyChildrenChanged(r1)
                return
        }
    }

    /* renamed from: c1.a$f */
    public class f extends p031c1.AbstractServiceC0833a.e {

        /* renamed from: e */
        public final /* synthetic */ p031c1.AbstractServiceC0833a f4543e;

        /* renamed from: c1.a$f$a */
        public class a extends p031c1.AbstractServiceC0833a.e.a {

            /* renamed from: Z */
            public final /* synthetic */ p031c1.AbstractServiceC0833a.f f4544Z;

            public a(p031c1.AbstractServiceC0833a.f r1, android.content.Context r2) {
                    r0 = this;
                    r0.f4544Z = r1
                    r0.<init>(r1, r2)
                    return
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(java.lang.String r3, android.service.media.MediaBrowserService.Result<android.media.browse.MediaBrowser.MediaItem> r4) {
                    r2 = this;
                    c1.a$f r3 = r2.f4544Z
                    c1.a r0 = r3.f4543e
                    c1.a$c r1 = r0.f4518Z
                    java.util.Objects.requireNonNull(r0)
                    r0 = 0
                    r4.sendResult(r0)
                    c1.a r3 = r3.f4543e
                    java.util.Objects.requireNonNull(r3)
                    return
            }
        }

        public f(p031c1.AbstractServiceC0833a r1) {
                r0 = this;
                r0.f4543e = r1
                r0.<init>(r1)
                return
        }

        @Override // p031c1.AbstractServiceC0833a.e, p031c1.AbstractServiceC0833a.d
        /* renamed from: a */
        public void mo2506a() {
                r2 = this;
                c1.a$f$a r0 = new c1.a$f$a
                c1.a r1 = r2.f4543e
                r0.<init>(r2, r1)
                r2.f4539b = r0
                r0.onCreate()
                return
        }
    }

    /* renamed from: c1.a$g */
    public class g extends p031c1.AbstractServiceC0833a.f {

        /* renamed from: f */
        public final /* synthetic */ p031c1.AbstractServiceC0833a f4545f;

        /* renamed from: c1.a$g$a */
        public class a extends p031c1.AbstractServiceC0833a.f.a {

            /* renamed from: a0 */
            public final /* synthetic */ p031c1.AbstractServiceC0833a.g f4546a0;

            public a(p031c1.AbstractServiceC0833a.g r1, android.content.Context r2) {
                    r0 = this;
                    r0.f4546a0 = r1
                    r0.<init>(r1, r2)
                    return
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(java.lang.String r3, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> r4, android.os.Bundle r5) {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat.m283a(r5)
                    c1.a$g r0 = r2.f4546a0
                    c1.a r0 = r0.f4545f
                    c1.a$c r1 = r0.f4518Z
                    java.util.Objects.requireNonNull(r0)
                    c1.a$g r0 = r2.f4546a0
                    c1.a$j r1 = new c1.a$j
                    r1.<init>(r4)
                    c1.f r4 = new c1.f
                    r4.<init>(r0, r3, r1, r5)
                    c1.a r5 = r0.f4545f
                    c1.a$c r1 = r5.f4518Z
                    java.util.Objects.requireNonNull(r5)
                    r1 = 1
                    r4.f4551e = r1
                    r5.mo2503c(r3, r4)
                    c1.a r3 = r0.f4545f
                    java.util.Objects.requireNonNull(r3)
                    c1.a$g r3 = r2.f4546a0
                    c1.a r3 = r3.f4545f
                    java.util.Objects.requireNonNull(r3)
                    return
            }
        }

        public g(p031c1.AbstractServiceC0833a r1) {
                r0 = this;
                r0.f4545f = r1
                r0.<init>(r1)
                return
        }

        @Override // p031c1.AbstractServiceC0833a.f, p031c1.AbstractServiceC0833a.e, p031c1.AbstractServiceC0833a.d
        /* renamed from: a */
        public void mo2506a() {
                r2 = this;
                c1.a$g$a r0 = new c1.a$g$a
                c1.a r1 = r2.f4545f
                r0.<init>(r2, r1)
                r2.f4539b = r0
                r0.onCreate()
                return
        }

        @Override // p031c1.AbstractServiceC0833a.e
        /* renamed from: b */
        public void mo2507b(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                if (r3 == 0) goto L8
                android.service.media.MediaBrowserService r0 = r1.f4539b
                r0.notifyChildrenChanged(r2, r3)
                goto Ld
            L8:
                android.service.media.MediaBrowserService r3 = r1.f4539b
                r3.notifyChildrenChanged(r2)
            Ld:
                return
        }
    }

    /* renamed from: c1.a$h */
    public class h extends p031c1.AbstractServiceC0833a.g {
        public h(p031c1.AbstractServiceC0833a r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: c1.a$i */
    public static class i<T> {

        /* renamed from: a */
        public final java.lang.Object f4547a;

        /* renamed from: b */
        public boolean f4548b;

        /* renamed from: c */
        public boolean f4549c;

        /* renamed from: d */
        public boolean f4550d;

        /* renamed from: e */
        public int f4551e;

        public i(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.f4547a = r1
                return
        }

        /* renamed from: a */
        public void mo2508a() {
                r3 = this;
                boolean r0 = r3.f4548b
                if (r0 != 0) goto L3a
                boolean r0 = r3.f4549c
                if (r0 != 0) goto L25
                boolean r0 = r3.f4550d
                if (r0 != 0) goto L10
                r0 = 1
                r3.f4548b = r0
                return
            L10:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "detach() called when sendError() had already been called for: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.Object r2 = r3.f4547a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L25:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "detach() called when sendResult() had already been called for: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.Object r2 = r3.f4547a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L3a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "detach() called when detach() had already been called for: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.Object r2 = r3.f4547a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        /* renamed from: b */
        public boolean m2509b() {
                r1 = this;
                boolean r0 = r1.f4548b
                if (r0 != 0) goto Lf
                boolean r0 = r1.f4549c
                if (r0 != 0) goto Lf
                boolean r0 = r1.f4550d
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        /* renamed from: c */
        public void mo2505c(T r1) {
                r0 = this;
                r0 = 0
                throw r0
        }

        /* renamed from: d */
        public void m2510d(T r3) {
                r2 = this;
                boolean r0 = r2.f4549c
                if (r0 != 0) goto Lf
                boolean r0 = r2.f4550d
                if (r0 != 0) goto Lf
                r0 = 1
                r2.f4549c = r0
                r2.mo2505c(r3)
                return
            Lf:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "sendResult() called when either sendResult() or sendError() had already been called for: "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.Object r1 = r2.f4547a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    /* renamed from: c1.a$j */
    public static class j<T> {

        /* renamed from: a */
        public android.service.media.MediaBrowserService.Result f4552a;

        public j(android.service.media.MediaBrowserService.Result r1) {
                r0 = this;
                r0.<init>()
                r0.f4552a = r1
                return
        }

        /* renamed from: a */
        public void m2511a(T r6) {
                r5 = this;
                boolean r0 = r6 instanceof java.util.List
                r1 = 0
                r2 = 0
                if (r0 == 0) goto L38
                android.service.media.MediaBrowserService$Result r0 = r5.f4552a
                java.util.List r6 = (java.util.List) r6
                if (r6 != 0) goto Ld
                goto L34
            Ld:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r6 = r6.iterator()
            L16:
                boolean r3 = r6.hasNext()
                if (r3 == 0) goto L34
                java.lang.Object r3 = r6.next()
                android.os.Parcel r3 = (android.os.Parcel) r3
                r3.setDataPosition(r1)
                android.os.Parcelable$Creator r4 = android.media.browse.MediaBrowser.MediaItem.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r3)
                android.media.browse.MediaBrowser$MediaItem r4 = (android.media.browse.MediaBrowser.MediaItem) r4
                r2.add(r4)
                r3.recycle()
                goto L16
            L34:
                r0.sendResult(r2)
                goto L55
            L38:
                boolean r0 = r6 instanceof android.os.Parcel
                if (r0 == 0) goto L50
                android.os.Parcel r6 = (android.os.Parcel) r6
                r6.setDataPosition(r1)
                android.service.media.MediaBrowserService$Result r0 = r5.f4552a
                android.os.Parcelable$Creator r1 = android.media.browse.MediaBrowser.MediaItem.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r6)
                r0.sendResult(r1)
                r6.recycle()
                goto L55
            L50:
                android.service.media.MediaBrowserService$Result r6 = r5.f4552a
                r6.sendResult(r2)
            L55:
                return
        }
    }

    /* renamed from: c1.a$k */
    public class k {

        /* renamed from: a */
        public final /* synthetic */ p031c1.AbstractServiceC0833a f4553a;

        public k(p031c1.AbstractServiceC0833a r1) {
                r0 = this;
                r0.f4553a = r1
                r0.<init>()
                return
        }
    }

    /* renamed from: c1.a$l */
    public interface l {
    }

    /* renamed from: c1.a$m */
    public static class m implements p031c1.AbstractServiceC0833a.l {

        /* renamed from: a */
        public final android.os.Messenger f4554a;

        public m(android.os.Messenger r1) {
                r0 = this;
                r0.<init>()
                r0.f4554a = r1
                return
        }

        /* renamed from: a */
        public android.os.IBinder m2512a() {
                r1 = this;
                android.os.Messenger r0 = r1.f4554a
                android.os.IBinder r0 = r0.getBinder()
                return r0
        }

        /* renamed from: b */
        public void m2513b(java.lang.String r3, android.support.v4.media.session.MediaSessionCompat.Token r4, android.os.Bundle r5) {
                r2 = this;
                if (r5 != 0) goto L7
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
            L7:
                r0 = 2
                java.lang.String r1 = "extra_service_version"
                r5.putInt(r1, r0)
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_media_session_token"
                r0.putParcelable(r3, r4)
                java.lang.String r3 = "data_root_hints"
                r0.putBundle(r3, r5)
                r3 = 1
                r2.m2515d(r3, r0)
                return
        }

        /* renamed from: c */
        public void m2514c(java.lang.String r3, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r4, android.os.Bundle r5, android.os.Bundle r6) {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_options"
                r0.putBundle(r3, r5)
                java.lang.String r3 = "data_notify_children_changed_options"
                r0.putBundle(r3, r6)
                if (r4 == 0) goto L28
                boolean r3 = r4 instanceof java.util.ArrayList
                if (r3 == 0) goto L1d
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                goto L23
            L1d:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r4)
                r4 = r3
            L23:
                java.lang.String r3 = "data_media_item_list"
                r0.putParcelableArrayList(r3, r4)
            L28:
                r3 = 3
                r2.m2515d(r3, r0)
                return
        }

        /* renamed from: d */
        public final void m2515d(int r2, android.os.Bundle r3) {
                r1 = this;
                android.os.Message r0 = android.os.Message.obtain()
                r0.what = r2
                r2 = 2
                r0.arg1 = r2
                r0.setData(r3)
                android.os.Messenger r2 = r1.f4554a
                r2.send(r0)
                return
        }
    }

    /* renamed from: c1.a$n */
    public final class n extends android.os.Handler {

        /* renamed from: a */
        public final p031c1.AbstractServiceC0833a.k f4555a;

        public n(p031c1.AbstractServiceC0833a r2) {
                r1 = this;
                r1.<init>()
                c1.a$k r0 = new c1.a$k
                r0.<init>(r2)
                r1.f4555a = r0
                return
        }

        /* renamed from: a */
        public void m2516a(java.lang.Runnable r3) {
                r2 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                android.os.Looper r1 = r2.getLooper()
                java.lang.Thread r1 = r1.getThread()
                if (r0 != r1) goto L12
                r3.run()
                goto L15
            L12:
                r2.post(r3)
            L15:
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r18) {
                r17 = this;
                r0 = r17
                r1 = r18
                android.os.Bundle r2 = r18.getData()
                int r3 = r1.what
                java.lang.String r4 = "data_callback_token"
                java.lang.String r5 = "data_calling_uid"
                java.lang.String r6 = "data_calling_pid"
                java.lang.String r7 = "data_package_name"
                java.lang.String r8 = "data_root_hints"
                java.lang.String r9 = "data_result_receiver"
                java.lang.String r10 = "data_media_item_id"
                switch(r3) {
                    case 1: goto L18d;
                    case 2: goto L176;
                    case 3: goto L14d;
                    case 4: goto L12e;
                    case 5: goto L100;
                    case 6: goto Ld3;
                    case 7: goto Lbc;
                    case 8: goto L81;
                    case 9: goto L46;
                    default: goto L1b;
                }
            L1b:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unhandled message: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = "\n  Service version: "
                r2.append(r3)
                r3 = 2
                r2.append(r3)
                java.lang.String r3 = "\n  Client version: "
                r2.append(r3)
                int r1 = r1.arg1
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "MBServiceCompat"
                android.util.Log.w(r2, r1)
                goto L1fb
            L46:
                java.lang.String r3 = "data_custom_action_extras"
                android.os.Bundle r14 = r2.getBundle(r3)
                android.support.v4.media.session.MediaSessionCompat.m283a(r14)
                c1.a$k r11 = r0.f4555a
                java.lang.String r3 = "data_custom_action"
                java.lang.String r13 = r2.getString(r3)
                android.os.Parcelable r2 = r2.getParcelable(r9)
                r15 = r2
                b.b r15 = (p016b.C0652b) r15
                c1.a$m r12 = new c1.a$m
                android.os.Messenger r1 = r1.replyTo
                r12.<init>(r1)
                java.util.Objects.requireNonNull(r11)
                boolean r1 = android.text.TextUtils.isEmpty(r13)
                if (r1 != 0) goto L1fb
                if (r15 != 0) goto L72
                goto L1fb
            L72:
                c1.a r1 = r11.f4553a
                c1.a$n r1 = r1.f4521c0
                c1.p r2 = new c1.p
                r10 = r2
                r10.<init>(r11, r12, r13, r14, r15)
                r1.m2516a(r2)
                goto L1fb
            L81:
                java.lang.String r3 = "data_search_extras"
                android.os.Bundle r14 = r2.getBundle(r3)
                android.support.v4.media.session.MediaSessionCompat.m283a(r14)
                c1.a$k r11 = r0.f4555a
                java.lang.String r3 = "data_search_query"
                java.lang.String r13 = r2.getString(r3)
                android.os.Parcelable r2 = r2.getParcelable(r9)
                r15 = r2
                b.b r15 = (p016b.C0652b) r15
                c1.a$m r12 = new c1.a$m
                android.os.Messenger r1 = r1.replyTo
                r12.<init>(r1)
                java.util.Objects.requireNonNull(r11)
                boolean r1 = android.text.TextUtils.isEmpty(r13)
                if (r1 != 0) goto L1fb
                if (r15 != 0) goto Lad
                goto L1fb
            Lad:
                c1.a r1 = r11.f4553a
                c1.a$n r1 = r1.f4521c0
                c1.o r2 = new c1.o
                r10 = r2
                r10.<init>(r11, r12, r13, r14, r15)
                r1.m2516a(r2)
                goto L1fb
            Lbc:
                c1.a$k r2 = r0.f4555a
                c1.a$m r3 = new c1.a$m
                android.os.Messenger r1 = r1.replyTo
                r3.<init>(r1)
                c1.a r1 = r2.f4553a
                c1.a$n r1 = r1.f4521c0
                c1.n r4 = new c1.n
                r4.<init>(r2, r3)
                r1.m2516a(r4)
                goto L1fb
            Ld3:
                android.os.Bundle r11 = r2.getBundle(r8)
                android.support.v4.media.session.MediaSessionCompat.m283a(r11)
                c1.a$k r3 = r0.f4555a
                c1.a$m r4 = new c1.a$m
                android.os.Messenger r1 = r1.replyTo
                r4.<init>(r1)
                java.lang.String r9 = r2.getString(r7)
                int r10 = r2.getInt(r6)
                int r8 = r2.getInt(r5)
                c1.a r1 = r3.f4553a
                c1.a$n r1 = r1.f4521c0
                c1.m r2 = new c1.m
                r5 = r2
                r6 = r3
                r7 = r4
                r5.<init>(r6, r7, r8, r9, r10, r11)
                r1.m2516a(r2)
                goto L1fb
            L100:
                c1.a$k r3 = r0.f4555a
                java.lang.String r4 = r2.getString(r10)
                android.os.Parcelable r2 = r2.getParcelable(r9)
                b.b r2 = (p016b.C0652b) r2
                c1.a$m r5 = new c1.a$m
                android.os.Messenger r1 = r1.replyTo
                r5.<init>(r1)
                java.util.Objects.requireNonNull(r3)
                boolean r1 = android.text.TextUtils.isEmpty(r4)
                if (r1 != 0) goto L1fb
                if (r2 != 0) goto L120
                goto L1fb
            L120:
                c1.a r1 = r3.f4553a
                c1.a$n r1 = r1.f4521c0
                c1.l r6 = new c1.l
                r6.<init>(r3, r5, r4, r2)
                r1.m2516a(r6)
                goto L1fb
            L12e:
                c1.a$k r3 = r0.f4555a
                java.lang.String r5 = r2.getString(r10)
                android.os.IBinder r2 = r2.getBinder(r4)
                c1.a$m r4 = new c1.a$m
                android.os.Messenger r1 = r1.replyTo
                r4.<init>(r1)
                c1.a r1 = r3.f4553a
                c1.a$n r1 = r1.f4521c0
                c1.k r6 = new c1.k
                r6.<init>(r3, r4, r5, r2)
                r1.m2516a(r6)
                goto L1fb
            L14d:
                java.lang.String r3 = "data_options"
                android.os.Bundle r16 = r2.getBundle(r3)
                android.support.v4.media.session.MediaSessionCompat.m283a(r16)
                c1.a$k r12 = r0.f4555a
                java.lang.String r14 = r2.getString(r10)
                android.os.IBinder r15 = r2.getBinder(r4)
                c1.a$m r13 = new c1.a$m
                android.os.Messenger r1 = r1.replyTo
                r13.<init>(r1)
                c1.a r1 = r12.f4553a
                c1.a$n r1 = r1.f4521c0
                c1.i r2 = new c1.i
                r11 = r2
                r11.<init>(r12, r13, r14, r15, r16)
                r1.m2516a(r2)
                goto L1fb
            L176:
                c1.a$k r2 = r0.f4555a
                c1.a$m r3 = new c1.a$m
                android.os.Messenger r1 = r1.replyTo
                r3.<init>(r1)
                c1.a r1 = r2.f4553a
                c1.a$n r1 = r1.f4521c0
                c1.h r4 = new c1.h
                r4.<init>(r2, r3)
                r1.m2516a(r4)
                goto L1fb
            L18d:
                android.os.Bundle r11 = r2.getBundle(r8)
                android.support.v4.media.session.MediaSessionCompat.m283a(r11)
                c1.a$k r3 = r0.f4555a
                java.lang.String r8 = r2.getString(r7)
                int r9 = r2.getInt(r6)
                int r10 = r2.getInt(r5)
                c1.a$m r7 = new c1.a$m
                android.os.Messenger r1 = r1.replyTo
                r7.<init>(r1)
                c1.a r1 = r3.f4553a
                java.util.Objects.requireNonNull(r1)
                r2 = 0
                if (r8 != 0) goto L1b2
                goto L1cb
            L1b2:
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                java.lang.String[] r1 = r1.getPackagesForUid(r10)
                int r4 = r1.length
                r5 = 0
            L1bc:
                if (r5 >= r4) goto L1cb
                r6 = r1[r5]
                boolean r6 = r6.equals(r8)
                if (r6 == 0) goto L1c8
                r2 = 1
                goto L1cb
            L1c8:
                int r5 = r5 + 1
                goto L1bc
            L1cb:
                if (r2 == 0) goto L1dc
                c1.a r1 = r3.f4553a
                c1.a$n r1 = r1.f4521c0
                c1.g r2 = new c1.g
                r5 = r2
                r6 = r3
                r5.<init>(r6, r7, r8, r9, r10, r11)
                r1.m2516a(r2)
                goto L1fb
            L1dc:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Package/uid mismatch: uid="
                r2.append(r3)
                r2.append(r10)
                java.lang.String r3 = " package="
                r2.append(r3)
                r2.append(r8)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L1fb:
                return
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(android.os.Message r4, long r5) {
                r3 = this;
                android.os.Bundle r0 = r4.getData()
                java.lang.Class<android.support.v4.media.MediaBrowserCompat> r1 = android.support.v4.media.MediaBrowserCompat.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r0.setClassLoader(r1)
                int r1 = android.os.Binder.getCallingUid()
                java.lang.String r2 = "data_calling_uid"
                r0.putInt(r2, r1)
                int r1 = android.os.Binder.getCallingPid()
                java.lang.String r2 = "data_calling_pid"
                if (r1 <= 0) goto L22
            L1e:
                r0.putInt(r2, r1)
                goto L2a
            L22:
                boolean r1 = r0.containsKey(r2)
                if (r1 != 0) goto L2a
                r1 = -1
                goto L1e
            L2a:
                boolean r4 = super.sendMessageAtTime(r4, r5)
                return r4
        }
    }

    static {
            java.lang.String r0 = "MBServiceCompat"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            p031c1.AbstractServiceC0833a.f4516e0 = r0
            return
    }

    public AbstractServiceC0833a() {
            r8 = this;
            r8.<init>()
            c1.a$c r7 = new c1.a$c
            java.lang.String r2 = "android.media.session.MediaController"
            r3 = -1
            r4 = -1
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f4518Z = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.f4519a0 = r0
            s.a r0 = new s.a
            r0.<init>()
            r8.f4520b0 = r0
            c1.a$n r0 = new c1.a$n
            r0.<init>(r8)
            r8.f4521c0 = r0
            return
    }

    /* renamed from: a */
    public java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> m2501a(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r4, android.os.Bundle r5) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.String r0 = "android.media.browse.extra.PAGE"
            r1 = -1
            int r0 = r5.getInt(r0, r1)
            java.lang.String r2 = "android.media.browse.extra.PAGE_SIZE"
            int r5 = r5.getInt(r2, r1)
            if (r0 != r1) goto L16
            if (r5 != r1) goto L16
            return r4
        L16:
            int r1 = r5 * r0
            int r2 = r1 + r5
            if (r0 < 0) goto L35
            r0 = 1
            if (r5 < r0) goto L35
            int r5 = r4.size()
            if (r1 < r5) goto L26
            goto L35
        L26:
            int r5 = r4.size()
            if (r2 <= r5) goto L30
            int r2 = r4.size()
        L30:
            java.util.List r4 = r4.subList(r1, r2)
            return r4
        L35:
            java.util.List r4 = java.util.Collections.emptyList()
            return r4
    }

    /* renamed from: b */
    public abstract p031c1.AbstractServiceC0833a.b mo2502b(java.lang.String r1, int r2, android.os.Bundle r3);

    /* renamed from: c */
    public abstract void mo2503c(java.lang.String r1, p031c1.AbstractServiceC0833a.i<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> r2);

    /* renamed from: d */
    public void m2504d(java.lang.String r9, p031c1.AbstractServiceC0833a.c r10, android.os.Bundle r11, android.os.Bundle r12) {
            r8 = this;
            c1.a$a r7 = new c1.a$a
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r9
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            if (r11 != 0) goto L12
            r8.mo2503c(r9, r7)
            goto L18
        L12:
            r11 = 1
            r7.f4551e = r11
            r8.mo2503c(r9, r7)
        L18:
            boolean r11 = r7.m2509b()
            if (r11 == 0) goto L1f
            return
        L1f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "onLoadChildren must call detach() or sendResult() before returning for package="
            java.lang.StringBuilder r12 = android.support.v4.media.C0144c.m256a(r12)
            java.lang.String r10 = r10.f4530a
            java.lang.String r0 = " id="
            java.lang.String r9 = p083f.C1932s.m4774a(r12, r10, r0, r9)
            r11.<init>(r9)
            throw r11
    }

    @Override // android.app.Service
    public void dump(java.io.FileDescriptor r1, java.io.PrintWriter r2, java.lang.String[] r3) {
            r0 = this;
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            c1.a$d r0 = r1.f4517Y
            c1.a$e r0 = (p031c1.AbstractServiceC0833a.e) r0
            android.service.media.MediaBrowserService r0 = r0.f4539b
            android.os.IBinder r2 = r0.onBind(r2)
            return r2
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            c1.a$h r0 = new c1.a$h
            r0.<init>(r2)
            goto L28
        Lf:
            r1 = 26
            if (r0 < r1) goto L19
            c1.a$g r0 = new c1.a$g
            r0.<init>(r2)
            goto L28
        L19:
            r1 = 23
            if (r0 < r1) goto L23
            c1.a$f r0 = new c1.a$f
            r0.<init>(r2)
            goto L28
        L23:
            c1.a$e r0 = new c1.a$e
            r0.<init>(r2)
        L28:
            r2.f4517Y = r0
            r0.mo2506a()
            return
    }
}
