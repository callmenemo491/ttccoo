package p222mb;

/* renamed from: mb.s */
/* loaded from: classes.dex */
public class C4528s implements p169jb.InterfaceC3458a0 {

    /* renamed from: Y */
    public final /* synthetic */ java.lang.Class f18413Y;

    /* renamed from: Z */
    public final /* synthetic */ p169jb.AbstractC3483z f18414Z;

    /* renamed from: mb.s$a */
    public class a extends p169jb.AbstractC3483z<java.lang.Object> {

        /* renamed from: a */
        public final /* synthetic */ java.lang.Class f18415a;

        /* renamed from: b */
        public final /* synthetic */ p222mb.C4528s f18416b;

        public a(p222mb.C4528s r1, java.lang.Class r2) {
                r0 = this;
                r0.f18416b = r1
                r0.f18415a = r2
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Object mo7919a(p290qb.C5612a r4) {
                r3 = this;
                mb.s r0 = r3.f18416b
                jb.z r0 = r0.f18414Z
                java.lang.Object r4 = r0.mo7919a(r4)
                if (r4 == 0) goto L3c
                java.lang.Class r0 = r3.f18415a
                boolean r0 = r0.isInstance(r4)
                if (r0 == 0) goto L13
                goto L3c
            L13:
                jb.w r0 = new jb.w
                java.lang.String r1 = "Expected a "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.Class r2 = r3.f18415a
                java.lang.String r2 = r2.getName()
                r1.append(r2)
                java.lang.String r2 = " but was "
                r1.append(r2)
                java.lang.Class r4 = r4.getClass()
                java.lang.String r4 = r4.getName()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            L3c:
                return r4
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r2, java.lang.Object r3) {
                r1 = this;
                mb.s r0 = r1.f18416b
                jb.z r0 = r0.f18414Z
                r0.mo7920b(r2, r3)
                return
        }
    }

    public C4528s(java.lang.Class r1, p169jb.AbstractC3483z r2) {
            r0 = this;
            r0.f18413Y = r1
            r0.f18414Z = r2
            r0.<init>()
            return
    }

    @Override // p169jb.InterfaceC3458a0
    /* renamed from: a */
    public <T2> p169jb.AbstractC3483z<T2> mo7921a(p169jb.C3467j r1, p274pb.C5380a<T2> r2) {
            r0 = this;
            java.lang.Class<? super T> r1 = r2.f21381a
            java.lang.Class r2 = r0.f18413Y
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            mb.s$a r2 = new mb.s$a
            r2.<init>(r0, r1)
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Factory[typeHierarchy="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class r1 = r2.f18413Y
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ",adapter="
            r0.append(r1)
            jb.z r1 = r2.f18414Z
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
