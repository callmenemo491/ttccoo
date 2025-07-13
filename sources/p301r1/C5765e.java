package p301r1;

/* renamed from: r1.e */
/* loaded from: classes.dex */
public class C5765e extends android.view.animation.Animation {

    /* renamed from: Y */
    public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout f22217Y;

    public C5765e(androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1) {
            r0 = this;
            r0.f22217Y = r1
            r0.<init>()
            return
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float r1, android.view.animation.Transformation r2) {
            r0 = this;
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r2 = r0.f22217Y
            r2.setAnimationProgress(r1)
            return
    }
}
