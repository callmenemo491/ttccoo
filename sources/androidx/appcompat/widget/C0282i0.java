package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.i0 */
/* loaded from: classes.dex */
public class C0282i0 implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: Y */
    public final /* synthetic */ androidx.appcompat.widget.C0284j0 f1317Y;

    public C0282i0(androidx.appcompat.widget.C0284j0 r1) {
            r0 = this;
            r0.f1317Y = r1
            r0.<init>()
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            r1 = -1
            if (r3 == r1) goto Ld
            androidx.appcompat.widget.j0 r1 = r0.f1317Y
            androidx.appcompat.widget.f0 r1 = r1.f1329a0
            if (r1 == 0) goto Ld
            r2 = 0
            r1.setListSelectionHidden(r2)
        Ld:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }
}
