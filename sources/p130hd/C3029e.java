package p130hd;

/* renamed from: hd.e */
/* loaded from: classes.dex */
public final class C3029e implements p130hd.InterfaceC3028d {

    /* renamed from: a */
    public final p179k1.AbstractC3664v f12184a;

    /* renamed from: b */
    public final p179k1.AbstractC3658p<id.C3131b> f12185b;

    /* renamed from: c */
    public final p179k1.AbstractC3657o<id.C3131b> f12186c;

    /* renamed from: hd.e$a */
    public class a extends p179k1.AbstractC3658p<id.C3131b> {

        /* renamed from: d */
        public final /* synthetic */ p130hd.C3029e f12187d;

        public a(p130hd.C3029e r1, p179k1.AbstractC3664v r2) {
                r0 = this;
                r0.f12187d = r1
                r0.<init>(r2)
                return
        }

        @Override // p179k1.AbstractC3641a0
        /* renamed from: c */
        public java.lang.String mo7438c() {
                r1 = this;
                java.lang.String r0 = "INSERT OR REPLACE INTO `wallets` (`username`,`type`) VALUES (?,?)"
                return r0
        }

        @Override // p179k1.AbstractC3658p
        /* renamed from: e */
        public void mo7439e(p243o1.InterfaceC4876f r3, id.C3131b r4) {
                r2 = this;
                id.b r4 = (id.C3131b) r4
                java.lang.String r0 = r4.f12559a
                r1 = 1
                if (r0 != 0) goto Lb
                r3.mo8103B(r1)
                goto Le
            Lb:
                r3.mo8108u(r1, r0)
            Le:
                od.v0 r4 = r4.f12560b
                r0 = 2
                if (r4 != 0) goto L17
                r3.mo8103B(r0)
                goto L20
            L17:
                hd.e r1 = r2.f12187d
                java.lang.String r4 = p130hd.C3029e.m7446f(r1, r4)
                r3.mo8108u(r0, r4)
            L20:
                return
        }
    }

    /* renamed from: hd.e$b */
    public class b extends p179k1.AbstractC3657o<id.C3131b> {
        public b(p130hd.C3029e r1, p179k1.AbstractC3664v r2) {
                r0 = this;
                r0.<init>(r2)
                return
        }

        @Override // p179k1.AbstractC3641a0
        /* renamed from: c */
        public java.lang.String mo7438c() {
                r1 = this;
                java.lang.String r0 = "DELETE FROM `wallets` WHERE `username` = ?"
                return r0
        }

        @Override // p179k1.AbstractC3657o
        /* renamed from: e */
        public void mo7440e(p243o1.InterfaceC4876f r2, id.C3131b r3) {
                r1 = this;
                id.b r3 = (id.C3131b) r3
                java.lang.String r3 = r3.f12559a
                r0 = 1
                if (r3 != 0) goto Lb
                r2.mo8103B(r0)
                goto Le
            Lb:
                r2.mo8108u(r0, r3)
            Le:
                return
        }
    }

    /* renamed from: hd.e$c */
    public class c implements java.util.concurrent.Callable<ch.C0985l> {

        /* renamed from: a */
        public final /* synthetic */ id.C3131b f12188a;

        /* renamed from: b */
        public final /* synthetic */ p130hd.C3029e f12189b;

        public c(p130hd.C3029e r1, id.C3131b r2) {
                r0 = this;
                r0.f12189b = r1
                r0.f12188a = r2
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        public ch.C0985l call() {
                r2 = this;
                hd.e r0 = r2.f12189b
                k1.v r0 = r0.f12184a
                r0.m8109a()
                r0.m8112i()
                hd.e r0 = r2.f12189b     // Catch: java.lang.Throwable -> L24
                k1.p<id.b> r0 = r0.f12185b     // Catch: java.lang.Throwable -> L24
                id.b r1 = r2.f12188a     // Catch: java.lang.Throwable -> L24
                r0.m8087f(r1)     // Catch: java.lang.Throwable -> L24
                hd.e r0 = r2.f12189b     // Catch: java.lang.Throwable -> L24
                k1.v r0 = r0.f12184a     // Catch: java.lang.Throwable -> L24
                r0.m8116m()     // Catch: java.lang.Throwable -> L24
                ch.l r0 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L24
                hd.e r1 = r2.f12189b
                k1.v r1 = r1.f12184a
                r1.m8113j()
                return r0
            L24:
                r0 = move-exception
                hd.e r1 = r2.f12189b
                k1.v r1 = r1.f12184a
                r1.m8113j()
                throw r0
        }
    }

