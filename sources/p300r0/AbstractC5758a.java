package p300r0;

/* renamed from: r0.a */
/* loaded from: classes.dex */
public abstract class AbstractC5758a extends android.widget.BaseAdapter implements android.widget.Filterable, p300r0.C5759b.a {

    /* renamed from: Y */
    public boolean f22167Y;

    /* renamed from: Z */
    public boolean f22168Z;

    /* renamed from: a0 */
    public android.database.Cursor f22169a0;

    /* renamed from: b0 */
    public android.content.Context f22170b0;

    /* renamed from: c0 */
    public int f22171c0;

    /* renamed from: d0 */
    public p300r0.AbstractC5758a.a f22172d0;

    /* renamed from: e0 */
    public android.database.DataSetObserver f22173e0;

    /* renamed from: f0 */
    public p300r0.C5759b f22174f0;

    /* renamed from: r0.a$a */
    public class a extends android.database.ContentObserver {

        /* renamed from: a */
        public final /* synthetic */ p300r0.AbstractC5758a f22175a;

        public a(p300r0.AbstractC5758a r1) {
                r0 = this;
                r0.f22175a = r1
                android.os.Handler r1 = new android.os.Handler
                r1.<init>()
                r0.<init>(r1)
                return
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r2) {
                r1 = this;
                r0.a r2 = r1.f22175a
                boolean r0 = r2.f22168Z
                if (r0 == 0) goto L18
                android.database.Cursor r0 = r2.f22169a0
                if (r0 == 0) goto L18
                boolean r0 = r0.isClosed()
                if (r0 != 0) goto L18
                android.database.Cursor r0 = r2.f22169a0
                boolean r0 = r0.requery()
                r2.f22167Y = r0
            L18:
                return
        }
    }

    /* renamed from: r0.a$b */
    public class b extends android.database.DataSetObserver {

        /* renamed from: a */
        public final /* synthetic */ p300r0.AbstractC5758a f22176a;

        public b(p300r0.AbstractC5758a r1) {
                r0 = this;
                r0.f22176a = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r2 = this;
                r0.a r0 = r2.f22176a
                r1 = 1
                r0.f22167Y = r1
                r0.notifyDataSetChanged()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r2 = this;
                r0.a r0 = r2.f22176a
                r1 = 0
                r0.f22167Y = r1
                r0.notifyDataSetInvalidated()
                return
        }
    }

