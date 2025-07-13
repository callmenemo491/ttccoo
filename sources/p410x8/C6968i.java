package p410x8;

/* renamed from: x8.i */
/* loaded from: classes.dex */
public class C6968i implements android.widget.AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.textfield.C1218b f27214a;

    public C6968i(com.google.android.material.textfield.C1218b r1) {
            r0 = this;
            r0.f27214a = r1
            r0.<init>()
            return
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
            r3 = this;
            com.google.android.material.textfield.b r0 = r3.f27214a
            r1 = 1
            r0.f6475i = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.f6477k = r1
            com.google.android.material.textfield.b r0 = r3.f27214a
            r1 = 0
            com.google.android.material.textfield.C1218b.m3593f(r0, r1)
            return
    }
}
