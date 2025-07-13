package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.s */
/* loaded from: classes.dex */
public class C0301s extends android.widget.RatingBar {

    /* renamed from: a0 */
    public final androidx.appcompat.widget.C0297q f1412a0;

    public C0301s(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969392(0x7f040330, float:1.7547465E38)
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r1, r2)
            androidx.appcompat.widget.q r2 = new androidx.appcompat.widget.q
            r2.<init>(r1)
            r1.f1412a0 = r2
            r2.mo774a(r3, r0)
            return
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            super.onMeasure(r2, r3)     // Catch: java.lang.Throwable -> L22
            androidx.appcompat.widget.q r3 = r1.f1412a0     // Catch: java.lang.Throwable -> L22
            android.graphics.Bitmap r3 = r3.f1408b     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L20
            int r3 = r3.getWidth()     // Catch: java.lang.Throwable -> L22
            int r0 = r1.getNumStars()     // Catch: java.lang.Throwable -> L22
            int r3 = r3 * r0
            r0 = 0
            int r2 = android.view.View.resolveSizeAndState(r3, r2, r0)     // Catch: java.lang.Throwable -> L22
            int r3 = r1.getMeasuredHeight()     // Catch: java.lang.Throwable -> L22
            r1.setMeasuredDimension(r2, r3)     // Catch: java.lang.Throwable -> L22
        L20:
            monitor-exit(r1)
            return
        L22:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