    /* renamed from: hd.e$d */
    public class d implements java.util.concurrent.Callable<ch.C0985l> {

        /* renamed from: a */
        public final /* synthetic */ id.C3131b[] f12190a;

        /* renamed from: b */
        public final /* synthetic */ p130hd.C3029e f12191b;

        public d(p130hd.C3029e r1, id.C3131b[] r2) {
                r0 = this;
                r0.f12191b = r1
                r0.f12190a = r2
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        public ch.C0985l call() {
                r2 = this;
                hd.e r0 = r2.f12191b
                k1.v r0 = r0.f12184a
                r0.m8109a()
                r0.m8112i()
                hd.e r0 = r2.f12191b     // Catch: java.lang.Throwable -> L24
                k1.o<id.b> r0 = r0.f12186c     // Catch: java.lang.Throwable -> L24
                id.b[] r1 = r2.f12190a     // Catch: java.lang.Throwable -> L24
                r0.m8086f(r1)     // Catch: java.lang.Throwable -> L24
                hd.e r0 = r2.f12191b     // Catch: java.lang.Throwable -> L24
                k1.v r0 = r0.f12184a     // Catch: java.lang.Throwable -> L24
                r0.m8116m()     // Catch: java.lang.Throwable -> L24
                ch.l r0 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L24
                hd.e r1 = r2.f12191b
                k1.v r1 = r1.f12184a
                r1.m8113j()
                return r0
            L24:
                r0 = move-exception
                hd.e r1 = r2.f12191b
                k1.v r1 = r1.f12184a
                r1.m8113j()
                throw r0
        }
    }

    /* renamed from: hd.e$e */
    public class e implements java.util.concurrent.Callable<java.util.List<id.C3131b>> {

        /* renamed from: a */
        public final /* synthetic */ p179k1.C3666x f12192a;

        /* renamed from: b */
        public final /* synthetic */ p130hd.C3029e f12193b;

        public e(p130hd.C3029e r1, p179k1.C3666x r2) {
                r0 = this;
                r0.f12193b = r1
                r0.f12192a = r2
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        public java.util.List<id.C3131b> call() {
                r8 = this;
                hd.e r0 = r8.f12193b
                k1.v r0 = r0.f12184a
                k1.x r1 = r8.f12192a
                r2 = 0
                r3 = 0
                android.database.Cursor r0 = p213m1.C4317c.m9645a(r0, r1, r2, r3)
                java.lang.String r1 = "username"
                int r1 = p213m1.C4316b.m9644a(r0, r1)     // Catch: java.lang.Throwable -> L4a
                java.lang.String r2 = "type"
                int r2 = p213m1.C4316b.m9644a(r0, r2)     // Catch: java.lang.Throwable -> L4a
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4a
                int r5 = r0.getCount()     // Catch: java.lang.Throwable -> L4a
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L4a
            L21:
                boolean r5 = r0.moveToNext()     // Catch: java.lang.Throwable -> L4a
                if (r5 == 0) goto L46
                boolean r5 = r0.isNull(r1)     // Catch: java.lang.Throwable -> L4a
                if (r5 == 0) goto L2f
                r5 = r3
                goto L33
            L2f:
                java.lang.String r5 = r0.getString(r1)     // Catch: java.lang.Throwable -> L4a
            L33:
                hd.e r6 = r8.f12193b     // Catch: java.lang.Throwable -> L4a
                java.lang.String r7 = r0.getString(r2)     // Catch: java.lang.Throwable -> L4a
                od.v0 r6 = p130hd.C3029e.m7447g(r6, r7)     // Catch: java.lang.Throwable -> L4a
                id.b r7 = new id.b     // Catch: java.lang.Throwable -> L4a
                r7.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4a
                r4.add(r7)     // Catch: java.lang.Throwable -> L4a
                goto L21
            L46:
                r0.close()
                return r4
            L4a:
                r1 = move-exception
                r0.close()
                throw r1
        }

        public void finalize() {
                r1 = this;
                k1.x r0 = r1.f12192a
                r0.release()
                return
        }
    }

    /* renamed from: hd.e$f */
    public class f implements java.util.concurrent.Callable<java.util.List<id.C3131b>> {

        /* renamed from: a */
        public final /* synthetic */ p179k1.C3666x f12194a;

        /* renamed from: b */
        public final /* synthetic */ p130hd.C3029e f12195b;

