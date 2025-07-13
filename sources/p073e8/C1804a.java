package p073e8;

/* renamed from: e8.a */
/* loaded from: classes.dex */
public class C1804a extends android.view.ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.chip.Chip f7851a;

    public C1804a(com.google.android.material.chip.Chip r1) {
            r0 = this;
            r0.f7851a = r1
            r0.<init>()
            return
    }

    @Override // android.view.ViewOutlineProvider
    @android.annotation.TargetApi(21)
    public void getOutline(android.view.View r1, android.graphics.Outline r2) {
            r0 = this;
            com.google.android.material.chip.Chip r1 = r0.f7851a
            com.google.android.material.chip.a r1 = r1.f5946d0
            if (r1 == 0) goto La
            r1.getOutline(r2)
            goto Le
        La:
            r1 = 0
            r2.setAlpha(r1)
        Le:
            return
    }
}
