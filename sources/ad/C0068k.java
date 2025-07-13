package ad;

/* renamed from: ad.k */
/* loaded from: classes.dex */
public class C0068k extends ad.AbstractC0071n {
    public C0068k() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: c */
    public static float m106c(float r2) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 >= 0) goto L8
            float r0 = r0 / r2
            return r0
        L8:
            return r2
    }

    @Override // ad.AbstractC0071n
    /* renamed from: a */
    public float mo104a(p454zc.C7294r r5, p454zc.C7294r r6) {
            r4 = this;
            int r0 = r5.f27963Y
            if (r0 <= 0) goto L43
            int r1 = r5.f27964Z
            if (r1 > 0) goto L9
            goto L43
        L9:
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            int r2 = r6.f27963Y
            float r2 = (float) r2
            float r0 = r0 / r2
            float r0 = m106c(r0)
            int r2 = r5.f27964Z
            float r2 = (float) r2
            float r2 = r2 * r1
            int r3 = r6.f27964Z
            float r3 = (float) r3
            float r2 = r2 / r3
            float r2 = m106c(r2)
            float r0 = r1 / r0
            float r0 = r0 / r2
            int r2 = r5.f27963Y
            float r2 = (float) r2
            float r2 = r2 * r1
            int r5 = r5.f27964Z
            float r5 = (float) r5
            float r2 = r2 / r5
            int r5 = r6.f27963Y
            float r5 = (float) r5
            float r5 = r5 * r1
            int r6 = r6.f27964Z
            float r6 = (float) r6
            float r5 = r5 / r6
            float r2 = r2 / r5
            float r5 = m106c(r2)
            float r1 = r1 / r5
            float r1 = r1 / r5
            float r1 = r1 / r5
            float r1 = r1 * r0
            return r1
        L43:
            r5 = 0
            return r5
    }

    @Override // ad.AbstractC0071n
    /* renamed from: b */
    public android.graphics.Rect mo105b(p454zc.C7294r r3, p454zc.C7294r r4) {
            r2 = this;
            android.graphics.Rect r3 = new android.graphics.Rect
            int r0 = r4.f27963Y
            int r4 = r4.f27964Z
            r1 = 0
            r3.<init>(r1, r1, r0, r4)
            return r3
    }
}
