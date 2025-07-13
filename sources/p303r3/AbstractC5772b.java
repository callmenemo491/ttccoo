package p303r3;

/* renamed from: r3.b */
/* loaded from: classes.dex */
public abstract class AbstractC5772b extends p303r3.AbstractC5773c {

    /* renamed from: f */
    public p303r3.AbstractC5772b.a f22249f;

    /* renamed from: r3.b$a */
    public class a {

        /* renamed from: a */
        public int f22250a;

        /* renamed from: b */
        public int f22251b;

        /* renamed from: c */
        public int f22252c;

        /* renamed from: d */
        public final /* synthetic */ p303r3.AbstractC5772b f22253d;

        public a(p303r3.AbstractC5772b r1) {
                r0 = this;
                r0.f22253d = r1
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m12090a(p245o3.InterfaceC4888a r5, p267p3.InterfaceC5348b r6) {
                r4 = this;
                r3.b r0 = r4.f22253d
                i3.a r0 = r0.f22254b
                java.util.Objects.requireNonNull(r0)
                r0 = 1065353216(0x3f800000, float:1.0)
                float r0 = java.lang.Math.min(r0, r0)
                r1 = 0
                float r0 = java.lang.Math.max(r1, r0)
                float r1 = r5.getLowestVisibleX()
                float r5 = r5.getHighestVisibleX()
                l3.e$a r2 = p198l3.AbstractC4171e.a.f17285Z
                r3 = 2143289344(0x7fc00000, float:NaN)
                l3.f r1 = r6.mo9264u(r1, r3, r2)
                l3.e$a r2 = p198l3.AbstractC4171e.a.f17284Y
                l3.f r5 = r6.mo9264u(r5, r3, r2)
                r2 = 0
                if (r1 != 0) goto L2d
                r1 = 0
                goto L31
            L2d:
                int r1 = r6.mo9265v(r1)
            L31:
                r4.f22250a = r1
                if (r5 != 0) goto L36
                goto L3a
            L36:
                int r2 = r6.mo9265v(r5)
            L3a:
                r4.f22251b = r2
                int r5 = r4.f22250a
                int r2 = r2 - r5
                float r5 = (float) r2
                float r5 = r5 * r0
                int r5 = (int) r5
                r4.f22252c = r5
                return
        }
    }

    public AbstractC5772b(p141i3.C3066a r1, p323s3.C5953g r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r3.b$a r1 = new r3.b$a
            r1.<init>(r0)
            r0.f22249f = r1
            return
    }

    /* renamed from: t */
    public boolean m12088t(p198l3.C4172f r3, p267p3.InterfaceC5348b r4) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r3 = r4.mo9265v(r3)
            float r3 = (float) r3
            int r4 = r4.mo9255P()
            float r4 = (float) r4
            i3.a r1 = r2.f22254b
            java.util.Objects.requireNonNull(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r1
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L1c
            return r0
        L1c:
            r3 = 1
            return r3
    }

    /* renamed from: u */
    public boolean m12089u(p267p3.InterfaceC5350d r2) {
            r1 = this;
            boolean r0 = r2.isVisible()
            if (r0 == 0) goto L14
            boolean r0 = r2.mo9227D()
            if (r0 != 0) goto L12
            boolean r2 = r2.mo9244s()
            if (r2 == 0) goto L14
        L12:
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }
}