        public f(p130hd.C3029e r1, p179k1.C3666x r2) {
                r0 = this;
                r0.f12195b = r1
                r0.f12194a = r2
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        public java.util.List<id.C3131b> call() {
                r8 = this;
                hd.e r0 = r8.f12195b
                k1.v r0 = r0.f12184a
                k1.x r1 = r8.f12194a
                r2 = 0
                r3 = 0
                android.database.Cursor r0 = p213m1.C4317c.m9645a(r0, r1, r2, r3)
                java.lang.String r1 = "username"
                int r1 = p213m1.C4316b.m9644a(r0, r1)     // Catch: java.lang.Throwable -> L4f
                java.lang.String r2 = "type"
                int r2 = p213m1.C4316b.m9644a(r0, r2)     // Catch: java.lang.Throwable -> L4f
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f
                int r5 = r0.getCount()     // Catch: java.lang.Throwable -> L4f
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L4f
            L21:
                boolean r5 = r0.moveToNext()     // Catch: java.lang.Throwable -> L4f
                if (r5 == 0) goto L46
                boolean r5 = r0.isNull(r1)     // Catch: java.lang.Throwable -> L4f
                if (r5 == 0) goto L2f
                r5 = r3
                goto L33
            L2f:
                java.lang.String r5 = r0.getString(r1)     // Catch: java.lang.Throwable -> L4f
            L33:
                hd.e r6 = r8.f12195b     // Catch: java.lang.Throwable -> L4f
                java.lang.String r7 = r0.getString(r2)     // Catch: java.lang.Throwable -> L4f
                od.v0 r6 = p130hd.C3029e.m7447g(r6, r7)     // Catch: java.lang.Throwable -> L4f
                id.b r7 = new id.b     // Catch: java.lang.Throwable -> L4f
                r7.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4f
                r4.add(r7)     // Catch: java.lang.Throwable -> L4f
                goto L21
            L46:
                r0.close()
                k1.x r0 = r8.f12194a
                r0.release()
                return r4
            L4f:
                r1 = move-exception
                r0.close()
                k1.x r0 = r8.f12194a
                r0.release()
                throw r1
        }
    }

    /* renamed from: hd.e$g */
    public static /* synthetic */ class g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12196a = null;

