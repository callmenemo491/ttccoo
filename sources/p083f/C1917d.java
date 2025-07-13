package p083f;

/* renamed from: f.d */
/* loaded from: classes.dex */
public class C1917d implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ android.view.View f8314a;

    /* renamed from: b */
    public final /* synthetic */ android.view.View f8315b;

    public C1917d(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
            r0 = this;
            r0.f8314a = r2
            r0.f8315b = r3
            r0.<init>()
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
            r0 = this;
            android.view.View r2 = r0.f8314a
            android.view.View r3 = r0.f8315b
            androidx.appcompat.app.AlertController.m451c(r1, r2, r3)
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView r1, int r2) {
            r0 = this;
            return
    }
}
