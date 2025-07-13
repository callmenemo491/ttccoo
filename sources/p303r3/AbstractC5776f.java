package p303r3;

/* renamed from: r3.f */
/* loaded from: classes.dex */
public abstract class AbstractC5776f extends p303r3.AbstractC5777g {
    public AbstractC5776f(p141i3.C3066a r1, p323s3.C5953g r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* renamed from: v */
    public void m12100v(android.graphics.Canvas r2, android.graphics.Path r3, int r4, int r5) {
            r1 = this;
            int r5 = r5 << 24
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r0
            r4 = r4 | r5
            android.util.DisplayMetrics r5 = p323s3.AbstractC5952f.f22855a
            int r5 = r2.save()
            r2.clipPath(r3)
            r2.drawColor(r4)
            r2.restoreToCount(r5)
            return
    }

    /* renamed from: w */
    public void m12101w(android.graphics.Canvas r5, android.graphics.Path r6, android.graphics.drawable.Drawable r7) {
            r4 = this;
            android.util.DisplayMetrics r0 = p323s3.AbstractC5952f.f22855a
            int r0 = r5.save()
            r5.clipPath(r6)
            java.lang.Object r6 = r4.f25150a
            s3.g r6 = (p323s3.C5953g) r6
            android.graphics.RectF r6 = r6.f22866b
            float r1 = r6.left
            int r1 = (int) r1
            float r2 = r6.top
            int r2 = (int) r2
            float r3 = r6.right
            int r3 = (int) r3
            float r6 = r6.bottom
            int r6 = (int) r6
            r7.setBounds(r1, r2, r3, r6)
            r7.draw(r5)
            r5.restoreToCount(r0)
            return
    }
}
