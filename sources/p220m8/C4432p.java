package p220m8;

@android.annotation.SuppressLint({"AppCompatCustomView"})
/* renamed from: m8.p */
/* loaded from: classes.dex */
public class C4432p extends android.widget.ImageButton {

    /* renamed from: a0 */
    public int f18091a0;

    /* renamed from: b */
    public final void m9888b(int r1, boolean r2) {
            r0 = this;
            super.setVisibility(r1)
            if (r2 == 0) goto L7
            r0.f18091a0 = r1
        L7:
            return
    }

    public final int getUserSetVisibility() {
            r1 = this;
            int r0 = r1.f18091a0
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            r0.f18091a0 = r1
            return
    }
}
