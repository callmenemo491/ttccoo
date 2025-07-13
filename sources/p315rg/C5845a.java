package p315rg;

/* JADX WARN: Unexpected interfaces in signature: [android.widget.Filterable] */
/* renamed from: rg.a */
/* loaded from: classes.dex */
public final class C5845a extends android.widget.ArrayAdapter<id.C3130a> {

    /* renamed from: Y */
    public final java.util.List<id.C3130a> f22615Y;

    /* renamed from: Z */
    public final int f22616Z;

    /* renamed from: a0 */
    public java.util.List<id.C3130a> f22617a0;

    /* renamed from: b0 */
    public java.lang.String f22618b0;

    /* renamed from: rg.a$a */
    public static final class a extends android.widget.Filter {

        /* renamed from: a */
        public final /* synthetic */ p315rg.C5845a f22619a;

        public a(p315rg.C5845a r1) {
                r0 = this;
                r0.f22619a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.Filter
        public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r10) {
                r9 = this;
                android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
                r0.<init>()
                if (r10 == 0) goto Lc
                java.lang.String r10 = r10.toString()
                goto Ld
            Lc:
                r10 = 0
            Ld:
                if (r10 != 0) goto L11
                java.lang.String r10 = ""
            L11:
                rg.a r1 = r9.f22619a
                r1.f22618b0 = r10
                int r2 = r10.length()
                r3 = 1
                r4 = 0
                if (r2 <= 0) goto L1f
                r2 = 1
                goto L20
            L1f:
                r2 = 0
            L20:
                if (r2 == 0) goto L56
                rg.a r2 = r9.f22619a
                java.util.List<id.a> r2 = r2.f22615Y
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r2 = r2.iterator()
            L2f:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L5a
                java.lang.Object r6 = r2.next()
                r7 = r6
                id.a r7 = (id.C3130a) r7
                java.lang.String r8 = r7.f12558a0
                boolean r8 = p362uh.C6467m.m13062S(r8, r10, r3)
                if (r8 != 0) goto L4f
                java.lang.String r7 = r7.f12557Z
                boolean r7 = p362uh.C6467m.m13062S(r7, r10, r3)
                if (r7 == 0) goto L4d
                goto L4f
            L4d:
                r7 = 0
                goto L50
            L4f:
                r7 = 1
            L50:
                if (r7 == 0) goto L2f
                r5.add(r6)
                goto L2f
            L56:
                rg.a r10 = r9.f22619a
                java.util.List<id.a> r5 = r10.f22615Y
            L5a:
                r1.f22617a0 = r5
                rg.a r10 = r9.f22619a
                java.util.List<id.a> r10 = r10.f22617a0
                r0.values = r10
                if (r10 == 0) goto L68
                int r4 = r10.size()
            L68:
                r0.count = r4
                return r0
        }

        @Override // android.widget.Filter
        public void publishResults(java.lang.CharSequence r1, android.widget.Filter.FilterResults r2) {
                r0 = this;
                if (r2 == 0) goto Lc
                int r1 = r2.count
                if (r1 <= 0) goto Lc
                rg.a r1 = r0.f22619a
                r1.notifyDataSetChanged()
                goto L11
            Lc:
                rg.a r1 = r0.f22619a
                r1.notifyDataSetInvalidated()
            L11:
                return
        }
    }

    public C5845a(android.content.Context r2, java.util.List<id.C3130a> r3) {
            r1 = this;
            r0 = 2131558593(0x7f0d00c1, float:1.8742506E38)
            r1.<init>(r2, r0)
            r1.f22615Y = r3
            android.content.Context r2 = r1.getContext()
            r3 = 2131099722(0x7f06004a, float:1.7811805E38)
            int r2 = p046d0.C1259a.m3706b(r2, r3)
            r1.f22616Z = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f22617a0 = r2
            java.lang.String r2 = ""
            r1.f22618b0 = r2
            return
    }

