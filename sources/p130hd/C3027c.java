package p130hd;

/* renamed from: hd.c */
/* loaded from: classes.dex */
public final class C3027c implements p130hd.InterfaceC3026b {

    /* renamed from: a */
    public final p179k1.AbstractC3664v f12178a;

    /* renamed from: b */
    public final p179k1.AbstractC3658p<id.C3130a> f12179b;

    /* renamed from: c */
    public final p179k1.AbstractC3657o<id.C3130a> f12180c;

    /* renamed from: d */
    public final p179k1.AbstractC3657o<id.C3130a> f12181d;

    /* renamed from: hd.c$a */
    public class a extends p179k1.AbstractC3658p<id.C3130a> {
        public a(p130hd.C3027c r1, p179k1.AbstractC3664v r2) {
                r0 = this;
                r0.<init>(r2)
                return
        }

        @Override // p179k1.AbstractC3641a0
        /* renamed from: c */
        public java.lang.String mo7438c() {
                r1 = this;
                java.lang.String r0 = "INSERT OR REPLACE INTO `contacts` (`id`,`address`,`name`) VALUES (nullif(?, 0),?,?)"
                return r0
        }

        @Override // p179k1.AbstractC3658p
        /* renamed from: e */
        public void mo7439e(p243o1.InterfaceC4876f r4, id.C3130a r5) {
                r3 = this;
                id.a r5 = (id.C3130a) r5
                int r0 = r5.f12556Y
                long r0 = (long) r0
                r2 = 1
                r4.mo8105X(r2, r0)
                java.lang.String r0 = r5.f12557Z
                r1 = 2
                if (r0 != 0) goto L12
                r4.mo8103B(r1)
                goto L15
            L12:
                r4.mo8108u(r1, r0)
            L15:
                java.lang.String r5 = r5.f12558a0
                r0 = 3
                if (r5 != 0) goto L1e
                r4.mo8103B(r0)
                goto L21
            L1e:
                r4.mo8108u(r0, r5)
            L21:
                return
        }
    }

    /* renamed from: hd.c$b */
    public class b extends p179k1.AbstractC3657o<id.C3130a> {
        public b(p130hd.C3027c r1, p179k1.AbstractC3664v r2) {
                r0 = this;
                r0.<init>(r2)
                return
        }

        @Override // p179k1.AbstractC3641a0
        /* renamed from: c */
        public java.lang.String mo7438c() {
                r1 = this;
                java.lang.String r0 = "DELETE FROM `contacts` WHERE `id` = ?"
                return r0
        }

        @Override // p179k1.AbstractC3657o
        /* renamed from: e */
        public void mo7440e(p243o1.InterfaceC4876f r3, id.C3130a r4) {
                r2 = this;
                id.a r4 = (id.C3130a) r4
                int r4 = r4.f12556Y
                long r0 = (long) r4
                r4 = 1
                r3.mo8105X(r4, r0)
                return
        }
    }

    /* renamed from: hd.c$c */
    public class c extends p179k1.AbstractC3657o<id.C3130a> {
        public c(p130hd.C3027c r1, p179k1.AbstractC3664v r2) {
                r0 = this;
                r0.<init>(r2)
                return
        }

        @Override // p179k1.AbstractC3641a0
        /* renamed from: c */
        public java.lang.String mo7438c() {
                r1 = this;
                java.lang.String r0 = "UPDATE OR REPLACE `contacts` SET `id` = ?,`address` = ?,`name` = ? WHERE `id` = ?"
                return r0
        }

        @Override // p179k1.AbstractC3657o
        /* renamed from: e */
        public void mo7440e(p243o1.InterfaceC4876f r4, id.C3130a r5) {
                r3 = this;
                id.a r5 = (id.C3130a) r5
                int r0 = r5.f12556Y
                long r0 = (long) r0
                r2 = 1
                r4.mo8105X(r2, r0)
                java.lang.String r0 = r5.f12557Z
                r1 = 2
                if (r0 != 0) goto L12
                r4.mo8103B(r1)
                goto L15
            L12:
                r4.mo8108u(r1, r0)
            L15:
                java.lang.String r0 = r5.f12558a0
                r1 = 3
                if (r0 != 0) goto L1e
                r4.mo8103B(r1)
                goto L21
            L1e:
                r4.mo8108u(r1, r0)
            L21:
                r0 = 4
                int r5 = r5.f12556Y
                long r1 = (long) r5
                r4.mo8105X(r0, r1)
                return
        }
    }

    /* renamed from: hd.c$d */
    public class d implements java.util.concurrent.Callable<java.util.List<id.C3130a>> {

        /* renamed from: a */
        public final /* synthetic */ p179k1.C3666x f12182a;

        /* renamed from: b */
        public final /* synthetic */ p130hd.C3027c f12183b;

