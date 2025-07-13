package p264p0;

/* renamed from: p0.b */
/* loaded from: classes.dex */
public class C5338b extends android.view.inputmethod.InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ p264p0.InterfaceC5340d f21232a;

    public C5338b(android.view.inputmethod.InputConnection r1, boolean r2, p264p0.InterfaceC5340d r3) {
            r0 = this;
            r0.f21232a = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitContent(android.view.inputmethod.InputContentInfo r5, int r6, android.os.Bundle r7) {
            r4 = this;
            p0.d r0 = r4.f21232a
            r1 = 0
            if (r5 != 0) goto L6
            goto L17
        L6:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r2 >= r3) goto Ld
            goto L17
        Ld:
            p0.e r1 = new p0.e
            p0.e$a r2 = new p0.e$a
            r2.<init>(r5)
            r1.<init>(r2)
        L17:
            androidx.appcompat.widget.t r0 = (androidx.appcompat.widget.C0303t) r0
            boolean r0 = r0.m786a(r1, r6, r7)
            if (r0 == 0) goto L21
            r5 = 1
            return r5
        L21:
            boolean r5 = super.commitContent(r5, r6, r7)
            return r5
    }
}