        static {
                od.v0[] r0 = p255od.EnumC5234v0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p130hd.C3029e.g.f12196a = r0
                od.v0 r1 = p255od.EnumC5234v0.WAX_CLOUD_WALLET     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = p130hd.C3029e.g.f12196a     // Catch: java.lang.NoSuchFieldError -> L1d
                od.v0 r1 = p255od.EnumC5234v0.ANCHOR     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public C3029e(p179k1.AbstractC3664v r3) {
            r2 = this;
            r2.<init>()
            r2.f12184a = r3
            hd.e$a r0 = new hd.e$a
            r0.<init>(r2, r3)
            r2.f12185b = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            hd.e$b r0 = new hd.e$b
            r0.<init>(r2, r3)
            r2.f12186c = r0
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>(r1)
            return
    }

    /* renamed from: f */
    public static java.lang.String m7446f(p130hd.C3029e r2, p255od.EnumC5234v0 r3) {
            java.util.Objects.requireNonNull(r2)
            if (r3 != 0) goto L7
            r2 = 0
            goto L31
        L7:
            int[] r2 = p130hd.C3029e.g.f12196a
            int r0 = r3.ordinal()
            r2 = r2[r0]
            r0 = 1
            if (r2 == r0) goto L2f
            r0 = 2
            if (r2 != r0) goto L18
            java.lang.String r2 = "ANCHOR"
            goto L31
        L18:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't convert enum to string, unknown enum value: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L2f:
            java.lang.String r2 = "WAX_CLOUD_WALLET"
        L31:
            return r2
    }

    /* renamed from: g */
    public static p255od.EnumC5234v0 m7447g(p130hd.C3029e r1, java.lang.String r2) {
            java.util.Objects.requireNonNull(r1)
            if (r2 != 0) goto L7
            r1 = 0
            goto L28
        L7:
            java.lang.String r1 = "WAX_CLOUD_WALLET"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L26
            java.lang.String r1 = "ANCHOR"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1a
            od.v0 r1 = p255od.EnumC5234v0.ANCHOR
            goto L28
        L1a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't convert value to enum, unknown value: "
            java.lang.String r2 = p064e.C1493g.m4049a(r0, r2)
            r1.<init>(r2)
            throw r1
        L26:
            od.v0 r1 = p255od.EnumC5234v0.WAX_CLOUD_WALLET
        L28:
            return r1
    }

    @Override // p130hd.InterfaceC3028d
    /* renamed from: a */
    public androidx.lifecycle.LiveData<java.util.List<id.C3131b>> mo7441a() {
            r5 = this;
            java.lang.String r0 = "SELECT * FROM WALLETS"
            r1 = 0
            k1.x r0 = p179k1.C3666x.m8125a(r0, r1)
            k1.v r2 = r5.f12184a
            k1.t r2 = r2.f16191e
            java.lang.String r3 = "WALLETS"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            hd.e$e r4 = new hd.e$e
            r4.<init>(r5, r0)
            androidx.lifecycle.LiveData r0 = r2.m8092b(r3, r1, r4)
            return r0
    }

    @Override // p130hd.InterfaceC3028d
    /* renamed from: b */
    public void mo7442b(id.C3131b r2) {
            r1 = this;
            k1.v r0 = r1.f12184a
            r0.m8110b()
            k1.v r0 = r1.f12184a
            r0.m8109a()
            r0.m8112i()
            k1.p<id.b> r0 = r1.f12185b     // Catch: java.lang.Throwable -> L1d
            r0.m8087f(r2)     // Catch: java.lang.Throwable -> L1d
            k1.v r2 = r1.f12184a     // Catch: java.lang.Throwable -> L1d
            r2.m8116m()     // Catch: java.lang.Throwable -> L1d
            k1.v r2 = r1.f12184a
            r2.m8113j()
            return
        L1d:
            r2 = move-exception
            k1.v r0 = r1.f12184a
            r0.m8113j()
            throw r2
    }

    @Override // p130hd.InterfaceC3028d
    /* renamed from: c */
    public java.lang.Object mo7443c(id.C3131b r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
            r2 = this;
            k1.v r0 = r2.f12184a
            hd.e$c r1 = new hd.e$c
            r1.<init>(r2, r3)
            r3 = 1
            java.lang.Object r3 = p179k1.C3654l.m8084a(r0, r3, r1, r4)
            return r3
    }

    @Override // p130hd.InterfaceC3028d
    /* renamed from: d */
    public java.lang.Object mo7444d(io.tacocrypto.app.database.model.Wallet[] r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
            r2 = this;
            k1.v r0 = r2.f12184a
            hd.e$d r1 = new hd.e$d
            r1.<init>(r2, r3)
            r3 = 1
            java.lang.Object r3 = p179k1.C3654l.m8084a(r0, r3, r1, r4)
            return r3
    }

    @Override // p130hd.InterfaceC3028d
    /* renamed from: e */
    public java.lang.Object mo7445e(p101fh.InterfaceC2172d<? super java.util.List<id.C3131b>> r11) {
            r10 = this;
            java.lang.String r0 = "SELECT * FROM WALLETS"
            r1 = 0
            k1.x r0 = p179k1.C3666x.m8125a(r0, r1)
            android.os.CancellationSignal r1 = new android.os.CancellationSignal
            r1.<init>()
            k1.v r2 = r10.f12184a
            hd.e$f r3 = new hd.e$f
            r3.<init>(r10, r0)
            boolean r0 = r2.m8114k()
            if (r0 == 0) goto L24
            boolean r0 = r2.m8111h()
            if (r0 == 0) goto L24
            java.lang.Object r11 = r3.call()
            goto L5e
        L24:
            fh.g r0 = r11.mo5706c()
            k1.b0$a r4 = p179k1.C3643b0.f16077Y
            fh.g$a r0 = r0.get(r4)
            k1.b0 r0 = (p179k1.C3643b0) r0
            vh.z r5 = p064e.C1488b.m4035b(r2)
            vh.i r0 = new vh.i
            fh.d r11 = gh.C2390b.m6127q(r11)
            r2 = 1
            r0.<init>(r11, r2)
            r0.m13634x()
            vh.v0 r4 = p379vh.C6746v0.f26044Y
            k1.k r7 = new k1.k
            r11 = 0
            r7.<init>(r3, r0, r11)
            r8 = 2
            r9 = 0
            r6 = 0
            vh.b1 r11 = p101fh.C2174f.m5728r(r4, r5, r6, r7, r8, r9)
            k1.j r2 = new k1.j
            r2.<init>(r1, r11)
            r0.mo13609d(r2)
            java.lang.Object r11 = r0.m13633w()
            gh.a r0 = gh.EnumC2389a.f10764Y
        L5e:
            return r11
    }
}