        public d(p130hd.C3027c r1, p179k1.C3666x r2) {
                r0 = this;
                r0.f12183b = r1
                r0.f12182a = r2
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        public java.util.List<id.C3130a> call() {
                r10 = this;
                hd.c r0 = r10.f12183b
                k1.v r0 = r0.f12178a
                k1.x r1 = r10.f12182a
                r2 = 0
                r3 = 0
                android.database.Cursor r0 = p213m1.C4317c.m9645a(r0, r1, r2, r3)
                java.lang.String r1 = "id"
                int r1 = p213m1.C4316b.m9644a(r0, r1)     // Catch: java.lang.Throwable -> L56
                java.lang.String r2 = "address"
                int r2 = p213m1.C4316b.m9644a(r0, r2)     // Catch: java.lang.Throwable -> L56
                java.lang.String r4 = "name"
                int r4 = p213m1.C4316b.m9644a(r0, r4)     // Catch: java.lang.Throwable -> L56
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L56
                int r6 = r0.getCount()     // Catch: java.lang.Throwable -> L56
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L56
            L27:
                boolean r6 = r0.moveToNext()     // Catch: java.lang.Throwable -> L56
                if (r6 == 0) goto L52
                int r6 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L56
                boolean r7 = r0.isNull(r2)     // Catch: java.lang.Throwable -> L56
                if (r7 == 0) goto L39
                r7 = r3
                goto L3d
            L39:
                java.lang.String r7 = r0.getString(r2)     // Catch: java.lang.Throwable -> L56
            L3d:
                boolean r8 = r0.isNull(r4)     // Catch: java.lang.Throwable -> L56
                if (r8 == 0) goto L45
                r8 = r3
                goto L49
            L45:
                java.lang.String r8 = r0.getString(r4)     // Catch: java.lang.Throwable -> L56
            L49:
                id.a r9 = new id.a     // Catch: java.lang.Throwable -> L56
                r9.<init>(r6, r7, r8)     // Catch: java.lang.Throwable -> L56
                r5.add(r9)     // Catch: java.lang.Throwable -> L56
                goto L27
            L52:
                r0.close()
                return r5
            L56:
                r1 = move-exception
                r0.close()
                throw r1
        }

        public void finalize() {
                r1 = this;
                k1.x r0 = r1.f12182a
                r0.release()
                return
        }
    }

    public C3027c(p179k1.AbstractC3664v r2) {
            r1 = this;
            r1.<init>()
            r1.f12178a = r2
            hd.c$a r0 = new hd.c$a
            r0.<init>(r1, r2)
            r1.f12179b = r0
            hd.c$b r0 = new hd.c$b
            r0.<init>(r1, r2)
            r1.f12180c = r0
            hd.c$c r0 = new hd.c$c
            r0.<init>(r1, r2)
            r1.f12181d = r0
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r2.<init>(r0)
            return
    }

    @Override // p130hd.InterfaceC3026b
    /* renamed from: a */
    public void mo7434a(id.C3130a... r2) {
            r1 = this;
            k1.v r0 = r1.f12178a
            r0.m8110b()
            k1.v r0 = r1.f12178a
            r0.m8109a()
            r0.m8112i()
            k1.o<id.a> r0 = r1.f12180c     // Catch: java.lang.Throwable -> L1d
            r0.m8086f(r2)     // Catch: java.lang.Throwable -> L1d
            k1.v r2 = r1.f12178a     // Catch: java.lang.Throwable -> L1d
            r2.m8116m()     // Catch: java.lang.Throwable -> L1d
            k1.v r2 = r1.f12178a
            r2.m8113j()
            return
        L1d:
            r2 = move-exception
            k1.v r0 = r1.f12178a
            r0.m8113j()
            throw r2
    }

    @Override // p130hd.InterfaceC3026b
    /* renamed from: b */
    public androidx.lifecycle.LiveData<java.util.List<id.C3130a>> mo7435b() {
            r5 = this;
            java.lang.String r0 = "SELECT * FROM CONTACTS"
            r1 = 0
            k1.x r0 = p179k1.C3666x.m8125a(r0, r1)
            k1.v r2 = r5.f12178a
            k1.t r2 = r2.f16191e
            java.lang.String r3 = "CONTACTS"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            hd.c$d r4 = new hd.c$d
            r4.<init>(r5, r0)
            androidx.lifecycle.LiveData r0 = r2.m8092b(r3, r1, r4)
            return r0
    }

    @Override // p130hd.InterfaceC3026b
    /* renamed from: c */
    public void mo7436c(id.C3130a r2) {
            r1 = this;
            k1.v r0 = r1.f12178a
            r0.m8110b()
            k1.v r0 = r1.f12178a
            r0.m8109a()
            r0.m8112i()
            k1.p<id.a> r0 = r1.f12179b     // Catch: java.lang.Throwable -> L1d
            r0.m8087f(r2)     // Catch: java.lang.Throwable -> L1d
            k1.v r2 = r1.f12178a     // Catch: java.lang.Throwable -> L1d
            r2.m8116m()     // Catch: java.lang.Throwable -> L1d
            k1.v r2 = r1.f12178a
            r2.m8113j()
            return
        L1d:
            r2 = move-exception
            k1.v r0 = r1.f12178a
            r0.m8113j()
            throw r2
    }

    @Override // p130hd.InterfaceC3026b
    /* renamed from: d */
    public void mo7437d(id.C3130a r3) {
            r2 = this;
            k1.v r0 = r2.f12178a
            r0.m8110b()
            k1.v r0 = r2.f12178a
            r0.m8109a()
            r0.m8112i()
            k1.o<id.a> r0 = r2.f12181d     // Catch: java.lang.Throwable -> L33
            o1.f r1 = r0.m8076a()     // Catch: java.lang.Throwable -> L33
            r0.mo7440e(r1, r3)     // Catch: java.lang.Throwable -> L2e
            r1.mo11023x()     // Catch: java.lang.Throwable -> L2e
            o1.f r3 = r0.f16050c     // Catch: java.lang.Throwable -> L33
            if (r1 != r3) goto L23
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.f16048a     // Catch: java.lang.Throwable -> L33
            r0 = 0
            r3.set(r0)     // Catch: java.lang.Throwable -> L33
        L23:
            k1.v r3 = r2.f12178a     // Catch: java.lang.Throwable -> L33
            r3.m8116m()     // Catch: java.lang.Throwable -> L33
            k1.v r3 = r2.f12178a
            r3.m8113j()
            return
        L2e:
            r3 = move-exception
            r0.m8078d(r1)     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L33
        L33:
            r3 = move-exception
            k1.v r0 = r2.f12178a
            r0.m8113j()
            throw r3
    }
}
