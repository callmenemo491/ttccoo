package de;

/* renamed from: de.m */
/* loaded from: classes.dex */
public final class C1443m<T> implements java.util.Comparator {

    /* renamed from: Y */
    public final /* synthetic */ java.util.List f7161Y;

    public C1443m(java.util.List r1) {
            r0 = this;
            r0.f7161Y = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(T r10, T r11) {
            r9 = this;
            ch.h r10 = (ch.C0981h) r10
            A r0 = r10.f5057Y
            io.tacocrypto.app.ui.secret.c r0 = (io.tacocrypto.app.p156ui.secret.EnumC3251c) r0
            B r1 = r10.f5058Z
            io.tacocrypto.app.ui.secret.b r2 = io.tacocrypto.app.p156ui.secret.EnumC3250b.f14328Y
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            C r5 = r10.f5059a0
            md.t0 r5 = (md.C4580t0) r5
            r6 = 0
            if (r5 == 0) goto L21
            double r7 = r5.getCost()
            java.lang.Double r5 = java.lang.Double.valueOf(r7)
            goto L22
        L21:
            r5 = r6
        L22:
            java.util.List r7 = r9.f7161Y
            A r10 = r10.f5057Y
            int r10 = r7.indexOf(r10)
            java.util.List r7 = r9.f7161Y
            int r7 = r7.size()
            if (r10 < 0) goto L33
            goto L34
        L33:
            r10 = r7
        L34:
            int r10 = r0.m7733h(r1, r5, r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            ch.h r11 = (ch.C0981h) r11
            A r0 = r11.f5057Y
            io.tacocrypto.app.ui.secret.c r0 = (io.tacocrypto.app.p156ui.secret.EnumC3251c) r0
            B r1 = r11.f5058Z
            if (r1 != r2) goto L47
            r3 = 1
        L47:
            C r1 = r11.f5059a0
            md.t0 r1 = (md.C4580t0) r1
            if (r1 == 0) goto L55
            double r1 = r1.getCost()
            java.lang.Double r6 = java.lang.Double.valueOf(r1)
        L55:
            java.util.List r1 = r9.f7161Y
            A r11 = r11.f5057Y
            int r11 = r1.indexOf(r11)
            java.util.List r1 = r9.f7161Y
            int r1 = r1.size()
            if (r11 < 0) goto L66
            goto L67
        L66:
            r11 = r1
        L67:
            int r11 = r0.m7733h(r3, r6, r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r10 = p079eh.C1850a.m4597b(r10, r11)
            return r10
    }
}
