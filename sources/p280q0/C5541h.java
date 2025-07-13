package p280q0;

/* renamed from: q0.h */
/* loaded from: classes.dex */
public final class C5541h implements p227n0.InterfaceC4654m {
    public C5541h() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p227n0.InterfaceC4654m
    /* renamed from: a */
    public p227n0.C4644c mo10518a(android.view.View r10, p227n0.C4644c r11) {
            r9 = this;
            java.lang.String r0 = "ReceiveContent"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onReceive: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L1d:
            n0.c$e r0 = r11.f18538a
            int r0 = r0.mo10499c()
            r1 = 2
            if (r0 != r1) goto L27
            return r11
        L27:
            n0.c$e r0 = r11.f18538a
            android.content.ClipData r0 = r0.mo10497a()
            n0.c$e r11 = r11.f18538a
            int r11 = r11.mo10500z()
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.CharSequence r1 = r10.getText()
            android.text.Editable r1 = (android.text.Editable) r1
            android.content.Context r10 = r10.getContext()
            r2 = 0
            r3 = 0
            r4 = 0
        L42:
            int r5 = r0.getItemCount()
            if (r3 >= r5) goto L99
            android.content.ClipData$Item r5 = r0.getItemAt(r3)
            r6 = 1
            r7 = r11 & 1
            if (r7 == 0) goto L5e
            java.lang.CharSequence r5 = r5.coerceToText(r10)
            boolean r7 = r5 instanceof android.text.Spanned
            if (r7 == 0) goto L62
            java.lang.String r5 = r5.toString()
            goto L62
        L5e:
            java.lang.CharSequence r5 = r5.coerceToStyledText(r10)
        L62:
            if (r5 == 0) goto L96
            if (r4 != 0) goto L86
            int r4 = android.text.Selection.getSelectionStart(r1)
            int r7 = android.text.Selection.getSelectionEnd(r1)
            int r8 = java.lang.Math.min(r4, r7)
            int r8 = java.lang.Math.max(r2, r8)
            int r4 = java.lang.Math.max(r4, r7)
            int r4 = java.lang.Math.max(r2, r4)
            android.text.Selection.setSelection(r1, r4)
            r1.replace(r8, r4, r5)
            r4 = 1
            goto L96
        L86:
            int r6 = android.text.Selection.getSelectionEnd(r1)
            java.lang.String r7 = "\n"
            r1.insert(r6, r7)
            int r6 = android.text.Selection.getSelectionEnd(r1)
            r1.insert(r6, r5)
        L96:
            int r3 = r3 + 1
            goto L42
        L99:
            r10 = 0
            return r10
    }
}
