package p242o0;

/* renamed from: o0.a */
/* loaded from: classes.dex */
public final class C4867a extends android.text.style.ClickableSpan {

    /* renamed from: Y */
    public final int f19333Y;

    /* renamed from: Z */
    public final p242o0.C4868b f19334Z;

    /* renamed from: a0 */
    public final int f19335a0;

    public C4867a(int r1, p242o0.C4868b r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f19333Y = r1
            r0.f19334Z = r2
            r0.f19335a0 = r3
            return
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View r3) {
            r2 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            int r0 = r2.f19333Y
            java.lang.String r1 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r3.putInt(r1, r0)
            o0.b r0 = r2.f19334Z
            int r1 = r2.f19335a0
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f19337a
            r0.performAction(r1, r3)
            return
    }
}
