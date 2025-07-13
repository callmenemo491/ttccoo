package p347u0;

/* renamed from: u0.f */
/* loaded from: classes.dex */
public class C6282f {

    /* renamed from: u0.f$a */
    public class a implements android.text.TextWatcher {

        /* renamed from: Y */
        public final /* synthetic */ p347u0.C6282f.c f24438Y;

        /* renamed from: Z */
        public final /* synthetic */ p347u0.C6282f.d f24439Z;

        /* renamed from: a0 */
        public final /* synthetic */ androidx.databinding.InterfaceC0360g f24440a0;

        /* renamed from: b0 */
        public final /* synthetic */ p347u0.C6282f.b f24441b0;

        public a(p347u0.C6282f.c r1, p347u0.C6282f.d r2, androidx.databinding.InterfaceC0360g r3, p347u0.C6282f.b r4) {
                r0 = this;
                r0.f24438Y = r1
                r0.f24439Z = r2
                r0.f24440a0 = r3
                r0.f24441b0 = r4
                r0.<init>()
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r2) {
                r1 = this;
                u0.f$b r0 = r1.f24441b0
                if (r0 == 0) goto L7
                r0.afterTextChanged(r2)
            L7:
                return
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
                r1 = this;
                u0.f$c r0 = r1.f24438Y
                if (r0 == 0) goto L7
                r0.beforeTextChanged(r2, r3, r4, r5)
            L7:
                return
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
                r1 = this;
                u0.f$d r0 = r1.f24439Z
                if (r0 == 0) goto L7
                r0.onTextChanged(r2, r3, r4, r5)
            L7:
                androidx.databinding.g r2 = r1.f24440a0
                if (r2 == 0) goto Le
                r2.mo1070a()
            Le:
                return
        }
    }

    /* renamed from: u0.f$b */
    public interface b {
        void afterTextChanged(android.text.Editable r1);
    }

    /* renamed from: u0.f$c */
    public interface c {
        void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4);
    }

    /* renamed from: u0.f$d */
    public interface d {
        void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4);
    }

    /* renamed from: a */
    public static java.lang.String m12908a(android.widget.TextView r0) {
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: b */
    public static void m12909b(android.widget.TextView r7, java.lang.CharSequence r8) {
            java.lang.CharSequence r0 = r7.getText()
            if (r8 == r0) goto L4f
            if (r8 != 0) goto Lf
            int r1 = r0.length()
            if (r1 != 0) goto Lf
            goto L4f
        Lf:
            boolean r1 = r8 instanceof android.text.Spanned
            if (r1 == 0) goto L1a
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L4c
            return
        L1a:
            r1 = 0
            r2 = 1
            if (r8 != 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r0 != 0) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            if (r3 == r4) goto L29
            goto L44
        L29:
            if (r8 != 0) goto L2c
            goto L49
        L2c:
            int r3 = r8.length()
            int r4 = r0.length()
            if (r3 == r4) goto L37
            goto L44
        L37:
            r4 = 0
        L38:
            if (r4 >= r3) goto L49
            char r5 = r8.charAt(r4)
            char r6 = r0.charAt(r4)
            if (r5 == r6) goto L46
        L44:
            r1 = 1
            goto L49
        L46:
            int r4 = r4 + 1
            goto L38
        L49:
            if (r1 != 0) goto L4c
            return
        L4c:
            r7.setText(r8)
        L4f:
            return
    }

    /* renamed from: c */
    public static void m12910c(android.widget.TextView r0, p347u0.C6282f.c r1, p347u0.C6282f.d r2, p347u0.C6282f.b r3, androidx.databinding.InterfaceC0360g r4) {
            r1 = 0
            if (r2 != 0) goto L6
            if (r4 != 0) goto L6
            goto Lc
        L6:
            u0.f$a r3 = new u0.f$a
            r3.<init>(r1, r2, r4, r1)
            r1 = r3
        Lc:
            r2 = 2131362688(0x7f0a0380, float:1.8345164E38)
            int r3 = p347u0.C6277a.f24433a
            java.lang.Object r3 = r0.getTag(r2)
            r0.setTag(r2, r1)
            android.text.TextWatcher r3 = (android.text.TextWatcher) r3
            if (r3 == 0) goto L1f
            r0.removeTextChangedListener(r3)
        L1f:
            if (r1 == 0) goto L24
            r0.addTextChangedListener(r1)
        L24:
            return
    }
}
