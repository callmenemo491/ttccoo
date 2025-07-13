package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class AppCompatSeekBar extends android.widget.SeekBar {

    /* renamed from: a0 */
    public final androidx.appcompat.widget.C0305u f979a0;

    public AppCompatSeekBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969421(0x7f04034d, float:1.7547523E38)
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r1, r2)
            androidx.appcompat.widget.u r2 = new androidx.appcompat.widget.u
            r2.<init>(r1)
            r1.f979a0 = r2
            r2.mo774a(r3, r0)
            return
    }

    public AppCompatSeekBar(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r0, r1)
            androidx.appcompat.widget.u r1 = new androidx.appcompat.widget.u
            r1.<init>(r0)
            r0.f979a0 = r1
            r1.mo774a(r2, r3)
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
            r3 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.u r0 = r3.f979a0
            android.graphics.drawable.Drawable r1 = r0.f1441e
            if (r1 == 0) goto L20
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L20
            android.widget.SeekBar r2 = r0.f1440d
            int[] r2 = r2.getDrawableState()
            boolean r2 = r1.setState(r2)
            if (r2 == 0) goto L20
            android.widget.SeekBar r0 = r0.f1440d
            r0.invalidateDrawable(r1)
        L20:
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            androidx.appcompat.widget.u r0 = r1.f979a0
            android.graphics.drawable.Drawable r0 = r0.f1441e
            if (r0 == 0) goto Lc
            r0.jumpToCurrentState()
        Lc:
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            monitor-enter(r1)
            super.onDraw(r2)     // Catch: java.lang.Throwable -> Lb
            androidx.appcompat.widget.u r0 = r1.f979a0     // Catch: java.lang.Throwable -> Lb
            r0.m792d(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
