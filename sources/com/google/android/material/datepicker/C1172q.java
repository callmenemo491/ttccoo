package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes.dex */
public final class C1172q<S> extends com.google.android.material.datepicker.AbstractC1178w<S> {

    /* renamed from: V0 */
    public int f6118V0;

    /* renamed from: W0 */
    public com.google.android.material.datepicker.InterfaceC1158c<S> f6119W0;

    /* renamed from: X0 */
    public com.google.android.material.datepicker.C1154a f6120X0;

    /* renamed from: com.google.android.material.datepicker.q$a */
    public class a extends com.google.android.material.datepicker.AbstractC1177v<S> {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.datepicker.C1172q f6121a;

        public a(com.google.android.material.datepicker.C1172q r1) {
                r0 = this;
                r0.f6121a = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.datepicker.AbstractC1177v
        /* renamed from: a */
        public void mo3423a(S r3) {
                r2 = this;
                com.google.android.material.datepicker.q r0 = r2.f6121a
                java.util.LinkedHashSet<com.google.android.material.datepicker.v<S>> r0 = r0.f6144U0
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                com.google.android.material.datepicker.v r1 = (com.google.android.material.datepicker.AbstractC1177v) r1
                r1.mo3423a(r3)
                goto L8
            L18:
                return
        }
    }

    public C1172q() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r2) {
            r1 = this;
            super.mo114V(r2)
            if (r2 != 0) goto L7
            android.os.Bundle r2 = r1.f2282d0
        L7:
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.f6118V0 = r0
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.c r0 = (com.google.android.material.datepicker.InterfaceC1158c) r0
            r1.f6119W0 = r0
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            com.google.android.material.datepicker.a r2 = (com.google.android.material.datepicker.C1154a) r2
            r1.f6120X0 = r2
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: W */
    public android.view.View mo1317W(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
            r9 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.m1339v()
            int r2 = r9.f6118V0
            r0.<init>(r1, r2)
            android.view.LayoutInflater r4 = r10.cloneInContext(r0)
            com.google.android.material.datepicker.c<S> r3 = r9.f6119W0
            com.google.android.material.datepicker.a r7 = r9.f6120X0
            com.google.android.material.datepicker.q$a r8 = new com.google.android.material.datepicker.q$a
            r8.<init>(r9)
            r5 = r11
            r6 = r12
            android.view.View r10 = r3.m3408S(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: f0 */
    public void mo1234f0(android.os.Bundle r3) {
            r2 = this;
            int r0 = r2.f6118V0
            java.lang.String r1 = "THEME_RES_ID_KEY"
            r3.putInt(r1, r0)
            com.google.android.material.datepicker.c<S> r0 = r2.f6119W0
            java.lang.String r1 = "DATE_SELECTOR_KEY"
            r3.putParcelable(r1, r0)
            com.google.android.material.datepicker.a r0 = r2.f6120X0
            java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
            r3.putParcelable(r1, r0)
            return
    }
}