    public AbstractC5758a(android.content.Context r5, android.database.Cursor r6, boolean r7) {
            r4 = this;
            r4.<init>()
            r0 = 1
            r1 = 2
            if (r7 == 0) goto L9
            r7 = 1
            goto La
        L9:
            r7 = 2
        La:
            r2 = r7 & 1
            r3 = 0
            if (r2 != r0) goto L14
            r7 = r7 | 2
            r4.f22168Z = r0
            goto L16
        L14:
            r4.f22168Z = r3
        L16:
            if (r6 == 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            r4.f22169a0 = r6
            r4.f22167Y = r0
            r4.f22170b0 = r5
            if (r0 == 0) goto L29
            java.lang.String r5 = "_id"
            int r5 = r6.getColumnIndexOrThrow(r5)
            goto L2a
        L29:
            r5 = -1
        L2a:
            r4.f22171c0 = r5
            r5 = r7 & 2
            if (r5 != r1) goto L3d
            r0.a$a r5 = new r0.a$a
            r5.<init>(r4)
            r4.f22172d0 = r5
            r0.a$b r5 = new r0.a$b
            r5.<init>(r4)
            goto L40
        L3d:
            r5 = 0
            r4.f22172d0 = r5
        L40:
            r4.f22173e0 = r5
            if (r0 == 0) goto L52
            r0.a$a r5 = r4.f22172d0
            if (r5 == 0) goto L4b
            r6.registerContentObserver(r5)
        L4b:
            android.database.DataSetObserver r5 = r4.f22173e0
            if (r5 == 0) goto L52
            r6.registerDataSetObserver(r5)
        L52:
            return
    }

    /* renamed from: a */
    public abstract void mo779a(android.view.View r1, android.content.Context r2, android.database.Cursor r3);

    /* renamed from: b */
    public void mo780b(android.database.Cursor r3) {
            r2 = this;
            android.database.Cursor r0 = r2.f22169a0
            if (r3 != r0) goto L6
            r0 = 0
            goto L40
        L6:
            if (r0 == 0) goto L16
            r0.a$a r1 = r2.f22172d0
            if (r1 == 0) goto Lf
            r0.unregisterContentObserver(r1)
        Lf:
            android.database.DataSetObserver r1 = r2.f22173e0
            if (r1 == 0) goto L16
            r0.unregisterDataSetObserver(r1)
        L16:
            r2.f22169a0 = r3
            if (r3 == 0) goto L37
            r0.a$a r1 = r2.f22172d0
            if (r1 == 0) goto L21
            r3.registerContentObserver(r1)
        L21:
            android.database.DataSetObserver r1 = r2.f22173e0
            if (r1 == 0) goto L28
            r3.registerDataSetObserver(r1)
        L28:
            java.lang.String r1 = "_id"
            int r3 = r3.getColumnIndexOrThrow(r1)
            r2.f22171c0 = r3
            r3 = 1
            r2.f22167Y = r3
            r2.notifyDataSetChanged()
            goto L40
        L37:
            r3 = -1
            r2.f22171c0 = r3
            r3 = 0
            r2.f22167Y = r3
            r2.notifyDataSetInvalidated()
        L40:
            if (r0 == 0) goto L45
            r0.close()
        L45:
            return
    }

    /* renamed from: c */
    public abstract java.lang.CharSequence mo781c(android.database.Cursor r1);

    /* renamed from: d */
    public abstract android.view.View mo782d(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3);

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            boolean r0 = r1.f22167Y
            if (r0 == 0) goto Ld
            android.database.Cursor r0 = r1.f22169a0
            if (r0 == 0) goto Ld
            int r0 = r0.getCount()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.f22167Y
            if (r0 == 0) goto L1f
            android.database.Cursor r0 = r1.f22169a0
            r0.moveToPosition(r2)
            if (r3 != 0) goto L17
            r2 = r1
            r0.c r2 = (p300r0.AbstractC5760c) r2
            android.view.LayoutInflater r3 = r2.f22180i0
            int r2 = r2.f22179h0
            r0 = 0
            android.view.View r3 = r3.inflate(r2, r4, r0)
        L17:
            android.content.Context r2 = r1.f22170b0
            android.database.Cursor r4 = r1.f22169a0
            r1.mo779a(r3, r2, r4)
            return r3
        L1f:
            r2 = 0
            return r2
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
            r1 = this;
            r0.b r0 = r1.f22174f0
            if (r0 != 0) goto Lb
            r0.b r0 = new r0.b
            r0.<init>(r1)
            r1.f22174f0 = r0
        Lb:
            r0.b r0 = r1.f22174f0
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r2) {
            r1 = this;
            boolean r0 = r1.f22167Y
            if (r0 == 0) goto Le
            android.database.Cursor r0 = r1.f22169a0
            if (r0 == 0) goto Le
            r0.moveToPosition(r2)
            android.database.Cursor r2 = r1.f22169a0
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // android.widget.Adapter
    public long getItemId(int r4) {
            r3 = this;
            boolean r0 = r3.f22167Y
            r1 = 0
            if (r0 == 0) goto L19
            android.database.Cursor r0 = r3.f22169a0
            if (r0 == 0) goto L19
            boolean r4 = r0.moveToPosition(r4)
            if (r4 == 0) goto L19
            android.database.Cursor r4 = r3.f22169a0
            int r0 = r3.f22171c0
            long r0 = r4.getLong(r0)
            return r0
        L19:
            return r1
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.f22167Y
            if (r0 == 0) goto L2a
            android.database.Cursor r0 = r1.f22169a0
            boolean r0 = r0.moveToPosition(r2)
            if (r0 == 0) goto L1e
            if (r3 != 0) goto L16
            android.content.Context r2 = r1.f22170b0
            android.database.Cursor r3 = r1.f22169a0
            android.view.View r3 = r1.mo782d(r2, r3, r4)
        L16:
            android.content.Context r2 = r1.f22170b0
            android.database.Cursor r4 = r1.f22169a0
            r1.mo779a(r3, r2, r4)
            return r3
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "couldn't move cursor to position "
            java.lang.String r2 = android.support.v4.media.C0142a.m254a(r4, r2)
            r3.<init>(r2)
            throw r3
        L2a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "this should only be called when the cursor is valid"
            r2.<init>(r3)
            throw r2
    }
}