    /* renamed from: a */
    public final void m12200a(android.widget.TextView r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            int r0 = p362uh.C6467m.m13070a0(r9, r10, r2, r0, r1)     // Catch: java.lang.Exception -> L54
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder     // Catch: java.lang.Exception -> L54
            r1.<init>()     // Catch: java.lang.Exception -> L54
            java.lang.String r3 = "this as java.lang.String\u2026ing(startIndex, endIndex)"
            if (r0 == 0) goto L1a
            java.lang.String r2 = r9.substring(r2, r0)     // Catch: java.lang.Exception -> L54
            p214m2.C4339q.m9705j(r2, r3)     // Catch: java.lang.Exception -> L54
            r1.append(r2)     // Catch: java.lang.Exception -> L54
        L1a:
            int r2 = r7.f22616Z     // Catch: java.lang.Exception -> L54
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan     // Catch: java.lang.Exception -> L54
            r4.<init>(r2)     // Catch: java.lang.Exception -> L54
            int r2 = r1.length()     // Catch: java.lang.Exception -> L54
            int r5 = r10.length()     // Catch: java.lang.Exception -> L54
            int r5 = r5 + r0
            java.lang.String r5 = r9.substring(r0, r5)     // Catch: java.lang.Exception -> L54
            p214m2.C4339q.m9705j(r5, r3)     // Catch: java.lang.Exception -> L54
            r1.append(r5)     // Catch: java.lang.Exception -> L54
            int r5 = r1.length()     // Catch: java.lang.Exception -> L54
            r6 = 17
            r1.setSpan(r4, r2, r5, r6)     // Catch: java.lang.Exception -> L54
            int r10 = r10.length()     // Catch: java.lang.Exception -> L54
            int r10 = r10 + r0
            int r0 = r9.length()     // Catch: java.lang.Exception -> L54
            java.lang.String r10 = r9.substring(r10, r0)     // Catch: java.lang.Exception -> L54
            p214m2.C4339q.m9705j(r10, r3)     // Catch: java.lang.Exception -> L54
            r1.append(r10)     // Catch: java.lang.Exception -> L54
            r8.setText(r1)     // Catch: java.lang.Exception -> L54
            goto L57
        L54:
            r8.setText(r9)
        L57:
            return
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
            r1 = this;
            java.util.List<id.a> r0 = r1.f22617a0
            if (r0 == 0) goto L9
            int r0 = r0.size()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public android.widget.Filter getFilter() {
            r1 = this;
            rg.a$a r0 = new rg.a$a
            r0.<init>(r1)
            return r0
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public java.lang.Object getItem(int r2) {
            r1 = this;
            java.util.List<id.a> r0 = r1.f22617a0
            if (r0 == 0) goto Lb
            java.lang.Object r2 = p062dh.C1473i.m3997I(r0, r2)
            id.a r2 = (id.C3130a) r2
            goto Lc
        Lb:
            r2 = 0
        Lc:
            return r2
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            java.lang.String r0 = "parent"
            p214m2.C4339q.m9706k(r8, r0)
            if (r7 != 0) goto L1c
            android.content.Context r7 = r5.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131558593(0x7f0d00c1, float:1.8742506E38)
            r1 = 0
            android.view.View r7 = r7.inflate(r0, r8, r1)
            java.lang.String r8 = "from(context)\n          \u2026e_contact, parent, false)"
            p214m2.C4339q.m9705j(r7, r8)
        L1c:
            java.util.List<id.a> r8 = r5.f22617a0
            r0 = 0
            if (r8 == 0) goto L28
            java.lang.Object r6 = p062dh.C1473i.m3997I(r8, r6)
            id.a r6 = (id.C3130a) r6
            goto L29
        L28:
            r6 = r0
        L29:
            r8 = 2131361879(0x7f0a0057, float:1.8343523E38)
            android.view.View r1 = p064e.C1494h.m4055f(r7, r8)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            if (r1 == 0) goto L6e
            r8 = 2131362439(0x7f0a0287, float:1.8344659E38)
            android.view.View r2 = p064e.C1494h.m4055f(r7, r8)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            if (r2 == 0) goto L6e
            androidx.appcompat.widget.LinearLayoutCompat r7 = (androidx.appcompat.widget.LinearLayoutCompat) r7
            java.lang.String r8 = "binding.nameText"
            p214m2.C4339q.m9705j(r2, r8)
            if (r6 == 0) goto L4b
            java.lang.String r8 = r6.f12558a0
            goto L4c
        L4b:
            r8 = r0
        L4c:
            java.lang.String r3 = ""
            if (r8 != 0) goto L51
            r8 = r3
        L51:
            java.lang.String r4 = r5.f22618b0
            r5.m12200a(r2, r8, r4)
            java.lang.String r8 = "binding.addressText"
            p214m2.C4339q.m9705j(r1, r8)
            if (r6 == 0) goto L5f
            java.lang.String r0 = r6.f12557Z
        L5f:
            if (r0 != 0) goto L62
            goto L63
        L62:
            r3 = r0
        L63:
            java.lang.String r6 = r5.f22618b0
            r5.m12200a(r1, r3, r6)
            java.lang.String r6 = "binding.root"
            p214m2.C4339q.m9705j(r7, r6)
            return r7
        L6e:
            android.content.res.Resources r6 = r7.getResources()
            java.lang.String r6 = r6.getResourceName(r8)
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "Missing required view with ID: "
            java.lang.String r6 = r8.concat(r6)
            r7.<init>(r6)
            throw r7
    }
}
