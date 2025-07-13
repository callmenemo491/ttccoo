package ad;

/* renamed from: ad.h */
/* loaded from: classes.dex */
public class C0065h extends ad.AbstractC0071n {
    public C0065h() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ad.AbstractC0071n
    /* renamed from: a */
    public float mo104a(p454zc.C7294r r8, p454zc.C7294r r9) {
            r7 = this;
            int r0 = r8.f27963Y
            if (r0 <= 0) goto L41
            int r0 = r8.f27964Z
            if (r0 > 0) goto L9
            goto L41
        L9:
            zc.r r0 = r8.m14394e(r9)
            int r1 = r0.f27963Y
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r2
            int r8 = r8.f27963Y
            float r8 = (float) r8
            float r1 = r1 / r8
            int r8 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r8 <= 0) goto L29
            float r8 = r2 / r1
            double r3 = (double) r8
            r5 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            double r3 = java.lang.Math.pow(r3, r5)
            float r1 = (float) r3
        L29:
            int r8 = r0.f27963Y
            float r8 = (float) r8
            float r8 = r8 * r2
            int r3 = r9.f27963Y
            float r3 = (float) r3
            float r8 = r8 / r3
            int r0 = r0.f27964Z
            float r0 = (float) r0
            float r0 = r0 * r2
            int r9 = r9.f27964Z
            float r9 = (float) r9
            float r0 = r0 / r9
            float r0 = r0 + r8
            float r2 = r2 / r0
            float r2 = r2 / r0
            float r2 = r2 * r1
            return r2
        L41:
            r8 = 0
            return r8
    }

    @Override // ad.AbstractC0071n
    /* renamed from: b */
    public android.graphics.Rect mo105b(p454zc.C7294r r6, p454zc.C7294r r7) {
            r5 = this;
            zc.r r0 = r6.m14394e(r7)
            java.lang.String r1 = "h"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Preview: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = "; Scaled: "
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = "; Want: "
            r2.append(r6)
            r2.append(r7)
            java.lang.String r6 = r2.toString()
            android.util.Log.i(r1, r6)
            int r6 = r0.f27963Y
            int r1 = r7.f27963Y
            int r6 = r6 - r1
            int r6 = r6 / 2
            int r1 = r0.f27964Z
            int r7 = r7.f27964Z
            int r1 = r1 - r7
            int r1 = r1 / 2
            android.graphics.Rect r7 = new android.graphics.Rect
            int r2 = -r6
            int r3 = -r1
            int r4 = r0.f27963Y
            int r4 = r4 - r6
            int r6 = r0.f27964Z
            int r6 = r6 - r1
            r7.<init>(r2, r3, r4, r6)
            return r7
    }
}
