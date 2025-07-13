package p410x8;

/* renamed from: x8.h */
/* loaded from: classes.dex */
public class ViewOnTouchListenerC6967h implements android.view.View.OnTouchListener {

    /* renamed from: Y */
    public final /* synthetic */ android.widget.AutoCompleteTextView f27212Y;

    /* renamed from: Z */
    public final /* synthetic */ com.google.android.material.textfield.C1218b f27213Z;

    public ViewOnTouchListenerC6967h(com.google.android.material.textfield.C1218b r1, android.widget.AutoCompleteTextView r2) {
            r0 = this;
            r0.f27213Z = r1
            r0.f27212Y = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r2, android.view.MotionEvent r3) {
            r1 = this;
            int r2 = r3.getAction()
            r3 = 0
            r0 = 1
            if (r2 != r0) goto L1b
            com.google.android.material.textfield.b r2 = r1.f27213Z
            boolean r2 = r2.m3597i()
            if (r2 == 0) goto L14
            com.google.android.material.textfield.b r2 = r1.f27213Z
            r2.f6475i = r3
        L14:
            com.google.android.material.textfield.b r2 = r1.f27213Z
            android.widget.AutoCompleteTextView r0 = r1.f27212Y
            com.google.android.material.textfield.C1218b.m3594g(r2, r0)
        L1b:
            return r3
    }
}
